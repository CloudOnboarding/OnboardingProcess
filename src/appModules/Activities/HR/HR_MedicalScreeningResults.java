package appModules.Activities.HR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.HR_Tasks.HR_MedicalScreeningResults_Page;
import utility.psUtility;

public class HR_MedicalScreeningResults extends psUtility {
	@Test
	public static void Execute() throws Exception {
		HR_MedicalScreeningResults_Page.chkbox_agree().click();
		HR_MedicalScreeningResults_Page.btn_acknowledg().click();
		
		Reporter.log("Medical Screening Results Completed Successfully<br>");
	}
}
