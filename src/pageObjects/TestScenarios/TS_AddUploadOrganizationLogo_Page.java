package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TS_AddUploadOrganizationLogo_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public TS_AddUploadOrganizationLogo_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement btn_AddUpdate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Add/Update Revision\"))");
			Log.info("btn_AddUpdate found in the TS_AddUploadOrganizationLogo_Page");
		} catch (Exception e) {
			Log.info("btn_AddUpdate not found in the TS_AddUploadOrganizationLogo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_AddNewValue() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSwitchMode\"))");
			Log.info("btn_AddNewValue found in the TS_AddUploadOrganizationLogo_Page");
		} catch (Exception e) {
			Log.info("btn_AddNewValue not found in the TS_AddUploadOrganizationLogo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_RevisionType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_HDR_SM_CD_REV_TYPE\"))");
			Log.info("sel_RevisionType found in the TS_AddUploadOrganizationLogo_Page");
		} catch (Exception e) {
			Log.info("sel_RevisionType not found in the TS_AddUploadOrganizationLogo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Descr() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_HDR_SM_CD_REV_DESCR\"))");
			Log.info("txt_Descr found in the TS_AddUploadOrganizationLogo_Page");
		} catch (Exception e) {
			Log.info("txt_Descr not found in the TS_AddUploadOrganizationLogo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_WRK_SM_CO_SAVE_PB\"))");
			Log.info("btn_Save found in the TS_AddUploadOrganizationLogo_Page");
		} catch (Exception e) {
			Log.info("btn_Save not found in the TS_AddUploadOrganizationLogo_Page");
			throw (e);
		}
		return element;
	}
	
	
			public static WebElement GetAttribute_RevisionID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//span[@sm-id='RevnbrInptSpan']\"))");
			Log.info("GetAttribute_RevisionID found in the TS_AddUploadOrganizationLogo_Page");
		} catch (Exception e) {
			Log.info("GetAttribute_RevisionID not found in the TS_AddUploadOrganizationLogo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Congif() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_WRK_SM_CD_CONFIGURE\"))");
			Log.info("btn_Congif found in the TS_AddUploadOrganizationLogo_Page");
		} catch (Exception e) {
			Log.info("btn_Congif not found in the TS_AddUploadOrganizationLogo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_Add() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX5\"))");
			Log.info("lnk_Add found in the TS_AddUploadOrganizationLogo_Page");
		} catch (Exception e) {
			Log.info("lnk_Add not found in the TS_AddUploadOrganizationLogo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Descr120() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_IMG_SM_CO_DESCR120\"))");
			Log.info("txt_Descr120 found in the TS_AddUploadOrganizationLogo_Page");
		} catch (Exception e) {
			Log.info("txt_Descr120 not found in the TS_AddUploadOrganizationLogo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_ImageType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_IMG_SM_CO_IMAGE_TYPE\"))");
			Log.info("sel_ImageType found in the TS_AddUploadOrganizationLogo_Page");
		} catch (Exception e) {
			Log.info("sel_ImageType not found in the TS_AddUploadOrganizationLogo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Upload1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_WRK_SM_CO_UPLOAD\"))");
			Log.info("btn_Upload1 found in the TS_AddUploadOrganizationLogo_Page");
		} catch (Exception e) {
			Log.info("btn_Upload1 not found in the TS_AddUploadOrganizationLogo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_FilePath() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.name(\"#ICOrigFileName\"))");
			Log.info("txt_FilePath found in the TS_AddUploadOrganizationLogo_Page");
		} catch (Exception e) {
			Log.info("txt_FilePath not found in the TS_AddUploadOrganizationLogo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Upload2() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@value='Upload']\"))");
			Log.info("btn_Upload2 found in the TS_AddUploadOrganizationLogo_Page");
		} catch (Exception e) {
			Log.info("btn_Upload2 not found in the TS_AddUploadOrganizationLogo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Save1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
			Log.info("btn_Save1 found in the TS_AddUploadOrganizationLogo_Page");
		} catch (Exception e) {
			Log.info("btn_Save1 not found in the TS_AddUploadOrganizationLogo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Return() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_WRK_SM_CO_RETURN_PB\"))");
			Log.info("btn_Return found in the TS_AddUploadOrganizationLogo_Page");
		} catch (Exception e) {
			Log.info("btn_Return not found in the TS_AddUploadOrganizationLogo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Apply() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_WRK_SM_CD_APPLY\"))");
			Log.info("btn_Apply found in the TS_AddUploadOrganizationLogo_Page");
		} catch (Exception e) {
			Log.info("btn_Apply not found in the TS_AddUploadOrganizationLogo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Ok() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICOK\"))");
			Log.info("btn_Ok found in the TS_AddUploadOrganizationLogo_Page");
		} catch (Exception e) {
			Log.info("btn_Ok not found in the TS_AddUploadOrganizationLogo_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_Close() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@value='Close']\"))");
			Log.info("btn_Close found in the TS_AddUploadOrganizationLogo_Page");
		} catch (Exception e) {
			Log.info("btn_Close not found in the TS_AddUploadOrganizationLogo_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement span_FileWindow() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.className(\"modal-title\"))");
			Log.info("btn_AddNewValue found in the TS_AddUploadOrganizationLogo_Page");
		} catch (Exception e) {
			Log.info("btn_AddNewValue not found in the TS_AddUploadOrganizationLogo_Page");
			throw (e);
		}
		return element;
	}
}
