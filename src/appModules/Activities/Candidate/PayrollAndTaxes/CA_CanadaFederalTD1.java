package appModules.Activities.Candidate.PayrollAndTaxes;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PayroleAndTaxes.CA_CanadaFederalTD1_Page;
import utility.Log;
import utility.psUtility;

public class CA_CanadaFederalTD1 extends psUtility {
	@Test
	public static void Execute() throws Exception {

		CA_CanadaFederalTD1_Page.chkBox_ICertify().click();
		Log.info("Click action is performed on 'I certify' check box");
		CA_CanadaFederalTD1_Page.btn_ElectronicSigature().click();
		Log.info("Click action is performed on 'Electronic Sigature' button ");

		Reporter.log("ElectronicW2 Acknowledgement Completed Successfully<br>");
	}
}
