package pageObjects.Revision.Content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class RV_TextCatalog_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public RV_TextCatalog_Page(WebDriver driver) {
		super(driver);
	}
	
	public static WebElement lnk_Add() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX10\"))");
			Log.info("lnk_Add found in the RV_TextCatalog_Page");
		} catch (Exception e) {
			Log.info("lnk_Add not found in the RV_TextCatalog_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_Description() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_TXT_DESCR254_MIXED\"))");
			Log.info("txt_Description found in the RV_TextCatalog_Page");
		} catch (Exception e) {
			Log.info("txt_Description not found in the RV_TextCatalog_Page");
			throw (e);
		}
		return element;
	
	}
	 public static WebElement Element_DivId() throws Exception {
		   element = null;
		   try {
		    element = psUtility.switchFrame("driver.findElement(By.cssSelector(\"div[id^='cke_']\"))");
		    Log.info("Element_DivId found in the RV_TextCatalog_Page");
		   } catch (Exception e) {
		    Log.info("Element_DivId not found in the RV_TextCatalog_Page");
		    throw (e);
		   }
		   return element;
		  }
	 public static WebElement btn_Save() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
				Log.info("btn_Save found in the RV_TextCatalog_Page");
			} catch (Exception e) {
				Log.info("btn_Save not found in the RV_TextCatalog_Page");
				throw (e);
			}
			return element;
		}

}
