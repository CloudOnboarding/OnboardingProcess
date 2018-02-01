package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.psUtility;

public class Verifycation2Factor_Page extends BaseClass {

	public static String VerfCode;
	private static WebElement element;

	public Verifycation2Factor_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement btn_sendverifphone() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_2FACT_WRK_SM_CO_2FACT_SEND\"))");
			Log.info("btn_sendverifphone found in Verifycation2Factor_Page");
		} catch (Exception e) {
			Log.info("btn_sendverifphone not found in Verifycation2Factor_Page");
			throw (e);
		}
		return element;
	}

	/*
	 * public static WebElement popup_message() { element = null; try { element =
	 * driver.findElement(By.className("modal-body"));
	 * Log.info("popup_message found in the Verifycation2Factor_Page"); } catch
	 * (Exception e) {
	 * Log.info("popup_message not found in the Verifycation2Factor_Page"); throw
	 * (e); } return element; }
	 */

	/*
	 * public static WebElement btn_closeButton() { element = null; try { element =
	 * driver.findElement(By.xpath("//*[@value='Close']"));
	 * Log.info("btn_closeButton found in the Verifycation2Factor_Page"); } catch
	 * (Exception e) {
	 * Log.info("btn_closeButton not found in the Verifycation2Factor_Page"); throw
	 * (e); } return element; }
	 */

	public static WebElement txt_enterCode() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_2FACT_WRK_SM_CO_2FACT_CODE\"))");
			Log.info("txt_enterCode found in the Verifycation2Factor_Page");
		} catch (Exception e) {
			Log.info("txt_enterCode not found in the Verifycation2Factor_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_VerifCode() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"PHONE1\"))");
			Log.info("txt_VerifCode found in the Verifycation2Factor_Page");
		} catch (Exception e) {
			Log.info("txt_VerifCode not found in the Verifycation2Factor_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Verify() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_2FACT_WRK_SM_CO_2FACT_VALID\"))");
			Log.info("btn_Verify found in Verifycation2Factor_Page");
		} catch (Exception e) {
			Log.info("btn_Verify not found in Verifycation2Factor_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_EmailVerify() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_VERIFY_WK_SM_CO_2FACT_VALID1\"))");
			Log.info("btn_EmailVerify found in Verifycation2Factor_Page");
		} catch (Exception e) {
			Log.info("btn_EmailVerify not found in Verifycation2Factor_Page");
			throw (e);
		}
		return element;
	}

}
