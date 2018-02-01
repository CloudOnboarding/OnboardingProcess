package appModules.Login;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.InternalHome_Page;
import utility.psUtility;

public class Internal_Logout extends psUtility {

	@Test
	public static void Execute() throws Exception {

		InternalHome_Page.lnk_HSignout().click();

		Reporter.log("Internal Logout Action Performed Successfully<br>");

	}

}
