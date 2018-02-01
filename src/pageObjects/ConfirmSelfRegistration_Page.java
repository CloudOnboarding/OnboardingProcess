package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.psUtility;

public class ConfirmSelfRegistration_Page extends BaseClass {

	private static WebElement element;

	public ConfirmSelfRegistration_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement get_UserRegistrationDivTxt() throws Exception {
		element = null;
		try {
			element = psUtility
					.switchFrame("driver.findElement(By.xpath(\".//span[contains(@sm-id,'confirmationText')]\"))");
			Log.info("get_SpanTxt found in ConfirmSelfRegistration_page");
		} catch (Exception e) {
			Log.info("get_SpanTxt not found in ConfirmSelfRegistration_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_Clickhere() throws Exception {
		element = null;
		try {
			// element = driver.findElement(By.linkText("Click here"));
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Click here\"))");

			Log.info("lnk_Clickhere found in ConfirmSelfRegistration_Page");
		} catch (Exception e) {
			Log.info("lnk_Clickhere not found in ConfirmSelfRegistration_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_OK() throws Exception {
		element = null;
		try {
			// element = driver.findElement(By.linkText("Click here"));
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_SLFREG_WK_OK_BUTTON\"))");

			Log.info("btn_OK found in ConfirmSelfRegistration_Page");
		} catch (Exception e) {
			Log.info(" btn_OK  not found in ConfirmSelfRegistration_Page");
			throw (e);
		}
		return element;
	}
	

}
