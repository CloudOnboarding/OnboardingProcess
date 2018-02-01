package appModules.Activities.Candidate.NewHireForms;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.NewHireForms.CA_SelfIdentificationRace_Page;
import utility.Log;
import utility.psUtility;

public class CA_SelfIdentificationRace extends psUtility {

	@Test
	public static void Execute() throws Exception {

		/* Enter Candidate Self Identification: Race Status details */

		CA_SelfIdentificationRace_Page.chkbox_DeclinedSlefIDInpt().click();
		Log.info("Click action is performed on :I agree");
		CA_SelfIdentificationRace_Page.btn_ElectronicSignature().click();
		Log.info("Click action is performed on :Electronic Signature Button");

		Reporter.log("SelfIdentification Race Completed Successfully<br>");

	}

}
