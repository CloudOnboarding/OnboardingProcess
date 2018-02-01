package appModules.TestScenarios.LoginSelfServicesActns;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Login.External_LogOut;
import pageObjects.BaseClass;
import pageObjects.Message_Handler;
import pageObjects.TestScenarios.TS_ChangeProfile_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class TS_ChangeProfile extends psUtility {
	
	/**
	 * Test Name      : How to change your profile
	 * Developer      : Rahul
	 * Description    : Login with TA 
	 *                  Select My Profile and update TA  details 
	 *                  
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
		
		// Navigate to my profile and update ProfileData
		TS_ChangeProfile_Page.lnk_Accountname().click();
		TS_ChangeProfile_Page.lnk_MyProfile().click();

		// Disable clear field value action from Listener
		Constant.clear = false;

		// First & Last Names
		TS_ChangeProfile_Page.txt_FirstName().sendKeys(Keys.chord(Keys.CONTROL, "a"), "James");
		TS_ChangeProfile_Page.txt_LastName().sendKeys(Keys.chord(Keys.CONTROL, "a"), "Gillesp");

		// Email
		TS_ChangeProfile_Page.txt_Email().sendKeys(Keys.chord(Keys.CONTROL, "a"), "jasonGillespie@smarterp.com");

		/***** Verify Email ******/
		// Condition to check whether email verification required or not.
		if (Verification2Factor_Authentication.Verfy2FactStatus.equalsIgnoreCase("Y")) {
			if (!TS_ChangeProfile_Page.span_emaiVerfStatus().getText().equalsIgnoreCase("Verified")) {
				TS_ChangeProfile_Page.btn_SendEmailVerfCode().click();
				String l_EmailVerfyCode = VerifCode(Message_Handler.get_VerfyText());
				TS_ChangeProfile_Page.txt_EnterCode().sendKeys(l_EmailVerfyCode);
				Message_Handler.btn_ModalBodyClose().click();
				TS_ChangeProfile_Page.btn_Verify().click();
			}
		}
		// Phone No
		TS_ChangeProfile_Page.txt_PhoneNum().sendKeys(Keys.chord(Keys.CONTROL, "a"), "4445557777");

		/***** Verify Phone No ******/
		// Condition to check whether phone verification required or not.
		if (Verification2Factor_Authentication.Verfy2FactStatus.equalsIgnoreCase("Y")) {
			if (!TS_ChangeProfile_Page.span_phoneVerfStatus().getText().equalsIgnoreCase("Verified")) {
				TS_ChangeProfile_Page.btn_SendPhVerfCode().click();
				String l_PhoneVerfyCode = VerifCode(Message_Handler.get_VerfyText());
				TS_ChangeProfile_Page.txt_EnterCode().sendKeys(l_PhoneVerfyCode);
				Message_Handler.btn_ModalBodyClose().click();
				TS_ChangeProfile_Page.btn_Verify().click();
			}
		}

		// Address Details
		TS_ChangeProfile_Page.txt_Address().sendKeys(Keys.chord(Keys.CONTROL, "a"), "12 Subway Road");
		TS_ChangeProfile_Page.txt_City().sendKeys(Keys.chord(Keys.CONTROL, "a"), "Pleasanton");
		select(TS_ChangeProfile_Page.select_State(), "California");
		TS_ChangeProfile_Page.txt_Postal().sendKeys(Keys.chord(Keys.CONTROL, "a"), "96533");
		TS_ChangeProfile_Page.txt_County().sendKeys(Keys.chord(Keys.CONTROL, "a"), "Alameda");
		TS_ChangeProfile_Page.chk_CopySameAddress().click();

		// Save
		TS_ChangeProfile_Page.btn_Save().click();

		// Close Save conf. message box
		Message_Handler.btn_ModalBodyClose().click();

		// Enable clear field value action from Listener
		Constant.clear = true;
		
		External_LogOut.Execute();
		BaseClass.driver.quit();
		
		Reporter.log("Profile Changed Successfully<br>");
		Constant.StopOnFail=true;
		
	}

	public static String VerifCode(WebElement VerifyElmnt) throws Exception {
		String VerifCode = VerifyElmnt.getText();

		for (int i = 0; VerifCode.length() < 1; i++) {
			VerifCode = VerifyElmnt.getText();
			Thread.sleep(1000);
			System.out.println("Email verfication code::::::;" + VerifCode);
			if (i == 10) {
				System.out.println("Abor Scriptt: Verification code not received");
				Reporter.log("Abor Scriptt: Verification code not received");
				Assert.assertTrue(false);
				break;
			}
		}
		return VerifCode = VerifCode.substring(VerifCode.length() - 8, VerifCode.length() - 2);
	}
	

}
