package appModules.Activities.Candidate.Welcome;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.Welcome.CA_ElectronicDisclosure_Page;
import utility.Log;
import utility.psUtility;

public class CA_ElectronicDisclosure extends psUtility {
	@Test
	public static void Execute() throws Exception {

		/* Enter Candidate Electronic Disclosure details */
		CA_ElectronicDisclosure_Page.chkbox_Agree().click();
		Log.info(
				"Click action is performed on :I understand the terms above, and give my consent to use electronic signatures for my onboarding. ");
		CA_ElectronicDisclosure_Page.btn_Acknowledgement().click();
		Log.info("Click action is performed on :Electronic Signature Button");

		Reporter.log("ElectronicDisclosure Completed Successfully<br>");

	}

}
