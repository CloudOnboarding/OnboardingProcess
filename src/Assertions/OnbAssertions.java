package Assertions;

import pageObjects.ConfirmSelfRegistration_Page;
import pageObjects.InternalHome_Page;
import pageObjects.InternalLogin_Page;
import pageObjects.ManageOrginization_Page;
import pageObjects.Message_Handler;
import pageObjects.OrginizationRegistration_Page;
import pageObjects.SetupChallengeQuestions_Page;
import pageObjects.SmartOnboardingWelcome_Page;
import utility.Log;
import utility.psUtility;
 
public class OnbAssertions extends psUtility {

	public static void Verify_HomePage() throws Exception {
		// Validation for Home Page
		if (InternalHome_Page.SignoutLnkExts == true) {
			//Reporter.log("Verification pass for Home page.<br>");
		} else {
			//Reporter.log("Verification fail for Home page.<br>");
			pageObjects.BaseClass.bResult = false;
		}

	}

	public static void Verify_OrgRegistrationPage() throws Exception {

		/* Validation for Verify Organization Registration Page */
		if (OrginizationRegistration_Page.get_PageTitle().getText().equals("Organization Registration")) {
			//Reporter.log("Verification Passed for Organization Registration page.<br>");
		} else {
			//Reporter.log("Verification Failed for Organization Registration page.<br>");
			pageObjects.BaseClass.bResult = false;
		}

		// Assert.assertEquals("Organization Registration",
		// BaseClass.driver.findElement(By.className("PAPAGETITLE")).getText(),"Organization
		// Registration page is not displayed");

	}

	public static void Verify_GenerateOrgID() throws Exception {

		/* Validation for Organization Registration ID is created */
		String[] OrgIDRetArry = Message_Handler.get_popupText().getText().split(":");
		OrginizationRegistration_Page.OrgnizationID = OrgIDRetArry[1];
		// System.out.println("Organization
		// ID::::::::"+OrginizationRegistration_Page.OrgnizationID);
		if (!OrginizationRegistration_Page.OrgnizationID.equals(null)) {
			//Reporter.log("Verification Passed for Organization ID created."
			//		+ OrginizationRegistration_Page.OrgnizationID + "<br>");

		} else {
			//Reporter.log("Verification Failed for Organization ID created.<br>");
			pageObjects.BaseClass.bResult = false;
		}

	}

	public static void Verify_SelfRegistration(String UserName) throws Exception {

		/* Validation for TA User Registration completed successfully */
		if (ConfirmSelfRegistration_Page.get_UserRegistrationDivTxt().getText().contains("successfully completed")) {
			Log.info("Verification Passed for " + UserName + " Registration completed successfully.");
			//Reporter.log("Verification Passed for " + UserName + " Registration completed successfully.<br>");
		} else {
		//	Reporter.log("Verification Failed for " + UserName + " Registration completed successfully.<br>");
			pageObjects.BaseClass.bResult = false;
		}

	}

	public static void Verify_TwoFactorAuthentication() throws Exception {

		/* Validation for Two Factor Authentication completed successfully */
		if (SetupChallengeQuestions_Page.get_SetUpChnQnsDivElementTxt().getText()
				.equals("Set up Challenge Questions")) {
		//	Reporter.log("Verification Passed for Two Factor Authentication completed successfully.<br>");
		} else {
		//	Reporter.log("Verification Failed for Two Factor Authentication completed successfully.<br>");
			pageObjects.BaseClass.bResult = false;
		}

	}

	public static void Verify_SetUpQns() throws Exception {

		/* Validation for Challenge Question details entered successfully */
		if (SmartOnboardingWelcome_Page.GetStartedLnkExts == true) {
		//	Reporter.log("Verification Passed for Challenge Question details entered successfully.<br>");
		} else {
		//	Reporter.log("Verification Failed for Challenge Question details entered successfully.<br>");
			pageObjects.BaseClass.bResult = false;
		}

	}

	/* Validation for Browser Launch */
	public static void Verify_PrimaryLoginPage() throws Exception {

		if (InternalLogin_Page.txt_UserName().isEnabled() == true) {
		//	Reporter.log("Verification Pass for Display Login Page<br>");
		} else {
		//	Reporter.log("Verification Failed for Display Login Page<br>");
			pageObjects.BaseClass.bResult = false;
		}

	}

	public static void Verify_SmartORGInvite() throws Exception {

		/* Validation for Challenge Question details entered successfully */
		if (ManageOrginization_Page.btn_SmartORGInvite().isEnabled() == true) {
		//	Reporter.log("Verification Pass for Service Provider Console Page<br>");
		} else {
		//	Reporter.log("Verification Pass for Service Provider Console Page<br>");
			pageObjects.BaseClass.bResult = false;
		}

	}
}
