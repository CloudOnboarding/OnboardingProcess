package appModules.Activities.Candidate.PayrollAndTaxes;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PayroleAndTaxes.CA_ElectronicW2Acknowledgment_Page;
import utility.Log;
import utility.psUtility;

public class CA_ElectronicW2Acknowledgement extends psUtility {
	@Test
	public static void Execute() throws Exception {

		CA_ElectronicW2Acknowledgment_Page.chkBox_AuthorizeW2s().click();
		Log.info("Click action is performed on 'Authorize Electronic W-2s' check box");
		CA_ElectronicW2Acknowledgment_Page.btn_ElectronicSignature().click();
		Log.info("Click action is performed on 'Electronic Sigature' button ");

		Reporter.log("ElectronicW2 Acknowledgement Completed Successfully<br>");
	}
}
