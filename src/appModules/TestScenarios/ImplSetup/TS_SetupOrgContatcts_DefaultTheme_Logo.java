package appModules.TestScenarios.ImplSetup;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Login.External_LogOut;
import pageObjects.BaseClass;
import pageObjects.TestScenarios.TS_SetupOrgContatcts_DefaultTheme_Logo_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class TS_SetupOrgContatcts_DefaultTheme_Logo extends psUtility {
	
	/**
	 * Test Name      : How to set up your organization's contacts, default theme and logos
	 * Developer      : Gopi
	 * Description    : Login with TA
	 *                  Navigate to organization management and select the values from the prompt 
	 *                  Ex: Primary contact, Secondary Contact , Log  and finally save the case
	 *                  
	 * Dependency     : 1) Organization ID, Tenant Admin user is required To execute the script
	 *                  2) Set the connection.Property file  in the folder Files>EnvironemntDetails>Connection.properties
	 *                  3) System defined data should be there before executing the case
	 *                    
	 *                   
	 */
	@Test
	public static void Execute() throws Exception {
		Constant.StopOnFail=false;
		
		//Login to external URL
		setEnvironment(Constant.ExternalURL);
		ExternalLogin(OnboardingConstants.TAUser, OnboardingConstants.ONBPassword);
		Verification2Factor_Authentication.Execute();
		Setup_ChallengeQuestions.Execute();
		
        //Set values using prompts in organization Management Page
		TS_SetupOrgContatcts_DefaultTheme_Logo_Page.btn_Menu().click();
		TS_SetupOrgContatcts_DefaultTheme_Logo_Page.lnk_OrganizationManagement().click();
		TS_SetupOrgContatcts_DefaultTheme_Logo_Page.txt_PrimaryContact().click();
		TS_SetupOrgContatcts_DefaultTheme_Logo_Page.lnk_PrimaryContactId().click();
		TS_SetupOrgContatcts_DefaultTheme_Logo_Page.txt_SecondaryContact().click();
		TS_SetupOrgContatcts_DefaultTheme_Logo_Page.lnk_SecondaryContactId().click();
		TS_SetupOrgContatcts_DefaultTheme_Logo_Page.txt_SupportContact().click();
		TS_SetupOrgContatcts_DefaultTheme_Logo_Page.lnk_SupportContacId().click();
		TS_SetupOrgContatcts_DefaultTheme_Logo_Page.txt_DefaultTheme().click();
		TS_SetupOrgContatcts_DefaultTheme_Logo_Page.lnk_DefaultThemeId().click();
		select(TS_SetupOrgContatcts_DefaultTheme_Logo_Page.sel_ThemeDriver(), "Company");
		TS_SetupOrgContatcts_DefaultTheme_Logo_Page.txt_DefaultLogo().click();
		TS_SetupOrgContatcts_DefaultTheme_Logo_Page.lnk_DefaultLogoImageID().click();
		TS_SetupOrgContatcts_DefaultTheme_Logo_Page.txt_MobileLogo().click();
		TS_SetupOrgContatcts_DefaultTheme_Logo_Page.lnk_MobileLogoImageID().click();
		
		//Save 
		TS_SetupOrgContatcts_DefaultTheme_Logo_Page.btn_Save().click();

		// Logout test case
		External_LogOut.Execute();
		BaseClass.driver.quit();

		Reporter.log("Setup Organization Contacts,Default Theme and Logo Successfully");

	}
}
