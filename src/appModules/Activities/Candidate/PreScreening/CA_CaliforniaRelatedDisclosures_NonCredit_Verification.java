package appModules.Activities.Candidate.PreScreening;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PreScreening.CA_CaliforniaRelatedDisclosures_NonCredit_Verification_Page;
import utility.psUtility;

public class CA_CaliforniaRelatedDisclosures_NonCredit_Verification extends psUtility {
	@Test
	public static void Execute() throws Exception {
		CA_CaliforniaRelatedDisclosures_NonCredit_Verification_Page.chk_Agree().click();
		CA_CaliforniaRelatedDisclosures_NonCredit_Verification_Page.btn_Acknowledge().click();
		
		Reporter.log("CaliforniaRelated Disclosures-NonCredit-Verification Completed Successfully<br>");
	}
}
