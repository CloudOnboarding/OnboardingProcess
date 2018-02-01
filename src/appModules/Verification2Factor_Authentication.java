package appModules;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.Message_Handler;
import pageObjects.VerifiyContactInfo_Page;
import pageObjects.Verifycation2Factor_Page;
import utility.Log;
import utility.psUtility;

public class Verification2Factor_Authentication extends psUtility {
	public static String Verfy2FactStatus = " ";

	@Test
	public static void Execute() throws Exception {

		// Enter Email Verification Code
		if (isElementExists("driver.findElement(By.id(\"SM_CO_2FACT_WRK_SM_CO_2FACT_SEND\"))")) {
			/* Enter Two Factor Authentication details */
			Verifycation2Factor_Page.btn_sendverifphone().click();
			Log.info("Click action is performed on Send verification Code button");
			/* Get the Verification Code from pop up text */
			String l_VerfCode = Message_Handler.get_VerfyText().getText();
			System.out.println("Email verfication code::::::;" + l_VerfCode);

			Verifycation2Factor_Page.VerfCode = l_VerfCode.substring(l_VerfCode.length() - 8, l_VerfCode.length() - 2);
			Message_Handler.btn_ModalBodyClose().click();
			Log.info("Click action is performed on Close button");
			Verifycation2Factor_Page.txt_enterCode().sendKeys(Verifycation2Factor_Page.VerfCode);
			Log.info("Entered the Verification Code");
			Verifycation2Factor_Page.btn_Verify().click();
			Log.info("Click action is performed on Verify button");

			/* Verify Two Factor Authentication completed successfully */
			// OnbAssertions.Verify_TwoFactorAuthentication();
		}
		
		if (isElementExists("driver.findElement(By.id(\"SM_CO_VERIFY_WK_SM_CO_2FACT_SEND1\"))")) {
			VerifiyContactInfo_Page.btn_sendverifEmail().click();
			Log.info("Click action is performed on Send verification Code button");
			/* Get the Verification Code from pop up text */
			String l_VerfCode = Message_Handler.get_VerfyText().getText();
			System.out.println("Email verfication code::::::;" + l_VerfCode);

			Verifycation2Factor_Page.VerfCode = l_VerfCode.substring(l_VerfCode.length() - 8, l_VerfCode.length() - 2);
			Message_Handler.btn_ModalBodyClose().click();
			Log.info("Click action is performed on Close button");
			Verifycation2Factor_Page.txt_VerifCode().sendKeys(Verifycation2Factor_Page.VerfCode);
			Log.info("Entered the Verification Code");
			Verifycation2Factor_Page.btn_EmailVerify().click();
			Log.info("Click action is performed on Verify button");
			
			
		}
		

		// Enter Phone Verification Code
		if (isElementExists("driver.findElement(By.id(\"SM_CO_VERIFY_WK_SM_CO_2FACT_SEND\"))")) {
			VerifiyContactInfo_Page.btn_sendverifphone().click();
			Log.info("Click action is performed on phone Send verification Code button");
			// Get the Phone Verification Code from pop up text
			String l_PVerfCode = Message_Handler.get_VerfyText().getText();
			System.out.println("Phone verfication code::::::;" + l_PVerfCode);
			VerifiyContactInfo_Page.VerfCode = l_PVerfCode.substring(l_PVerfCode.length() - 8,l_PVerfCode.length() - 2);
			Message_Handler.btn_ModalBodyClose().click();
			Log.info("Click action is performed on Close button");
			VerifiyContactInfo_Page.txt_EnterPhoneVerifyCode().sendKeys(VerifiyContactInfo_Page.VerfCode);
			Log.info("Entered the phone Verification Code");
			VerifiyContactInfo_Page.btn_PhoneVerify().click();
			Log.info("Click action is performed on phone Verify button");
			
			VerifiyContactInfo_Page.lnk_Next().click();
			Log.info("Click action is performed on Next button");
		}
				
		
		Reporter.log("Verification2Factor Authentication has been Performed successfully<br>");

	}

}
