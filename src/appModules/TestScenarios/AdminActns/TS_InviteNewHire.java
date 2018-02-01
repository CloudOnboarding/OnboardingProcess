package appModules.TestScenarios.AdminActns;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.CreateInvitation;
import appModules.ExternalHome_CreateInvitation;
import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Login.External_LogOut;
import appModules.OnboardingMaster.Select_RoleType_HRAdmin;
import pageObjects.BaseClass;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class TS_InviteNewHire extends psUtility {
	
	/**
	 * Test Name      : How to invite a new hire
	 * Developer      : Srinivas
	 * Description    : Login with TU and create a new candidate ID
	 *                  
	 * Dependency     : 1) Organization ID, Tenant  user is required To execute the script
	 *                  2) Set the connection.Property file  in the folder Files>EnvironemntDetails>Connection.properties
	 *                   
	 */
	@Test
	public static void Execute() throws Exception {
		Constant.StopOnFail=false;
		//Login to external url
		setEnvironment(Constant.ExternalURL);
		ExternalLogin(OnboardingConstants.TUUser, OnboardingConstants.ONBPassword);
		Verification2Factor_Authentication.Execute();
		Setup_ChallengeQuestions.Execute();
		//Select the role		
		Select_RoleType_HRAdmin.Execute();
		ExternalHome_CreateInvitation.Execute();
		//Create invitation and launch
		CreateInvitation.Execute();
		Reporter.log("CA- Launched Successfully <br>");
		
		External_LogOut.Execute();
		BaseClass.driver.quit();
		
		
		Constant.StopOnFail=true;
	
	
	}

}
