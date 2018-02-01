package utility;

import java.io.File;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.base.Function;

import appModules.ExternalHome_MyTask;
import appModules.MyTask;
import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.OnboardingMaster.Select_RoleType_EVerifyAdmin;
import appModules.OnboardingMaster.Select_RoleType_HRAdmin;
import appModules.OnboardingMaster.Select_RoleType_I9Admin;
import appModules.Revision.RV_CreateRevisions;
import appModules.Revision.RV_ViewEditRevisions;
import pageObjects.BaseClass;
import pageObjects.ExternalLogin_Page;

public class psUtility {
	private static final DateFormat dateFormat = new SimpleDateFormat("yyyy_mm_dd SSS");
	public static EventFiringWebDriver eventDriver;
	public static WebListener handler;
	public static String parentWindowHnd;
	public static Boolean isEleExists = false;
	public static int pollingTime = 60000;
	public static int pollingEvery = 3000;

	public static void clear(WebElement element) throws InterruptedException {
		drawBoarder(element);
		element.clear();
		element.sendKeys(Keys.TAB);
		processWait();
	}

	public static void setEnvironment(String URL) throws Exception {
		//Assert.assertTrue(false);
		System.setProperty(Constant.Brwsr_Chrome, Constant.ChromePath);

		BaseClass.driver = new ChromeDriver();
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("disable-infobars"); BaseClass.driver = new
		 * ChromeDriver(options);
		 */
		eventDriver = new EventFiringWebDriver(BaseClass.driver);
		handler = new WebListener();
		eventDriver.register(handler);
		BaseClass.driver = eventDriver;

		BaseClass.driver.manage().deleteAllCookies();
		BaseClass.driver.get(URL);
		BaseClass.driver.manage().window().maximize();
		BaseClass.driver.navigate().refresh();
		BaseClass.driver.manage().timeouts().implicitlyWait(Constant.implicitWaitTime, TimeUnit.SECONDS);
	}

	public static void ExternalLogin(String UseriD, String Password) throws Exception {
		eventDriver.unregister(handler);
		ExternalLogin_Page.txt_UserName().sendKeys(Keys.F11);
		eventDriver.register(handler);
		Thread.sleep(1000);
		ExternalLogin_Page.txt_UserName().sendKeys(UseriD);
		ExternalLogin_Page.txt_Pwd().sendKeys(Password);
		Log.info("Entered the External Login Credentials");
		ExternalLogin_Page.btn_Submit().click();
		Log.info("Click action is performed on Submit button");
		Reporter.log("External SignIn Action is successfully performed for user " + UseriD + "<br>");
	}

	public static void select(WebElement element, String value) throws Exception {
		drawBoarder(element);
		new Select(element).selectByVisibleText(value);
	}

	public static void ONBAdminLogin(String UseriD, String Password, String RoleType, String ActivityName)
			throws Exception {
		setEnvironment(Constant.ExternalURL);
		ExternalLogin(UseriD, Password);
		Verification2Factor_Authentication.Execute();
		Setup_ChallengeQuestions.Execute();

		if (RoleType.toUpperCase().contains("HR")) {
			Select_RoleType_HRAdmin.Execute();
			ExternalHome_MyTask.Execute();
			MyTask.Execute(ActivityName);
		}
		if (RoleType.toUpperCase().contains("I9") || RoleType.toUpperCase().contains("I-9")) {
			Select_RoleType_I9Admin.Execute();
			ExternalHome_MyTask.Execute();
			MyTask.Execute(ActivityName);
		}
		if (RoleType.toUpperCase().contains("EV") || RoleType.toUpperCase().contains("E-V")) {
			Select_RoleType_EVerifyAdmin.Execute();
			ExternalHome_MyTask.Execute();
			MyTask.Execute(ActivityName);
		}

	}

	public static void processWait() {
		BaseClass.driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		waitForPageLoad(60, EXPECT_DOC_READY_STATE, EXPECT_NOT_WAITING, EXPECT_NO_SPINNERS);

		BaseClass.driver.manage().timeouts().implicitlyWait(Constant.implicitWaitTime, TimeUnit.SECONDS);
	}

