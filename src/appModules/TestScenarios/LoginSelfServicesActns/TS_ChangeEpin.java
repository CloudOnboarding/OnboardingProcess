package appModules.TestScenarios.LoginSelfServicesActns;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Login.External_LogOut;
import pageObjects.BaseClass;
import pageObjects.TestScenarios.TS_ChangeEpin_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class TS_ChangeEpin extends psUtility {
	
	/**
	 * Test Name      : How to change your EPin
	 * Developer      : Srinivas
	 * Description    : Login with TA and Select my profile
	 *                  Select change E-Pin link and give the appropriate  data 
	 *                  Finally click update button
	 * Dependency     : 1) Organization ID, Tenant Admin user is required To execute the script
	 *                  2) Set the connection.Property file  in the folder Files>EnvironemntDetails>Connection.properties
	 *                  3)Set the right E-Pin details to update  in the script 
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
		
		// Navigate to my profile and update the E-Pin
		TS_ChangeEpin_Page.lnk_Accountname().click();
		TS_ChangeEpin_Page.lnk_MyProfile().click();

		TS_ChangeEpin_Page.lnk_ChangePin().click();
		TS_ChangeEpin_Page.btn_Edit().click();
		TS_ChangeEpin_Page.txt_CurrentPin().sendKeys("123$%");
		TS_ChangeEpin_Page.txt_NewPin().sendKeys("123$4");
		TS_ChangeEpin_Page.txt_ConfirmPin().sendKeys("123$4");
		TS_ChangeEpin_Page.btn_Update().click();
		TS_ChangeEpin_Page.btn_Ok().click();

		// External URL logout
		External_LogOut.Execute();
		BaseClass.driver.quit();

		Reporter.log("E-Pin Changed Successfully <br>");
		Constant.StopOnFail=true;
	}
}
