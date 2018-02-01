package appModules.Activities.Candidate.NewHireForms;
 
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.NewHireForms.CA_OSHAFieldSafety_HealthManual_Page;
import utility.Log;
import utility.psUtility;
 
public class CA_OSHAFieldSafety_HealthManual extends psUtility {

	@Test
	public static void Execute() throws Exception {
		
		CA_OSHAFieldSafety_HealthManual_Page.txt_FirstName().sendKeys("Robert");
		CA_OSHAFieldSafety_HealthManual_Page.txt_LastName().sendKeys("Cole");
		
		CA_OSHAFieldSafety_HealthManual_Page.chkbox_Agree().click();
		Log.info("Click action is performed on :I Agree check box ");
		CA_OSHAFieldSafety_HealthManual_Page.btn_Acknowledgement().click();
		Log.info("Click action is performed on :Electronic Signature Button");

		Reporter.log("OSHA Field Safety and Health Manual Completed Successfully<br>");

	}

}
