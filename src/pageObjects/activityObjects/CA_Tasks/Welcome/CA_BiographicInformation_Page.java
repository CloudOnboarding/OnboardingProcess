package pageObjects.activityObjects.CA_Tasks.Welcome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_BiographicInformation_Page extends BaseClass {
	public static WebElement element;

	public CA_BiographicInformation_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement select_Prefix() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_NAMES_NAME_PREFIX\"))");

			Log.info("select_Prefix found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("select_Prefix not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_FirstName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_NAMES_FIRST_NAME\"))");

			Log.info("txt_FirstName found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("txt_FirstName not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_MiddleName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_NAMES_MIDDLE_NAME\"))");

			Log.info("txt_MiddleName found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("txt_MiddleName not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_LastName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_NAMES_LAST_NAME\"))");

			Log.info("txt_LastName found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("txt_LastName not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_NameSuffix() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_NAMES_NAME_SUFFIX\"))");

			Log.info("select_NameSuffix found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("select_NameSuffix not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement Select_Gender() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_PERSON_SEX\"))");

			Log.info("Select_Gender found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("Select_Gender not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_MaritalStatus() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_PERSON_MAR_STATUS\"))");

			Log.info("select_MaritalStatus found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("select_MaritalStatus not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement Select_CountryFoBirth() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_PERSON_BIRTHCOUNTRY\"))");

			Log.info("Select_CountryFoBirth found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("Select_CountryFoBirth not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_DOB() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_SENFLD_WK_SM_CO_BIRTHDATE\"))");

			Log.info("txt_DOB found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("txt_DOB not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_SSN() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_SENFLD_WK_SM_CO_SSN$0\"))");

			Log.info("txt_SSN found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("txt_SSN not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_CofirmSSN() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_SENFLD_WK_SM_CO_SSN_REC$0\"))");

			Log.info("txt_CofirmSSN found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("txt_CofirmSSN not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_NIDexpireDt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_PERS_NID_NID_EXPIRY_DATE$0\"))");

			Log.info("txt_NIDexpireDt found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("txt_NIDexpireDt not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_HomePhone() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_SENFLD_WK_SM_CO_PHONE\"))");

			Log.info("txt_HomePhone found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("txt_HomePhone not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_CellPhone() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_SENFLD_WK_SM_CO_PHONE_REC\"))");

			Log.info("txt_CellPhone found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("txt_CellPhone not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Email() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_SENFLD_WK_SM_CO_EMAILID\"))");

			Log.info("txt_Email found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("txt_Email not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_ConfirmEmail() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_SENFLD_WK_SM_CO_EMAIL_ADDR\"))");

			Log.info("txt_ConfirmEmail found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("txt_ConfirmEmail not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkBx_MailingAddress() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EBI_WRK_SM_OB_CPY_HOM_ADDR\"))");

			Log.info("select_MailingAddress found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("select_MailingAddress not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_EmergencyContFirstName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EMER_WRK_FIRST_NAME$0\"))");

			Log.info("txt_EmergencyContFirstName found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("txt_EmergencyContFirstName not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_EmergencyContLastName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EMER_WRK_LAST_NAME$0\"))");

			Log.info("txt_EmergencyContLastName found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("txt_EmergencyContLastName not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_Suffix() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EMER_WRK_NAME_SUFFIX$0\"))");

			Log.info("select_Suffix found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("select_Suffix not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_RelationShip() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EMER_WRK_RELATIONSHIP$0\"))");

			Log.info("select_RelationShip found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("select_RelationShip not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_PhoneType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EMER_WRK_PHONE_TYPE$0\"))");

			Log.info("select_PhoneType found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("select_PhoneType not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_PrimaryPhone() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_SENFLD_WK_SM_CO_PHONE$252$$0\"))");

			Log.info("txt_PrimaryPhone found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("txt_PrimaryPhone not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_secPhoneType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EMER_WRK_SM_OB_PHN_TYP1$0\"))");

			Log.info("select_secPhoneType found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("select_secPhoneType not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_PhoneNumber() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_SENFLD_WK_SM_CO_PHONE_REC$253$$0\"))");

			Log.info("txt_PhoneNumber found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("txt_PhoneNumber not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_EBI_WRK_SAVE_PB\"))");

			Log.info("btn_Save found in the CA_BiographicInformation_Page");
		} catch (Exception e) {
			Log.info("btn_Save not found in the CA_BiographicInformation_Page");
			throw (e);
		}
		return element;
	}

}
