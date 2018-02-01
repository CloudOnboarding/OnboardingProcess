package appModules.Revision.Content;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Revision.RV_CreateRevisions;
import pageObjects.BaseClass;
import pageObjects.Revision.RV_ApplyRevision_Page;
import pageObjects.Revision.Content.RV_BGChkVendor_Page;
import pageObjects.TestScenarios.TS_ChangeAuthenticationNotificationEmails_Page;
import pageObjects.TestScenarios.TS_ChangeContentOnUserPage_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class ChangeContentOnUserPageMixedContent extends psUtility {

	@Test
	public static void Execute() throws Exception {
		/*setEnvironment(Constant.ExternalURL);
		RV_CreateRevisions.RevNum = "0000000006";
		RV_CreateRevisions.RevisnType = "Content";*/
		

		dynamicLogin(isElementExists("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX5\"))"),
				OnboardingConstants.TAUser, "Content");
		JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver;
		// to get the scroll view to top position
		js.executeScript("arguments[0].scrollIntoView();", RV_ApplyRevision_Page.lnk_Return());

		TS_ChangeContentOnUserPage_Page.lnk_Add().click();
		TS_ChangeContentOnUserPage_Page.txt_Descr120().sendKeys("CompanyBackground");
		select(TS_ChangeContentOnUserPage_Page.sel_ImageType(), "JPEG");
		TS_ChangeContentOnUserPage_Page.btn_Upload1().click();

		/***** File Upload *****/
		eventDriver.unregister(handler);
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.className("bn")));

		String RelativePath = System.getProperty("user.dir") + "\\Files\\Images\\Company_Background1.jpg";

		TS_ChangeContentOnUserPage_Page.txt_FilePath().sendKeys(RelativePath);
		TS_ChangeContentOnUserPage_Page.btn_Upload2().click();

		eventDriver.register(handler);

		TS_ChangeContentOnUserPage_Page.btn_Save1().click();

		dynamicLogin(isElementExists("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX20\"))"),
				OnboardingConstants.TAUser, "Content");

		// to get the scroll view to top position
		JavascriptExecutor js1 = (JavascriptExecutor) BaseClass.driver;
		WebElement element = RV_BGChkVendor_Page.lnk_Add();
		js1.executeScript("arguments[0].scrollIntoView();", element);

		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].click();", TS_ChangeContentOnUserPage_Page.lnk_AddMixedContent());

		/*
		 * eventDriver.unregister(handler);
		 * TS_ChangeContentOnUserPage_Page.lnk_AddMixedContent().click();
		 * eventDriver.register(handler);
		 */

		TS_ChangeContentOnUserPage_Page.txt_Description().sendKeys("Link to SmartOnboarding Documentation");
		TS_ChangeContentOnUserPage_Page.txt_ContentLabel().sendKeys("Link to SmartOnboarding Documentation");
		TS_ChangeContentOnUserPage_Page.lnk_ContentExplanation().click();
	

		Thread.sleep(2000);
		TS_ChangeAuthenticationNotificationEmails_Page.Element_DivId().click();
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));

		// eventDriver.register(handler);
		TS_ChangeContentOnUserPage_Page.lnk_RichTextContent().sendKeys(
				"Click on Link below to View the SmartOnboarding Documentation", Keys.ENTER,
				"Smart OnBoarding Documentation", Keys.chord(Keys.SHIFT, Keys.HOME));
		TS_ChangeContentOnUserPage_Page.lnk_Link().click();
		Thread.sleep(1000);
		TS_ChangeContentOnUserPage_Page.txt_url().sendKeys("docs.smarterp.com");
		TS_ChangeContentOnUserPage_Page.lnk_target().click();
		select(TS_ChangeContentOnUserPage_Page.sel_target(), "New Window (_blank)");
		Thread.sleep(2000);
		// js.executeScript("arguments[0].click();",
		// TS_ChangeContentOnUserPage_Page.btn_okTarget());
		eventDriver.unregister(handler);
		TS_ChangeContentOnUserPage_Page.btn_okTarget().click();
		eventDriver.register(handler);
		TS_ChangeContentOnUserPage_Page.btn_okSave().click();
		eventDriver.unregister(handler);
		TS_ChangeContentOnUserPage_Page.btn_okSave().click();
		eventDriver.register(handler);

		Reporter.log("Change  Content On User Home Page Completed Successfully<br>");

	}

}
