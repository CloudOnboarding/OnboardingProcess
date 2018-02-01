package appModules.OnboardingMaster;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.CreateInvitation;
import appModules.ExternalHome_CreateInvitation;
import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Login.External_LogOut;
import pageObjects.BaseClass;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class TU_CreateInvitation extends psUtility {
	@Test
	public static void Execute() throws Exception {
		setEnvironment(Constant.ExternalURL);
		psUtility.ExternalLogin(OnboardingConstants.TUUser, OnboardingConstants.ONBPassword);
		Verification2Factor_Authentication.Execute();
		Setup_ChallengeQuestions.Execute();
		Select_RoleType_HRAdmin.Execute();
		ExternalHome_CreateInvitation.Execute();
		CreateInvitation.Execute();
		Reporter.log("CA- Launched Successfully<br>");
		External_LogOut.Execute();
		BaseClass.driver.quit();
	}

}
