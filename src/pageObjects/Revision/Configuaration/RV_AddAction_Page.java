package pageObjects.Revision.Configuaration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class RV_AddAction_Page extends BaseClass{
	
	private static WebElement element;

	public RV_AddAction_Page(WebDriver driver) {
		super(driver);
	}
	public static WebElement txt_QuickFilter() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@class='form-control input-sm']\"))");
			Log.info("txt_QuickFilter found in RV_AddAction_Page");
		} catch (Exception e) {
			Log.info("txt_QuickFilter not found in RV_AddAction_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_stageName(String stepName) throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[text()='"+stepName+"']\"))");
			Log.info("lnk_stageName found in RV_AddAction_Page");
		} catch (Exception e) {
			Log.info("lnk_stageName not found in RV_AddAction_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_addAction() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(linkText(\"Add\"))");
			Log.info("lnk_stageName found in RV_AddAction_Page");
		} catch (Exception e) {
			Log.info("lnk_stageName not found in RV_AddAction_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement chkbx_ActionID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@sm-id='selectColInpt']\"))");
			Log.info("chkbx_ActionID found in RV_AddAction_Page");
		} catch (Exception e) {
			Log.info("chkbx_ActionID not found in RV_AddAction_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_OK() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_BPR_AS_WK_SM_BP_OK\"))");
			Log.info("btn_OK found in RV_AddAction_Page");
		} catch (Exception e) {
			Log.info("btn_OK not found in RV_AddAction_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement get_ActionName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//span[@sm-parent='actionNameColInptWrpr']\"))");
			Log.info("get_ActionName found in RV_AddAction_Page");
		} catch (Exception e) {
			Log.info("get_ActionName not found in RV_AddAction_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement chkbx_AlwaysRoute() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_RLDTL_STG_SM_CD_ALWAYSROUTE\"))");
			Log.info("chkbx_AlwaysRoute found in RV_AddAction_Page");
		} catch (Exception e) {
			Log.info("chkbx_AlwaysRoute not found in RV_AddAction_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_CriteriaPGOK() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_SEC_W_SM_CD_OK\"))");
			Log.info("btn_CriteriaPGOK found in RV_AddAction_Page");
		} catch (Exception e) {
			Log.info("btn_CriteriaPGOK not found in RV_AddAction_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
			Log.info("btn_Save found in RV_AddAction_Page");
		} catch (Exception e) {
			Log.info("btn_Save not found in RV_AddAction_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_Cancel() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICCancel\"))");
			Log.info("btn_Cancel found in RV_AddAction_Page");
		} catch (Exception e) {
			Log.info("btn_Cancel not found in RV_AddAction_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement span_page_title() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.className(\"page-title\"))");
			Log.info("span_page_title found in RV_AddAction_Page");
		} catch (Exception e) {
			Log.info("span_page_title not found in RV_AddAction_Page");
			throw (e);
		}
		return element;
	}
}