	@SafeVarargs
	public static boolean waitForPageLoad(int waitTimeInSec, ExpectedCondition<Boolean>... conditions) {

		boolean isLoaded = false;
		Wait<WebDriver> wait = new FluentWait<>(BaseClass.driver).withTimeout(waitTimeInSec, TimeUnit.SECONDS)
				.ignoring(StaleElementReferenceException.class).ignoring(NoSuchElementException.class)
				.pollingEvery(200, TimeUnit.MILLISECONDS);
		for (ExpectedCondition<Boolean> condition : conditions) {
			isLoaded = wait.until(condition);
			if (isLoaded == false) {
				// Stop checking on first condition returning false.
				break;
			}
		}
		// System.out.println("is Loaded status::::"+isLoaded);
		return isLoaded;
	}

	/*******************************/
	/**
	 * Returns 'true' if the value of the 'window.document.readyState' via
	 * JavaScript is 'complete'
	 */

	public static final ExpectedCondition<Boolean> EXPECT_DOC_READY_STATE = new ExpectedCondition<Boolean>() {
		@Override
		public Boolean apply(WebDriver driver) {
			String script = "if (typeof window != 'undefined' && window.document) { return window.document.readyState; } else { return 'notready'; }";
			Boolean result;
			try {
				result = ((JavascriptExecutor) driver).executeScript(script).equals("complete");

			} catch (Exception ex) {
				result = Boolean.FALSE;
			}
			// System.out.println(result);
			return result;
		}
	};
	/**
	 * Returns 'true' if there is no 'wait_dialog' element present on the page.
	 */
	public static final ExpectedCondition<Boolean> EXPECT_NOT_WAITING = new ExpectedCondition<Boolean>() {
		@Override
		public Boolean apply(WebDriver driver) {
			Boolean loaded = true;
			try {
				WebElement wait = driver.findElement(By.xpath("//*[contains(@id,'WAIT_')]"));
				if (wait.isDisplayed()) {
					loaded = false;
				}
			} catch (StaleElementReferenceException serex) {
				loaded = false;
			} catch (NoSuchElementException nseex) {
				loaded = true;
			} catch (Exception ex) {
				loaded = false;
				System.out.println("EXPECTED_NOT_WAITING: UNEXPECTED EXCEPTION: " + ex.getMessage());
			}

			// System.out.println(loaded);
			return loaded;

		}
	};

	/**
	 * Returns true if there are no elements with the 'spinner' class name.
	 */
	public static final ExpectedCondition<Boolean> EXPECT_NO_SPINNERS = new ExpectedCondition<Boolean>() {
		@Override
		public Boolean apply(WebDriver driver) {
			Boolean loaded = true;
			try {
				List<WebElement> spinners = driver.findElements(By.className("spinner"));
				for (WebElement spinner : spinners) {
					if (spinner.isDisplayed()) {
						loaded = false;
						break;
					}
				}
			} catch (Exception ex) {
				loaded = false;
			}
			System.out.println(loaded);
			return loaded;
		}
	};

