package appModules.Activities.Candidate.PreScreening;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PreScreening.CA_DrugAlcoholTestAuthorization_Page;
import utility.psUtility;

public class CA_DrugAlcoholTestAuthorization extends psUtility {
	@Test
	public static void Execute() throws Exception {
		//CA_DrugAlcoholTestAuthorization_Page.rdbtn_yes().click();
		CA_DrugAlcoholTestAuthorization_Page.rdbtn_No().click();
		CA_DrugAlcoholTestAuthorization_Page.chkbox_certify().click();
		CA_DrugAlcoholTestAuthorization_Page.btn_save().click();
		
		Reporter.log("DrugAlcoholTest Authorization Completed Successfully<br>");
	}
}
