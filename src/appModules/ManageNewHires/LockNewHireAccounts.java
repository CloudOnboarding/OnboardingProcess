package appModules.ManageNewHires;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import pageObjects.SelectRoleType_Page;
import pageObjects.TestScenarios.TS_LockNewHireAccounts_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class LockNewHireAccounts extends psUtility {
	/**
	 * Test Name      : How to Lock a new hire  account
	 * Developer      : Srinivas
	 * Description    : Login with TU and select candidate and lock the account .
	 *                  
	 * Dependency     : 1) Organization ID, Tenant Admin, Tenent user (User must me unlock) is required To execute the script
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

		SelectRoleType_Page.lnk_HRHelpdesk().click();
		
		TS_LockNewHireAccounts_Page.Lnk_ConfigMenu().click();
		TS_LockNewHireAccounts_Page.Lnk_HelpDeskConsole().click();
		TS_LockNewHireAccounts_Page.txt_QuickFliter().sendKeys(OnboardingConstants.CandidateId);
		TS_LockNewHireAccounts_Page.Lnk_Actions().click();
		TS_LockNewHireAccounts_Page.Lnk_AccountLock().click();
		TS_LockNewHireAccounts_Page.btn_OK().click();
		TS_LockNewHireAccounts_Page.btn_Close().click();
        
		Reporter.log("Lock NewHire Accounts Performed Successfully<br>");
	}
}
