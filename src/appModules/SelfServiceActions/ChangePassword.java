package appModules.SelfServiceActions;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import pageObjects.BaseClass;
import pageObjects.TestScenarios.TS_ChangePassword_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class ChangePassword extends psUtility {
	
	/**
	 * Test Name      : How to change your password
	 * Developer      : Srinivas
	 * Description    : Login with TA and Select my profile
	 *                  Select change password link and give the appropriate  data 
	 *                  Finally click update button
	 * Dependency     : 1) Organization ID, Tenant Admin user is required To execute the script
	 *                  2) Set the connection.Property file  in the folder Files>EnvironemntDetails>Connection.properties
	 *                  3)Set the right password details to update  in the script 
	 *                   
	 */
	
	@Test
	public static void Execute() throws Exception {
		if(!isElementExists("driver.findElement(By.xpath(\"//*[@sm-parent='accountMenu']\"))")) {
			BaseClass.driver.quit();
			// Login to external URL
			setEnvironment(Constant.ExternalURL);
			psUtility.ExternalLogin(OnboardingConstants.TAUser, OnboardingConstants.ONBPassword);
			Verification2Factor_Authentication.Execute();
			Setup_ChallengeQuestions.Execute();
		}
        // Navigate to my profile and update the password 
		TS_ChangePassword_Page.lnk_Accountname().click();
		TS_ChangePassword_Page.lnk_MyProfile().click();
		TS_ChangePassword_Page.lnk_ChangePwd().click();
		TS_ChangePassword_Page.btn_Edit().click();
		TS_ChangePassword_Page.txt_CurrentPwd().sendKeys(OnboardingConstants.ONBPassword);
		TS_ChangePassword_Page.txt_NewPwd().sendKeys("Serps*1234");
		TS_ChangePassword_Page.txt_ConfirmPwd().sendKeys("Serps*1234");
		TS_ChangePassword_Page.btn_Update().click();
		TS_ChangePassword_Page.btn_ok().click();
		OnboardingConstants.ONBPassword="Serps*1234";
		Reporter.log("Password Changed Successfully<br>");
	}
}
