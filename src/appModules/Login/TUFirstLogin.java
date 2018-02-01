package appModules.Login;

import org.testng.annotations.Test;

import appModules.SelfRegistration;
import appModules.SetEnvironment;
import appModules.Setup_ChallengeQuestions;
import appModules.SmartOnboardingWelcome;
import appModules.Verification2Factor_Authentication;
import appModules.OnboardingMaster.Select_RoleType_HRAdmin;
import pageObjects.SelectRoleType_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class TUFirstLogin {
	@Test
	public static void Execute() throws Exception {
		SetEnvironment.Execute();
		SelfRegistration.Execute(OnboardingConstants.TUUser);
		psUtility.ExternalLogin(OnboardingConstants.TUUser, OnboardingConstants.ONBPassword);
		Verification2Factor_Authentication.Execute();
		Setup_ChallengeQuestions.Execute();
		SelectRoleType_Page.lnk_RoleSwitch().click();
		Select_RoleType_HRAdmin.Execute();
		SmartOnboardingWelcome.Execute();
	}

}
