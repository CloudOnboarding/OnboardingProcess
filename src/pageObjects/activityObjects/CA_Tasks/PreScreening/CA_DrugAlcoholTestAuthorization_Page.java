package pageObjects.activityObjects.CA_Tasks.PreScreening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_DrugAlcoholTestAuthorization_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public CA_DrugAlcoholTestAuthorization_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement rdbtn_yes() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_DRG_AUT_R_SM_OB_AGREE\"))");
			Log.info("rdbtn_yes found in the CA_DrugAlcoholTestAuthorization_Page");
		} catch (Exception e) {
			Log.info("rdbtn_yes not found in the CA_DrugAlcoholTestAuthorization_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement rdbtn_No() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_DRG_AUT_R_SM_OB_AGREE$10$\"))");
			Log.info("rdbtn_No found in the CA_DrugAlcoholTestAuthorization_Page");
		} catch (Exception e) {
			Log.info("rdbtn_No not found in the CA_DrugAlcoholTestAuthorization_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbox_certify() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_DRG_AUT_R_SM_OB_CERTIFY\"))");
			Log.info("chkbox_certify found in the CA_DrugAlcoholTestAuthorization_Page");
		} catch (Exception e) {
			Log.info("chkbox_certify not found in the CA_DrugAlcoholTestAuthorization_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_DRG_AUT_W_SM_OB_SAVE\"))");
			Log.info("btn_save found in the CA_DrugAlcoholTestAuthorization_Page");
		} catch (Exception e) {
			Log.info("btn_save not found in the CA_DrugAlcoholTestAuthorization_Page");
			throw (e);
		}
		return element;
	}
}
