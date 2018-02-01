package appModules.OnboardingMaster;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.SelectRoleType_Page;
import utility.Log;
import utility.psUtility;

public class Select_RoleType_EVerifyAdmin extends psUtility {

	@Test
	public static void Execute() throws Exception {

		SelectRoleType_Page.lnk_EVerifyAdministrator().click();
		Log.info("Click action is perfromed on 'E-Verify Administrator' link");
		Reporter.log("Select RoleType E-Verify Administrator<br>");
	}

}