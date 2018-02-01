package appModules.Activities.Candidate.PreScreening;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PreScreening.CA_CaliforniaCreditCheck_Page;
import utility.psUtility;

public class CA_CaliforniaCreditCheck extends psUtility {
	@Test
	public static void Execute() throws Exception {
		CA_CaliforniaCreditCheck_Page.chkbox_agree().click();
		CA_CaliforniaCreditCheck_Page.btn_acknowledg().click();
		
		Reporter.log("California CreditCheck Completed Successfully<br>");
	}
}
