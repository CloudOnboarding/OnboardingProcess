package pageObjects.Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class RV_CreateRevisions_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public RV_CreateRevisions_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement lnk_ConfigMnu() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"configMenu\"))");
			Log.info(" lnk_ConfigMnu found in the RV_CreateRevisions_Page");
		} catch (Exception e) {
			Log.info(" lnk_ConfigMnu not found in the RV_CreateRevisions_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_AddUpdRevsn() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Add/Update Revision\"))");
			Log.info(" lnk_AddUpdRevsn found in the RV_CreateRevisions_Page");
		} catch (Exception e) {
			Log.info(" lnk_AddUpdRevsn not found in the RV_CreateRevisions_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_AddMode() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSwitchMode\"))");
			Log.info(" lnk_AddMode found in the RV_CreateRevisions_Page");
		} catch (Exception e) {
			Log.info(" lnk_AddMode not found in the RV_CreateRevisions_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_RevisionType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_HDR_SM_CD_REV_TYPE\"))");
			Log.info(" sel_RevisionType found in the RV_CreateRevisions_Page");
		} catch (Exception e) {
			Log.info(" sel_RevisionType not found in the RV_CreateRevisions_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_RevisionNum() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REVHD_VW_SM_CD_REV_NBR\"))");
			Log.info(" txt_RevisionNum found in the RV_CreateRevisions_Page");
		} catch (Exception e) {
			Log.info(" txt_RevisionNum not found in the RV_CreateRevisions_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Descr() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_HDR_SM_CD_REV_DESCR\"))");
			Log.info(" txt_Descr found in the RV_CreateRevisions_Page");
		} catch (Exception e) {
			Log.info(" txt_Descr not found in the RV_CreateRevisions_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Search() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSearch\"))");
			Log.info(" btn_Search found in the RV_CreateRevisions_Page");
		} catch (Exception e) {
			Log.info(" btn_Search not found in the RV_CreateRevisions_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement lnk_RevisionNumber() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SEARCH_RESULTLAST\"))");
			Log.info(" lnk_RevisionNumber found in the RV_CreateRevisions_Page");
		} catch (Exception e) {
			Log.info(" lnk_RevisionNumber not found in the RV_CreateRevisions_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_WRK_SM_CO_SAVE_PB\"))");
			Log.info(" btn_Save found in the RV_CreateRevisions_Page");
		} catch (Exception e) {
			Log.info(" btn_Save not found in the RV_CreateRevisions_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement get_RevNum() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@sm-id='RevnbrInptSpan']\"))");
			Log.info(" get_RevNum found in the RV_CreateRevisions_Page");
		} catch (Exception e) {
			Log.info(" get_RevNum not found in the RV_CreateRevisions_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_ViewEdit() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_WRK_SM_CO_VIEW\"))");
			Log.info(" btn_ViewEdit found in the RV_CreateRevisions_Page");
		} catch (Exception e) {
			Log.info(" btn_ViewEdit not found in the RV_CreateRevisions_Page");
			throw (e);
		}
		return element;
	}


	public static WebElement btn_Config() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_WRK_SM_CD_CONFIGURE\"))");
			Log.info(" btn_Config found in the RV_CreateRevisions_Page");
		} catch (Exception e) {
			Log.info(" btn_Config not found in the RV_CreateRevisions_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_Result() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SEARCH_RESULT1\"))");
			Log.info(" lnk_Result found in the RV_CreateRevisions_Page");
		} catch (Exception e) {
			Log.info(" lnk_Result not found in the RV_CreateRevisions_Page");
			throw (e);
		}
		return element;
	}
	
}
