package appModules.Activities.TenantAdmin.OrgOnbording;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.TA_Tasks.TA_CompleteOrgOnboarding_Page;
import utility.Log;
import utility.psUtility;

public class CompleteOrgOnboarding extends psUtility {
	@Test
	public static void Execute() throws Exception {

		TA_CompleteOrgOnboarding_Page.btn_Acknowledge().click();
		Log.info("Click action is performed on Acknowledge button");

		Reporter.log("Organization Onboarding Activity For Tenant Admin-Org Onboarding Completed Successfully<br>");
	}

}
