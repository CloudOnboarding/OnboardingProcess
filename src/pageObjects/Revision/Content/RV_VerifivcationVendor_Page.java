package pageObjects.Revision.Content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class RV_VerifivcationVendor_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public RV_VerifivcationVendor_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement lnk_add() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX16\"))");
			Log.info("lnk_add found in the RV_VerifivcationVendor_Page");
		} catch (Exception e) {
			Log.info("lnk_add not found in the RV_VerifivcationVendor_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_descr() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REVERVD_H_SM_OB_BGVER_DESCR\"))");
			Log.info("txt_descr found in the RV_VerifivcationVendor_Page");
		} catch (Exception e) {
			Log.info("txt_descr not found in the RV_VerifivcationVendor_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_vndrId() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REVERVD_H_SM_OB_BG_VNDR_ID\"))");
			Log.info("txt_vndrId found in the RV_VerifivcationVendor_Page");
		} catch (Exception e) {
			Log.info("txt_vndrId not found in the RV_VerifivcationVendor_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_RVEntryMethod() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REVERVD_H_SM_OB_ENTRY_METHD\"))");
			Log.info("sel_RVEntryMethod found in the RV_VerifivcationVendor_Page");
		} catch (Exception e) {
			Log.info("sel_RVEntryMethod not found in the RV_VerifivcationVendor_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
			Log.info("btn_Save found in the RV_VerifivcationVendor_Page");
		} catch (Exception e) {
			Log.info("btn_Save not found in the RV_VerifivcationVendor_Page");
			throw (e);
		}
		return element;
	}
}
