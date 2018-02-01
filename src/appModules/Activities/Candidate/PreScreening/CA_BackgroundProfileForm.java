package appModules.Activities.Candidate.PreScreening;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PreScreening.CA_BackgroundProfileForm_Page;
import utility.psUtility;

public class CA_BackgroundProfileForm extends psUtility {
	@Test
	public static void Execute() throws Exception {
		CA_BackgroundProfileForm_Page.chk_Agree().click();
		CA_BackgroundProfileForm_Page.btn_Acknowledge().click();
		
		Reporter.log("Background ProfileForm Completed Successfully<br>");
	}
}
