package appModules.ManageNewHires;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.OnboardingMaster.Select_RoleType_HRAdmin;
import pageObjects.Message_Handler;
import pageObjects.TestScenarios.TS_ResendInvitationNewHire_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class ResendInvitationNewHire extends psUtility {
	/**
	 * Test Name      : How to resend invitation for new hire
	 * Developer      : Srinivas
	 * Description    : Login with TU and re-send invitation for a candidate ID
	 *                  
	 * Dependency     : 1) Organization ID, Tenant  user, CandidateID is required To execute the script
	 *                  2) Set the connection.Property file  in the folder Files>EnvironemntDetails>Connection.properties
	 *                   
	 */
	@Test
	public static void Execute() throws Exception {
		
		//Login to external URL
		setEnvironment(Constant.ExternalURL);
		psUtility.ExternalLogin(OnboardingConstants.TUUser, OnboardingConstants.ONBPassword);
		Verification2Factor_Authentication.Execute();
		Setup_ChallengeQuestions.Execute();
		
		Select_RoleType_HRAdmin.Execute();
		
		//Navigate to candidate console and resend invitation
		TS_ResendInvitationNewHire_Page.Lnk_ConfigMenu().click();
		TS_ResendInvitationNewHire_Page.Lnk_CandidateConsole().click();
		TS_ResendInvitationNewHire_Page.txt_QuickFliter().sendKeys(OnboardingConstants.CandidateId);
		TS_ResendInvitationNewHire_Page.Lnk_SelectAction().click();
		TS_ResendInvitationNewHire_Page.lnk_ResendLogin().click();
		
		String ConfirmationMessage = Message_Handler.get_ModalBodyText().getText();
		Reporter.log("ConfirmMessage:::" + ConfirmationMessage + "<br>");
		
		Message_Handler.btn_OK().click();
		
		String LoginEmailSent = Message_Handler.get_ResendMessage().getText();
		Reporter.log( LoginEmailSent + "<br>");
		Message_Handler.btn_ModalBodyClose().click();
	}
}
