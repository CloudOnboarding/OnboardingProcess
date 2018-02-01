package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.psUtility;

public class InternalHome_Page extends BaseClass {

	private static WebElement element;
	public static boolean SignoutLnkExts, FluidSignOutLnkExts;

	public InternalHome_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement lnk_HSignout() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Sign out\"))");
			// element = driver.findElement(By.linkText("Sign out"));
			// HSignoutLnkExts=driver.findElements( By.linkText("Sign out") ).size() != 0;
			Log.info("lnk_HSignout found in Home_Page");
		} catch (Exception e) {
			Log.info("lnk_HSignout not found in Home_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_FluidActionList() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@title='Actions List']\"))");
			// element = driver.findElement(By.id("Sign out"));
			// HSignoutLnkExts=driver.findElements( By.xpath("//*[@title='Actions List']")
			// ).size() != 0;
			Log.info("lnk_FluidActionList found in Home_Page");
		} catch (Exception e) {
			Log.info("lnk_FluidActionList not found in Home_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_FluidSignOut() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@title='Sign out']\"))");
			// element = driver.findElement(By.id("Sign out"));
			Log.info("lnk_FluidSignOut found in Home_Page");
		} catch (Exception e) {
			Log.info("lnk_FluidSignOut not found in Home_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_SignOutExts() throws Exception {
		element = null;
		try {

			SignoutLnkExts = BaseClass.driver.findElements(By.linkText("Sign out")).size() != 0;
			//FluidSignOutLnkExts = BaseClass.driver.findElements(By.xpath("//*[@title='Actions List']")).size() != 0;

			Log.info("lnk_SignOutExts in Home_Page");
		} catch (Exception e) {
			Log.info("lnk_SignOutExts not in Home_Page");
			throw (e);
		}
		return element;
	}

}
