package pageObjects.activityObjects.CA_Tasks.PreScreening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_DrugAlcoholTestPolicy_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public CA_DrugAlcoholTestPolicy_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement chkbox_Agree() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_BP_WRK_SM_BP_AGREE\"))");
			Log.info("chkbox_Agree found in the CA_DrugAlcoholTestPolicy_Page");
		} catch (Exception e) {
			Log.info("chkbox_Agree not found in the CA_DrugAlcoholTestPolicy_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_BP_WRK_SM_BP_CERTIFY\"))");
			Log.info("btn_save found in the CA_DrugAlcoholTestPolicy_Page");
		} catch (Exception e) {
			Log.info("btn_save not found in the CA_DrugAlcoholTestPolicy_Page");
			throw (e);
		}
		return element;
	}
}
