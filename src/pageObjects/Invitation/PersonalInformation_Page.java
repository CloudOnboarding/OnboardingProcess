package pageObjects.Invitation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class PersonalInformation_Page extends BaseClass {

	private static WebElement element;

	public PersonalInformation_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement select_NamePrefix() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_NAME_WORK_NAME_PREFIX\"))");
			Log.info("select_NamePrefix found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("select_NamePrefix not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_FirstName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_NAME_WORK_FIRST_NAME\"))");
			Log.info("txt_FirstName found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("txt_FirstName not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_MiddleName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_NAME_WORK_MIDDLE_NAME\"))");
			Log.info("txt_MiddleName found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("txt_MiddleName not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_LastName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_NAME_WORK_LAST_NAME\"))");
			Log.info("txt_LastName found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("txt_LastName not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_NameSuffix() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_NAME_WORK_NAME_SUFFIX\"))");
			Log.info("select_NameSuffix found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("select_NameSuffix not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_AddressType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_ADDR_ADDRESS_TYPE$0\"))");
			Log.info("select_AddressType found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("select_AddressType not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_Country() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ADDR_WORK_COUNTRY$0$0\"))");
			Log.info("select_Country found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("select_Country not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement select_Contry() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"COUNTRY_1$0\"))");
			Log.info("select_Country found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("select_Country not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}


	public static WebElement txt_County() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@sm-id='countyInpt']\"))");
			Log.info("txt_County found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("txt_County not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Address1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@sm-id='address1Inpt']\"))");
			Log.info("txt_Address1 found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("txt_Address1 not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Address2() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@sm-id='address2Inpt']\"))");
			Log.info("txt_Address2 found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("txt_Address2 not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Address3() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@sm-id='address3Inpt']\"))");
			Log.info("txt_Address3 found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("txt_Address3 not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_City() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@sm-id='cityInpt']\"))");
			Log.info("txt_City found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("txt_City not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_State() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//select[@sm-id='stateInpt']\"))");
			Log.info("select_State found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("select_State not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Postal() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@sm-id='postalInpt']\"))");
			Log.info("txt_Postal found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("txt_Postal not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Country() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ADDR_WORK_COUNTY$0$0\"))");
			Log.info("txt_Country found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("txt_Country not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Telephone() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_PHONE_PHONE$0\"))");
			Log.info("txt_Telephone found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("txt_Telephone not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_PhoneType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_PHONE_PHONE_TYPE$0\"))");
			Log.info("select_PhoneType found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("select_PhoneType not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbx_PhonePreffered() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_PHONE_PREF_PHONE_FLAG$0\"))");
			Log.info("chkbx_PhonePreffered found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("chkbx_PhonePreffered not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_EmailId() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_EMAIL_EMAIL_ADDR$0\"))");
			Log.info("txt_EmailId found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("txt_EmailId not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbx_EmailPreffered() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_EMAIL_PREF_EMAIL_FLAG$0\"))");
			Log.info("chkbx_EmailPreffered found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("chkbx_EmailPreffered not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_EmailType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_EMAIL_E_ADDR_TYPE$0\"))");
			Log.info("select_EmailType found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("select_EmailType not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_Next() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_DF_HOOK_WK_SM_DF_NEXT_TASK\"))");
			Log.info("lnk_Next found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info("lnk_Next not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement nonEdit_CandidateId() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//span[@sm-id='candidateID']\"))");
			Log.info(" nonEdit_CandidateId found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info(" nonEdit_CandidateId not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement nonEdit_InvitationStatus() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//span[@sm-id='invitStatus']\"))");
			Log.info(" nonEdit_InvitationStatus found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info(" nonEdit_InvitationStatus not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Launch() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_WRK_SM_OB_LAUNCH_BP\"))");
			Log.info(" btn_Launch found in the PersonalInformation_Page");
		} catch (Exception e) {
			Log.info(" btn_Launch not found in the PersonalInformation_Page");
			throw (e);
		}
		return element;
	}

}
