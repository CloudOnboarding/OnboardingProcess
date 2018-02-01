package pageObjects.activityObjects.CA_Tasks.NewHireForms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_SelfIdentificationRace_Page extends BaseClass {
	public static WebElement element;

	public CA_SelfIdentificationRace_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement chkbox_AmericanIndianInpt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_SELFID_R_SM_OB_AMERICAN_IND\"))");

			Log.info("chkbox_AmericanIndianInpt found in the CA_SelfIdentificationRace_Page");
		} catch (Exception e) {
			Log.info("chkbox_AmericanIndianInpt not found in the CA_SelfIdentificationRace_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbox_AsianInpt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_SELFID_R_SM_OB_ASIAN\"))");

			Log.info("chkbox_AsianInpt found in the CA_SelfIdentificationRace_Page");
		} catch (Exception e) {
			Log.info("chkbox_AsianInpt not found in the CA_SelfIdentificationRace_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbox_blackInpt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_SELFID_R_SM_OB_BLACK\"))");

			Log.info("chkbox_blackInpt found in the CA_SelfIdentificationRace_Page");
		} catch (Exception e) {
			Log.info("chkbox_blackInpt not found in the CA_SelfIdentificationRace_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbox_HispanicInpt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_SELFID_R_SM_OB_HISPANIC\"))");

			Log.info("chkbox_HispanicInpt found in the CA_SelfIdentificationRace_Page");
		} catch (Exception e) {
			Log.info("chkbox_HispanicInpt not found in the CA_SelfIdentificationRace_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbox_NativeHwInpt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_SELFID_R_SM_OB_NATIV_HAWIAN\"))");

			Log.info("chkbox_NativeHwInpt found in the CA_SelfIdentificationRace_Page");
		} catch (Exception e) {
			Log.info("chkbox_NativeHwInpt not found in the CA_SelfIdentificationRace_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbox_WhiteInptInpt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_SELFID_R_SM_OB_WHITE\"))");

			Log.info("chkbox_WhiteInptInpt found in the CA_SelfIdentificationRace_Page");
		} catch (Exception e) {
			Log.info("chkbox_WhiteInptInpt not found in the CA_SelfIdentificationRace_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbox_DeclinedSlefIDInpt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_SELFID_R_SM_OB_DECLI_SELFID\"))");

			Log.info("chkbox_DeclinedSlefIDInpt found in the CA_SelfIdentificationRace_Page");
		} catch (Exception e) {
			Log.info("chkbox_DeclinedSlefIDInpt not found in the CA_SelfIdentificationRace_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_ElectronicSignature() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_SELF_R_W_SAVE_PB\"))");

			Log.info("btn_ElectronicSignature found in the CA_SelfIdentificationRace_Page");
		} catch (Exception e) {
			Log.info("btn_ElectronicSignature not found in the CA_SelfIdentificationRace_Page");
			throw (e);
		}
		return element;
	}

}
