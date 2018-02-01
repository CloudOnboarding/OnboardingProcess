package appModules.Revision.Content;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Revision.RV_CreateRevisions;
import pageObjects.Revision.Content.SmartChecklists_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class AddSmartChecklists extends psUtility {
	public static String ChecklistID;
	@Test
	public static void Execute() throws Exception {
		dynamicLogin(isElementExists("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX12\"))"), OnboardingConstants.TAUser,"Content");
		SmartChecklists_Page.lnk_AddSmartChklist().click();
		SmartChecklists_Page.txt_ChecklistTitle().sendKeys("Upload Documents_CHKLIST");
		select(SmartChecklists_Page.sel_ParticipantPool(),"New Hire");
		SmartChecklists_Page.txt_OverrideSaveBtnLbl().sendKeys("Submit");
		SmartChecklists_Page.txt_Description(0).sendKeys("Drivers License or Passport");
		SmartChecklists_Page.chkbx_EnableUploads(0).click();
		SmartChecklists_Page.lnk_EditDtls().click();
		SmartChecklists_Page.chkbx_Required().click();
		SmartChecklists_Page.btn_OK().click();
		SmartChecklists_Page.btn_AddTask().click();
		SmartChecklists_Page.txt_Description(1).sendKeys("Voided Check/Deposit Slip/Bank Letter");
		SmartChecklists_Page.chkbx_EnableUploads(1).click();
		SmartChecklists_Page.btn_AddTask().click();
		SmartChecklists_Page.txt_Description(2).sendKeys("Social Security Card or Birth Certifica");
		SmartChecklists_Page.chkbx_EnableUploads(2).click();
		SmartChecklists_Page.btn_AddTask().click();
		SmartChecklists_Page.txt_Description(3).sendKeys("Other Identification Documents");
		SmartChecklists_Page.chkbx_EnableUploads(3).click();
		SmartChecklists_Page.btn_Save().click();
		
		Reporter.log("Smart Checklists Completed Successfully<br>");
	}
}
