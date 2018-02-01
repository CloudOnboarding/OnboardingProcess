package appModules.TestScenarios.ImplSetup;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.CreateOrganization;
import appModules.NavigateToOrganizationRegistration_Page;
import appModules.SetEnvironment;
import appModules.Login.Internal_Login;
import appModules.Login.TAFirstLogin;
import appModules.OnboardingMaster.TA_OnboardingProcess;
import utility.Constant;

public class TS_ActivateOrganization {

	/**
	 * Test Name      : How to activate your organization
	 * Developer      : Gopi
	 * Description    : Self Registration URL sent to TA EMail,TA Completes activities like 
	 *                  Self Registration , User Onboarding , Orginization Onboarding to activate org.
	 * Dependency     : 1) Create and launching organization is the prerequisite and Change the orgID & TA value  in package :Utility>OnboardingConstants.java                   
	 *                     so-Included Create organization Scripts
	 *                  2) Set The connection.Property file  in the folder Files>EnvironemntDetails>Connection.properties      
	 *                   
	 */
	
	@Test 
	public static void Execute() throws Exception {
		Constant.StopOnFail=false;
		/**** Start :Dependency Script "Create organization"****/
		
		SetEnvironment.Execute();
		Internal_Login.Execute();
		NavigateToOrganizationRegistration_Page.Execute();
		CreateOrganization.Execute();

		/**** End :Dependency Script "Create organization" ****/
		
		TAFirstLogin.Execute();
		TA_OnboardingProcess.Execute();
		Reporter.log("Orginization Activated Performed Successfully");
		Constant.StopOnFail=true;
	}

}
