package appModules.Activities.Candidate.PreScreening;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PreScreening.CA_BackgroundCheckStateDisclosures_Verification_Page;
import utility.psUtility;

public class CA_BackgroundCheckStateDisclosures_Verification extends psUtility {
	@Test
	public static void Execute() throws Exception {
		CA_BackgroundCheckStateDisclosures_Verification_Page.chkbox_agree().click();
		CA_BackgroundCheckStateDisclosures_Verification_Page.btn_acknowledg().click();
		
		Reporter.log("Background Check State Disclosures Verification Completed Successfully<br>");
	}
}
