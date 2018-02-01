package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.psUtility;

public class Setup_E_Pin_Page extends BaseClass {
	private static WebElement element;

	public Setup_E_Pin_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement txt_ePin() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_OPRDEFN_SM_CO_ELECSIGN_PIN\"))");
			Log.info("txt_ePin found in the E_Pin_Page");
		} catch (Exception e) {
			Log.info("txt_ePin not found in the E_Pin_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_ConfirmEpin() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_AUTH_WRK_SM_CO_CONFIRM_PIN\"))");
			Log.info("txt_ConfirmEpin found in the E_Pin_Page");
		} catch (Exception e) {
			Log.info("txt_ConfirmEpin not found in the E_Pin_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_registerNow() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_SLFREG_WK_SM_CO_COMPLETE_REG\"))");
			Log.info("lnk_registerNow found in the E_Pin_Page");
		} catch (Exception e) {
			Log.info("lnk_registerNow not found in the E_Pin_Page");
			throw (e);
		}
		return element;
	}

}
