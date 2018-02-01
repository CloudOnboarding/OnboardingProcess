package appModules.TestScenarios.ImplSetup;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Login.External_LogOut;
import pageObjects.BaseClass;
import pageObjects.TestScenarios.TS_SetupDHSClientAccessForEVerify_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class TS_SetupDHSClientAccessForEVerify extends psUtility {
	/**
	 * Test Name      : How to set up DHS Client access for E-Verify
	 * Developer      : Gopi
	 * Description    : Login with TA  and go to misc setup and click SetupDHSClientAccessForEVerify
	 *                  Enter valide data and save the setup
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

		// Enter Client Information
		TS_SetupDHSClientAccessForEVerify_Page.lnk_ConfigMnu().click();
		TS_SetupDHSClientAccessForEVerify_Page.lnk_More().click();
		TS_SetupDHSClientAccessForEVerify_Page.lnk_DHSClientSetup().click();
		TS_SetupDHSClientAccessForEVerify_Page.prmt_CompanyId().click();
		TS_SetupDHSClientAccessForEVerify_Page.lnk_CompanyAttributeID().click();
		TS_SetupDHSClientAccessForEVerify_Page.prmt_BusinessunitID().click();
		TS_SetupDHSClientAccessForEVerify_Page.lnk_BUAttributeID().click();
		// TS_SetupDHSClientAccessForEVerify_Page.txt_DHSUserId().click();
		TS_SetupDHSClientAccessForEVerify_Page.txt_DHSUserId().sendKeys("RPAN4547");
		TS_SetupDHSClientAccessForEVerify_Page.txt_Password().sendKeys("Oct$26$+$-");
		TS_SetupDHSClientAccessForEVerify_Page.txt_ConfirmPassword().sendKeys("Oct$26$+$-");
		select(TS_SetupDHSClientAccessForEVerify_Page.sel_Type(), "Reverification");
		select(TS_SetupDHSClientAccessForEVerify_Page.sel_RoleType(), "E-Verify Specialist");
		TS_SetupDHSClientAccessForEVerify_Page.btn_Add().click();
		select(TS_SetupDHSClientAccessForEVerify_Page.sel_Type1(), "Set User Password");
		select(TS_SetupDHSClientAccessForEVerify_Page.sel_RoleType1(), "E-Verify Specialist");
		TS_SetupDHSClientAccessForEVerify_Page.btn_Save().click();

		JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver;
		js.executeScript("arguments[0].scrollIntoView();",
				TS_SetupDHSClientAccessForEVerify_Page.txt_ConfirmPassword());

		TS_SetupDHSClientAccessForEVerify_Page.lnk_VerifyCPSConnection().click();
		TS_SetupDHSClientAccessForEVerify_Page.btn_Close().click();

		js.executeScript("arguments[0].scrollIntoView();", TS_SetupDHSClientAccessForEVerify_Page.rdbtn_RadioButton());
		TS_SetupDHSClientAccessForEVerify_Page.btn_Add1().click();

		TS_SetupDHSClientAccessForEVerify_Page.prmt_CompanyId1().click();
		TS_SetupDHSClientAccessForEVerify_Page.lnk_CompanyAttributeID1().click();
		TS_SetupDHSClientAccessForEVerify_Page.prmt_BusinessunitID1().click();
		TS_SetupDHSClientAccessForEVerify_Page.lnk_BUAttributeID1().click();
		TS_SetupDHSClientAccessForEVerify_Page.txt_DHSUserId1().sendKeys("RPAN4547");
		TS_SetupDHSClientAccessForEVerify_Page.txt_Password1().sendKeys("Oct$26$+$-");
		TS_SetupDHSClientAccessForEVerify_Page.txt_ConfirmPassword1().sendKeys("Oct$26$+$-");
		select(TS_SetupDHSClientAccessForEVerify_Page.sel_Type2(), "Reverification");
		select(TS_SetupDHSClientAccessForEVerify_Page.sel_RoleType2(), "E-Verify Specialist");
		TS_SetupDHSClientAccessForEVerify_Page.btn_AddLn2().click();
		select(TS_SetupDHSClientAccessForEVerify_Page.sel_Type3(), "Set User Password");
		select(TS_SetupDHSClientAccessForEVerify_Page.sel_RoleType3(), "E-Verify Specialist");
		TS_SetupDHSClientAccessForEVerify_Page.btn_Save().click();
		js.executeScript("arguments[0].scrollIntoView();",
				TS_SetupDHSClientAccessForEVerify_Page.txt_ConfirmPassword());
		TS_SetupDHSClientAccessForEVerify_Page.lnk_VerifyCPSConnection().click();
		TS_SetupDHSClientAccessForEVerify_Page.btn_Close().click();

		// Logout test case
		External_LogOut.Execute();
		BaseClass.driver.quit();
		Constant.StopOnFail=true;

	}
}
