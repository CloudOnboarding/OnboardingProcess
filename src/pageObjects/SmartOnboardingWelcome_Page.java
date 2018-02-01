package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.psUtility;

public class SmartOnboardingWelcome_Page extends BaseClass {

	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public SmartOnboardingWelcome_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement lnk_GetStarted() throws Exception {
		element = null;
		try {

			// Thread.sleep(20000);
			element = psUtility.switchFrame("driver.findElement(By.partialLinkText(\"GET STARTED\"))");
			GetStartedLnkExts = driver.findElements(By.partialLinkText("GET STARTED")).size() != 0;
			System.out.println("Value GetStartedLnkExts::::" + GetStartedLnkExts);

			Log.info("lnk_GetStarted found in SmartOnboardingWelcome_Page");
		} catch (Exception e) {
			Log.info("lnk_GetStarted not found in SmartOnboardingWelcome_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_ContinueOnboarding() throws Exception {
		element = null;
		try {

			// Thread.sleep(20000);
			element = psUtility.switchFrame("driver.findElement(By.partialLinkText(\"Continue Onboarding\"))");

			Log.info("lnk_ContinueOnboarding found in SmartOnboardingWelcome_Page");
		} catch (Exception e) {
			Log.info("lnk_ContinueOnboarding not found in SmartOnboardingWelcome_Page");
			throw (e);
		}
		return element;
	}
}
