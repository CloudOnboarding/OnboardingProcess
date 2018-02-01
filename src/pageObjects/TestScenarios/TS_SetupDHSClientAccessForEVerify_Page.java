package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TS_SetupDHSClientAccessForEVerify_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public TS_SetupDHSClientAccessForEVerify_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement lnk_ConfigMnu() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"configMenu\"))");
			Log.info(" lnk_ConfigMnu found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" lnk_ConfigMnu not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_More() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"More\"))");
			Log.info(" lnk_DHSClientSetup found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" lnk_DHSClientSetup not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_DHSClientSetup() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Smart I-9 DHS Client Setup\"))");
			Log.info(" lnk_DHSClientSetup found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" lnk_DHSClientSetup not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement prmt_CompanyId() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_CLIENTPWD_SM_I9_COMPANYID$prompt$0\"))");
			Log.info(" btn_CompanyId found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" btn_CompanyId not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_CompanyAttributeID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SEARCH_RESULT1\"))");
			Log.info(" lnk_CompanyAttributeID found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" lnk_CompanyAttributeID not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement prmt_BusinessunitID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_CLIENTPWD_BUSINESS_UNIT$prompt$0\"))");
			Log.info(" btn_BusinessunitID found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" btn_BusinessunitID not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_BUAttributeID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"RESULT2$0\"))");
			Log.info(" lnk_BUAttributeID found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" lnk_BUAttributeID not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_DHSUserId() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_CLIENTPWD_SM_I9_DHS_USERID$0\"))");
			Log.info(" txt_DHSUserId found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" txt_DHSUserId not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_Password() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_CLIENTPWD_SM_I9_DHS_PWD$0\"))");
			Log.info(" txt_Password found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" txt_Password not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_ConfirmPassword() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_CLIENTPWD_SM_I9_DHS_CNFRMPWD$0\"))");
			Log.info(" txt_ConfirmPassword found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" txt_ConfirmPassword not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement sel_Type() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_NOTRLESET_SM_I9_NOT_RLE_TYPE$0\"))");
			Log.info(" sel_Type found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" sel_Type not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement sel_RoleType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_NOTRLESET_SM_CO_ROLETYPE$0\"))");
			Log.info(" sel_RoleType found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" sel_RoleType not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_Add() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_WRK_ADD_PB$0\"))");
			Log.info(" sel_RoleType found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" sel_RoleType not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_AddLn2() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_WRK_ADD_PB$2\"))");
			Log.info(" sel_RoleType found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" sel_RoleType not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement sel_Type1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_NOTRLESET_SM_I9_NOT_RLE_TYPE$1\"))");
			Log.info(" sel_Type1 found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" sel_Type1 not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement sel_RoleType1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_NOTRLESET_SM_CO_ROLETYPE$1\"))");
			Log.info(" sel_RoleType1 found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" sel_RoleType1 not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_VerifyCPSConnection() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_CLTPWD_WK_SM_I9_VERIF_CPS$0\"))");
			Log.info(" lnk_VerifyCPSConnection found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" lnk_VerifyCPSConnection not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
			Log.info(" btn_Save found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" btn_Save not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_Close() throws Exception {
		   element = null;
		   try {
		    element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@value='Close']\"))");
		    Log.info("btn_Close found in TS_SetupDHSClientAccessForEVerify_Page");
		   } catch (Exception e) {
		    Log.info("btn_Close not found in TS_SetupDHSClientAccessForEVerify_Page");
		    throw (e);
		   }
		   return element;
		  }
	


	public static WebElement prmt_CompanyId1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_CLIENTPWD_SM_I9_COMPANYID$prompt$1\"))");
			Log.info(" prmt_CompanyId1 found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" prmt_CompanyId1 not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_CompanyAttributeID1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"RESULT1$1\"))");
			Log.info(" lnk_CompanyAttributeID1 found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" lnk_CompanyAttributeID1 not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement prmt_BusinessunitID1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_CLIENTPWD_BUSINESS_UNIT$prompt$1\"))");
			Log.info(" prmt_BusinessunitID1 found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" prmt_BusinessunitID1 not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_BUAttributeID1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"RESULT1$1\"))");
			Log.info(" lnk_BUAttributeID1 found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" lnk_BUAttributeID1 not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_DHSUserId1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_CLIENTPWD_SM_I9_DHS_USERID$1\"))");
			Log.info(" txt_DHSUserId1 found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" txt_DHSUserId1 not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_Password1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_CLIENTPWD_SM_I9_DHS_PWD$1\"))");
			Log.info(" txt_Password1 found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" txt_Password1 not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_ConfirmPassword1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_CLIENTPWD_SM_I9_DHS_CNFRMPWD$1\"))");
			Log.info(" txt_ConfirmPassword1 found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" txt_ConfirmPassword1 not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement sel_Type2() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_NOTRLESET_SM_I9_NOT_RLE_TYPE$2\"))");
			Log.info(" sel_Type2 found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" sel_Type2 not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement sel_RoleType2() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_NOTRLESET_SM_CO_ROLETYPE$2\"))");
			Log.info(" sel_RoleType2 found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" sel_RoleType2 not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_Add1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@sm-id='AddClientBtnBtnLbl']\"))");
			Log.info(" btn_Add1 found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" btn_Add1 not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement sel_Type3() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_NOTRLESET_SM_I9_NOT_RLE_TYPE$3\"))");
			Log.info(" sel_Type3 found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" sel_Type3 not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement sel_RoleType3() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_NOTRLESET_SM_CO_ROLETYPE$3\"))");
			Log.info(" sel_RoleType3 found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" sel_RoleType3 not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_VerifyCPSConnection1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_CLTPWD_WK_SM_I9_VERIF_CPS$2\"))");
			Log.info(" lnk_VerifyCPSConnection1 found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" lnk_VerifyCPSConnection1 not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement rdbtn_RadioButton() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_CLTPWD_HD_SM_I9_SETMODE\"))");
			Log.info(" sel_RoleType3 found in the TS_SetupDHSClientAccessForEVerify_Page");
		} catch (Exception e) {
			Log.info(" sel_RoleType3 not found in the TS_SetupDHSClientAccessForEVerify_Page");
			throw (e);
		}
		return element;
	}
	
		
}
