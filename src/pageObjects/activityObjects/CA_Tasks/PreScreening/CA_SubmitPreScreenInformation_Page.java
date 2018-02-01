package pageObjects.activityObjects.CA_Tasks.PreScreening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_SubmitPreScreenInformation_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public CA_SubmitPreScreenInformation_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement chkbox_agree() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_BP_WRK_SM_BP_AGREE\"))");
			Log.info("chkbox_agree found in the CA_SubmitPreScreenInformation_Page");
		} catch (Exception e) {
			Log.info("chkbox_agree not found in the CA_SubmitPreScreenInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_BP_WRK_SM_BP_CERTIFY\"))");
			Log.info("btn_save found in the CA_SubmitPreScreenInformation_Page");
		} catch (Exception e) {
			Log.info("btn_save not found in the CA_SubmitPreScreenInformation_Page");
			throw (e);
		}
		return element;
	}
}
