package appModules.Activities.Candidate.SubmitToHr;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.SubmitToHr.CA_SubmitToHR_Page;
import utility.Log;
import utility.psUtility;

public class CA_SubmitToHR extends psUtility {
	@Test
	public static void Execute() throws Exception {

		CA_SubmitToHR_Page.rdbtn_SubmitHrReview().click();
		Log.info("Click action is performed on 'Submit to HR for Review' button");

		//External_LogOut.Execute();
		//BaseClass.driver.quit();

		Reporter.log("Submit to HR Activity Completed Successfully<br>");
	}
}