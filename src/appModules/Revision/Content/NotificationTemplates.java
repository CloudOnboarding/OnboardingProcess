package appModules.Revision.Content;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Revision.RV_CreateRevisions;
import pageObjects.BaseClass;
import pageObjects.TestScenarios.TS_ChangeAuthenticationNotificationEmails_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class NotificationTemplates extends psUtility {
	@Test
	public static void Execute() throws Exception { // Defining a notification template in manage content revision

		/*setEnvironment(Constant.ExternalURL);
		RV_CreateRevisions.RevNum = "0000000006";
		RV_CreateRevisions.RevisnType = "Content";*/

		dynamicLogin(isElementExists("driver.findElement(By.id(\"SM_CD_REV_WRK_SM_CO_NTF_TEMPLATE\"))"),
				OnboardingConstants.TAUser, "Content");
		//TS_ChangeAuthenticationNotificationEmails_Page.lnk_NotifTempl().click();
		TS_ChangeAuthenticationNotificationEmails_Page.lnk_AddNotifTempl().click();
		/*TS_ChangeAuthenticationNotificationEmails_Page.txt_QuickFilter().sendKeys("SM_OB_SUBMIT_FOR_REVIEW");
		TS_ChangeAuthenticationNotificationEmails_Page.lnk_Result1().click();*/

		// Setup notification template details
		TS_ChangeAuthenticationNotificationEmails_Page.txt_Desc().sendKeys("Confirm Onboarding Submit for Review-New");
		select(TS_ChangeAuthenticationNotificationEmails_Page.sel_Priority(), "2-Medium");
		select(TS_ChangeAuthenticationNotificationEmails_Page.sel_Sender(), "Other");

		TS_ChangeAuthenticationNotificationEmails_Page.txt_emailid().sendKeys("Demo@smarterp.com");

		// Click Add/Edit Subject
		TS_ChangeAuthenticationNotificationEmails_Page.lnk_AddEditSubj().click();

		Thread.sleep(2000);
		// BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector(".cke_wysiwyg_frame.cke_reset")));

		TS_ChangeAuthenticationNotificationEmails_Page.Element_DivId().click();

		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));

		WebElement element = BaseClass.driver
				.findElement(By.cssSelector(".cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders>div"));
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].innerHTML = arguments[1]", element,
				"Thank you for completing your online onboarding process");
		TS_ChangeAuthenticationNotificationEmails_Page.btn_Ok().click();

		// Click Add/Edit Content
		TS_ChangeAuthenticationNotificationEmails_Page.lnk_AddEditContent().click();

		Thread.sleep(2000);
		// BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector(".cke_wysiwyg_frame.cke_reset")));

		// TS_ChangeAuthenticationNotificationEmails_Page.Element_DivIdEmailContent().click();
		eventDriver.unregister(handler);
		TS_ChangeAuthenticationNotificationEmails_Page.Element_DivId().click();
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));

		WebElement element1 = BaseClass.driver
				.findElement(By.cssSelector(".cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders"));

		/*
		 * JavascriptExecutor executor1 = (JavascriptExecutor) BaseClass.driver;
		 * executor1.executeScript("arguments[0].innerHTML = arguments[1]", element1,
		 * "");
		 */

		element1.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Dear Candidate Name CD,\r\n" + "\r\n"
				+ "Thank you for completing the online portion of your hiring process. You are one step closer to starting your new position.\r\n"
				+ "\r\n" + "What's next?\r\n" + "\r\n"
				+ "The information that you have submitted will be reviewed and processed. A representative will contact you to schedule a time for you to come into the office to complete your orientation and to review your original work authorization documents for I-9 compliance. \r\n"
				+ "\r\n" + "For further information please write us\r\n" + "\r\n",
				"email Onboarding Org support email.", Keys.chord(Keys.SHIFT, Keys.HOME));

		// email Onboarding Org support email.
		TS_ChangeAuthenticationNotificationEmails_Page.btn_insertBind().click();
		TS_ChangeAuthenticationNotificationEmails_Page.btn_BindVariable().sendKeys("0000000837");
		TS_ChangeAuthenticationNotificationEmails_Page.btn_BindOK().click();
		eventDriver.register(handler);

		TS_ChangeAuthenticationNotificationEmails_Page.btn_Ok().click();
		Thread.sleep(1000);
		// save
		TS_ChangeAuthenticationNotificationEmails_Page.btn_Ok().click();

		// Return
		//TS_ChangeAuthenticationNotificationEmails_Page.btn_Return().click();
		Reporter.log("Change Onboarding Process Notification Email Completed Successfully<br>");
	}
}
