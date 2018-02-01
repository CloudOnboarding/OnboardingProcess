package appModules.Activities.Candidate.PreScreening;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PreScreening.CA_VerificationFormInstructions_Page;
import utility.psUtility;

public class CA_VerificationFormInstructions extends psUtility {
	@Test
	public static void Execute() throws Exception {
		CA_VerificationFormInstructions_Page.chkbox_agree().click();
		CA_VerificationFormInstructions_Page.btn_acknowledg().click();
		
		Reporter.log("VerificationForm Instructions Completed Successfully<br>");
	}
}
