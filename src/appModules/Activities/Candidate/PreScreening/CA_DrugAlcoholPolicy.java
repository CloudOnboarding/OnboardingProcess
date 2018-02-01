package appModules.Activities.Candidate.PreScreening;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PreScreening.CA_DrugAlcoholTestPolicy_Page;
import utility.psUtility;

public class CA_DrugAlcoholPolicy extends psUtility {
	@Test
	public static void Execute() throws Exception {
		CA_DrugAlcoholTestPolicy_Page.chkbox_Agree().click();
		CA_DrugAlcoholTestPolicy_Page.btn_save().click();
		
		Reporter.log("DrugAlcohol Policy Completed Successfully<br>");
	}
}
