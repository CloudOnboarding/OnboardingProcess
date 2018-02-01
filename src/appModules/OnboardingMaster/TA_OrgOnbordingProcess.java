package appModules.OnboardingMaster;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Activities.TenantAdmin.OrgOnbording.CompleteOrgOnboarding;
import appModules.Activities.TenantAdmin.OrgOnbording.ElectronicDisclosure;
import appModules.Activities.TenantAdmin.OrgOnbording.NextSteps;
import appModules.Login.External_LogOut;

public class TA_OrgOnbordingProcess {
	@Test
	public static void Execute() throws Exception {

		ElectronicDisclosure.Execute();
		NextSteps.Execute();
		CompleteOrgOnboarding.Execute();
		External_LogOut.Execute();
		Reporter.log("TenantAdmin OrgOnboarding Completed Successfully<br>");
	}
}
