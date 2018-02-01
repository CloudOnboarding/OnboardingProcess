package appModules.ManageNewHires;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Login.External_LogOut;
import appModules.OnboardingMaster.Select_RoleType_HRAdmin;
import pageObjects.BaseClass;
import pageObjects.Message_Handler;
import pageObjects.TestScenarios.TS_PurgeProcess_page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class PurgeProcess extends psUtility {
	
	/**
	 * Test Name      : How to Purge  a business process for new hire
	 * Developer      : Srinivas
	 * Description    : Login with TU and Purge invitation for a candidate ID
	 *                  
	 * Dependency     : 1) Organization ID, Tenant  user, CandidateID is required To execute the script
	 *                  2) Set the connection.Property file  in the folder Files>EnvironemntDetails>Connection.properties
	 *                   
	 */
	@Test
	public static void Execute() throws Exception {
		//setEnvironment(Constant.ExternalURL);
		if(!isElementExists("driver.findElement(By.id(\"configMenu\"))")) {
			//Login to External URL
			BaseClass.driver.quit();
			setEnvironment(Constant.ExternalURL);
			psUtility.ExternalLogin(OnboardingConstants.TUUser, OnboardingConstants.ONBPassword);
			Verification2Factor_Authentication.Execute();
			Setup_ChallengeQuestions.Execute();
			
			Select_RoleType_HRAdmin.Execute();
		}
		//Navigate to candidate console and Purge  the BP
		TS_PurgeProcess_page.lnk_ConfigMenu().click();
		TS_PurgeProcess_page.lnk_CandidateConsole().click();
		TS_PurgeProcess_page.txt_QuickFliter().sendKeys(OnboardingConstants.CandidateId);
		TS_PurgeProcess_page.lnk_SelectAction().click();
		TS_PurgeProcess_page.lnk_Purge().click();
		
		
		String ConfirmationMessage = Message_Handler.get_ModalBodyText().getText();
		Reporter.log("ConfirmMessage:::" + ConfirmationMessage + "<br>");
		Message_Handler.btn_OK().click();
		
		Thread.sleep(2000);
		Message_Handler.btn_OK().click();
		
		
		External_LogOut.Execute();
		BaseClass.driver.quit();
		
	}
}
