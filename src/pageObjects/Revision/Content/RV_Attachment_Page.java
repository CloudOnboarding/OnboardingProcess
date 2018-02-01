package pageObjects.Revision.Content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class RV_Attachment_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public RV_Attachment_Page(WebDriver driver) {
		super(driver);
	}
	
	public static WebElement lnk_Add() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX4\"))");
			Log.info("lnk_Add found in the RV_Attachment_Page");
		} catch (Exception e) {
			Log.info("lnk_Add not found in the RV_Attachment_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_AttachmentTitle() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_FA_SM_CO_ATCH_NAME\"))");
			Log.info("txt_AttachmentTitle found in the RV_Attachment_Page");
		} catch (Exception e) {
			Log.info("txt_AttachmentTitle not found in the RV_Attachment_Page");
			throw (e);
		}
		return element;
	
	}
	public static WebElement txt_lookupDescription() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_FA_SM_CO_DESCR65\"))");
			Log.info("txt_lookupDescription found in the RV_Attachment_Page");
		} catch (Exception e) {
			Log.info("txt_lookupDescription not found in the RV_Attachment_Page");
			throw (e);
		}
		return element;
	
	}
	public static WebElement sel_AttachmentCatagory() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_FA_SM_CO_ATCH_CATG\"))");
			Log.info("sel_AttachmentCatagory found in the RV_Attachment_Page");
		} catch (Exception e) {
			Log.info("sel_AttachmentCatagory not found in the RV_Attachment_Page");
			throw (e);
		}
		return element;
		
		}
	public static WebElement btn_Upload() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ATCH_WRK_SM_CO_UPLOAD\"))");
			Log.info("btn_Upload found in the RV_Attachment_Page");
		} catch (Exception e) {
			Log.info("btn_Upload not found in the RV_Attachment_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_FilePath() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.name(\"#ICOrigFileName\"))");
			Log.info("txt_FilePath found in the RV_Attachment_Page");
		} catch (Exception e) {
			Log.info("txt_FilePath not found in the RV_Attachment_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Upload2() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@value='Upload']\"))");
			Log.info("btn_Upload2 found in the RV_Attachment_Page");
		} catch (Exception e) {
			Log.info("btn_Upload2 not found in the RV_Attachment_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
			Log.info("btn_Save found in the RV_Attachment_Page");
		} catch (Exception e) {
			Log.info("btn_Save not found in the RV_Attachment_Page");
			throw (e);
		}
		return element;
	}

}
