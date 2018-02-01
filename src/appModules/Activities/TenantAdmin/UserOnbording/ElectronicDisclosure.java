package appModules.Activities.TenantAdmin.UserOnbording;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.TA_Tasks.TA_UserElectronicDisclosure_Page;
import utility.Log;
import utility.psUtility;

public class ElectronicDisclosure extends psUtility {
	@Test
	public static void Execute() throws Exception {
		TA_UserElectronicDisclosure_Page.chkbox_Agree().click();
		Log.info("Checked the acknowledge agree check box");
		TA_UserElectronicDisclosure_Page.btn_Acknowledged().click();
		Log.info("Click action is performed on Electronically Acknowledged button");

		Reporter.log("Electronic Disclosure Activity For Tenant Admin-User Onbording Completed Successfully<br>");
	}
}
