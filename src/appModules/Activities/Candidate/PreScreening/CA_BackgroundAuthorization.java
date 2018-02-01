package appModules.Activities.Candidate.PreScreening;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PreScreening.CA_BackgroundAuthorization_Page;
import utility.psUtility;

public class CA_BackgroundAuthorization extends psUtility {
	@Test
	public static void Execute() throws Exception {
		
		CA_BackgroundAuthorization_Page.chk_Acknowledge().click();
		CA_BackgroundAuthorization_Page.btn_ElectricallySign().click();
		
		Reporter.log("Background Authorization Completed Successfully<br>");
	}
}
