package appModules.Revision.Configuration;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Revision.RV_CreateRevisions;
import pageObjects.TestScenarios.TS_ChangeAuthenticationNotificationEmails_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class ApplyAuthNotifyEmail extends psUtility {

	@Test
	public static void Execute() throws Exception {

		/*setEnvironment(Constant.ExternalURL);
		RV_CreateRevisions.RevNum = "0000000003";
		RV_CreateRevisions.RevisnType = "Process";*/
		dynamicLogin(isElementExists(
				"driver.findElement(By.xpath(\"//span[contains(text(),'On User Launch')]/parent::div/parent::div/parent::td/following-sibling::td/div/div/span/button[contains(@id,'NOTF_TMPL_DESCR')]\"))"),
				OnboardingConstants.TAUser, "Process");
		TS_ChangeAuthenticationNotificationEmails_Page.lnk_AuthenticateEdit().click();
		// Notification Template Prompt in Event actions
		TS_ChangeAuthenticationNotificationEmails_Page.btn_NotifEvntPrompt().click();
		// QuickFilter
		eventDriver.unregister(handler);
		TS_ChangeAuthenticationNotificationEmails_Page.txt_QuickFilter().sendKeys("SM_CO_USR_SELFREG_TEMPLATE");
		eventDriver.register(handler);

		TS_ChangeAuthenticationNotificationEmails_Page.lnk_NotfTemResult().click();
		TS_ChangeAuthenticationNotificationEmails_Page.btn_Ok().click();

		Reporter.log("Apply Authentication Notification Completed Successfully<br>");

	}

}
