package appModules.TestScenarios.ContentChanges;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Login.External_LogOut;
import appModules.Revision.RV_ApplyRevision;
import appModules.Revision.RV_CreateRevisions;
import pageObjects.BaseClass;
import pageObjects.TestScenarios.TS_ChangeAuthenticationNotificationEmails_Page;
import pageObjects.TestScenarios.TS_ChangeOnboardProcessNotificationEmails_page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class TS_ChangeOnboardProcessNotificationEmails extends psUtility {
	/**
	 * Test Name      : How to change onboarding Process notification email
	 * Developer      : Srinivas
	 * Description    : Login with TA and create a new Revision (Content)
	 *                  Go to Notification templates and use system defined template to update 
	 *                  Create a revision (Configuration)and select the new template in events and notifications page and apply configuration for specific revision
	 *                  
	 * Dependency     : 1) Organization ID, Tenant Admin user is required To execute the script
	 *                  2) Set the connection.Property file  in the folder Files>EnvironemntDetails>Connection.properties
	 *                  3)This is a static case for update template (SM_OB_SUBMIT_FOR_REVIEW).
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
		
		// Create New rivision-Content
		RV_CreateRevisions.Execute("Content", "Change Confirm on Submit");

		// Defining a notification template in manage content revision
		TS_ChangeAuthenticationNotificationEmails_Page.lnk_NotifTempl().click();
		TS_ChangeAuthenticationNotificationEmails_Page.txt_QuickFilter().sendKeys("SM_OB_SUBMIT_FOR_REVIEW");
		TS_ChangeAuthenticationNotificationEmails_Page.lnk_Result1().click();

		// Setup notification template details
		TS_ChangeAuthenticationNotificationEmails_Page.txt_Desc().sendKeys("Confirm on Submit for Review-New");
		select(TS_ChangeAuthenticationNotificationEmails_Page.sel_Priority(), "2-Medium");
		select(TS_ChangeAuthenticationNotificationEmails_Page.sel_Sender(), "Other");

		// Click Add/Edit Subject
		TS_ChangeAuthenticationNotificationEmails_Page.lnk_AddEditSubj().click();

		Thread.sleep(2000);
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector(".cke_wysiwyg_frame.cke_reset")));

		WebElement element = BaseClass.driver
				.findElement(By.cssSelector(".cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders>div"));
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].innerHTML = arguments[1]", element,
				"Thank you for Completing your Online Onboarding Process!");
		TS_ChangeAuthenticationNotificationEmails_Page.btn_Ok().click();

		// Click Add/Edit Content
		TS_ChangeAuthenticationNotificationEmails_Page.lnk_AddEditContent().click();

		Thread.sleep(2000);
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector(".cke_wysiwyg_frame.cke_reset")));

		WebElement element1 = BaseClass.driver
				.findElement(By.cssSelector(".cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders>div"));
		JavascriptExecutor executor1 = (JavascriptExecutor) BaseClass.driver;
		executor1.executeScript("arguments[0].innerHTML = arguments[1]", element1, " Dear Candidate Name");
		TS_ChangeAuthenticationNotificationEmails_Page.btn_Ok().click();

		// save
		TS_ChangeAuthenticationNotificationEmails_Page.btn_Ok().click();

		// Return
		TS_ChangeAuthenticationNotificationEmails_Page.btn_Return().click();

		// Apply Content
		RV_ApplyRevision.Execute();

		// Create revision configuration and applying the template
		RV_CreateRevisions.Execute("Process", "Implement New Confirm On Submit");

		TS_ChangeOnboardProcessNotificationEmails_page.lnk_ManageEvntsNotf().click();
		select(TS_ChangeOnboardProcessNotificationEmails_page.sel_NotifTempinpt(),
				"Confirm on Submit for Review-New");
		TS_ChangeAuthenticationNotificationEmails_Page.btn_Ok().click();
		RV_ApplyRevision.Execute();

		// External URL logout
		External_LogOut.Execute();
		BaseClass.driver.quit();

		Reporter.log("Change onboarding Process Notification Email Performed Successfully<br>");
		Constant.StopOnFail=true;
	}
}