	public static WebElement switchFrame(String webElement) throws Exception {
		// FluentWait<WebDriver> wait = new FluentWait<WebDriver>(BaseClass.driver) {
		@SuppressWarnings("unused")
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(BaseClass.driver) {
			@Override
			protected RuntimeException timeoutException(String Message, Throwable lastException) {
				StrTowebelement(webElement);

				return (RuntimeException) StrTowebelement(webElement);

			}
		};
		// };

		wait.withTimeout(pollingTime, TimeUnit.MILLISECONDS).pollingEvery(pollingEvery, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);

		WebElement Elemnt = wait.until(new Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver driver) {
				driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);

				final List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
				WebElement ele = null;

				try {
					ele = StrTowebelement(webElement);
				} catch (Exception e) {
					if (iframes.size() > 0) {

						for (WebElement iframe : iframes) {
							String IframeId = iframe.getAttribute("id");
							// System.out.println("current frame::"+IframeId);
							try {
								driver.switchTo().frame(driver.findElement(By.id(IframeId)));

								ele = StrTowebelement(webElement);
								break;
							} catch (Exception ex) {
								driver.switchTo().defaultContent();
								continue;
							}

						}
					} else {
						System.out.println("Before Default Content:::" + ele);
						driver.switchTo().defaultContent();
						ele = StrTowebelement(webElement);
					}

				}

				return ele;

			}
		});
		return Elemnt;

	}

	public static WebElement StrTowebelement(String ele) {
		String selector, ID;
		WebElement element;
		String str[] = ele.split("\"");
		selector = str[0].substring("driver.findElement(By.".length(), str[0].length() - 1);
		ID = str[1];

		switch (selector) {

		case "className":
			element = BaseClass.driver.findElement(By.className(ID));
			break;

		case "cssSelector":
			element = BaseClass.driver.findElement(By.cssSelector(ID));
			break;

		case "id":
			element = BaseClass.driver.findElement(By.id(ID));
			break;

		case "linkText":
			element = BaseClass.driver.findElement(By.linkText(ID));
			break;

		case "name":
			element = BaseClass.driver.findElement(By.name(ID));
			break;

		case "partialLinkText":
			element = BaseClass.driver.findElement(By.partialLinkText(ID));
			break;

		case "tagName":
			element = BaseClass.driver.findElement(By.tagName(ID));
			break;

		case "xpath":
			element = BaseClass.driver.findElement(By.xpath(ID));
			break;

		default:
			element = null;
		}

		return element;
	}

	public static Boolean isElementExists(String webElement) throws Exception {
		Wait<WebDriver> wait = new FluentWait<>(BaseClass.driver).withTimeout(300, TimeUnit.MILLISECONDS)
				.ignoring(StaleElementReferenceException.class).ignoring(NoSuchElementException.class)
				.pollingEvery(300, TimeUnit.MILLISECONDS);
		@SuppressWarnings("unused")
		Boolean ElementExists = wait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
				Boolean Exists = true;
				int pollTime = pollingTime;
				int PollEvery = pollingEvery;
				try {
					// Reducing polling time and poolingevery time of switch frame
					pollingTime = 300;
					pollingEvery = 300;
					switchFrame(webElement);
					isEleExists = true;
				} catch (Exception e) {
					isEleExists = false;
				}
				pollingTime = pollTime;
				pollingEvery = PollEvery;
				return Exists;
			}
		});

		System.out.println("isEleExists::::" + isEleExists);
		return isEleExists;

	}

	public static void drawBoarder(WebElement element) {
		((JavascriptExecutor) BaseClass.driver).executeScript("arguments[0].style.border='3px solid red'", element);

	}

	public static void setCurrentbrowser() {
		try {

			parentWindowHnd = BaseClass.driver.getWindowHandle();
			// System.out.println("Parent Window::" + parentWindowHnd);
			// To Get Multiple Window
			Set<String> handels = BaseClass.driver.getWindowHandles();
			// System.out.println("WindowID count::::" + handels.size());

			if (handels.size() > 1) {
				for (String windowHandel : handels) {
					if (!windowHandel.equals(parentWindowHnd)) {
						BaseClass.driver.switchTo().window(windowHandel);
						break;
					}
				}
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static File takeScreenshot(WebDriver driver, String screenshot) throws Exception {

		File DestFile = null;
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			DestFile = new File(Constant.Path_ScreenShot + screenshot + ".jpg");
			FileUtils.copyFile(scrFile, DestFile);
		} catch (Exception e) {
			Log.error("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "
					+ e.getMessage());
			// throw new Exception();
		}
		return DestFile;
	}

	public static String generateFileName(ITestResult result) {
		Date date = new Date();
		String filename = result.getName() + "_" + dateFormat.format(date);
		filename = filename.replace(" ", "");
		return filename;

	}

	public static void dynamicLogin(Boolean isEleExists, String UserID, String RevisionType) throws Exception {
		System.out.println("isEleExists::::" + isEleExists);
		if (RevisionType.toLowerCase().contains("any")) {
			RevisionType = RV_CreateRevisions.RevisnType;
		}
		if (!isEleExists) {
			BaseClass.driver.quit();
			setEnvironment(Constant.ExternalURL);
			ExternalLogin(UserID, OnboardingConstants.ONBPassword);
			Verification2Factor_Authentication.Execute();
			Setup_ChallengeQuestions.Execute();
			if (RV_CreateRevisions.RevNum.length() > 1 && (RV_CreateRevisions.RevisnType.contains(RevisionType))) {
				RV_ViewEditRevisions.Execute(RV_CreateRevisions.RevNum);
			} else {
				RV_CreateRevisions.Execute(RevisionType, "Demo Revision");
			}
		}

	}

}
