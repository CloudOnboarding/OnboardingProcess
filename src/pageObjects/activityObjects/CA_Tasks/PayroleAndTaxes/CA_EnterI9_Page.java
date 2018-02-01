package pageObjects.activityObjects.CA_Tasks.PayroleAndTaxes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_EnterI9_Page extends BaseClass {
	public static WebElement element;

	public CA_EnterI9_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement rdbtn_UScitizen() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_ELIG_TYPE$0$C\"))");

			Log.info("rdbtn_UScitizen found in the CA_EnterI9_Page");
		} catch (Exception e) {
			Log.info("rdbtn_UScitizen not found in the CA_EnterI9_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement rdbtn_Noncitizen() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_ELIG_TYPE$0$N\"))");

			Log.info("rdbtn_Noncitizen found in the CA_EnterI9_Page");
		} catch (Exception e) {
			Log.info("rdbtn_Noncitizen not found in the CA_EnterI9_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement rdbtn_LawfulPermanentResident() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_ELIG_TYPE$0$R\"))");

			Log.info("rdbtn_LawfulPermanentResident found in the CA_EnterI9_Page");
		} catch (Exception e) {
			Log.info("rdbtn_LawfulPermanentResident not found in the CA_EnterI9_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement select_LPRType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_LPR_TYPE$0\"))");

			Log.info("select_LPRType found in the CA_EnterI9_Page");
		} catch (Exception e) {
			Log.info("select_LPRType not found in the CA_EnterI9_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_AlienNumber() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_ALIEN_NBR$0\"))");

			Log.info("txt_AlienNumber found in the CA_EnterI9_Page");
		} catch (Exception e) {
			Log.info("txt_AlienNumber not found in the CA_EnterI9_Page");
			throw (e);
		}
		return element;
	}

	
	public static WebElement rdbtn_Alien() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_ELIG_TYPE$0$A\"))");

			Log.info("rdbtn_Alien found in the CA_EnterI9_Page");
		} catch (Exception e) {
			Log.info("rdbtn_Alien not found in the CA_EnterI9_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_AlienExpDate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_ALIENAUTH_DT$0\"))");

			Log.info("txt_AlienExpDate found in the CA_EnterI9_Page");
		} catch (Exception e) {
			Log.info("txt_AlienExpDate not found in the CA_EnterI9_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement select_AlienType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_ALIEN_TYPE$0\"))");

			Log.info("select_AlienType found in the CA_EnterI9_Page");
		} catch (Exception e) {
			Log.info("select_AlienType not found in the CA_EnterI9_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_AlienRegistrationNumber() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_ALIEN_NBR_A$0\"))");

			Log.info("txt_AlienRegistrationNumber found in the CA_EnterI9_Page");
		} catch (Exception e) {
			Log.info("txt_AlienRegistrationNumber not found in the CA_EnterI9_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_I94AdmissionNbr() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_ADMISSIONNBR$0\"))");

			Log.info("txt_I94AdmissionNbr found in the CA_EnterI9_Page");
		} catch (Exception e) {
			Log.info("txt_I94AdmissionNbr not found in the CA_EnterI9_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_ForeignPassportNumber() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_PASSPORT_NBR$0\"))");

			Log.info("txt_ForeignPassportNumber found in the CA_EnterI9_Page");
		} catch (Exception e) {
			Log.info("txt_ForeignPassportNumber not found in the CA_EnterI9_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement select_CountryIssuance() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_COI$0\"))");

			Log.info("select_CountryIssuance found in the CA_EnterI9_Page");
		} catch (Exception e) {
			Log.info("select_CountryIssuance not found in the CA_EnterI9_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement chkBox_Iagree() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_EMPL_AGREE$0\"))");

			Log.info("chkBox_Iagree found in the CA_EnterI9_Page");
		} catch (Exception e) {
			Log.info("chkBox_Iagree not found in the CA_EnterI9_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_ElectronicSignature() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_WRK_SM_I9_ELECT_AKLDG\"))");

			Log.info("chkBox_ElectronicSignature found in the CA_EnterI9_Page");
		} catch (Exception e) {
			Log.info("chkBox_ElectronicSignature not found in the CA_EnterI9_Page");
			throw (e);
		}
		return element;
	}
	

}
