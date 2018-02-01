package appModules.Revision.Configuration;

import org.testng.annotations.Test;

import appModules.Revision.RV_CreateRevisions;
import pageObjects.Revision.Configuaration.ManageAdhocReport_page;
import pageObjects.TestScenarios.TS_ChangeOnboardProcessNotificationEmails_page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class ManageAdhocReport extends psUtility {

	@Test
	public static void Execute() throws Exception {
		
		/*setEnvironment(Constant.ExternalURL);
		RV_CreateRevisions.RevNum = "0000000017";
		RV_CreateRevisions.RevisnType = "Process";*/

		dynamicLogin(isElementExists("driver.findElement(By.id(\"SM_CD_TREE_WRK_SM_CD_REV_ADHC\"))"), OnboardingConstants.TAUser,"Process");
		ManageAdhocReport_page.lnk_ManageAdhocReport().click();
		ManageAdhocReport_page.btn_PDFTemplate().click();
		eventDriver.unregister(handler);
		ManageAdhocReport_page.txt_QuickFilter().sendKeys("Demo PDF");
		ManageAdhocReport_page.lnk_SearchClick().click();
		eventDriver.register(handler);
		ManageAdhocReport_page.lnk_DefineCriteria().click();
		ManageAdhocReport_page.rdbtn_AlwaysRoute().click();
		ManageAdhocReport_page.btn_save().click();
		select(ManageAdhocReport_page.sel_ParticipantPool(), "HR Specialist");
		ManageAdhocReport_page.btn_save().click();
}
}