package appModules.Revision.Configuration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import appModules.Revision.RV_CreateRevisions;
import pageObjects.BaseClass;
import pageObjects.Revision.Configuaration.MassUploadRevisionAttribute_Page;
import pageObjects.Revision.Content.RV_Attachment_Page;
import pageObjects.TestScenarios.TS_ChangeOnboardProcessNotificationEmails_page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class MassUploadRevisionAttribute extends psUtility {

	@Test
	public static void Execute() throws Exception {
		setEnvironment(Constant.ExternalURL);
		
		 RV_CreateRevisions.RevNum = "0000000003"; 
		 RV_CreateRevisions.RevisnType ="Process";
		 

		String RelativePath = System.getProperty("user.dir") + "\\Files\\TestData\\Mass Upload Locations1.csv";
		MassUpload(RelativePath);
		String RelativePath1 = System.getProperty("user.dir") + "\\Files\\TestData\\Mass Upload Locations2.csv";
		MassUpload(RelativePath1);
	}

	public static void MassUpload(String FilePath) throws Exception {

		dynamicLogin(isElementExists("driver.findElement(By.id(\"SM_CD_TREE_WRK_SM_CO_UPLOAD\"))"),
				OnboardingConstants.TAUser, "Process");
		MassUploadRevisionAttribute_Page.lnk_MassUpload().click();
		if (isElementExists("driver.findElement(By.id(\"SM_CD_WRK_DELETE_PB$0\"))")) {
			MassUploadRevisionAttribute_Page.btn_Discard().click();
			MassUploadRevisionAttribute_Page.btn_yes().click();
		}

		select(MassUploadRevisionAttribute_Page.sel_AttributeType(), "Location");
		MassUploadRevisionAttribute_Page.btn_Upload().click();

		/***** File Upload *****/
		eventDriver.unregister(handler);
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.className("bn")));

		// String RelativePath = System.getProperty("user.dir") +
		// "\\Files\\TestData\\Mass Upload Locations1.csv";

		MassUploadRevisionAttribute_Page.txt_FilePath().sendKeys(FilePath);
		MassUploadRevisionAttribute_Page.btn_Upload2().click();

		eventDriver.register(handler);
		MassUploadRevisionAttribute_Page.btn_Push().click();
		MassUploadRevisionAttribute_Page.btn_Return().click();

	}

}
