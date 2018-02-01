package pageObjects.activityObjects.CA_Tasks.PreScreening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_BackgroundAuthorization_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public CA_BackgroundAuthorization_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement chk_Acknowledge() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_BCHK_DISC_SM_OB_ACK_SIGN\"))");
			Log.info("chk_Acknowledge found in the CA_BackgroundAuthorization_Page");
		} catch (Exception e) {
			Log.info("chk_Acknowledge not found in the CA_BackgroundAuthorization_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_ElectricallySign() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_BCHK_WRK_SAVE_PB\"))");
			Log.info("btn_ElectricallySign found in the CA_BackgroundAuthorization_Page");
		} catch (Exception e) {
			Log.info("btn_ElectricallySign not found in the CA_BackgroundAuthorization_Page");
			throw (e);
		}
		return element;
	}
}
