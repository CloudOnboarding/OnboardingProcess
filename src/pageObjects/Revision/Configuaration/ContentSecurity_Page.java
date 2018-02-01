package pageObjects.Revision.Configuaration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class ContentSecurity_Page extends BaseClass{
	
	private static WebElement element;

	public ContentSecurity_Page(WebDriver driver) {
		super(driver);
	}
	public static WebElement lnk_Edit() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_TREE_WRK_SM_CD_REV_SECURITY\"))");
			Log.info("lnk_Edit found in ContentSecurity_Page");
		} catch (Exception e) {
			Log.info("lnk_Edit not found in ContentSecurity_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_Edit2() throws Exception {
		element = null;
		try {
			element =psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_TREE_WRK_SM_CD_REV_RULES\"))");
			Log.info("lnk_Edit2 found in ContentSecurity_Page");
		} catch (Exception e) {
			Log.info("lnk_Edit2 not found in ContentSecurity_Page");
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement btn_AssignActions() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_SEC_W_SM_CD_REFRESH\"))");
			Log.info("btn_AssignActions found in ContentSecurity_Page");
		} catch (Exception e) {
			Log.info("btn_AssignActions not found in ContentSecurity_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_OK() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ACTSEL_WK_SM_BP_OK\"))");
			Log.info("btn_OK found in ContentSecurity_Page");
		} catch (Exception e) {
			Log.info("btn_OK not found in ContentSecurity_Page");
			throw (e);
		}
		return element;
	}
		
	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
			Log.info("btn_Save found in ContentSecurity_Page");
		} catch (Exception e) {
			Log.info("btn_Save not found in ContentSecurity_Page");
			throw (e);
		}
		return element;
	}
}
