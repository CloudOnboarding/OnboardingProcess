package pageObjects.activityObjects.CA_Tasks.PreScreening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_HepatitisBVaccinationConfirmation_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public CA_HepatitisBVaccinationConfirmation_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement chkbox_heptts() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_HEPTTS_B_SM_OB_HEPT_B_VACC\"))");
			Log.info("chkbox_heptts found in the CA_HepatitisBImmunizationForm_Page");
		} catch (Exception e) {
			Log.info("chkbox_heptts not found in the CA_HepatitisBImmunizationForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbox_agree() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_HEPTTS_B_SM_OB_AGREE\"))");
			Log.info("chkbox_agree found in the CA_HepatitisBImmunizationForm_Page");
		} catch (Exception e) {
			Log.info("chkbox_agree not found in the CA_HepatitisBImmunizationForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_HEPT_WRK_SM_OB_HEPT_B_SAVE\"))");
			Log.info("btn_save found in the CA_HepatitisBImmunizationForm_Page");
		} catch (Exception e) {
			Log.info("btn_save not found in the CA_HepatitisBImmunizationForm_Page");
			throw (e);
		}
		return element;
	}
}
