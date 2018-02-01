package pageObjects.activityObjects.TU_Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TU_CompleteUserOnboarding_Page extends BaseClass {

	private static WebElement element;

	public TU_CompleteUserOnboarding_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement btn_continueOrgOnboard() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORG_WRK_OK_BTN\"))");
			Log.info("btn_continueOrgOnboard found in TU_CompleteUserOnboarding_Page");
		} catch (Exception e) {
			Log.info("btn_continueOrgOnboard not found in TU_CompleteUserOnboarding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Home() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORG_WRK_VIEW_PB\"))");
			Log.info("btn_Home found in TU_CompleteUserOnboarding_Page");
		} catch (Exception e) {
			Log.info("btn_Home not found in TU_CompleteUserOnboarding_Page");
			throw (e);
		}
		return element;
	}

}
