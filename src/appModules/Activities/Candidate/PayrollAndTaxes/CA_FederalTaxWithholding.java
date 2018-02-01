package appModules.Activities.Candidate.PayrollAndTaxes;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PayroleAndTaxes.CA_FederalTaxWithholding_Page;
import utility.Log;
import utility.psUtility;

public class CA_FederalTaxWithholding extends psUtility {
	@Test
	public static void Execute() throws Exception {

		CA_FederalTaxWithholding_Page.rdbtn_Single().click();
		Log.info("Click action is performed on 'Single' radio button");
		CA_FederalTaxWithholding_Page.txt_ClimeAllowances().sendKeys("454");
		Log.info(454 + " is entered in 'Total number of allowances' text box");
		CA_FederalTaxWithholding_Page.txt_AdditionalAmt().sendKeys("1000");
		Log.info(1000 + " is entered in 'Additional amount' text box");
		CA_FederalTaxWithholding_Page.chkBox_IAgree().click();
		Log.info("Click action is performed on 'Agree' check box");
		CA_FederalTaxWithholding_Page.btn_ElectronicSigature().click();
		Log.info("Click action is performed on 'Electronic Sigature' button");

		Reporter.log("FederalTax Withholding Completed Successfully<br>");
	}
}
