package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.psUtility;

public class SelectRoleType_Page extends BaseClass {

	private static WebElement element;
	public static boolean EHomeLnkExts;

	public SelectRoleType_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement lnk_EVerifyAdministrator() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"E-Verify Specialist\"))");
			Log.info("lnk_EVerifyAdministrator found in SelectRoleType_Page");
		} catch (Exception e) {
			Log.info("lnk_EVerifyAdministrator not found in SelectRoleType_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_RoleSwitch() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@id='sm_role_switch']\"))");
			Log.info("lnk_RoleSwitch found in SelectRoleType_Page");
		} catch (Exception e) {
			Log.info("lnk_RoleSwitch not found in SelectRoleType_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_HRAdministrator() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"HR Specialist\"))");
			Log.info("lnk_HRAdministrator found in SelectRoleType_Page");
		} catch (Exception e) {
			Log.info("lnk_HRAdministrator not found in SelectRoleType_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_HRHelpdesk() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Help Desk Analyst\"))");
			Log.info("lnk_HRHelpdesk found in SelectRoleType_Page");
		} catch (Exception e) {
			Log.info("lnk_HRHelpdesk not found in SelectRoleType_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_I9Administrator() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"I-9 Specialist\"))");
			Log.info("lnk_I9Administrator found in SelectRoleType_Page");
		} catch (Exception e) {
			Log.info("lnk_I9Administrator not found in SelectRoleType_Page");
			throw (e);
		}
		return element;
	}
}
