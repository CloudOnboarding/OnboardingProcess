package appModules.Activities.Candidate.NewHireForms;
 
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.NewHireForms.CA_SelfIdentificationDisability_Page;
import utility.Log;
import utility.psUtility;
 
public class CA_SelfIdentificationDisability extends psUtility {

	@Test
	public static void Execute() throws Exception {

		/* Enter Candidate Self Identification: Race Status details */

		 CA_SelfIdentificationDisability_Page.rdBtn_IdontwishAnswer().click();
		Log.info("Click action is performed on :I Dont not to answer");
		CA_SelfIdentificationDisability_Page.btn_ElectronicSignature().click();
		Log.info("Click action is performed on :Electronic Signature Button");

		Reporter.log("SelfIdentification Disability Completed Successfully<br>");

	}

}
