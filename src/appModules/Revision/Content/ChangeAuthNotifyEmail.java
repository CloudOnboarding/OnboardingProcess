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
import pageObjects.TestScenarios.TS_ChangeContentOnUserPage_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class ChangeAuthNotifyEmail extends psUtility {

	@Test
	public static void Execute() throws Exception {
	/*	setEnvironment(Constant.ExternalURL);
		RV_CreateRevisions.RevNum = "0000000006";
		RV_CreateRevisions.RevisnType = "Content";*/

		dynamicLogin(isElementExists("driver.findElement(By.id(\"SM_CD_REV_WRK_SM_CO_NTF_TEMPLATE\"))"),
				OnboardingConstants.TAUser, "Content");
		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();",
				TS_ChangeAuthenticationNotificationEmails_Page.lnk_NotifTempl());
		// TS_ChangeAuthenticationNotificationEmails_Page.lnk_NotifTempl().click();
		TS_ChangeAuthenticationNotificationEmails_Page.txt_QuickFilter().sendKeys("SM_CO_USR_SELFREG_TEMPLATE");
		TS_ChangeAuthenticationNotificationEmails_Page.lnk_Result1().click();

		// Setup notification template details
		TS_ChangeAuthenticationNotificationEmails_Page.txt_Desc().sendKeys("User Self Registration");
		select(TS_ChangeAuthenticationNotificationEmails_Page.sel_Priority(), "1-High");
		select(TS_ChangeAuthenticationNotificationEmails_Page.sel_Sender(), "System");

		// Click Add/Edit Subject
		TS_ChangeAuthenticationNotificationEmails_Page.lnk_AddEditSubj().click();

		Thread.sleep(2000);
		TS_ChangeAuthenticationNotificationEmails_Page.Element_DivId().click();

		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));

		Thread.sleep(2000);
		// BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector(".cke_wysiwyg_frame.cke_reset")));

		WebElement element = BaseClass.driver
				.findElement(By.cssSelector(".cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders"));
		// JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].innerHTML = arguments[1]", element, "Welcome to Cloud Organization Name!");
		element.sendKeys("Welcome to OrgName", Keys.chord(Keys.SHIFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT,
				Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT, Keys.ARROW_LEFT));

		TS_ChangeAuthenticationNotificationEmails_Page.btn_insertBind().click();
		TS_ChangeAuthenticationNotificationEmails_Page.btn_BindVariable().sendKeys("0000001150");
		TS_ChangeAuthenticationNotificationEmails_Page.btn_BindOK().click();

		TS_ChangeAuthenticationNotificationEmails_Page.btn_Ok().click();

		/****************/

		// Click Add/Edit Content
		TS_ChangeAuthenticationNotificationEmails_Page.lnk_AddEditContent().click();
		eventDriver.unregister(handler);
		Thread.sleep(2000);
		TS_ChangeAuthenticationNotificationEmails_Page.Element_DivId().click();
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));

		WebElement element1 = BaseClass.driver
				.findElement(By.cssSelector(".cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders"));
		/*
		 * JavascriptExecutor executor1 = (JavascriptExecutor) BaseClass.driver;
		 * executor1.executeScript("arguments[0].innerHTML = arguments[1]", element1,
		 * "Welcome as Tenant User as Cloud Organization Name");
		 */

		element1.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Dear UserName,\r\n" + "\r\n"
				+ "Welcome as a tenant user for OrgName! \r\n" + "\r\n"
				+ "Before you can perform your activities with the system, please complete your online onboarding.  You can begin the process by clicking the top link below to set up your User ID and Password.  \r\n"
				+ "\r\n" + "Click here to register your User ID and Password.\r\n" + "\r\n"
				+ "If you have already registered to start or continue your onboarding process:click here \r\n" + "\r\n"
				+ "If you feel that something is wrong with this message, or this notification should not have occurred, please contact :\r\n"
				+ "\r\n" + "Organization Support Name\r\n" + "Organization Support Phone \r\n"
				+ "Organization Support E-mail", Keys.chord(Keys.SHIFT, Keys.HOME));

		// Set Bindes For Organization Support E-mail
		TS_ChangeAuthenticationNotificationEmails_Page.btn_insertBind().click();
		TS_ChangeAuthenticationNotificationEmails_Page.btn_BindVariable().sendKeys("0000001152");
		TS_ChangeAuthenticationNotificationEmails_Page.btn_BindOK().click();

		// Set Binds For Organization Support Phone
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));
		element1.sendKeys(Keys.chord(Keys.CONTROL, Keys.UP), Keys.chord(Keys.SHIFT, Keys.HOME));

		TS_ChangeAuthenticationNotificationEmails_Page.btn_insertBind().click();
		TS_ChangeAuthenticationNotificationEmails_Page.btn_BindVariable().sendKeys("0000001151");
		TS_ChangeAuthenticationNotificationEmails_Page.btn_BindOK().click();

		// Set Binds For Organization Support Name 
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));
		element1.sendKeys(Keys.chord(Keys.CONTROL, Keys.UP), Keys.chord(Keys.SHIFT, Keys.HOME));

		TS_ChangeAuthenticationNotificationEmails_Page.btn_insertBind().click();
		TS_ChangeAuthenticationNotificationEmails_Page.btn_BindVariable().sendKeys("0000001153");
		TS_ChangeAuthenticationNotificationEmails_Page.btn_BindOK().click();

		// Set Binds User Name

		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));
		element1.sendKeys(Keys.chord(Keys.CONTROL, Keys.HOME), Keys.chord(Keys.CONTROL, Keys.RIGHT),
				Keys.chord(Keys.SHIFT, Keys.RIGHT), Keys.chord(Keys.SHIFT, Keys.RIGHT),
				Keys.chord(Keys.SHIFT, Keys.RIGHT), Keys.chord(Keys.SHIFT, Keys.RIGHT),
				Keys.chord(Keys.SHIFT, Keys.RIGHT), Keys.chord(Keys.SHIFT, Keys.RIGHT),
				Keys.chord(Keys.SHIFT, Keys.RIGHT), Keys.chord(Keys.SHIFT, Keys.RIGHT));

		TS_ChangeAuthenticationNotificationEmails_Page.btn_insertBind().click();
		TS_ChangeAuthenticationNotificationEmails_Page.btn_BindVariable().sendKeys("0000001154");
		TS_ChangeAuthenticationNotificationEmails_Page.btn_BindOK().click();

		// Insert binds for Orginization Name:
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));
		element1.sendKeys(Keys.chord(Keys.HOME), Keys.chord(Keys.CONTROL, Keys.DOWN),
				Keys.chord(Keys.CONTROL, Keys.DOWN), Keys.chord(Keys.CONTROL, Keys.RIGHT),
				Keys.chord(Keys.CONTROL, Keys.RIGHT), Keys.chord(Keys.CONTROL, Keys.RIGHT),
				Keys.chord(Keys.CONTROL, Keys.RIGHT), Keys.chord(Keys.CONTROL, Keys.RIGHT),
				Keys.chord(Keys.CONTROL, Keys.RIGHT), Keys.chord(Keys.SHIFT, Keys.END));

		TS_ChangeAuthenticationNotificationEmails_Page.btn_insertBind().click();
		TS_ChangeAuthenticationNotificationEmails_Page.btn_BindVariable().sendKeys("0000001150");
		TS_ChangeAuthenticationNotificationEmails_Page.btn_BindOK().click();

		// Highlight Binf Fields
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));

		TS_ChangeAuthenticationNotificationEmails_Page.lnk_HighlightFields().click();

		eventDriver.register(handler);

		// Ok in Add/Edit Content
		TS_ChangeAuthenticationNotificationEmails_Page.btn_Ok().click();
		// save
		TS_ChangeAuthenticationNotificationEmails_Page.btn_Ok().click();

		// Return
		TS_ChangeAuthenticationNotificationEmails_Page.btn_Return().click();

		Reporter.log("Change  authentication Notification Email Completed Successfully<br>");

	}
}
