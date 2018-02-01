package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.psUtility;

public class ManageOrginization_Page extends BaseClass {
	private static WebElement element;

	public ManageOrginization_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement btn_SmartORGInvite() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORG_WRK_ADD_PB\"))");
			Log.info("btn_SmartORGInvite found in the ManageOrginization_Page");
		} catch (Exception e) {
			Log.info("btn_SmartORGInvite not found in the ManageOrginization_Page");
			throw (e);
		}
		return element;
	}
}
