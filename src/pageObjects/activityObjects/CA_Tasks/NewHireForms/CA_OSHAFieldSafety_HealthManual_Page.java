package pageObjects.activityObjects.CA_Tasks.NewHireForms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_OSHAFieldSafety_HealthManual_Page extends BaseClass {
	public CA_OSHAFieldSafety_HealthManual_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement element;

	public static WebElement chkbox_Agree() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_SF_RT_WRK_SM_SF_ENABLE_AGREE\"))");

			Log.info("chkbox_Agree found in the CA_OSHAFieldSafety_HealthManual_Page");
		} catch (Exception e) {
			Log.info("chkbox_Agree not found in the CA_OSHAFieldSafety_HealthManual_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_FirstName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[text()='First Name']/parent::tr/td[2]/span/span[2]/textarea\"))");

			Log.info("txt_FirstName found in the CA_OSHAFieldSafety_HealthManual_Page");
		} catch (Exception e) {
			Log.info("txt_FirstName not found in the CA_OSHAFieldSafety_HealthManual_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_LastName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[text()='Last Name']/parent::tr/td[2]/span/span[2]/textarea\"))");

			Log.info("txt_LastName found in the CA_OSHAFieldSafety_HealthManual_Page");
		} catch (Exception e) {
			Log.info("txt_LastName not found in the CA_OSHAFieldSafety_HealthManual_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_Acknowledgement() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_SF_RT_WRK_SAVE_PB\"))");

			Log.info("btn_Acknowledgement found in the CA_OSHAFieldSafety_HealthManual_Page");
		} catch (Exception e) {
			Log.info("btn_Acknowledgement not found in the CA_OSHAFieldSafety_HealthManual_Page");
			throw (e);
		}
		return element;
	}

}
