package pageObjects.activityObjects.CA_Tasks.NewHireForms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_SelfIdentificationVeteran_Page extends BaseClass {
	public static WebElement element;

	public CA_SelfIdentificationVeteran_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement rdBtn_VetCatgry1Inpt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_VETSELFID_SM_OB_VET_CURNTSVC\"))");

			Log.info("rdBtn_VetCatgry1Inpt found in the CA_SelfIdentificationVeteran_Page");
		} catch (Exception e) {
			Log.info("rdBtn_VetCatgry1Inpt not found in the CA_SelfIdentificationVeteran_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdBtn_VetCatgry2Inpt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_VETSELFID_SM_OB_VET_CURNTSVC$138$\"))");

			Log.info("rdBtn_VetCatgry2Inpt found in the CA_SelfIdentificationVeteran_Page");
		} catch (Exception e) {
			Log.info("rdBtn_VetCatgry2Inpt not found in the CA_SelfIdentificationVeteran_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdBtn_VetCatgry3Inpt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_VETSELFID_SM_OB_VET_CURNTSVC$139$\"))");

			Log.info("rdBtn_VetCatgry3Inpt found in the CA_SelfIdentificationVeteran_Page");
		} catch (Exception e) {
			Log.info("rdBtn_VetCatgry3Inpt not found in the CA_SelfIdentificationVeteran_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkBox_AddinfoCheck1Inpt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_VETSELFID_SM_OB_AFS_SERVE\"))");

			Log.info("chkBox_AddinfoCheck1Inpt found in the CA_SelfIdentificationVeteran_Page");
		} catch (Exception e) {
			Log.info("chkBox_AddinfoCheck1Inpt not found in the CA_SelfIdentificationVeteran_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkBox_AddinfoCheck2Inpt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_VETSELFID_SM_OB_VETRN_OCCTN\"))");

			Log.info("chkBox_AddinfoCheck2Inpt found in the CA_SelfIdentificationVeteran_Page");
		} catch (Exception e) {
			Log.info("chkBox_AddinfoCheck2Inpt not found in the CA_SelfIdentificationVeteran_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_ElectricallySign() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_VETSELF_W_SM_OB_SAVE\"))");

			Log.info("btn_ElectricallySign found in the CA_SelfIdentificationVeteran_Page");
		} catch (Exception e) {
			Log.info("btn_ElectricallySign not found in the CA_SelfIdentificationVeteran_Page");
			throw (e);
		}
		return element;
	}
}
