package appModules.Activities.Candidate.PreScreening;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PreScreening.CA_SubmitPreScreenInformation_Page;
import utility.psUtility;

public class CA_SubmitPreScreenInformation extends psUtility {
	@Test
	public static void Execute() throws Exception {
		CA_SubmitPreScreenInformation_Page.chkbox_agree().click();
		CA_SubmitPreScreenInformation_Page.btn_save().click();
		
		Reporter.log("Submit PreScreen Information Completed Successfully<br>");
	}
}
