package appModules.Revision.Content;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Revision.RV_CreateRevisions;
import pageObjects.BaseClass;
import pageObjects.Revision.Content.RV_BGChkVendor_Page;
import pageObjects.Revision.Content.RV_PDFTemplate_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class PDFTemplate extends psUtility {
	@Test
	public static void Execute() throws Exception {
		/*setEnvironment(Constant.ExternalURL);
		RV_CreateRevisions.RevNum = "0000000006";
		RV_CreateRevisions.RevisnType = "Content";*/

		dynamicLogin(isElementExists("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX18\"))"),
				OnboardingConstants.TAUser, "Content");
		RV_PDFTemplate_Page.lnk_Add().click();
		RV_PDFTemplate_Page.txt_Description().sendKeys("Demo PDF");
		RV_PDFTemplate_Page.btn_Upload1().click();

		/***** File Upload *****/
		eventDriver.unregister(handler);
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.className("bn")));

		String RelativePath = System.getProperty("user.dir") + "\\Files\\Attachments\\TestDoc.pdf";

		RV_PDFTemplate_Page.txt_FilePath().sendKeys(RelativePath);
		RV_PDFTemplate_Page.btn_Upload2().click();

		eventDriver.register(handler);

		RV_PDFTemplate_Page.btn_Save().click();

		Reporter.log("PDF Template Created Successfully<br>");

	}
}
