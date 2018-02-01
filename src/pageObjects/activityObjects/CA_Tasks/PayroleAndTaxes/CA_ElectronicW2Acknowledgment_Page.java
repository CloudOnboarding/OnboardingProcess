package pageObjects.activityObjects.CA_Tasks.PayroleAndTaxes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_ElectronicW2Acknowledgment_Page extends BaseClass {
	public static WebElement element;

	public CA_ElectronicW2Acknowledgment_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement chkBox_AuthorizeW2s() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_ELEC_W2_R_SM_OB_YREND_CNSNT\"))");

			Log.info("chkBox_AuthorizeW2s found in the CA_ElectronicW2Acknowledgment_Page");
		} catch (Exception e) {
			Log.info("chkBox_AuthorizeW2s not found in the CA_ElectronicW2Acknowledgment_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_ElectronicSignature() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_ELEC_W2_W_SAVE_PB\"))");

			Log.info("btn_ElectronicSignature found in the CA_ElectronicW2Acknowledgment_Page");
		} catch (Exception e) {
			Log.info("btn_ElectronicSignature not found in the CA_ElectronicW2Acknowledgment_Page");
			throw (e);
		}
		return element;
	}

}
