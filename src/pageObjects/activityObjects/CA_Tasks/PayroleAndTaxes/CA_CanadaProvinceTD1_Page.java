package pageObjects.activityObjects.CA_Tasks.PayroleAndTaxes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_CanadaProvinceTD1_Page extends BaseClass {
	public static WebElement element;

	public CA_CanadaProvinceTD1_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement chkBox_ICertify() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_CAN_TX_WK_SM_OB_I_AGREE\"))");

			Log.info("chkBox_ICertify found in the CA_CanadaProvinceTD1_Page");
		} catch (Exception e) {
			Log.info("chkBox_ICertify not found in the CA_CanadaProvinceTD1_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_ElectronicSigature() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_CAN_TX_WK_SM_OB_AGREE\"))");

			Log.info("btn_ElectronicSigature found in the CA_CanadaProvinceTD1_Page");
		} catch (Exception e) {
			Log.info("btn_ElectronicSigature not found in the CA_CanadaProvinceTD1_Page");
			throw (e);
		}
		return element;
	}
}
