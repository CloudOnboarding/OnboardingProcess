package appModules.Revision.Content;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.Revision.Content.RV_BGChkVendor_Page;
import utility.OnboardingConstants;
import utility.psUtility;

public class BackgroundCheckVendors extends psUtility {
	@Test
	public static void Execute() throws Exception {
		dynamicLogin(isElementExists("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX15\"))"), OnboardingConstants.TAUser,"Content");
		RV_BGChkVendor_Page.lnk_Add().click();
		RV_BGChkVendor_Page.txt_VndrDescr().sendKeys("SmartBGVendor");
		RV_BGChkVendor_Page.txt_VndrID().sendKeys("ACHECK");
		RV_BGChkVendor_Page.txt_FormID().sendKeys("SM_OB_BG_STND_AUTH");
		RV_BGChkVendor_Page.txt_AdmTxtID().sendKeys("SM_OB_BGC_PRCSING");
		RV_BGChkVendor_Page.txt_PRFL_FormID().sendKeys("7YRLWSTD");
		RV_BGChkVendor_Page.btn_Save().click();
		Reporter.log("Background Check Vendor Created Successfully<br>");
	}
}
