package appModules.OnboardingMaster;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Revision.Configuration.RevisonConfigMaster;
import appModules.Revision.Content.ManageContentRev_Master;
import pageObjects.BaseClass;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class RevisionMaster extends psUtility{
	@Test
	public static void Execute() throws Exception {

		setEnvironment(Constant.ExternalURL);
		psUtility.ExternalLogin(OnboardingConstants.TAUser, OnboardingConstants.ONBPassword);
		Verification2Factor_Authentication.Execute();
		Setup_ChallengeQuestions.Execute();
		
		ManageContentRev_Master.Execute();
		RevisonConfigMaster.Execute();
		
		//External_LogOut.Execute();
		Reporter.log("Revision Created Successfully <br>");
		BaseClass.driver.quit();
		
	//	TS_OrganizationThemeChange.Execute();
	//	TS_SetupOrgContatcts_DefaultTheme_Logo.Execute();
	}

}
