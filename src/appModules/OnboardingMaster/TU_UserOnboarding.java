package appModules.OnboardingMaster;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Activities.TenantUser.TU_CompleteUserOnboarding;
import appModules.Activities.TenantUser.TU_ElectronicDisclosure;
import pageObjects.BaseClass;

public class TU_UserOnboarding {
	@Test
	public static void Execute() throws Exception {

		TU_ElectronicDisclosure.Execute();
		TU_CompleteUserOnboarding.Execute();
		// External_LogOut.Execute();
		BaseClass.driver.quit();
		Reporter.log("TenantUser-UserOnboarding Completed Successfully<br>");
	}
}
