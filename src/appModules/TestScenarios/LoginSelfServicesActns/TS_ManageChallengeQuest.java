package appModules.TestScenarios.LoginSelfServicesActns;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Login.External_LogOut;
import pageObjects.BaseClass;
import pageObjects.TestScenarios.TS_ManageChallengeQuest_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class TS_ManageChallengeQuest extends psUtility {
	
	/**
	 * Test Name      : How to Manage Challange Questions your password
	 * Developer      : Srinivas
	 * Description    : Login with TA and Select my profile
	 *                  Select Manage questions link and give the appropriate  data 
	 *                  Finally click update button
	 * Dependency     : 1) Organization ID, Tenant Admin user is required To execute the script
	 *                  2) Set the connection.Property file  in the folder Files>EnvironemntDetails>Connection.properties
	 *                   
	 */
	
	@Test
	public static void Execute() throws Exception {
		Constant.StopOnFail=false;
		// Login to external URL
		setEnvironment(Constant.ExternalURL);
		psUtility.ExternalLogin(OnboardingConstants.TAUser, OnboardingConstants.ONBPassword);
		Verification2Factor_Authentication.Execute();
		Setup_ChallengeQuestions.Execute();
		
        // Navigate to my profile and update the password 
		TS_ManageChallengeQuest_Page.lnk_Accountname().click();
		TS_ManageChallengeQuest_Page.lnk_MyProfile().click();
		TS_ManageChallengeQuest_Page.lnk_ChangeQuestion().click();
		TS_ManageChallengeQuest_Page.btn_Edit().click();
		select(TS_ManageChallengeQuest_Page.sel_Question(),"What was the name of your first pet?");
		TS_ManageChallengeQuest_Page.txt_Answer().sendKeys("1");
		TS_ManageChallengeQuest_Page.btn_Update().click();
		TS_ManageChallengeQuest_Page.btn_Save().click();
		
		
        //Finally quit browser
		External_LogOut.Execute();
		BaseClass.driver.quit();

		Reporter.log("Manage Challange Questions Successfully for onboarding user<br>");
		Constant.StopOnFail=true;
	}
}
