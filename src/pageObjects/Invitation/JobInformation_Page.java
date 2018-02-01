package pageObjects.Invitation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class JobInformation_Page extends BaseClass {

	private static WebElement element;

	public JobInformation_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement txt_StartDate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_START_DT\"))");
			Log.info("txt_StartDate found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("txt_StartDate not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_BusinessProcessID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_BP_PROCESS_ID\"))");
			Log.info("txt_BusinessProcessID found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("txt_BusinessProcessID not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_RegularTemporary() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$0\"))");
			Log.info("txt_RegularTemporary found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("txt_RegularTemporary not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_FullPartTime() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$1\"))");
			Log.info("txt_FullPartTime found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("txt_FullPartTime not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Company() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$2\"))");
			Log.info(" txt_Company found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" txt_Company not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_BusinessUnit() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$3\"))");
			Log.info(" txt_BusinessUnit found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" txt_BusinessUnit not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Department() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$4\"))");
			Log.info(" txt_Department found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" txt_Department not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Location() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$5\"))");
			Log.info(" txt_Location found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" txt_Location not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_JobCode() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$6\"))");
			Log.info(" txt_JobCode found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" txt_JobCode not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_EmployeeClass() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$7\"))");
			Log.info(" txt_EmployeeClass found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" txt_EmployeeClass not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_AppointmentType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$8\"))");
			Log.info(" txt_AppointmentType found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" txt_AppointmentType not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_ClientId() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$9\"))");
			Log.info(" txt_ClientId found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" txt_ClientId not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_PayGroup() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$10\"))");
			Log.info(" txt_PayGroup found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" txt_PayGroup not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_SalaryPlan() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$11\"))");
			Log.info(" txt_SalaryPlan found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" txt_SalaryPlan not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_EmploymentAgreement() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$12\"))");
			Log.info(" txt_EmploymentAgreement found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" txt_EmploymentAgreement not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_Language() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_LANGUAGE_CD\"))");
			Log.info(" select_Language found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" select_Language not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_BackgroundRequired() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_OB_BG_CHKFLG\"))");
			Log.info(" select_BackgroundRequired found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" select_BackgroundRequired not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_EduEmpl_VerificationReq() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_OB_BGVER_REQ\"))");
			Log.info(" select_EduEmpl_VerificationReq found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" select_EduEmpl_VerificationReq not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_DrugTestReq() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_OB_DRUGTEST_FLG\"))");
			Log.info(" select_DrugTestReq found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" select_DrugTestReq not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_MedicalScreeningReq() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_OB_MED_SCREEN\"))");
			Log.info(" select_MedicalScreeningReq found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" select_MedicalScreeningReq not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_HepatitisBReq() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_OB_HEP_IMMUNE\"))");
			Log.info(" select_HepatitisBReq found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" select_HepatitisBReq not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement select_HoldPreScreenProcess() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_OB_PRSCR_REQ\"))");
			Log.info(" select_HoldPreScreenProcess found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" select_HoldPreScreenProcess not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_DF_HOOK_WK_SM_DF_SAVEDRFT_CNT\"))");
			Log.info(" btn_Save found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" btn_Save not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_ViewInvitation() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_WRK_SM_OB_GOTO_INVITE\"))");
			Log.info(" btn_ViewInvitation found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" btn_ViewInvitation not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_BusinessProcessPrompt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//button[@sm-id='prcsidPromptBtn']\"))");
			Log.info(" btn_BusinessProcessPrompt found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" btn_BusinessProcessPrompt not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_BusinessProcessId() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//a[@sm-id='srchRsltFld']\"))");
			Log.info(" lnk_BusinessProcessId found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" lnk_BusinessProcessId not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_SerchResFldLookup() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//a[@sm-id='srchRsltFld']\"))");
			Log.info(" lnk_BusinessProcessId found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info(" lnk_BusinessProcessId not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_BackgroundCheckVendor() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_OB_VNDR_GRP_ID\"))");
			Log.info("txt_BackgroundCheckVendor found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("txt_BackgroundCheckVendor not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_BackgroundCheckVendorPrompt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_OB_VNDR_GRP_ID$prompt\"))");
			Log.info("txt_BackgroundCheckVendorPrompt found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("txt_BackgroundCheckVendorPrompt not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_ProfileFormIDPrompt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_OB_PRFL_FORM_ID$prompt\"))");
			Log.info("txt_ProfileFormIDPrompt found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("txt_ProfileFormIDPrompt not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_VerifVendorIDPrompt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_OB_BGVER_VENDOR$prompt\"))");
			Log.info("txt_VerifVendorIDPrompt found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("txt_VerifVendorIDPrompt not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_ProfileFormID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_OB_PRFL_FORM_ID\"))");
			Log.info("txt_ProfileFormID found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("txt_ProfileFormID not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_CreditCheckRequired() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_OB_CREDIT_CHECK\"))");
			Log.info("sel_CreditCheckRequired found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("sel_CreditCheckRequired not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_VerificationVendorID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_OB_BGVER_VENDOR\"))");
			Log.info("txt_VerificationVendorID found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("txt_VerificationVendorID not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_EducationVerificationRequired1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_OB_BGEDU_REQ\"))");
			Log.info("sel_EducationVerificationRequired1 found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("sel_EducationVerificationRequired1 not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_EducationVerificationRequired2() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_OB_BG_EDU_SCOPE\"))");
			Log.info("sel_EducationVerificationRequired2 found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("sel_EducationVerificationRequired2 not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_EmploymentVerificationRequired() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_OB_BGEMPL_REQ\"))");
			Log.info("sel_EmploymentVerificationRequired found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("sel_EmploymentVerificationRequired not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Past1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_OB_BGEMPL_NUM\"))");
			Log.info("txt_Past1 found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("txt_Past1 not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_Past2() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_OB_BGEMPL_SCOPE\"))");
			Log.info("sel_Past2 found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("sel_Past2 not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_TestPanel() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_OB_TEST_PANEL\"))");
			Log.info("sel_TestPanel found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("sel_TestPanel not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement chkbox_ManagerialPosition() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_CRDIT_SM_OB_CREDIT_RSN1\"))");
			Log.info("chkbox_ManagerialPosition found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("chkbox_ManagerialPosition not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbox_ReportRequire() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_CRDIT_SM_OB_CREDIT_RSN2\"))");
			Log.info("chkbox_ReportRequire found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("chkbox_ReportRequire not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbox_RegularAccess() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_CRDIT_SM_OB_CREDIT_RSN3\"))");
			Log.info("chkbox_RegularAccess found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("chkbox_RegularAccess not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbox_CompanyBank() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_CRDIT_SM_OB_CREDIT_RSN4\"))");
			Log.info("chkbox_CompanyBank found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("chkbox_CompanyBank not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbox_TransferMoney() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_CRDIT_SM_OB_CREDIT_RSN5\"))");
			Log.info("chkbox_TransferMoney found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("chkbox_TransferMoney not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbox_FinancialContract() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_CRDIT_SM_OB_CREDIT_RSN6\"))");
			Log.info("chkbox_FinancialContract found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("chkbox_FinancialContract not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbox_ProprietaryInformation() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_CRDIT_SM_OB_CREDIT_RSN7\"))");
			Log.info("chkbox_ProprietaryInformation found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("chkbox_ProprietaryInformation not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbox_Workday() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_CRDIT_SM_OB_CREDIT_RSN8\"))");
			Log.info("chkbox_Workday found in the JobInformation_Page");
		} catch (Exception e) {
			Log.info("chkbox_Workday not found in the JobInformation_Page");
			throw (e);
		}
		return element;
	}

}
