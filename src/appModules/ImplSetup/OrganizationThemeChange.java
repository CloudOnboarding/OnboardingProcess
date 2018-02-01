package appModules.ImplSetup;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import pageObjects.BaseClass;
import pageObjects.TestScenarios.TS_OrganizationThemeChange_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class OrganizationThemeChange extends psUtility {
	/**
	 * Test Name : How to change your organization's theme Developer : Gopi
	 * Description : Login with TA and create a new Theme NAvigate to organization
	 * management and select the new theme
	 * 
	 * Dependency : 1) Organization ID, Tenant Admin user is required To execute the
	 * script 2) Set the connection.Property file in the folder
	 * Files>EnvironemntDetails>Connection.properties
	 * 
	 * 
	 */
	@Test
	public static void Execute() throws Exception {

	setEnvironment(Constant.ExternalURL);
		if (!isElementExists("driver.findElement(By.id(\"configMenu\"))")) {
			BaseClass.driver.quit();
			// Login to External URL
			setEnvironment(Constant.ExternalURL);
			psUtility.ExternalLogin(OnboardingConstants.TAUser, OnboardingConstants.ONBPassword);
			Verification2Factor_Authentication.Execute();
			Setup_ChallengeQuestions.Execute();
		}
		// Navigate to Theme Builder and create new Theme
		TS_OrganizationThemeChange_Page.btn_Menu().click();
		TS_OrganizationThemeChange_Page.lnk_ThemeBuilder().click();

		TS_OrganizationThemeChange_Page.btn_AddNewValue().click();

		// This Page contains Processing image Spinner so process wait set to false
		Constant.Processwait = false;
		TS_OrganizationThemeChange_Page.btn_Add().click();

		TS_OrganizationThemeChange_Page.txt_desc().sendKeys("AutoTheme");
		TS_OrganizationThemeChange_Page.lnk_Header().click();
		TS_OrganizationThemeChange_Page.txt_HearerFontColor().sendKeys("#ff0000");
		TS_OrganizationThemeChange_Page.txt_PrimaryIconHoverColor().sendKeys("#ff0000");
		TS_OrganizationThemeChange_Page.lnk_OnboardingNavigation().click();
		TS_OrganizationThemeChange_Page.txt_BackgroundColor().sendKeys("#ff0000");
		TS_OrganizationThemeChange_Page.txt_SelectedActivityBgcClr().sendKeys("#7boof");
		TS_OrganizationThemeChange_Page.lnk_FormControls().click();
		TS_OrganizationThemeChange_Page.txt_FontColor().sendKeys("#0072c6");
		TS_OrganizationThemeChange_Page.txt_ProcessingImageColor().sendKeys("#0072c6");
		TS_OrganizationThemeChange_Page.txt_LinkFontColor().sendKeys("#ff0000");
		TS_OrganizationThemeChange_Page.btn_ButtonBackgroundColor().sendKeys("#ff0000");
		TS_OrganizationThemeChange_Page.lnk_Footer().click();
		TS_OrganizationThemeChange_Page.lnk_Miscellaneous().click();
		TS_OrganizationThemeChange_Page.txt_LoginLogoWidth().sendKeys("250");
		TS_OrganizationThemeChange_Page.btn_save().click();
		Constant.Processwait = true;
		Thread.sleep(3000);
		String ThemeId = TS_OrganizationThemeChange_Page.getattribute_ThemeId().getText();
		System.out.println("New Theme Id:" + ThemeId);

		// Select the new theme in organization component
		TS_OrganizationThemeChange_Page.btn_Menu().click();
		TS_OrganizationThemeChange_Page.lnk_OrganizationManagement().click();

		TS_OrganizationThemeChange_Page.btn_PromptPrimaryContact().click();
		TS_OrganizationThemeChange_Page.lnk_LookUpContact().click();

		TS_OrganizationThemeChange_Page.btn_PromptSecondaryContact().click();
		TS_OrganizationThemeChange_Page.lnk_LookUpContact().click();

		TS_OrganizationThemeChange_Page.txt_defaultTheme().click();

		eventDriver.unregister(handler);
		TS_OrganizationThemeChange_Page.txt_QuickFilter().sendKeys(ThemeId);
		eventDriver.register(handler);

		TS_OrganizationThemeChange_Page.lnk_Result(ThemeId).click();
		TS_OrganizationThemeChange_Page.btn_save().click();
		Reporter.log("Organization Theme Is Available For Use" + ThemeId);

	}
}
