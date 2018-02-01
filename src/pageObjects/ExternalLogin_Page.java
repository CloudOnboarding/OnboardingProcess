package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.psUtility;

public class ExternalLogin_Page extends BaseClass {
	private static WebElement element;

	public ExternalLogin_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement txt_UserName() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_AUTH_WRK_SM_CO_OPRID\"))");
			Log.info("txt_UserName found in the ExternalLogin_Page");
		} catch (Exception e) {
			Log.info("txt_UserName not found in the ExternalLogin_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Pwd() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_AUTH_WRK_OPERPSWD\"))");
			Log.info("txt_Pwd found in the ExternalLogin_Page");
		} catch (Exception e) {
			Log.info("txt_Pwd not found in the ExternalLogin_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Submit() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_AUTH_WRK_SM_CO_AUTHENTICATE\"))");
			Log.info("btn_Submit found in the ExternalLogin_Page");
		} catch (Exception e) {
			Log.info("btn_Submit not found in the ExternalLogin_Page");
			throw (e);
		}
		return element;
	}

}
