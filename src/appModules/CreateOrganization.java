package appModules;
 
import org.testng.Reporter;
import org.testng.annotations.Test;

import Assertions.OnbAssertions;
import pageObjects.BaseClass;
import pageObjects.InternalHome_Page;
import pageObjects.Message_Handler;
import pageObjects.OrginizationRegistration_Page;
import utility.Constant;
import utility.Log;
import utility.OnboardingConstants;
import utility.psUtility;

public class CreateOrganization extends psUtility {
	@Test
	public static void Execute() throws Exception {

		// Verify Organization Registration Page
		OnbAssertions.Verify_OrgRegistrationPage();

		// Enter Organization Registration details
		OrginizationRegistration_Page.txt_OrganizationName().sendKeys("Selenium Tech");
		OrginizationRegistration_Page.txt_Description().sendKeys("Selenium Tech");
		OrginizationRegistration_Page.txt_Host().sendKeys(Constant.OrgHost);
		select(OrginizationRegistration_Page.select_NamePrefix(), "Mr");
		OrginizationRegistration_Page.txt_FirstName().sendKeys("Joseph");
		OrginizationRegistration_Page.txt_LastName().sendKeys("Jones");
		OrginizationRegistration_Page.txt_Personalemailid().sendKeys("Demo@smarterp.com");
		OrginizationRegistration_Page.txt_PhoneNumber().sendKeys("8888899999");
		OrginizationRegistration_Page.txt_ModelOrganizationID().sendKeys("SMRTMODEL");
		OrginizationRegistration_Page.txt_ModelBusinessProcess().sendKeys("MODELONBRD");
		OrginizationRegistration_Page.txt_ProviderId().sendKeys("PEOPLESOFT_HR");
		OrginizationRegistration_Page.rdbtn_ConfigurationAndSampleData().click();
		Log.info("Entered Organization Registration Details");
		OrginizationRegistration_Page.btn_Save().click();
		Log.info("Click action is performed on Save button");

		// Verify Organization Registration ID is created
		OnbAssertions.Verify_GenerateOrgID();

		Message_Handler.btn_OK().click();
		Log.info("Click action is performed on Modal Body Close button");
		// Constant.OnboardingUser =OnboardingConstants.TAUser;
		OnboardingConstants.OrgId = OrginizationRegistration_Page.OrgnizationID.trim();
		OnboardingConstants.TAUser = "TA_" + OnboardingConstants.OrgId;

		Reporter.log(
				"Organization Created Successfully " + OrginizationRegistration_Page.OrgnizationID.trim() + "<br>");

		// int lnk_HSignout=BaseClass.driver.findElements(By.linkText("Sign
		// out")).size();
		// int
		// lnk_FluidActionList=BaseClass.driver.findElements(By.xpath("//*[@title='Actions
		// List']")).size();
		InternalHome_Page.lnk_SignOutExts();

		if (InternalHome_Page.SignoutLnkExts == true) {
			InternalHome_Page.lnk_HSignout().click();
		} else {

			InternalHome_Page.lnk_FluidActionList().click();
			InternalHome_Page.lnk_FluidSignOut().click();
			Log.info("Click action is performed on Signout button");

		}

		BaseClass.driver.quit();

	}
}
