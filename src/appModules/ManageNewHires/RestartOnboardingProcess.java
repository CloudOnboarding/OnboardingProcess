package appModules.ManageNewHires;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.OnboardingMaster.Select_RoleType_HRAdmin;
import pageObjects.BaseClass;
import pageObjects.Message_Handler;
import pageObjects.TestScenarios.TS_RestartOnboardingProcess_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class RestartOnboardingProcess extends psUtility {
	/**
	 * Test Name      : How to Restart a business process for new hire
	 * Developer      : Srinivas
	 * Description    : Login with TU and Restart invitation for a candidate ID
	 *                  
	 * Dependency     : 1) Organization ID, Tenant  user, CandidateID is required To execute the script
	 *                  2) Set the connection.Property file  in the folder Files>EnvironemntDetails>Connection.properties
	 *                   
	 */
	@Test
	public static void Execute() throws Exception {
		//setEnvironment(Constant.ExternalURL);
		if(!isElementExists("driver.findElement(By.id(\"configMenu\"))")) {
			BaseClass.driver.quit();
			//Login to external URL
			setEnvironment(Constant.ExternalURL);
			psUtility.ExternalLogin(OnboardingConstants.TUUser, OnboardingConstants.ONBPassword);
			Verification2Factor_Authentication.Execute();
			Setup_ChallengeQuestions.Execute();
			
			Select_RoleType_HRAdmin.Execute();
			
		}
		//Navigate to candidate console and restart the BP
		TS_RestartOnboardingProcess_Page.lnk_ConfigMenu().click();
		TS_RestartOnboardingProcess_Page.lnk_CandidateConsole().click();
		TS_RestartOnboardingProcess_Page.txt_QuickFliter().sendKeys(OnboardingConstants.CandidateId);
		TS_RestartOnboardingProcess_Page.lnk_SelectAction().click();
		TS_RestartOnboardingProcess_Page.lnk_RestartProcess().click();
		select(TS_RestartOnboardingProcess_Page.sel_Reason(),"Process Restart");
		TS_RestartOnboardingProcess_Page.txt_Comment().sendKeys("Process Restart");
		TS_RestartOnboardingProcess_Page.btn_Submit().click();
		
		String ConfirmationMessage = Message_Handler.get_ModalBodyText().getText();
		Reporter.log("ConfirmMessage:::" + ConfirmationMessage + "<br>");
		Message_Handler.btn_OK().click();
		
	}
}
