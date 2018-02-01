package appModules.Revision.Content;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Revision.RV_CreateRevisions;
import pageObjects.BaseClass;
import pageObjects.Revision.Content.RV_Attachment_Page;
import pageObjects.Revision.Content.RV_BGChkVendor_Page;
import pageObjects.TestScenarios.TS_AddUploadOrganizationLogo_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class Attachments extends psUtility {
	@Test
	public static void Execute() throws Exception {
		setEnvironment(Constant.ExternalURL);
/*		RV_CreateRevisions.RevNum = "0000000003";
		RV_CreateRevisions.RevisnType = "Content";
*/
		dynamicLogin(isElementExists("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX15\"))"),
				OnboardingConstants.TAUser, "Content");
		RV_Attachment_Page.lnk_Add().click();
		RV_Attachment_Page.txt_AttachmentTitle().sendKeys("Demo Attachment");
		RV_Attachment_Page.txt_lookupDescription().sendKeys("Demo");
		select(RV_Attachment_Page.sel_AttachmentCatagory(), "Other");
		RV_Attachment_Page.btn_Upload().click();

		/***** File Upload *****/
		eventDriver.unregister(handler);
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.className("bn")));
		String RelativePath = System.getProperty("user.dir") + "\\Files\\Attachments\\TestDoc.pdf";

		RV_Attachment_Page.txt_FilePath().sendKeys(RelativePath);
		RV_Attachment_Page.btn_Upload2().click();
		
		eventDriver.register(handler);

		RV_Attachment_Page.btn_Save().click();

		Reporter.log("Attachment Created Successfully<br>");
	}
}
