package pageObjects.activityObjects.CA_Tasks.NewHireForms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_SelfIdentificationDisability_Page extends BaseClass {
	public static WebElement element;

	public CA_SelfIdentificationDisability_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement rdBtn_IhaveDisability() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_SELFID_VD_SM_OB_SELF_VDIS$0$Y\"))");

			Log.info("rdBtn_IhaveDisability found in the CA_SelfIdentificationDisability_Page");
		} catch (Exception e) {
			Log.info("rdBtn_IhaveDisability not found in the CA_SelfIdentificationDisability_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdBtn_IdonthaveDisability() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_SELFID_VD_SM_OB_SELF_VDIS$0$N\"))");

			Log.info("rdBtn_IdonthaveDisability found in the CA_SelfIdentificationDisability_Page");
		} catch (Exception e) {
			Log.info("rdBtn_IdonthaveDisability not found in the CA_SelfIdentificationDisability_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdBtn_IdontwishAnswer() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_SELFID_VD_SM_OB_SELF_VDIS$0$X\"))");

			Log.info("rdBtn_IdontwishAnswer found in the CA_SelfIdentificationDisability_Page");
		} catch (Exception e) {
			Log.info("rdBtn_IdontwishAnswer not found in the CA_SelfIdentificationDisability_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_ElectronicSignature() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_VDIS_WRK_SM_OB_VDIS_SAVE\"))");

			Log.info("btn_ElectronicSignature found in the CA_SelfIdentificationDisability_Page");
		} catch (Exception e) {
			Log.info("btn_ElectronicSignature not found in the CA_SelfIdentificationDisability_Page");
			throw (e);
		}

		return element;

	}

}
