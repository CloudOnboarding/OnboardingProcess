package appModules.Activities.HR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.HR_Tasks.HR_SendCandidateData_Page;
import utility.Log;
import utility.psUtility;

public class HR_SendCandidateData extends psUtility {

	@Test
	public static void Execute() throws Exception {

		if(isElementExists("driver.findElement(By.id(\"SM_BP_WRK_SM_BP_AGREE\"))")) {	
			HR_SendCandidateData_Page.chkbx_ProcessComplete().click();
			Log.info("Click action is performed on :chkbx_ProcessComplete ");
			HR_SendCandidateData_Page.btn_SaveSendCandidatetoHRMS().click();
			Log.info("Click action is performed on :Electronic Signature Button");

			Reporter.log("HR SendCandidateData Completed Successfully<br>");
		}
		
		if(isElementExists("driver.findElement(By.id(\"SM_OB_WRK_SM_OB_I_AGREE\"))")) {	
			HR_SendCandidateData_Page.chkbx_ProcessComplete1().click();
			Log.info("Click action is performed on :chkbx_ProcessComplete ");
			HR_SendCandidateData_Page.btn_SavetoHRMS().click();
			Log.info("Click action is performed on :Electronic Signature Button");

			Reporter.log("HR SendCandidateData Completed Successfully<br>");
		}
		

	}

}
