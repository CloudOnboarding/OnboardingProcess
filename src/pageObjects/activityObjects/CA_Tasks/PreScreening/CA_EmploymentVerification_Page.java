package pageObjects.activityObjects.CA_Tasks.PreScreening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_EmploymentVerification_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public CA_EmploymentVerification_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement txt_EmployerName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EMPVER_RE_SM_OB_EMPLOYER$0\"))");
			Log.info("txt_EmployerName found in the CA_EmploymentVerification_Page");
		} catch (Exception e) {
			Log.info("txt_EmployerName not found in the CA_EmploymentVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Phoneno() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EMPVER_RE_SM_OB_PHONE_NUM$0\"))");
			Log.info("txt_Phoneno found in the CA_EmploymentVerification_Page");
		} catch (Exception e) {
			Log.info("txt_Phoneno not found in the CA_EmploymentVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Address1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"ADDRESS1_1$0\"))");
			Log.info("txt_Address1 found in the CA_EmploymentVerification_Page");
		} catch (Exception e) {
			Log.info("txt_Address1 not found in the CA_EmploymentVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Address2() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"ADDRESS2_1$0\"))");
			Log.info("txt_Address2 found in the CA_EmploymentVerification_Page");
		} catch (Exception e) {
			Log.info("txt_Address2 not found in the CA_EmploymentVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_City() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"CITY_1$0\"))");
			Log.info("txt_City found in the CA_EmploymentVerification_Page");
		} catch (Exception e) {
			Log.info("txt_City not found in the CA_EmploymentVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_State() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"STATE_1$0\"))");
			Log.info("sel_State found in the CA_EmploymentVerification_Page");
		} catch (Exception e) {
			Log.info("sel_State not found in the CA_EmploymentVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Postal() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"POSTAL_1$0\"))");
			Log.info("txt_Postal found in the CA_EmploymentVerification_Page");
		} catch (Exception e) {
			Log.info("txt_Postal not found in the CA_EmploymentVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_County() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"COUNTY_1$0\"))");
			Log.info("txt_County found in the CA_EmploymentVerification_Page");
		} catch (Exception e) {
			Log.info("txt_County not found in the CA_EmploymentVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_FromDt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EMPVER_RE_SM_OB_EMPL_FRMDATE$0\"))");
			Log.info("txt_FromDt found in the CA_EmploymentVerification_Page");
		} catch (Exception e) {
			Log.info("txt_FromDt not found in the CA_EmploymentVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_ToDt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EMPVER_RE_SM_OB_EMPL_TODATE$0\"))");
			Log.info("txt_ToDt found in the CA_EmploymentVerification_Page");
		} catch (Exception e) {
			Log.info("txt_ToDt not found in the CA_EmploymentVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Position() throws Exception {
		element = null;
		try {
			element = psUtility
					.switchFrame("driver.findElement(By.id(\"SM_OB_EMPVER_RE_SM_OB_POSITION$0\")).sendKeys(\"Sr");
			Log.info("txt_Position found in the CA_EmploymentVerification_Page");
		} catch (Exception e) {
			Log.info("txt_Position not found in the CA_EmploymentVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_salary() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EMPVER_RE_SM_OB_SALARY$0\"))");
			Log.info("txt_salary found in the CA_EmploymentVerification_Page");
		} catch (Exception e) {
			Log.info("txt_salary not found in the CA_EmploymentVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_currency() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EMPVER_RE_CURRENCY_CD$0\"))");
			Log.info("sel_currency found in the CA_EmploymentVerification_Page");
		} catch (Exception e) {
			Log.info("sel_currency not found in the CA_EmploymentVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_EmplmntType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EMPVER_RE_SM_OB_EMPLMNT_TYPE$0\"))");
			Log.info("sel_EmplmntType found in the CA_EmploymentVerification_Page");
		} catch (Exception e) {
			Log.info("sel_EmplmntType not found in the CA_EmploymentVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbx_currentEmplyr() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EMPVERIFY_SM_OB_ALL_EMP_HIST\"))");
			Log.info("chkbx_currentEmplyr found in the CA_EmploymentVerification_Page");
		} catch (Exception e) {
			Log.info("chkbx_currentEmplyr not found in the CA_EmploymentVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbx_Certify() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EMPVER_WK_SM_OB_CERTIFY\"))");
			Log.info("chkbx_Certify found in the CA_EmploymentVerification_Page");
		} catch (Exception e) {
			Log.info("chkbx_Certify not found in the CA_EmploymentVerification_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EMPVER_WK_SM_OB_EMPVER_SAVE\"))");
			Log.info("btn_Save found in the CA_EmploymentVerification_Page");
		} catch (Exception e) {
			Log.info("btn_Save not found in the CA_EmploymentVerification_Page");
			throw (e);
		}
		return element;
	}
}
