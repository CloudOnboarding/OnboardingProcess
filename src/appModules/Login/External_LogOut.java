package appModules.Login;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.ExternalHome_Page;
import utility.psUtility;

public class External_LogOut extends psUtility {

	@Test
	public static void Execute() throws Exception {

		ExternalHome_Page.lnk_Accountname().click();
		ExternalHome_Page.lnk_Logout().click();

		Reporter.log("External Logout Action Performed Successfully<br>");
	}

}
