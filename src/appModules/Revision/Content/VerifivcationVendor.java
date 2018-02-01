package appModules.Revision.Content;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.Revision.Content.RV_VerifivcationVendor_Page;
import utility.OnboardingConstants;
import utility.psUtility;

public class VerifivcationVendor extends psUtility {
	@Test
	public static void Execute() throws Exception {
		dynamicLogin(isElementExists("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX16\"))"), OnboardingConstants.TAUser,"Content");
		RV_VerifivcationVendor_Page.lnk_add().click();
		RV_VerifivcationVendor_Page.txt_descr().sendKeys("SmartVendor");
		RV_VerifivcationVendor_Page.txt_vndrId().sendKeys("CARCO");
		select(RV_VerifivcationVendor_Page.sel_RVEntryMethod(), "Online Form");
		RV_VerifivcationVendor_Page.btn_Save().click();
		Reporter.log("Verification Vendor Completed Successfully<br>");
	}
}
