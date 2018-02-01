package appModules.ManageNewHires;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import pageObjects.BaseClass;
import pageObjects.SelectRoleType_Page;
import pageObjects.TestScenarios.TS_LockNewHireAccounts_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class ResetEpin extends psUtility {
	/**
	 * Test Name      : How to reset Epin
	 * Developer      : Srinivas
	 * Description    : Login with TU and reset epin .
	 *                  
	 * Dependency     : 1) Organization ID, Tenant Admin, Tenent user is required To execute the script
	 *                  2) Set the connection.Property file  in the folder Files>EnvironemntDetails>Connection.properties
	 *                   
	 */
	@Test
	public static void Execute() throws Exception {
		
		//Login to external site 
		if(!isElementExists("driver.findElement(By.id(\"configMenu\"))")) {
			BaseClass.driver.quit();
			setEnvironment(Constant.ExternalURL);
			psUtility.ExternalLogin(OnboardingConstants.TUUser, OnboardingConstants.ONBPassword);
			Verification2Factor_Authentication.Execute();
			Setup_ChallengeQuestions.Execute();
	
			SelectRoleType_Page.lnk_HRHelpdesk().click();
		}
		//Navigate to helpdeskconsole and change the Epin
		TS_LockNewHireAccounts_Page.Lnk_ConfigMenu().click();
		TS_LockNewHireAccounts_Page.Lnk_HelpDeskConsole().click();
		TS_LockNewHireAccounts_Page.txt_QuickFliter().sendKeys(OnboardingConstants.CandidateId);
		TS_LockNewHireAccounts_Page.Lnk_Actions().click();
		TS_LockNewHireAccounts_Page.Lnk_ResetEpin().click();
		TS_LockNewHireAccounts_Page.btn_OK().click();
		TS_LockNewHireAccounts_Page.btn_Close().click();
        
		Reporter.log("ResetEpin Performed Successfully<br>");
	}
}
