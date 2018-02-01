package appModules.OnboardingMaster;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Activities.TenantAdmin.UserOnbording.CompleteUserOnboarding;
import appModules.Activities.TenantAdmin.UserOnbording.ElectronicDisclosure;

public class TA_UserOnbordingProcess {
	@Test
	public static void Execute() throws Exception {

		ElectronicDisclosure.Execute();
		CompleteUserOnboarding.Execute();

		// External_LogOut.Execute();

		Reporter.log("TenantAdmin UserOnboarding Completed Successfully<br>");
	}
}
