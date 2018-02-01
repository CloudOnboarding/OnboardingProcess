package appModules.Activities.Candidate.NewHireForms;
 
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.BaseClass;
import pageObjects.Revision.Content.RV_Attachment_Page;
import pageObjects.activityObjects.CA_Tasks.NewHireForms.CA_SelfIdentificationDisability_Page;
import pageObjects.activityObjects.CA_Tasks.NewHireForms.CA_UploadDocuments_Page;
import utility.Log;
import utility.psUtility;
 
public class CA_UploadDocuments extends psUtility {

	@Test
	public static void Execute() throws Exception {
		
		CA_UploadDocuments_Page.chkbxDescFld(0).click();
		Log.info("Click action is performed on 'Drivers License or Passport' Desc Field"); 
		CA_UploadDocuments_Page.btn_Attach(0).click();
		Log.info("Click action is performed on 'Attach' button");
		CA_UploadDocuments_Page.btn_Attach1(0).click();
		Log.info("Click action is performed on 'Attach' button");
		
		eventDriver.unregister(handler);
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.xpath("//iframe[@class='bn']")));
		CA_UploadDocuments_Page.txt_FilePath().sendKeys(System.getProperty("user.dir") + "\\Files\\Attachments\\TestDoc.pdf");
		CA_UploadDocuments_Page.btn_Upload().click();
		Log.info("Click action is performed on 'Upload' button");
		eventDriver.register(handler);

		CA_UploadDocuments_Page.btn_OK().click();
		Log.info("Click action is performed on 'OK' button");
		
		//CA_UploadDocuments_Page.chkbxFld(0).click();
		//Log.info("Click action is performed on 'Drivers License or Passport' check box");
		
		CA_UploadDocuments_Page.chkbxFld(1).click();
		Log.info("Click action is performed on 'Voided Check/Deposit Slip/Bank Letter' check box");
		
		CA_UploadDocuments_Page.chkbxFld(2).click();
		Log.info("Click action is performed on 'Social Security Card or Birth Certificate' check box");
		
		CA_UploadDocuments_Page.chkbxFld(3).click();
		Log.info("Click action is performed on 'Other Identification Documents' check box");
		
		CA_UploadDocuments_Page.btn_Submit().click();
		Log.info("Click action is performed on 'Submit' Button");

		Reporter.log("Upload Documents Completed Successfully<br>");

	}

}
