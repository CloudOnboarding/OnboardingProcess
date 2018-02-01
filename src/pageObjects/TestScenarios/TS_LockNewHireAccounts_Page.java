package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TS_LockNewHireAccounts_Page extends BaseClass {
	private static WebElement element;

	public TS_LockNewHireAccounts_Page(WebDriver driver) {
		super(driver);
	}

	
	public static WebElement txt_QuickFliter() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@class='form-control input-sm']\"))");
			Log.info("txt_QuickFliter found in the TS_LockNewHireAccounts_Page");
		} catch (Exception e) {
			Log.info("txt_QuickFliter not found in the TS_LockNewHireAccounts_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Lnk_ConfigMenu() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"configMenu\"))");
			Log.info("lnk_ConfigMnu found in the TS_LockNewHireAccounts_Page");
		} catch (Exception e) {
			Log.info("lnk_ConfigMnu not found in the TS_LockNewHireAccounts_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement Lnk_HelpDeskConsole() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Help Desk Console\"))");
			Log.info("Lnk_HelpDeskConsole found in the TS_LockNewHireAccounts_Page");
		} catch (Exception e) {
			Log.info("Lnk_HelpDeskConsole not found in the TS_LockNewHireAccounts_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Lnk_Actions() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.partialLinkText(\"Select Actions\"))");
			Log.info("Lnk_Actions found in the TS_LockNewHireAccounts_Page");
		} catch (Exception e) {
			Log.info("Lnk_Actions not found in the TS_LockNewHireAccounts_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Lnk_AccountLock() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Account Lock\"))");
			Log.info("Lnk_AccountLock found in the TS_LockNewHireAccounts_Page");
		} catch (Exception e) {
			Log.info("Lnk_AccountLock not found in the TS_LockNewHireAccounts_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement Lnk_ResetEpin() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Reset Pin\"))");
			Log.info("Lnk_ResetEpin found in the TS_LockNewHireAccounts_Page");
		} catch (Exception e) {
			Log.info("Lnk_ResetEpin not found in the TS_LockNewHireAccounts_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement Lnk_ResetPwd() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Reset Password\"))");
			Log.info("Lnk_ResetPwd found in the TS_LockNewHireAccounts_Page");
		} catch (Exception e) {
			Log.info("Lnk_ResetPwd not found in the TS_LockNewHireAccounts_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement Lnk_AccountUnLock() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Account Unlock\"))");
			Log.info("Lnk_AccountUnLock found in the TS_LockNewHireAccounts_Page");
		} catch (Exception e) {
			Log.info("Lnk_AccountUnLock not found in the TS_LockNewHireAccounts_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement Btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORG_WRK_SM_CO_SAVE_PB\"))");
			Log.info("Sel_SmartOnboardingRoles found in the TS_LockNewHireAccounts_Page");
		} catch (Exception e) {
			Log.info("Sel_SmartOnboardingRoles not found in the TS_LockNewHireAccounts_Page");
			throw (e);
		}
		return element;
	}
	
	 public static WebElement btn_OK() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@value='OK']\"))");
				Log.info("btn_OK found in TS_LockNewHireAccounts_Page");
			} catch (Exception e) {
				Log.info("btn_OK not found in TS_LockNewHireAccounts_Page");
				throw (e);
			}
			return element;
		}
	
	 public static WebElement btn_Close() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@value='Close']\"))");
				Log.info("btn_Close found in TS_LockNewHireAccounts_Page");
			} catch (Exception e) {
				Log.info("btn_Close not found in TS_LockNewHireAccounts_Page");
				throw (e);
			}
			return element;
		}
	
	public static WebElement Lnk_AssignNewRoles() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Assign New Role\"))");
			Log.info("Lnk_AssignNewRoles found in the TS_LockNewHireAccounts_Page");
		} catch (Exception e) {
			Log.info("Lnk_AssignNewRoles not found in the TS_LockNewHireAccounts_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement Sel_SmartOnboardingRoles() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_CNTCTROLE_SM_CO_ROLETYPE$0\"))");
			Log.info("Sel_SmartOnboardingRoles found in the TS_LockNewHireAccounts_Page");
		} catch (Exception e) {
			Log.info("Sel_SmartOnboardingRoles not found in the TS_LockNewHireAccounts_Page");
			throw (e);
		}
		return element;
	}
	
	
	
}
