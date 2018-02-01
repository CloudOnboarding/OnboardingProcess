package appModules.Activities.Candidate.PreScreening;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PreScreening.CA_HepatitisBVaccinationConfirmation_Page;
import utility.psUtility;

public class CA_HepatitisBVaccinationConfirmation extends psUtility {
	@Test
	public static void Execute() throws Exception {
		CA_HepatitisBVaccinationConfirmation_Page.chkbox_heptts().click();
		CA_HepatitisBVaccinationConfirmation_Page.chkbox_agree().click();
		CA_HepatitisBVaccinationConfirmation_Page.btn_save().click();
		
		Reporter.log("HepatitisB Vaccination Confirmation Completed Successfully<br>");
	}
}
