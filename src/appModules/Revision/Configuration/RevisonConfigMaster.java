package appModules.Revision.Configuration;

import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Revision.RV_ApplyRevision;
import appModules.Revision.RV_CreateRevisions;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class RevisonConfigMaster extends psUtility{
	
	@Test
	public static void Execute() throws Exception {
		
		//setEnvironment(Constant.ExternalURL);
		psUtility.ExternalLogin(OnboardingConstants.TAUser, OnboardingConstants.ONBPassword);
		Verification2Factor_Authentication.Execute();
		Setup_ChallengeQuestions.Execute();
		
		
		
		RV_CreateRevisions.Execute("Process","Demo Revision Process");
		
		/*ApplyAuthNotifyEmail.Execute();
		ApplyChngonbProcNotifyEmails.Execute();
		NewAttributes.Execute();*/
		AddAction.Execute();
		ContentSecurity.Execute();
		RV_ApplyRevision.Execute();
		
	}
}
