package appModules.Activities.HR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.HR_Tasks.HR_PreScreenAudit_Page;
import utility.psUtility;

public class HR_PreScreenAudit extends psUtility {
	@Test
	public static void Execute() throws Exception {
		HR_PreScreenAudit_Page.chkbox_agree().click();
		HR_PreScreenAudit_Page.btn_acknowledg().click();
		
		Reporter.log("PreScreen Audit Completed Successfully<br>");
	}
}
