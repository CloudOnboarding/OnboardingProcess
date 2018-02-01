package appModules.Revision.Content;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Revision.RV_CreateRevisions;
import pageObjects.BaseClass;
import pageObjects.TestScenarios.TS_AddUploadOrganizationLogo_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class ImageManagement extends psUtility {
	@Test
	public static void Execute() throws Exception {
		// Login to external URL
	 	setEnvironment(Constant.ExternalURL);
		psUtility.ExternalLogin(OnboardingConstants.TAUser, OnboardingConstants.ONBPassword);
		Verification2Factor_Authentication.Execute();
		Setup_ChallengeQuestions.Execute();

		// Create New rivision-Content
		RV_CreateRevisions.Execute("Content", "Demo Content");
		dynamicLogin(isElementExists("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX5\"))"),OnboardingConstants.TAUser,"Content");
		TS_AddUploadOrganizationLogo_Page.lnk_Add().click();
		TS_AddUploadOrganizationLogo_Page.txt_Descr120().sendKeys("CompanyLogo");
		select(TS_AddUploadOrganizationLogo_Page.sel_ImageType(), "PNG");
		TS_AddUploadOrganizationLogo_Page.btn_Upload1().click();

		/***** File Upload *****/
		eventDriver.unregister(handler);
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.className("bn")));

		String RelativePath = System.getProperty("user.dir") + "\\Files\\Images\\logo.PNG";

		TS_AddUploadOrganizationLogo_Page.txt_FilePath().sendKeys(RelativePath);
		TS_AddUploadOrganizationLogo_Page.btn_Upload2().click();

		eventDriver.register(handler);

		/*********************/
		TS_AddUploadOrganizationLogo_Page.btn_Save1().click();
		
		Reporter.log("Image Upload Completed Successfully<br>");
	}

}
