package appModules.Activities.TenantAdmin.OrgOnbording;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.TA_Tasks.TA_OrgOnboarding_NextStep_Page;
import utility.Log;
import utility.psUtility;

public class NextSteps extends psUtility {
	@Test
	public static void Execute() throws Exception {

		TA_OrgOnboarding_NextStep_Page.btn_Continue().click();
		Log.info("Click action is performed on Continue button");

		Reporter.log("Next Steps Activity For Tenant Admin-Org Onbording Completed Successfully<br>");
	}
}
