package pageObjects.Revision.Content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class RV_PDFTemplate_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public RV_PDFTemplate_Page(WebDriver driver) {
		super(driver);
	}
	public static WebElement lnk_Add() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX18\"))");
			Log.info("lnk_Add found in the RV_PDFTemplate_Page");
		} catch (Exception e) {
			Log.info("lnk_Add not found in the RV_PDFTemplate_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_Description() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_PDF_FRM_H_SM_PDF_DESCR\"))");
			Log.info("txt_Description found in the RV_PDFTemplate_Page");
		} catch (Exception e) {
			Log.info("txt_Description not found in the RV_PDFTemplate_Page");
			throw (e);
		}
		return element;
	
	}
	public static WebElement btn_Upload1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_PDF_WRK_SM_PDF_UPLOAD\"))");
			Log.info("btn_Upload1 found in the RV_PDFTemplate_Page");
		} catch (Exception e) {
			Log.info("btn_Upload1 not found in the RV_PDFTemplate_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_FilePath() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.name(\"#ICOrigFileName\"))");
			Log.info("txt_FilePath found in the RV_PDFTemplate_Page");
		} catch (Exception e) {
			Log.info("txt_FilePath not found in the RV_PDFTemplate_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Upload2() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@value='Upload']\"))");
			Log.info("btn_Upload2 found in the RV_PDFTemplate_Page");
		} catch (Exception e) {
			Log.info("btn_Upload2 not found in the RV_PDFTemplate_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
			Log.info("btn_Save found in the RV_PDFTemplate_Page");
		} catch (Exception e) {
			Log.info("btn_Save not found in the RV_PDFTemplate_Page");
			throw (e);
		}
		return element;
	}
}
