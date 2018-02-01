package appModules;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.ExternalHome_Page;
import utility.Log;
import utility.psUtility;

public class ExternalHome_CreateInvitation extends psUtility {

	@Test
	public static void Execute() throws Exception {

		ExternalHome_Page.lnk_CreateInvitation().click();
		Log.info("Click action is performed on lnk_CreateInvitation");

		Reporter.log("External Home Page Action Performed Successfully<br>");
	}

}
