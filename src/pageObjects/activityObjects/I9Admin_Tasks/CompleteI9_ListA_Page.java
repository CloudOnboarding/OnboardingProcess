package pageObjects.activityObjects.I9Admin_Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CompleteI9_ListA_Page extends BaseClass {
	public static WebElement element;

	public CompleteI9_ListA_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement lnk_SelectDocument() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_WRK_SM_I9_DF_FLOW_INST$0\"))");

			Log.info("lnk_SelectDocument found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("lnk_SelectDocument not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_Section2Verification() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_DOCTYPE\"))");

			Log.info("select_Section2Verification found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("select_Section2Verification not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement rdbtn_ListAEmpAuthorizationDoc() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_DOC_TITLE_A$3$\"))");

			Log.info("rdbtn_ListAEmpAuthorizationDoc found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("rdbtn_ListAEmpAuthorizationDoc not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement rdbtn_PermanentResidentCard() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_DOC_TITLE_A\"))");

			Log.info("rdbtn_PermanentResidentCard found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("rdbtn_PermanentResidentCard not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_CardNumber() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_CARD_NBR\"))");

			Log.info("txt_CardNumber found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("txt_CardNumber not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_CardExpirationDate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_CARD_EXP_DT\"))");

			Log.info("txt_CardExpirationDate found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("txt_CardExpirationDate not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement rdbtn_LPRForeignPassport() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_DOC_TITLE_A$4$\"))");

			Log.info("rdbtn_LPRForeignPassport found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("rdbtn_LPRForeignPassport not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement rdbtn_AleinForeignPassport() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_DOC_TITLE_A$6$\"))");

			Log.info("rdbtn_AleinForeignPassport found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("rdbtn_AleinForeignPassport not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_PassportNumber() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_DOC_NBR_A1$56$\"))");

			Log.info("txt_PassportNumber found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("txt_PassportNumber not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_PassportDocExpDate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_DOC_EXPDT_A1$9$\"))");

			Log.info("txt_PassportDocExpDate found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("txt_PassportDocExpDate not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_CountryOfIssuance() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_COI\"))");

			Log.info("txt_CountryOfIssuance found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("txt_CountryOfIssuance not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement rdbtn_ListBDocDriverLicense() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_DOC_TITLE_B\"))");

			Log.info("rdbtn_DriverLicense found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("rdbtn_DriverLicense not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement rdbtn_SocialSecurityCard() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_DOC_TITLE_C\"))");

			Log.info("rdbtn_SocialSecurityCard found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("rdbtn_SocialSecurityCard not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdbtn_DocNameDriverLicense() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_DOC_NAME\"))");

			Log.info("rdbtn_DocNameDriverLicense found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("rdbtn_DocNameDriverLicense not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement select_DocumentState() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_DOCMNT_STATE\"))");

			Log.info("select_DocumentState found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("select_DocumentState not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_ListBDocumentNumber() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_DOC_NBR_B\"))");

			Log.info("txt_ListBDocumentNumber found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("txt_ListBDocumentNumber not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_ListBDocExpDate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_DOC_EXPDT_B\"))");

			Log.info("txt_ListBDocExpDate found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("txt_ListBDocExpDate not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_DocumentNumber() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_DOC_NBR_A1\"))");

			Log.info("txt_DocumentNumber found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("txt_DocumentNumber not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_DocumentExpirationDate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_DOC_EXPDT_A1\"))");

			Log.info("txt_DocumentExpirationDate found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("txt_DocumentExpirationDate not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_IssuingAuthority() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_ISSUE_AUTH_A\"))");

			Log.info("txt_IssuingAuthority found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("txt_IssuingAuthority not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_HIreDate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_HIRE_DT\"))");

			Log.info("txt_HIreDate found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("txt_HIreDate not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement LongTxt_AdditionalInformation() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_ADDITN_INFO\"))");

			Log.info("LongTxt_AdditionalInformation found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("LongTxt_AdditionalInformation not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_saveListA() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_WRK_SAVE_BTN\"))");

			Log.info("btn_saveListA found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("btn_saveListA not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_close() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.class(\"btn btn-primary mr5 pl20 pr20 sm-close\"))");

			Log.info("btn_close found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("btn_close not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Return() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_WRK_SM_I9_RETURN\"))");

			Log.info("btn_Return found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("btn_Return not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbx_IAgree() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_EMPLYR_AGREE$0\"))");

			Log.info("chkbx_IAgree found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("chkbx_IAgree not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_SavePage() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_WRK_SM_I9_AWSEC2_PB\"))");

			Log.info("btn_SavePage found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("btn_SavePage not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_Complete() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_AF_ACTION_Complete I-9\"))");

			Log.info("lnk_Complete found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("lnk_Complete not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}
	 
		public static WebElement txt_IssuingAuthorityListC() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_ISSUE_AUTH_C\"))");

			Log.info("txt_IssuingAuthorityListC found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("txt_IssuingAuthorityListC not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	} 
	public static WebElement txt_I94IssuingAuthority() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_I94_AUTH\"))");

			Log.info("txt_I94IssuingAuthority found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("txt_I94IssuingAuthority not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_I94AdmissionNumber() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_ADMISSIONNBR\"))");

			Log.info("txt_I94AdmissionNumber found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("txt_I94AdmissionNumber not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_I94DocExpDate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_I94_DOCEXPDT\"))");

			Log.info("txt_I94DocExpDate found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("txt_I94DocExpDate not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement get_I9ID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//span[contains(@id,'SM_I9_HR_PERSON_SM_I9_ID')]\"))");

			Log.info("get_I9ID found in the CompleteI9_ListA_Page");
		} catch (Exception e) {
			Log.info("get_I9ID not found in the CompleteI9_ListA_Page");
			throw (e);
		}
		return element;
	}

}
