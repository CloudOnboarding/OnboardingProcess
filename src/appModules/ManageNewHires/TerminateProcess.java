package appModules.ManageNewHires;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Login.External_LogOut;
import appModules.OnboardingMaster.Select_RoleType_HRAdmin;
import pageObjects.BaseClass;
import pageObjects.Message_Handler;
import pageObjects.TestScenarios.TS_TerminateProcess_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class TerminateProcess extends psUtility {
	/**
	 * Test Name      : How to Terminate  a business process for new hire
	 * Developer      : Srinivas
	 * Description    : Login with TU and Terminate  invitation for a candidate ID
	 *                  
	 * Dependency     : 1) Organization ID, Tenant  user, CandidateID is required To execute the script
	 *                  2) Set the connection.Property file  in the folder Files>EnvironemntDetails>Connection.properties
	 *                   
	 */
	@Test
	public static void Execute() throws Exception {
		
		
		//Login to External URL
		setEnvironment(Constant.ExternalURL);
		psUtility.ExternalLogin(OnboardingConstants.TUUser, OnboardingConstants.ONBPassword);
		Verification2Factor_Authentication.Execute();
		Setup_ChallengeQuestions.Execute();
		Select_RoleType_HRAdmin.Execute();
		TS_TerminateProcess_Page.lnk_ConfigMenu().click();
		//Navigate to candidate console and terminate  the BP
		TS_TerminateProcess_Page.lnk_CandidateConsole().click();
		
		TS_TerminateProcess_Page.txt_QuickFliter().sendKeys(OnboardingConstants.CandidateId);
		TS_TerminateProcess_Page.lnk_SelectAction().click();
		TS_TerminateProcess_Page.lnk_TerminateProcess().click();
		select(TS_TerminateProcess_Page.sel_Reason(),"Duplicate Entry");
		TS_TerminateProcess_Page.txt_Comment().sendKeys("Duplicate Entry");
		TS_TerminateProcess_Page.btn_Submit().click();
		
		String ConfirmationMessage = Message_Handler.get_ModalBodyText().getText();
		Reporter.log("ConfirmMessage:::" + ConfirmationMessage + "<br>");
		Message_Handler.btn_OK().click();
		
		Message_Handler.btn_ModalBodyClose().click();
		
		External_LogOut.Execute();
		BaseClass.driver.quit();
		
	}
}
