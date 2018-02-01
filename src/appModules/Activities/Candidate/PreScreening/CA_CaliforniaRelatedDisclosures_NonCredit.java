package appModules.Activities.Candidate.PreScreening;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PreScreening.CA_CaliforniaRelatedDisclosures_NonCredit_Page;
import utility.psUtility;

public class CA_CaliforniaRelatedDisclosures_NonCredit extends psUtility {
	@Test
	public static void Execute() throws Exception {
		CA_CaliforniaRelatedDisclosures_NonCredit_Page.chk_Agree().click();
		CA_CaliforniaRelatedDisclosures_NonCredit_Page.btn_Certify().click();
		
		Reporter.log("CaliforniaRelated Disclosures-NonCredit Completed Successfully<br>");
	}
}
