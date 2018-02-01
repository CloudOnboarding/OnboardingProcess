package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.psUtility;

public class OrginizationRegistration_Page extends BaseClass {
	public static WebElement element;
	public static String OrgnizationID = null;
	public static boolean OrgNameFldexts;

	public OrginizationRegistration_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement txt_OrganizationName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORGINVITE_SM_CO_ORG_NAME\"))");
			OrgNameFldexts = driver.findElements(By.id("SM_CO_ORGINVITE_SM_CO_ORG_NAME")).size() != 0;
			Log.info("txt_OrganizationName found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("txt_OrganizationName not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Description() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORGINVITE_DESCR\"))");
			Log.info("txt_Description found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("txt_Description not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_ShortDescription() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORGINVITE_DESCRSHORT\"))");
			Log.info("txt_ShortDescription found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("txt_ShortDescription not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Host() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORGINVITE_HOSTNAME\"))");
			Log.info("txt_Host found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("txt_Host not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_FormatUsing() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_NAME_WORK_COUNTRY_NM_FORMAT\"))");
			Log.info("select_FormatUsing found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("select_FormatUsing not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_NamePrefix() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_NAME_WORK_NAME_PREFIX\"))");
			Log.info("select_NamePrefix found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("select_NamePrefix not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_FirstName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_NAME_WORK_FIRST_NAME\"))");
			Log.info("txt_FirstName found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("txt_FirstName not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_MiddleName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_NAME_WORK_MIDDLE_NAME\"))");
			Log.info("txt_MiddleName found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("txt_MiddleName not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_LastName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_NAME_WORK_LAST_NAME\"))");
			Log.info("txt_LastName found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("txt_LastName not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_NameSiffix() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_NAME_WORK_NAME_SUFFIX\"))");
			Log.info("select_NameSiffix found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("select_NameSiffix not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Personalemailid() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORGINVITE_EMAILID\"))");
			Log.info("txt_Personalemailid found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("txt_Personalemailid not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	// this field is related to Personal Phone
	public static WebElement txt_PhonecountryCode() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORGINVITE_SM_CO_PHCOUNTRY_CD\"))");
			Log.info("txt_PhonecountryCode found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("txt_PhonecountryCode not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	// this field is related to Personal Phone
	public static WebElement txt_PhoneNumber() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORGINVITE_PHONE\"))");
			Log.info("txt_PhoneNumber found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("txt_PhoneNumber not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_Industry() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORGINVITE_SM_CD_INDUSTRY\"))");
			Log.info("select_Industry found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("select_Industry not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_ModelOrganizationID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORGINVITE_SM_CO_MODEL_ORG_ID\"))");
			Log.info("txt_ModelOrganizationID found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("txt_ModelOrganizationID not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_ModelBusinessProcess() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORGINVITE_SM_CO_MODEL_BP_ID\"))");
			Log.info("txt_ModelBusinessProcess found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("txt_ModelBusinessProcess not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	// Org Products Grid
	public static WebElement txt_EffectiveDate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_O_PRD_EFF_EFFDT$0\"))");
			Log.info("txt_EffectiveDate found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("txt_EffectiveDate not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_Product() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_O_PRODUCT_SM_CO_PRODUCT_CD$0$0\"))");
			Log.info("select_Product found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("select_Product not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_Status() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_O_PRODUCT_SM_CO_PRODUCT_STS$0\"))");
			Log.info("select_Status found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("select_Status not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	// Organization Provider Grid
	public static WebElement txt_ProviderId() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_O_PRVDR_H_SM_CD_PROVIDER_ID$0\"))");
			Log.info("txt_ProviderId found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("txt_ProviderId not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	// Copy Option grid
	public static WebElement rdbtn_ConfigurationAndSampleData() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORGINVITE_SM_CD_ORG_CPY_OPTN$113$\"))");
			Log.info("rbtn_ConfigurationSampleData found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			System.out.println("rbtn_ConfigurationSampleData not found in the OrginizationRegistration_Page");
			Log.info("rbtn_ConfigurationSampleData not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_OrganizationSource() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORGINVITE_SM_CO_ORG_SOURCE\"))");
			Log.info("select_OrganizationSource found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("select_OrganizationSource not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORG_WRK_SM_CO_SAVE_PB\"))");
			Log.info("btn_Save found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("btn_Save not found in the OrginizationRegistration_Page");
			System.out.println("Button Save");
			throw (e);
		}
		return element;
	}

	/* Retrieving Page Object Elements */
	public static WebElement get_PageTitle() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.className(\"PAPAGETITLE\"))");
			Log.info("get_PageTitle found in the OrginizationRegistration_Page");
		} catch (Exception e) {
			Log.info("get_PageTitle not found in the OrginizationRegistration_Page");
			throw (e);
		}
		return element;
	}

}
