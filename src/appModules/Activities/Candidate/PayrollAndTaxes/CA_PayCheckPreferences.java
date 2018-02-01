package appModules.Activities.Candidate.PayrollAndTaxes;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PayroleAndTaxes.CA_PayChkPreferences_Page;
import utility.Log;
import utility.psUtility;

public class CA_PayCheckPreferences extends psUtility {
	@Test
	public static void Execute() throws Exception {

		CA_PayChkPreferences_Page.rdbtn_CheckByMail().click();
		Log.info("Click action is performed on 'Check By Mail' radio button");
		CA_PayChkPreferences_Page.btn_Next().click();
		Log.info("Click action is performed on 'Next' button");
		CA_PayChkPreferences_Page.rdbtn_MailHomeAddress().click();
		Log.info("Click action is performed on 'Mail to my home address' radio button");
		CA_PayChkPreferences_Page.chkBox_Acknowledge().click();
		Log.info("Click action is performed on 'Acknowledge' check box");
		CA_PayChkPreferences_Page.btn_Save().click();
		Log.info("Click action is performed on 'Save' button ");

		Reporter.log("PayCheck Preferences Completed Successfully<br>");
	}
}
