package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.psUtility;

public class CreateAnAccount_Page extends BaseClass {
	private static WebElement element;

	public CreateAnAccount_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement txt_UserNameMV() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_AUTH_WRK_SM_CO_OPRID\"))");
			// Log.info("Product Name for purchased product is found on the Check Out
			// Page");
		} catch (Exception e) {
			// Log.error("Price for purchased product on Check Out page is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_PasswordMV() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_OPRDEFN_OPERPSWD\"))");
			// Log.info("Product Name for purchased product is found on the Check Out
			// Page");
		} catch (Exception e) {
			// Log.error("Price for purchased product on Check Out page is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_ConfPasswordMV() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_USRPRFLWK_OPERPSWDCONF\"))");
			// Log.info("Product Name for purchased product is found on the Check Out
			// Page");
		} catch (Exception e) {
			// Log.error("Price for purchased product on Check Out page is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_NextMV() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.partialLinkText(\"Next\"))");
			// Log.info("Product Name for purchased product is found on the Check Out
			// Page");
		} catch (Exception e) {
			// Log.error("Price for purchased product on Check Out page is not found");
			throw (e);
		}
		return element;
	}

}
