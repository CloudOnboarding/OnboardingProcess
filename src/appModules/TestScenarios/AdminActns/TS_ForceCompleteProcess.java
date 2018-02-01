package appModules.TestScenarios.AdminActns;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Login.External_LogOut;
import appModules.OnboardingMaster.Select_RoleType_HRAdmin;
import pageObjects.BaseClass;
import pageObjects.Message_Handler;
import pageObjects.TestScenarios.TS_ForceCompleteProcess_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class TS_ForceCompleteProcess extends psUtility {
	
	/**
	 * Test Name      : How to Force complete a business process for new hire
	 * Developer      : Srinivas
	 * Description    : Login with TU and Force complete invitation for a candidate ID
	 *                  
	 * Dependency     : 1) Organization ID, Tenant  user, CandidateID is required To execute the script
	 *                  2) Set the connection.Property file  in the folder Files>EnvironemntDetails>Connection.properties
	 *                   
	 */
	@Test
	public static void Execute() throws Exception {
		
		Constant.StopOnFail=false;
		
		//Login to external URL
		setEnvironment(Constant.ExternalURL);
		psUtility.ExternalLogin(OnboardingConstants.TUUser, OnboardingConstants.ONBPassword);
		Verification2Factor_Authentication.Execute();
		Setup_ChallengeQuestions.Execute();
		Select_RoleType_HRAdmin.Execute();
		//Navigate to candidate console and force complete the BP
		TS_ForceCompleteProcess_Page.lnk_ConfigMenu().click();
		TS_ForceCompleteProcess_Page.lnk_CandidateConsole().click();
		
		TS_ForceCompleteProcess_Page.txt_QuickFliter().sendKeys(OnboardingConstants.CandidateId);
		TS_ForceCompleteProcess_Page.lnk_SelectAction().click();
		TS_ForceCompleteProcess_Page.lnk_ForceComplete().click();
		select(TS_ForceCompleteProcess_Page.sel_Reason(),"Force Complete");
		TS_ForceCompleteProcess_Page.txt_Comment().sendKeys("Force Complete");
		TS_ForceCompleteProcess_Page.btn_Submit().click();
		
		String ConfirmationMessage = Message_Handler.get_ModalBodyText().getText();
		Reporter.log("ConfirmMessage:::" + ConfirmationMessage + "<br>");
		Message_Handler.btn_OK().click();
		
		
		
		External_LogOut.Execute();
		BaseClass.driver.quit();
		Constant.StopOnFail=true;
		
		Reporter.log("Fource COmplete Onboarding Process Performed Successfully<br>");
		
	}
}
