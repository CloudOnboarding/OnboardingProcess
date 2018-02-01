package pageObjects.activityObjects.CA_Tasks.PreScreening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_BackgroundProfileForm1_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public CA_BackgroundProfileForm1_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement rdbtn_AuthorizeBackgroundCheck() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"PRFL_EMAIL_QTN_AS\"))");
			Log.info("rdbtn_AuthorizeBackgroundCheck found in the CA_BackgroundProfileForm1_Page");
		} catch (Exception e) {
			Log.info("rdbtn_AuthorizeBackgroundCheck not found in the CA_BackgroundProfileForm1_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Next() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_BGV_WRK_SM_OB_NEXT\"))");
			Log.info("btn_Next found in the CA_BackgroundProfileForm1_Page");
		} catch (Exception e) {
			Log.info("btn_Next not found in the CA_BackgroundProfileForm1_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rbtn_OtherNameNo() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_BGV_PROF_SM_OB_HAVE_OT_NAME$77$\"))");
			Log.info("rbtn_OtherNameNo found in the CA_BackgroundProfileForm1_Page");
		} catch (Exception e) {
			Log.info("rbtn_OtherNameNo not found in the CA_BackgroundProfileForm1_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_MotherMaidenName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_BGV_PROF_SM_OB_MTHR_MDN_NM\"))");
			Log.info("txt_MotherMaidenName found in the CA_BackgroundProfileForm1_Page");
		} catch (Exception e) {
			Log.info("txt_MotherMaidenName not found in the CA_BackgroundProfileForm1_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_City() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_BGV_PROF_SM_OB_BIRTH_CITY\"))");
			Log.info("txt_City found in the CA_BackgroundProfileForm1_Page");
		} catch (Exception e) {
			Log.info("txt_City not found in the CA_BackgroundProfileForm1_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_State() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_BGV_PROF_STATE\"))");
			Log.info("sel_State found in the CA_BackgroundProfileForm1_Page");
		} catch (Exception e) {
			Log.info("sel_State not found in the CA_BackgroundProfileForm1_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chk_NameonId() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_BGV_PROF_SM_OB_NO_LICENSE\"))");
			Log.info("chk_NameonId found in the CA_BackgroundProfileForm1_Page");
		} catch (Exception e) {
			Log.info("chk_NameonId not found in the CA_BackgroundProfileForm1_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_FirstName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_NAME_WORK_FIRST_NAME$44$$0\"))");
			Log.info("txt_FirstName found in the CA_BackgroundProfileForm1_Page");
		} catch (Exception e) {
			Log.info("txt_FirstName not found in the CA_BackgroundProfileForm1_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_LastName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_NAME_WORK_LAST_NAME$46$$0\"))");
			Log.info("txt_LastName found in the CA_BackgroundProfileForm1_Page");
		} catch (Exception e) {
			Log.info("txt_LastName not found in the CA_BackgroundProfileForm1_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_FromMonth() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_BGV_PR_AD_SM_OB_FROM_MONTH1$0\"))");
			Log.info("sel_FromMonth found in the CA_BackgroundProfileForm1_Page");
		} catch (Exception e) {
			Log.info("sel_FromMonth not found in the CA_BackgroundProfileForm1_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_FromYear() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_BGV_PR_AD_SM_OB_FROM_YEAR1$0\"))");
			Log.info("txt_FromYear found in the CA_BackgroundProfileForm1_Page");
		} catch (Exception e) {
			Log.info("txt_FromYear not found in the CA_BackgroundProfileForm1_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_ToMonth() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_BGV_PR_AD_SM_OB_TO_MONTH1$0\"))");
			Log.info("sel_ToMonth found in the CA_BackgroundProfileForm1_Page");
		} catch (Exception e) {
			Log.info("sel_ToMonth not found in the CA_BackgroundProfileForm1_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_ToYear() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_BGV_PR_AD_SM_OB_TO_YEAR1$0\"))");
			Log.info("txt_ToYear found in the CA_BackgroundProfileForm1_Page");
		} catch (Exception e) {
			Log.info("txt_ToYear not found in the CA_BackgroundProfileForm1_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chk_EmploymentAddress() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_BGV_PROF_SM_OB_NO_PREV_WORK\"))");
			Log.info("chk_EmploymentAddress found in the CA_BackgroundProfileForm1_Page");
		} catch (Exception e) {
			Log.info("chk_EmploymentAddress not found in the CA_BackgroundProfileForm1_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rbtn_misdemeanor_No() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_BGV_H_CRH_SM_OB_BGC_FLNY_FLG$100$\"))");
			Log.info("rbtn_No found in the CA_BackgroundProfileForm1_Page");
		} catch (Exception e) {
			Log.info("rbtn_No not found in the CA_BackgroundProfileForm1_Page");
			throw (e);
		}
		return element;
	}
	
	

	public static WebElement rbtn_No() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_BGV_CRHST_SM_OB_BGC_FLNY_FLG$3$\"))");
			Log.info("rbtn_No found in the CA_BackgroundProfileForm1_Page");
		} catch (Exception e) {
			Log.info("rbtn_No not found in the CA_BackgroundProfileForm1_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_BGV_WRK_SM_OB_SAVE\"))");
			Log.info("btn_Save found in the CA_BackgroundProfileForm1_Page");
		} catch (Exception e) {
			Log.info("btn_Save not found in the CA_BackgroundProfileForm1_Page");
			throw (e);
		}
		return element;
	}
}
