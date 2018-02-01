package appModules.Activities.TenantUser;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.TU_Tasks.TU_UserElectronicDisclosure_Page;
import utility.Log;
import utility.psUtility;

public class TU_ElectronicDisclosure extends psUtility {
	@Test
	public static void Execute() throws Exception {
		TU_UserElectronicDisclosure_Page.chkbox_Agree().click();
		Log.info("Checked the acknowledge agree check box");
		TU_UserElectronicDisclosure_Page.btn_Acknowledged().click();
		Log.info("Click action is performed on Electronically Acknowledged button");

		Reporter.log("Electronic Disclosure activity for TU- User Onbording Completed Successfully<br>");
	}
}
