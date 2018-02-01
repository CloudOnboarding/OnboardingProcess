package appModules.Revision.Configuration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Login.External_LogOut;
import appModules.Revision.RV_CreateRevisions;
import pageObjects.BaseClass;
import pageObjects.TestScenarios.TS_ChangeContentOnUserPage_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class ApplyContentOnUserPage extends psUtility {

	@Test
	public static void Execute() throws Exception {
		/*setEnvironment(Constant.ExternalURL);
		RV_CreateRevisions.RevNum = "0000000003";
		RV_CreateRevisions.RevisnType = "Process";*/

		/*
		 * if(!isElementExists("driver.findElement(By.id(\"configMenu\"))")) {
		 * BaseClass.driver.quit(); //Dependency TA
		 * setEnvironment(Constant.ExternalURL);
		 * psUtility.ExternalLogin(OnboardingConstants.TAUser,
		 * OnboardingConstants.ONBPassword);
		 * Verification2Factor_Authentication.Execute();
		 * Setup_ChallengeQuestions.Execute(); }
		 */

		// Home Page Image Upload
		dynamicLogin(isElementExists("driver.findElement(By.id(\"configMenu\"))"), OnboardingConstants.TAUser,
				"Process");
		TS_ChangeContentOnUserPage_Page.Lnk_ConfigMenu().click();
		TS_ChangeContentOnUserPage_Page.lnk_OrgnazationHomepageConfig().click();
		TS_ChangeContentOnUserPage_Page.btn_search().click();
		TS_ChangeContentOnUserPage_Page.txt_QuickFilter().sendKeys("ACTIVE_REGULAR_TA_HMPG");
		TS_ChangeContentOnUserPage_Page.lnk_HomePageID().click();
		TS_ChangeContentOnUserPage_Page.MouseHr_columnActions().click();
		TS_ChangeContentOnUserPage_Page.btn_EditContent().click();
		TS_ChangeContentOnUserPage_Page.btn_imageID().click();
		TS_ChangeContentOnUserPage_Page.lnk_lookupImg().click();

		JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver;
		js.executeScript("arguments[0].click();", TS_ChangeContentOnUserPage_Page.btn_ok1());
		js.executeScript("arguments[0].click();", TS_ChangeContentOnUserPage_Page.btn_Save1());
		// to get the scroll view to top position
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", TS_ChangeContentOnUserPage_Page.MouseHr_GearICon());

		Thread.sleep(3000);

		WebElement element = TS_ChangeContentOnUserPage_Page.MouseHr_columnActions2();
		Actions action = new Actions(BaseClass.driver);
		action.moveToElement(element).build().perform();

		/* TS_ChangeContentOnUserPage_Page.MouseHr_columnActions2().click(); */
		Thread.sleep(2000);

		js.executeScript("arguments[0].click();", TS_ChangeContentOnUserPage_Page.btn_AddColumn());
		select(TS_ChangeContentOnUserPage_Page.sel_DrivenByCatagory(), "No");
		select(TS_ChangeContentOnUserPage_Page.sel_ContentType(), "Mixed Content");

		TS_ChangeContentOnUserPage_Page.btn_ContentID().click();
		eventDriver.unregister(handler);
		TS_ChangeContentOnUserPage_Page.txt_DescSearch().sendKeys("Link to SmartOnboarding Documentation", Keys.ENTER);
		eventDriver.register(handler);
		TS_ChangeContentOnUserPage_Page.lnk_Description().click();
		TS_ChangeContentOnUserPage_Page.txt_width().sendKeys("25");
		TS_ChangeContentOnUserPage_Page.txt_PaddingTop().sendKeys("20");
		TS_ChangeContentOnUserPage_Page.txt_PaddingRight().sendKeys("20");
		TS_ChangeContentOnUserPage_Page.txt_PaddingBottom().sendKeys("20");
		TS_ChangeContentOnUserPage_Page.txt_PaddingLeft().sendKeys("20");
		TS_ChangeContentOnUserPage_Page.btn_ok1().click();

		TS_ChangeContentOnUserPage_Page.MouseHr_News().click();
		js.executeScript("arguments[0].click();", TS_ChangeContentOnUserPage_Page.btn_EditContent());
		TS_ChangeContentOnUserPage_Page.txt_width().sendKeys("25");
		TS_ChangeContentOnUserPage_Page.btn_ok1().click();

		TS_ChangeContentOnUserPage_Page.MouseHr_FAQ().click();
		js.executeScript("arguments[0].click();", TS_ChangeContentOnUserPage_Page.btn_EditContent());
		TS_ChangeContentOnUserPage_Page.txt_width().sendKeys("25");
		TS_ChangeContentOnUserPage_Page.btn_ok1().click();

		TS_ChangeContentOnUserPage_Page.MouseHr_TrainingVideos().click();
		js.executeScript("arguments[0].click();", TS_ChangeContentOnUserPage_Page.btn_EditContent());
		TS_ChangeContentOnUserPage_Page.txt_width().sendKeys("25");
		TS_ChangeContentOnUserPage_Page.btn_ok1().click();
		TS_ChangeContentOnUserPage_Page.btn_Save1().click();

		TS_ChangeContentOnUserPage_Page.lnk_Home().click();

		TS_ChangeContentOnUserPage_Page.lnk_OnboardingDocument().click();
		// TS_ChangeContentOnUserPage_Page.lnk_OnboardingDocumentURL().click();

		// Logout test case
		External_LogOut.Execute();
		// BaseClass.driver.quit();

		Reporter.log("Content Has Been Change For User Home Page Successfully<br>");

	}

}
