package appModules.Activities.Candidate.PreScreening;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PreScreening.CA_BackgroundCheckDisclosures_Page;
import utility.psUtility;

public class CA_BackgroundCheckDisclosures extends psUtility {
	@Test
	public static void Execute() throws Exception {
		CA_BackgroundCheckDisclosures_Page.chk_Agree().click();
		CA_BackgroundCheckDisclosures_Page.btn_Certify().click();
		
		Reporter.log("Background Check Disclosures Completed Successfully<br>");
	}
}
