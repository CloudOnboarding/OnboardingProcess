package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TS_ChangePassword_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public TS_ChangePassword_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement lnk_ChangePwd() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_MYPROF_WK_EDIT_BTN1\"))");
			Log.info("lnk_ChangePwd found in the TS_ChangePassword_Page");
		} catch (Exception e) {
			Log.info("lnk_ChangePwd not found in the TS_ChangePassword_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Edit() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORG_WRK_SM_CO_UPDATE_BTN\"))");
			Log.info("btn_Edit found in the TS_ChangePassword_Page");
		} catch (Exception e) {
			Log.info("btn_Edit not found in the TS_ChangePassword_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_CurrentPwd() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_AUTH_WRK_SM_CO_CURR_PASSWD\"))");
			Log.info("txt_CurrentPwd found in the TS_ChangePassword_Page");
		} catch (Exception e) {
			Log.info("txt_CurrentPwd not found in the TS_ChangePassword_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_NewPwd() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_AUTH_WRK_OPERPSWD\"))");
			Log.info("txt_NewPwd found in the TS_ChangePassword_Page");
		} catch (Exception e) {
			Log.info("txt_NewPwd not found in the TS_ChangePassword_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_ConfirmPwd() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_AUTH_WRK_OPERPSWDCONF\"))");
			Log.info("txt_ConfirmPwd found in the TS_ChangePassword_Page");
		} catch (Exception e) {
			Log.info("txt_ConfirmPwd not found in the TS_ChangePassword_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Update() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORG_WRK_SM_CO_UPDATE_BTN\"))");
			Log.info("btn_Update found in the TS_ChangePassword_Page");
		} catch (Exception e) {
			Log.info("btn_Update not found in the TS_ChangePassword_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_ok() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_2FACT_WRK_OK_BTN\"))");
			Log.info("btn_ok found in the TS_ChangePassword_Page");
		} catch (Exception e) {
			Log.info("btn_ok not found in the TS_ChangePassword_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement lnk_Accountname() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@sm-parent='accountMenu']\"))");
			Log.info("lnk_Accountname found in the TS_ChangePassword_Page");
		} catch (Exception e) {
			Log.info("lnk_Accountname not found in the TS_ChangePassword_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement lnk_MyProfile() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//li[@sm-id='myaccountItem']/a[contains(text(),'My Profile')]\"))");
			Log.info("lnk_MyProfile found in the TS_ChangePassword_Page");
		} catch (Exception e) {
			Log.info("lnk_MyProfile not found in the TS_ChangePassword_Page");
			throw (e);
		}
		return element;
	}
}
