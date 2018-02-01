package appModules.OnboardingMaster;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.CreateAndMangeUsers;
import appModules.ExternalHome_ManageUserContacts;
import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Login.External_LogOut;
import pageObjects.BaseClass;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class TA_CreateNewTenantUser extends psUtility {

	@Test
	public static void Execute() throws Exception {
		setEnvironment(Constant.ExternalURL);
		psUtility.ExternalLogin(OnboardingConstants.TAUser, OnboardingConstants.ONBPassword);
		Verification2Factor_Authentication.Execute();
		Setup_ChallengeQuestions.Execute();
		// ONBAdminLogin(OnboardingConstants.TAUser, OnboardingConstants.ONBPassword,
		// "TA");
		ExternalHome_ManageUserContacts.Execute();
		CreateAndMangeUsers.Execute();
		External_LogOut.Execute();
		Reporter.log("TenantUser Id:" + OnboardingConstants.TUUser + " Is Created By TenantAdmin<br>");
		BaseClass.driver.quit();
	}

}
