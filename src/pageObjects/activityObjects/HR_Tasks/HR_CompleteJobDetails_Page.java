package pageObjects.activityObjects.HR_Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class HR_CompleteJobDetails_Page extends BaseClass {
	public static WebElement element;

	public HR_CompleteJobDetails_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement nonEditObj_CandidateId() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_SELFID_VD_SM_OB_SELF_VDIS$0$Y\"))");

			Log.info("nonEditObj_CandidateId found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("nonEditObj_CandidateId not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement nonEditObj_CandidateName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_SELFID_VD_SM_OB_SELF_VDIS$0$Y\"))");

			Log.info("nonEditObj_CandidateName found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("nonEditObj_CandidateName not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_StartDate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_SELFID_VD_SM_OB_SELF_VDIS$0$Y\"))");

			Log.info("txt_StartDate found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_StartDate not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Action() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$0\"))");

			Log.info("txt_Action found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_Action not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Reason() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$1\"))");

			Log.info("txt_Reason found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_Reason not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_RegularTemporary() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$2\"))");

			Log.info("txt_RegularTemporary found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_RegularTemporary not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_FullPartime() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$3\"))");

			Log.info("txt_FullPartime found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_FullPartime not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_COmpany() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$4\"))");

			Log.info("txt_COmpany found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_COmpany not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_BusinessUnit() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$5\"))");

			Log.info("txt_BusinessUnit found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_BusinessUnit not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Department() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$6\"))");

			Log.info("txt_Department found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_Department not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Location() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$7\"))");

			Log.info("txt_Location found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_Location not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_OperatingUnit() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$8\"))");

			Log.info("txt_OperatingUnit found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_OperatingUnit not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_JobCode() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$9\"))");

			Log.info("txt_JobCode found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_JobCode not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_EmployeeClass() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$10\"))");

			Log.info("txt_EmployeeClass found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_EmployeeClass not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_AppointmentType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$11\"))");

			Log.info("txt_AppointmentType found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_AppointmentType not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_ClientID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$12\"))");

			Log.info("txt_ClientID found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_ClientID not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_PayGroup() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$13\"))");

			Log.info("txt_PayGroup found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_PayGroup not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_SalaryPlan() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$14\"))");

			Log.info("txt_SalaryPlan found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_SalaryPlan not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_SalaryGrade() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$15\"))");

			Log.info("txt_SalaryGrade found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_SalaryGrade not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_EmployeeType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$16\"))");

			Log.info("txt_EmployeeType found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_EmployeeType not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_CompFreq() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$17\"))");

			Log.info("txt_CompFreq found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_CompFreq not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_CompRateCode() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$18\"))");

			Log.info("txt_CompRateCode found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_CompRateCode not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_EarningCode() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$19\"))");

			Log.info("txt_EarningCode found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_EarningCode not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_TaxLocationCode() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$20\"))");

			Log.info("txt_TaxLocationCode found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_TaxLocationCode not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_HireTemplate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ATTRB_MST_SM_CD_LOOKUP_ID$21\"))");

			Log.info("txt_HireTemplate found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_HireTemplate not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_SupervisorID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_UPDT_HRMS_SUPERVISOR_ID\"))");

			Log.info("txt_SupervisorID found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_SupervisorID not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_BusinessTitel() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_UPDT_HRMS_BUSINESS_TITLE\"))");

			Log.info("txt_BusinessTitel found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_BusinessTitel not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_StandardHours() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_UPDT_HRMS_STD_HOURS\"))");

			Log.info("txt_StandardHours found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_StandardHours not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_AnnualRate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_UPDT_HRMS_ANNUAL_RT\"))");

			Log.info("txt_AnnualRate found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_AnnualRate not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_CompRate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_UPDT_HRMS_COMPRATE\"))");

			Log.info("txt_CompRate found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_CompRate not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Currency() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_UPDT_HRMS_CURRENCY_CD\"))");

			Log.info("txt_Currency found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_Currency not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement nonEditObject_CompanySeniorityDate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_UPDT_HRMS_CMPNY_SENIORITY_DT\"))");

			Log.info("nonEditObject_CompanySeniorityDate found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("nonEditObject_CompanySeniorityDate not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement nonEditObject_BenefitsServiceDate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_UPDT_HRMS_SERVICE_DT\"))");

			Log.info("nonEditObject_BenefitsServiceDate found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("nonEditObject_BenefitsServiceDate not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement nonEditObject_SeniorityPayCalDate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_UPDT_HRMS_SENIORITY_PAY_DT\"))");

			Log.info("nonEditObject_SeniorityPayCalDate found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("nonEditObject_SeniorityPayCalDate not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_EarningStartDate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_UPDT_HRMS_EARNINGS_START_DT\"))");

			Log.info("txt_EarningStartDate found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_EarningStartDate not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_EarningEndDate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_UPDT_HRMS_EARNINGS_END_DT\"))");

			Log.info("txt_EarningEndDate found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("txt_EarningEndDate not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement chkbx_SkipSystemUpadte() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_UPDT_HRMS_SM_OB_BY_PASS_JOB\"))");

			Log.info("chkbx_SkipSystemUpadte found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("chkbx_SkipSystemUpadte not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_CMP_JOB_W_SAVE_PB\"))");

			Log.info("btn_Save found in the HR_CompleteJobDetails_Page");
		} catch (Exception e) {
			Log.info("btn_Save not found in the HR_CompleteJobDetails_Page");
			throw (e);
		}
		return element;
	}
}
