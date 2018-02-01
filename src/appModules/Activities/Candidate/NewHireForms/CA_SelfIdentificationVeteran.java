package appModules.Activities.Candidate.NewHireForms;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.NewHireForms.CA_SelfIdentificationVeteran_Page;
import utility.Log;
import utility.psUtility;

public class CA_SelfIdentificationVeteran extends psUtility {

	@Test
	public static void Execute() throws Exception {

		/* Enter Candidate Self Identification: Race Status details */
		CA_SelfIdentificationVeteran_Page.rdBtn_VetCatgry3Inpt().click();
		Log.info("Click action is performed on :I prefer not to answer");
		CA_SelfIdentificationVeteran_Page.btn_ElectricallySign().click();
		Log.info("Click action is performed on :Electronic Signature Button");

		Reporter.log("SelfIdentification Veteran Completed Successfully<br>");

	}

}
