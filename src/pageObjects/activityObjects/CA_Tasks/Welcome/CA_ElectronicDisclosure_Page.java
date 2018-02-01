package pageObjects.activityObjects.CA_Tasks.Welcome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_ElectronicDisclosure_Page extends BaseClass {
	public static WebElement element;

	public CA_ElectronicDisclosure_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement chkbox_Agree() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_BP_WRK_SM_BP_AGREE\"))");

			Log.info("chkbox_Agree found in the CA_ElectronicDisclosure_Page");
		} catch (Exception e) {
			Log.info("chkbox_Agree not found in the CA_ElectronicDisclosure_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Acknowledgement() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_BP_WRK_SM_BP_CERTIFY\"))");

			Log.info("btn_Acknowledgement found in the CA_ElectronicDisclosure_Page");
		} catch (Exception e) {
			Log.info("btn_Acknowledgement not found in the CA_ElectronicDisclosure_Page");
			throw (e);
		}
		return element;
	}

}
