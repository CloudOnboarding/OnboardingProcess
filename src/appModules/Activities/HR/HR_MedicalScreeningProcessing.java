package appModules.Activities.HR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.HR_Tasks.HR_MedicalScreeningProcessing_Page;
import utility.psUtility;

public class HR_MedicalScreeningProcessing extends psUtility {
	@Test
	public static void Execute() throws Exception {
		HR_MedicalScreeningProcessing_Page.chkbox_agree().click();
		HR_MedicalScreeningProcessing_Page.btn_acknowledg().click();
		
		Reporter.log("Medical Screening Processing Completed Successfully<br>");
	}
}
