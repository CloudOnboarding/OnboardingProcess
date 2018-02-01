package appModules.Activities.HR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.HR_Tasks.HR_DrugTestResults_Page;
import utility.psUtility;

public class HR_DrugTestResults extends psUtility {
	@Test
	public static void Execute() throws Exception {
		HR_DrugTestResults_Page.chkbox_agree().click();
		HR_DrugTestResults_Page.btn_acknowledg().click();
		
		Reporter.log("DrugTest Results Completed Successfully<br>");
	}
}
