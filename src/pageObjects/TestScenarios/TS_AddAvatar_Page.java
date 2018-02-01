package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TS_AddAvatar_Page extends BaseClass {
	private static WebElement element;

	public TS_AddAvatar_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement lnk_AddAvatar() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_MYPROF_WK_EDIT_BTN\"))");
			Log.info("lnk_AddAvatar found in the TS_AddAvatar_Page");
		} catch (Exception e) {
			Log.info("lnk_AddAvatar not found in the TS_AddAvatar_Page");
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement sel_ImageType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_AVATAR_WK_SM_CO_IMAGE_TYPE\"))");
			Log.info("sel_ImageType found in the TS_AddAvatar_Page");
		} catch (Exception e) {
			Log.info("sel_ImageType not found in the TS_AddAvatar_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_Upload1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_AVATAR_WK_SM_CO_UPLOAD_IMG\"))");
			Log.info("btn_Upload1 found in the TS_AddAvatar_Page");
		} catch (Exception e) {
			Log.info("btn_Upload1 not found in the TS_AddAvatar_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_FilePath() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.name(\"#ICOrigFileName\"))");
			Log.info("txt_FilePath found in the TS_AddAvatar_Page");
		} catch (Exception e) {
			Log.info("txt_FilePath not found in the TS_AddAvatar_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_Upload2() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@value='Upload']\"))");
			Log.info("btn_Upload2 found in the TS_AddAvatar_Page");
		} catch (Exception e) {
			Log.info("btn_Upload2 not found in the TS_AddAvatar_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORG_WRK_SM_CO_SAVE_PB\"))");
			Log.info("btn_Upload2 found in the TS_AddAvatar_Page");
		} catch (Exception e) {
			Log.info("btn_Upload2 not found in the TS_AddAvatar_Page");
			throw (e);
		}
		return element;
	}

}
