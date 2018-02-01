package appModules.Activities.HR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.HR_Tasks.HR_DrugTestAuthorizationDeclined_Page;
import utility.psUtility;

public class HR_DrugTestAuthorizationDeclined extends psUtility {
	@Test
	public static void Execute() throws Exception {
		HR_DrugTestAuthorizationDeclined_Page.chkbox_agree().click();
		HR_DrugTestAuthorizationDeclined_Page.btn_acknowledg().click();
		
		Reporter.log("DrugTest Authorization Declined Completed Successfully<br>");
	}
}
