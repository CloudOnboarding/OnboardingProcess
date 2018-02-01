package appModules;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.SmartOnboardingWelcome_Page;
import utility.Log;
import utility.psUtility;

public class SmartOnboardingWelcome extends psUtility {
	@Test
	public static void Execute() throws Exception {

		SmartOnboardingWelcome_Page.lnk_GetStarted().click();
		Log.info("Click action is performed on Get Started link");
		Reporter.log("Onboarding Welcome Page Displayed<br>");
	}
}
