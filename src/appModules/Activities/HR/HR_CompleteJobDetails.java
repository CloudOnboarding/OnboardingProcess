package appModules.Activities.HR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.HR_Tasks.HR_CompleteJobDetails_Page;
import utility.Log;
import utility.psUtility;

public class HR_CompleteJobDetails extends psUtility {
	@Test
	public static void Execute() throws Exception {
		// Candidate Information

		/*
		 * Fields are non editable in this session so to get the property use
		 * HR_CompleteJobDetails_Page method
		 *****/

		// Job Information

		HR_CompleteJobDetails_Page.txt_Action().sendKeys("AC00000001");
		Log.info("sendKeys action is performed on :txt_Action");
		HR_CompleteJobDetails_Page.txt_Reason().sendKeys("RE00000001");
		Log.info("sendKeys action is performed on :txt_Reason");

		/*
		 * HR_CompleteJobDetails_Page.txt_FullPartime().sendKeys( "");
		 * HR_CompleteJobDetails_Page.txt_COmpany().sendKeys( "");
		 * HR_CompleteJobDetails_Page.txt_Department().sendKeys( "");
		 * HR_CompleteJobDetails_Page.txt_BusinessUnit().sendKeys( "");
		 * HR_CompleteJobDetails_Page.txt_Location().sendKeys( "");
		 * HR_CompleteJobDetails_Page.txt_JobCode().sendKeys( "");
		 * HR_CompleteJobDetails_Page.txt_EmployeeClass().sendKeys( "");
		 * HR_CompleteJobDetails_Page.txt_AppointmentType().sendKeys( "");
		 * 
		 * HR_CompleteJobDetails_Page.txt_ClientID().sendKeys( "");
		 * HR_CompleteJobDetails_Page.txt_PayGroup().sendKeys( "");
		 * HR_CompleteJobDetails_Page.txt_SalaryPlan().sendKeys( "");
		 */
		HR_CompleteJobDetails_Page.txt_SalaryGrade().sendKeys("SG00000001");
		Log.info("sendKeys action is performed on :txt_SalaryGrade");
		HR_CompleteJobDetails_Page.txt_EmployeeType().sendKeys("ET00000002");
		Log.info("sendKeys action is performed on :txt_EmployeeType");
		HR_CompleteJobDetails_Page.txt_CompFreq().sendKeys("CF00000001");
		Log.info("Click action is performed on :txt_CompFreq");
		HR_CompleteJobDetails_Page.txt_CompRateCode().sendKeys("CR00000001");
		Log.info("sendKeys action is performed on :txt_CompFreq");

		HR_CompleteJobDetails_Page.txt_EarningCode().sendKeys("ER00000001");
		Log.info("sendKeys action is performed on :txt_EarningCode");

		HR_CompleteJobDetails_Page.txt_TaxLocationCode().sendKeys("TX00000001");
		Log.info("sendKeys action is performed on :txt_TaxLocationCode");

		// HR_CompleteJobDetails_Page.txt_HireTemplate(), "");

		HR_CompleteJobDetails_Page.txt_SupervisorID().sendKeys("0052");
		Log.info("sendKeys action is performed on :txt_SupervisorID");

		HR_CompleteJobDetails_Page.txt_BusinessTitel().sendKeys("SSE");
		Log.info("sendKeys action is performed on :txt_BusinessTitel");

		HR_CompleteJobDetails_Page.txt_StandardHours().sendKeys("40");
		Log.info("sendKeys action is performed on :txt_StandardHours");

		HR_CompleteJobDetails_Page.txt_CompRate().sendKeys("40000");
		Log.info("sendKeys action is performed on :txt_CompRate");
		HR_CompleteJobDetails_Page.txt_Currency().sendKeys("USD");
		Log.info("sendKeys action is performed on :txt_Currency");
		HR_CompleteJobDetails_Page.chkbx_SkipSystemUpadte().click();
		Log.info("Click action is performed on Skip System Upadte check box");
		
		HR_CompleteJobDetails_Page.btn_Save().click();
		Log.info("Click action is performed on :btn_Save");
		
		Reporter.log("HR Complete Job Details Completed Successfully<br>");

	}

}
