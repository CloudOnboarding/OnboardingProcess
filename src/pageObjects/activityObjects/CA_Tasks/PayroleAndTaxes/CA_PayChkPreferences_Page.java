package pageObjects.activityObjects.CA_Tasks.PayroleAndTaxes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_PayChkPreferences_Page extends BaseClass {
	public static WebElement element;

	public CA_PayChkPreferences_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement rdbtn_CheckByMail() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"CHECK_MAIL\"))");

			Log.info("rdbtn_CheckByMail found in the CA_PayChkPreferences_Page");
		} catch (Exception e) {
			Log.info("rdbtn_CheckByMail not found in the CA_PayChkPreferences_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Next() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_DF_HOOK_WK_SM_DF_NEXT_TASK\"))");

			Log.info("btn_Next found in the CA_PayChkPreferences_Page");
		} catch (Exception e) {
			Log.info("btn_Next not found in the CA_PayChkPreferences_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdbtn_MailHomeAddress() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_PAYOPTION_SM_OB_ADDR_TYPE\"))");

			Log.info("rdbtn_MailHomeAddress found in the CA_PayChkPreferences_Page");
		} catch (Exception e) {
			Log.info("rdbtn_MailHomeAddress not found in the CA_PayChkPreferences_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdbtn_MailtoMailAddress() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_PAYOPTION_SM_OB_ADDR_TYPE$23$\"))");

			Log.info("rdbtn_MailtoMailAddress found in the CA_PayChkPreferences_Page");
		} catch (Exception e) {
			Log.info("rdbtn_MailtoMailAddress not found in the CA_PayChkPreferences_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkBox_Acknowledge() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_PAYOPTION_SM_OB_ACK_ADDR_SEL\"))");

			Log.info("chkBox_Acknowledge found in the CA_PayChkPreferences_Page");
		} catch (Exception e) {
			Log.info("chkBox_Acknowledge not found in the CA_PayChkPreferences_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_DF_HOOK_WK_SM_DF_SAVEDRFT_CNT\"))");

			Log.info("btn_Save found in the CA_PayChkPreferences_Page");
		} catch (Exception e) {
			Log.info("btn_Save not found in the CA_PayChkPreferences_Page");
			throw (e);
		}
		return element;
	}

}
