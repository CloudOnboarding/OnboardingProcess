package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TS_ChangeUserRoles_Page extends BaseClass {
	private static WebElement element;

	public TS_ChangeUserRoles_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement Lnk_ConfigMenu() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"configMenu\"))");
			Log.info("lnk_ConfigMnu found in the TS_ChangeUserRoles_Page");
		} catch (Exception e) {
			Log.info("lnk_ConfigMnu not found in the TS_ChangeUserRoles_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement Lnk_ManageUsersContacts() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Manage Users/Contacts\"))");
			Log.info("Lnk_ManageUsersContacts found in the TS_ChangeUserRoles_Page");
		} catch (Exception e) {
			Log.info("Lnk_ManageUsersContacts not found in the TS_ChangeUserRoles_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement Lnk_Actions() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Actions\"))");
			Log.info("Lnk_Actions found in the TS_ChangeUserRoles_Page");
		} catch (Exception e) {
			Log.info("Lnk_Actions not found in the TS_ChangeUserRoles_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Lnk_AssignNewRoles() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Assign New Role\"))");
			Log.info("Lnk_AssignNewRoles found in the TS_ChangeUserRoles_Page");
		} catch (Exception e) {
			Log.info("Lnk_AssignNewRoles not found in the TS_ChangeUserRoles_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement Lnk_AccountLock() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Account Lock\"))");
			Log.info("Lnk_AccountLock found in the TS_ChangeUserRoles_Page");
		} catch (Exception e) {
			Log.info("Lnk_AccountLock not found in the TS_ChangeUserRoles_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement Sel_SmartOnboardingRoles() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_CNTCTROLE_SM_CO_ROLETYPE$0\"))");
			Log.info("Sel_SmartOnboardingRoles found in the TS_ChangeUserRoles_Page");
		} catch (Exception e) {
			Log.info("Sel_SmartOnboardingRoles not found in the TS_ChangeUserRoles_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement Lnk_AccountUnLock() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Account Unlock\"))");
			Log.info("Lnk_AccountUnLock found in the TS_ChangeUserRoles_Page");
		} catch (Exception e) {
			Log.info("Lnk_AccountUnLock not found in the TS_ChangeUserRoles_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement Btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORG_WRK_SM_CO_SAVE_PB\"))");
			Log.info("Sel_SmartOnboardingRoles found in the TS_ChangeUserRoles_Page");
		} catch (Exception e) {
			Log.info("Sel_SmartOnboardingRoles not found in the TS_ChangeUserRoles_Page");
			throw (e);
		}
		return element;
	}
	
	 public static WebElement btn_Yes() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@value='Yes']\"))");
				Log.info("btn_Yes found in TS_ChangeUserRoles_Page");
			} catch (Exception e) {
				Log.info("btn_Yes not found in TS_ChangeUserRoles_Page");
				throw (e);
			}
			return element;
		}
	
	 public static WebElement btn_Close() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@value='Close']\"))");
				Log.info("btn_Close found in TS_ChangeUserRoles_Page");
			} catch (Exception e) {
				Log.info("btn_Close not found in TS_ChangeUserRoles_Page");
				throw (e);
			}
			return element;
		}
	
	
}
