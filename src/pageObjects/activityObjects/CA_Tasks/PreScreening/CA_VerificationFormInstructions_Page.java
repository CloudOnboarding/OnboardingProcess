package pageObjects.activityObjects.CA_Tasks.PreScreening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_VerificationFormInstructions_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public CA_VerificationFormInstructions_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement chkbox_agree() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_BP_WRK_SM_BP_AGREE\"))");
			Log.info("chkbox_agree found in the CA_VerificationFormInstructions_Page");
		} catch (Exception e) {
			Log.info("chkbox_agree not found in the CA_VerificationFormInstructions_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_acknowledg() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_BP_WRK_SM_BP_CERTIFY\"))");
			Log.info("btn_acknowledg found in the CA_VerificationFormInstructions_Page");
		} catch (Exception e) {
			Log.info("btn_acknowledg not found in the CA_VerificationFormInstructions_Page");
			throw (e);
		}
		return element;
	}
}
