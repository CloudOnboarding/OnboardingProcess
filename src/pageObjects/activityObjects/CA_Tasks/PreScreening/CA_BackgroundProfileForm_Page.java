package pageObjects.activityObjects.CA_Tasks.PreScreening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_BackgroundProfileForm_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public CA_BackgroundProfileForm_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement chk_Agree() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_BP_WRK_SM_BP_AGREE\"))");
			Log.info("chk_Agree found in the CA_BackgroundProfileFormvVendorWebsite_Page");
		} catch (Exception e) {
			Log.info("chk_Agree not found in the CA_BackgroundProfileFormvVendorWebsite_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Acknowledge() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_BP_WRK_SM_BP_CERTIFY\"))");
			Log.info("btn_Acknowledge found in the CA_BackgroundProfileFormvVendorWebsite_Page");
		} catch (Exception e) {
			Log.info("btn_Acknowledge not found in the CA_BackgroundProfileFormvVendorWebsite_Page");
			throw (e);
		}
		return element;
	}
}
