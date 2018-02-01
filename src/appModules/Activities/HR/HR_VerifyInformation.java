package appModules.Activities.HR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.HR_Tasks.HR_VerifyInformation_Page;
import utility.Log;
import utility.psUtility;

public class HR_VerifyInformation extends psUtility {

	@Test
	public static void Execute() throws Exception {
		// Verify Information

		HR_VerifyInformation_Page.chkBox_Acknowledge().click();
		Log.info("Click action is performed on :chkBox_Acknowledge");
		HR_VerifyInformation_Page.btn_ElectronicSign().click();
		Log.info("Click action is performed on :Electronic Signature Button");

		Reporter.log("HR VerifyInformation Completed Successfully<br>");
	}

}
