package appModules.Activities.TenantAdmin.UserOnbording;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.TA_Tasks.TA_CompleteUserOnboarding_Page;
import utility.Log;
import utility.psUtility;

public class CompleteUserOnboarding extends psUtility {
	@Test
	public static void Execute() throws Exception {

		TA_CompleteUserOnboarding_Page.btn_continueOrgOnboard().click();
		Log.info("Click action is performed on Continue Organization Onboarding button");
		// click(CompleteUserOnboarding_Page.btn_Home());
		Reporter.log("Complete User Onboarding Activity For Tenant Admin-User Onbording completed successfully<br>");
	}
}
