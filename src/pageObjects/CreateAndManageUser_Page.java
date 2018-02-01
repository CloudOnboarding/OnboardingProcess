package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.psUtility;

public class CreateAndManageUser_Page extends BaseClass {
	private static WebElement element;

	public CreateAndManageUser_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement btn_AddNewUser() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//span[@sm-id='addBtnBtnLbl']\"))");
			Log.info("btn_AddNewUser  found in CreateAndManageUser_Page");
		} catch (Exception e) {
			Log.info("btn_AddNewUser  not found in CreateAndManageUser_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_InviteTuFirstName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_NAME_WORK_FIRST_NAME$0\"))");
			Log.info("txt_InviteTuFirstName  found in CreateAndManageUser_Page");
		} catch (Exception e) {
			Log.info("txt_InviteTuFirstName  not found in CreateAndManageUser_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_InviteTuLastName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_NAME_WORK_LAST_NAME$0\"))");
			Log.info("txt_InviteTuLastName  found in CreateAndManageUser_Page");
		} catch (Exception e) {
			Log.info("txt_InviteTuLastName not  found in CreateAndManageUser_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_InviteTuEmail() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_CNTWEML_V_EMAILID$0\"))");
			Log.info("txt_InviteTuEmail  found in CreateAndManageUser_Page");
		} catch (Exception e) {
			Log.info("txt_InviteTuEmail not  found in CreateAndManageUser_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_InviteTuPhone() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_CNTWPHN_V_PHONE$0\"))");
			Log.info("txt_InviteTuPhone  found in CreateAndManageUser_Page");
		} catch (Exception e) {
			Log.info("txt_InviteTuPhone not  found in CreateAndManageUser_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_InviteTuSmartOnbRolesDefault() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_CNTCTROLE_SM_CO_ROLETYPE$0\"))");
			Log.info("select_InviteTuSmartOnbRoles  found in CreateAndManageUser_Page");
		} catch (Exception e) {
			Log.info("select_InviteTuSmartOnbRoles  not found in CreateAndManageUser_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_InviteTuSmartOnbRoles() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_CNTCTROLE_SM_CO_ROLETYPE$1\"))");
			Log.info("select_InviteTuSmartOnbRoles  found in CreateAndManageUser_Page");
		} catch (Exception e) {
			Log.info("select_InviteTuSmartOnbRoles  not found in CreateAndManageUser_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Add() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORG_WRK_ADD_PB$0\"))");
			Log.info("btn_AddNewUser  found in CreateAndManageUser_Page");
		} catch (Exception e) {
			Log.info("btn_AddNewUser  not found in CreateAndManageUser_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_InviteTuSave() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@sm-id='SaveBtn']\"))");
			Log.info("btn_InviteTuSave  found in CreateAndManageUser_Page");
		} catch (Exception e) {
			Log.info("btn_InviteTuSave not  found in CreateAndManageUser_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_InviteTuLaunch() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@sm-id='InviteBtn']\"))");
			Log.info("btn_InviteTuLaunch  found in CreateAndManageUser_Page");
		} catch (Exception e) {
			Log.info("btn_InviteTuLaunch not  found in CreateAndManageUser_Page");
			throw (e);
		}
		return element;
	}
}
