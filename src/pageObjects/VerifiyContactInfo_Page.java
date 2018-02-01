package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.psUtility;

public class VerifiyContactInfo_Page extends BaseClass {
	public static String VerfCode;
	private static WebElement element;

	public VerifiyContactInfo_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement btn_sendverifEmail() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_VERIFY_WK_SM_CO_2FACT_SEND1\"))");
			Log.info("btn_sendverifEmail found in the VerifiyContactInfo_Page");
		} catch (Exception e) {
			Log.info("btn_sendverifEmail not found in the VerifiyContactInfo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_sendverifphone() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_VERIFY_WK_SM_CO_2FACT_SEND\"))");
			Log.info("btn_sendverifphone found in the VerifiyContactInfo_Page");
		} catch (Exception e) {
			Log.info("btn_sendverifphone not found in the VerifiyContactInfo_Page");
			throw (e);
		}
		return element;
	}

	/*
	 * public static WebElement btn_closeButton() { element = null; try { element =
	 * driver.findElement(By.xpath("//*[@value='Close']"));
	 * Log.info("btn_closeButton found in the VerifiyContactInfo_Page"); } catch
	 * (Exception e) {
	 * Log.info("btn_closeButton not found in the VerifiyContactInfo_Page"); throw
	 * (e); } return element; }
	 */
	public static WebElement btn_EmailVerify() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_VERIFY_WK_SM_CO_2FACT_VALID1\"))");

			Log.info("btn_EmailVerify found in the VerifiyContactInfo_Page");
		} catch (Exception e) {
			Log.info("btn_EmailVerify not found in the VerifiyContactInfo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_PhoneVerify() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_VERIFY_WK_SM_CO_2FACT_VALID\"))");

			Log.info("btn_PhoneVerify found in the VerifiyContactInfo_Page");
		} catch (Exception e) {
			Log.info("btn_PhoneVerify not found in the VerifiyContactInfo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_Next() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.partialLinkText(\"Next\"))");
			Log.info("lnk_Next found in the VerifiyContactInfo_Page");
		} catch (Exception e) {
			Log.info("lnk_Next not found in the VerifiyContactInfo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_EnterEmailVerifyCode() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.id(\"PHONE1\"))");
			Log.info("txt_EnterEmailVerifyCode found in the VerifiyContactInfo_Page");
		} catch (Exception e) {
			Log.info("txt_EnterEmailVerifyCode not found in the VerifiyContactInfo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_EnterPhoneVerifyCode() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_VERIFY_WK_SM_CO_2FACT_CODE\"))");
			Log.info("txt_EnterPhoneVerifyCode found in the VerifiyContactInfo_Page");
		} catch (Exception e) {
			Log.info("txt_EnterPhoneVerifyCode not found in the VerifiyContactInfo_Page");
			throw (e);
		}
		return element;
	}

	/* Retrieving Page Object Elements */
	/*
	 * public static WebElement get_ModalBodyText() { element = null; try { element
	 * = driver.findElement(By.className("modal-body"));
	 * Log.info("get_ModalBodyText found in the VerifiyContactInfo_Page"); } catch
	 * (Exception e) {
	 * Log.info("get_ModalBodyText not found in the VerifiyContactInfo_Page"); throw
	 * (e); } return element; }
	 */
}
