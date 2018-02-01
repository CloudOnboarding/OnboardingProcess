package appModules.TestScenarios.ImplSetup;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.CreateAndMangeUsers;
import appModules.ExternalHome_ManageUserContacts;
import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Activities.TenantUser.TU_CompleteUserOnboarding;
import appModules.Activities.TenantUser.TU_ElectronicDisclosure;
import appModules.Login.External_LogOut;
import appModules.Login.TUFirstLogin;
import pageObjects.BaseClass;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class TS_AddSystemSetupUsers extends psUtility{
	
	/**
	 * Test Name      : How to add system setup users
	 * Developer      : Gopi
	 * Description    : Creating New tenant user by tenant administrator
	 *                  
	 * Dependency     : 1) Organization ID, Tenant Admin user is required to execute the script
	 *                  2) Set the connection.Property file  in the folder Files>EnvironemntDetails>Connection.properties      
	 *                   
	 */
	
	@Test
	public static void Execute() throws Exception  {
		Constant.StopOnFail=false;
		//Launching External URL & login as TA
		setEnvironment(Constant.ExternalURL);
		ExternalLogin(OnboardingConstants.TAUser, OnboardingConstants.ONBPassword);
	   //Security Authentications 
		Verification2Factor_Authentication.Execute();
		Setup_ChallengeQuestions.Execute();
		
		ExternalHome_ManageUserContacts.Execute();
		
		//Create A new Tenant User with all roles
		CreateAndMangeUsers.Execute();
		External_LogOut.Execute();
		BaseClass.driver.quit();
		
		//TU Self Registration and TU onboarding Process
		TUFirstLogin.Execute();
		TU_ElectronicDisclosure.Execute();
		TU_CompleteUserOnboarding.Execute();
		
		
		BaseClass.driver.quit();
		Reporter.log("TenantUser Id:" + OnboardingConstants.TAUser + " is create by TenantAdmin<br>");
		Constant.StopOnFail=true;
	
	}

}

