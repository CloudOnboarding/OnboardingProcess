package appModules.Activities.TenantUser;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.TU_Tasks.TU_CompleteUserOnboarding_Page;
import utility.Log;
import utility.psUtility;

public class TU_CompleteUserOnboarding extends psUtility {
	@Test
	public static void Execute() throws Exception {

		TU_CompleteUserOnboarding_Page.btn_Home().click();
		Log.info("Click action is performed on TU_CompleteUserOnboarding");
		// click(CompleteUserOnboarding_Page.btn_Home());
		Reporter.log("Complete User Onboarding Activity For TU User Onbording Completed Successfully<br>");
	}
}
