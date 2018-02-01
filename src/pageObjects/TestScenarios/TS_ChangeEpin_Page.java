package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TS_ChangeEpin_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public TS_ChangeEpin_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement lnk_Accountname() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@sm-parent='accountMenu']\"))");
			Log.info("lnk_Accountname found in the TS_ChangeEpin_Page");
		} catch (Exception e) {
			Log.info("lnk_Accountname not found in the TS_ChangeEpin_Page");
			throw (e);
		}
		return element;
	}

	
	public static WebElement lnk_MyProfile() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//li[@sm-id='myaccountItem']/a[contains(text(),'My Profile')]\"))");
			Log.info("lnk_MyProfile found in the TS_ChangeEpin_Page");
		} catch (Exception e) {
			Log.info("lnk_MyProfile not found in the TS_ChangeEpin_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_ChangePin() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_MYPROF_WK_EDIT_BTN2\"))");
			Log.info("lnk_ChangePin found in the TS_ChangeEpin_Page");
		} catch (Exception e) {
			Log.info("lnk_ChangePin not found in the TS_ChangeEpin_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Edit() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORG_WRK_SM_CO_UPDATE_BTN\"))");
			Log.info("btn_Edit found in the TS_ChangeEpin_Page");
		} catch (Exception e) {
			Log.info("btn_Edit not found in the TS_ChangeEpin_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_CurrentPin() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_AUTH_WRK_SM_CO_CURR_PIN\"))");
			Log.info("txt_CurrentPin found in the TS_ChangeEpin_Page");
		} catch (Exception e) {
			Log.info("txt_CurrentPin not found in the TS_ChangeEpin_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_NewPin() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_AUTH_WRK_SM_CO_CHANGE_PIN\"))");
			Log.info("txt_NewPin found in the TS_ChangeEpin_Page");
		} catch (Exception e) {
			Log.info("txt_NewPin not found in the TS_ChangeEpin_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_ConfirmPin() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_AUTH_WRK_SM_CO_CONFIRM_PIN\"))");
			Log.info("txt_ConfirmPin found in the TS_ChangeEpin_Page");
		} catch (Exception e) {
			Log.info("txt_ConfirmPin not found in the TS_ChangeEpin_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Update() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORG_WRK_SM_CO_UPDATE_BTN\"))");
			Log.info("btn_Update found in the TS_ChangeEpin_Page");
		} catch (Exception e) {
			Log.info("btn_Update not found in the TS_ChangeEpin_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Ok() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_2FACT_WRK_OK_BTN\"))");
			Log.info("btn_Ok found in the TS_ChangeEpin_Page");
		} catch (Exception e) {
			Log.info("btn_Ok not found in the TS_ChangeEpin_Page");
			throw (e);
		}
		return element;
	}
}
