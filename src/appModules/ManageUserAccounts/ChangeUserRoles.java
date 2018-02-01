package appModules.ManageUserAccounts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import pageObjects.BaseClass;
import pageObjects.TestScenarios.TS_ChangeUserRoles_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class ChangeUserRoles extends psUtility {
	
	/**
	 * Test Name      : How to change a user's roles
	 * Developer      : Srinivas
	 * Description    : Login with TA and Navigating to Manage user/contacts and assign new role
	 *                  
	 * Dependency     : 1) Organization ID, TenantAdmin, CandidateID is required To execute the script
	 *                  2) Set the connection.Property file  in the folder Files>EnvironemntDetails>Connection.properties
	 *                   
	 */
	public static String userName="";
	@Test
	public static void Execute() throws Exception {
		if(!isElementExists("driver.findElement(By.id(\"configMenu\"))")) {
			BaseClass.driver.quit();
	       //Navigating to Manage user/contacts and assign new role
			setEnvironment(Constant.ExternalURL);
			psUtility.ExternalLogin(OnboardingConstants.TAUser, OnboardingConstants.ONBPassword);
			Verification2Factor_Authentication.Execute();
			Setup_ChallengeQuestions.Execute();
		}
		TS_ChangeUserRoles_Page.Lnk_ConfigMenu().click();
		TS_ChangeUserRoles_Page.Lnk_ManageUsersContacts().click();
		TS_ChangeUserRoles_Page.Lnk_Actions().click();
		TS_ChangeUserRoles_Page.Lnk_AssignNewRoles().click();
		select(TS_ChangeUserRoles_Page.Sel_SmartOnboardingRoles(), "HR Specialist");
		TS_ChangeUserRoles_Page.Btn_Save().click();
		
		Reporter.log("TenantUser Id:" + OnboardingConstants.TAUser + " is create by TA<br>");
}
}
