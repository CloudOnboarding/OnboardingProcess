package appModules.ImplSetup;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Login.External_LogOut;
import pageObjects.BaseClass;
import pageObjects.TestScenarios.TS_AuthenticationSchemePreference_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class AuthenticationSchemePreference extends psUtility{
	
	/**
	 * Test Name      : How to change authentication scheme preferences
	 * Developer      : Rahul
	 * Description    : Login with TA
	 *                  Navigate to Authentication preference schm and change the preference 
	 *                  Ex: Enable or disable challenge questions or 2 factor 
	 *                  
	 * Dependency     : 1) Organization ID, Tenant Admin user is required To execute the script
	 *                  2) Set the connection.Property file  in the folder Files>EnvironemntDetails>Connection.properties
	 *                    
	 *                   
	 */
	@Test
	public static void Execute() throws Exception {
		
		if(!isElementExists("driver.findElement(By.id(\"configMenu\"))")) {	
			BaseClass.driver.quit();
			// Login to External URL
			setEnvironment(Constant.ExternalURL);
			ExternalLogin(OnboardingConstants.TAUser, OnboardingConstants.ONBPassword);
			Verification2Factor_Authentication.Execute();
			Setup_ChallengeQuestions.Execute();
		}
		// Navigate to Authentication preference and change the preferences
		TS_AuthenticationSchemePreference_Page.Lnk_ConfigMenu().click();
		TS_AuthenticationSchemePreference_Page.Lnk_authenticationPrefrence().click();
		TS_AuthenticationSchemePreference_Page.Chk_TwoFactor().click();
		TS_AuthenticationSchemePreference_Page.Chk_ChallengeQueation().click();
		TS_AuthenticationSchemePreference_Page.Btn_Save().click();
        
		//Logout test case
		External_LogOut.Execute();
		BaseClass.driver.quit();
		
		Reporter.log("Authentication Scheme Prefrence Saved Performed Successfully <br>");
	}

}
