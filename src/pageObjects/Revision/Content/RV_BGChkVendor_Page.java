package pageObjects.Revision.Content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class RV_BGChkVendor_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public RV_BGChkVendor_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement lnk_Add() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX15\"))");
			Log.info("lnk_Add found in the RV_BGChkVendor_Page");
		} catch (Exception e) {
			Log.info("lnk_Add not found in the RV_BGChkVendor_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_VndrDescr() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REVVNDR_H_SM_OB_VNDRID_DESCR\"))");
			Log.info("txt_VndrDescr found in the RV_BGChkVendor_Page");
		} catch (Exception e) {
			Log.info("txt_VndrDescr not found in the RV_BGChkVendor_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_VndrID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REVVNDR_H_SM_OB_BG_VNDR_ID\"))");
			Log.info("txt_VndrID found in the RV_BGChkVendor_Page");
		} catch (Exception e) {
			Log.info("txt_VndrID not found in the RV_BGChkVendor_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_FormID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REVVNDR_H_SM_OB_BGC_FORMID\"))");
			Log.info("txt_FormID found in the RV_BGChkVendor_Page");
		} catch (Exception e) {
			Log.info("txt_FormID not found in the RV_BGChkVendor_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_AdmTxtID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REVVNDR_H_SM_OB_ADM_TXT_ID\"))");
			Log.info("txt_AdmTxtID found in the RV_BGChkVendor_Page");
		} catch (Exception e) {
			Log.info("txt_AdmTxtID not found in the RV_BGChkVendor_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_PRFL_FormID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REVVNDR_D_SM_OB_PRFL_FORM_ID$0\"))");
			Log.info("txt_PRFL_FormID found in the RV_BGChkVendor_Page");
		} catch (Exception e) {
			Log.info("txt_PRFL_FormID not found in the RV_BGChkVendor_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
			Log.info("btn_Save found in the RV_BGChkVendor_Page");
		} catch (Exception e) {
			Log.info("btn_Save not found in the RV_BGChkVendor_Page");
			throw (e);
		}
		return element;
	}
}
