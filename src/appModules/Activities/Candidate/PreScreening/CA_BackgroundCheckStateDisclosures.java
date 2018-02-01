package appModules.Activities.Candidate.PreScreening;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PreScreening.CA_BackgroundCheckStateDisclosures_Page;
import utility.psUtility;

public class CA_BackgroundCheckStateDisclosures extends psUtility {
	@Test
	public static void Execute() throws Exception {
		CA_BackgroundCheckStateDisclosures_Page.chkbox_agree().click();
		CA_BackgroundCheckStateDisclosures_Page.btn_acknowledg().click();
		
		Reporter.log("Background Check State Disclosures Completed Successfully<br>");
	}
}
