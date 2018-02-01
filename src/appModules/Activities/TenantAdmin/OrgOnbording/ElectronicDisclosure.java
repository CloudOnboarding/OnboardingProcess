package appModules.Activities.TenantAdmin.OrgOnbording;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.TA_Tasks.TA_OrgElectronicDiscloser_Page;
import utility.Log;
import utility.psUtility;

public class ElectronicDisclosure extends psUtility {
	@Test
	public static void Execute() throws Exception {

		TA_OrgElectronicDiscloser_Page.chkbox_Agree().click();
		TA_OrgElectronicDiscloser_Page.btn_Acklmnt().click();
		Log.info("Click action is performed on E-Sign button");

		Reporter.log("Electronic Disclosure Activity For Tenant Admin-Org Onboarding Completed Successfully<br>");
	}
}
