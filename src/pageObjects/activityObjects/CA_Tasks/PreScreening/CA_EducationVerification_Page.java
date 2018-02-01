package pageObjects.activityObjects.CA_Tasks.PreScreening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_EducationVerification_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public CA_EducationVerification_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement txt_SchoolName() throws Exception {
		element = null;
		try {
			element = psUtility
					.switchFrame("driver.findElement(By.id(\"SM_OB_EDUVERIFY_SM_OB_SCHOOL_NAME$0\")).sendKeys(\"St");
			Log.info("txt_SchoolName found in the CA_EducationVerification_Page");
		} catch (Exception e) {
			Log.info("txt_SchoolName not found in the CA_EducationVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_City() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"CITY_1$0\"))");
			Log.info("txt_City found in the CA_EducationVerification_Page");
		} catch (Exception e) {
			Log.info("txt_City not found in the CA_EducationVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_State() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"STATE_1$0\"))");
			Log.info("sel_State found in the CA_EducationVerification_Page");
		} catch (Exception e) {
			Log.info("sel_State not found in the CA_EducationVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Address1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"ADDRESS1_1$0\"))");
			Log.info("txt_Address1 found in the CA_EducationVerification_Page");
		} catch (Exception e) {
			Log.info("txt_Address1 not found in the CA_EducationVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Address2() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"ADDRESS2_1$0\"))");
			Log.info("txt_Address2 found in the CA_EducationVerification_Page");
		} catch (Exception e) {
			Log.info("txt_Address2 not found in the CA_EducationVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Postal() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"POSTAL_1$0\"))");
			Log.info("txt_Postal found in the CA_EducationVerification_Page");
		} catch (Exception e) {
			Log.info("txt_Postal not found in the CA_EducationVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_County() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"COUNTY_1$0\"))");
			Log.info("txt_County found in the CA_EducationVerification_Page");
		} catch (Exception e) {
			Log.info("txt_County not found in the CA_EducationVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdbtn_Graduate_No() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"GRADUATE_N$0\"))");
			Log.info("txt_Graduate found in the CA_EducationVerification_Page");
		} catch (Exception e) {
			Log.info("txt_Graduate not found in the CA_EducationVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbox_certify() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EDVER_WRK_SM_OB_CERTIFY\"))");
			Log.info("chkbox_certify found in the CA_EducationVerification_Page");
		} catch (Exception e) {
			Log.info("chkbox_certify not found in the CA_EducationVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EDVER_WRK_SM_OB_EDUVER_SAVE\"))");
			Log.info("btn_save found in the CA_EducationVerification_Page");
		} catch (Exception e) {
			Log.info("btn_save not found in the CA_EducationVerification_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_AttendanceFrom() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EDUVERIFY_SM_OB_ATT_FROMDATE$0\"))");
			Log.info("txt_AttendanceFrom found in the CA_EducationVerification_Page");
		} catch (Exception e) {
			Log.info("txt_AttendanceFrom not found in the CA_EducationVerification_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_Attendanceto() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EDUVERIFY_SM_OB_ATT_TODATE$0\"))");
			Log.info("txt_Attendanceto found in the CA_EducationVerification_Page");
		} catch (Exception e) {
			Log.info("txt_Attendanceto not found in the CA_EducationVerification_Page");
			throw (e);
		}
		return element;
	}
}
