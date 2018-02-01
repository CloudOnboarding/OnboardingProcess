package appModules.OnboardingMaster;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.SelectRoleType_Page;
import utility.Log;
import utility.psUtility;

public class Select_RoleType_I9Admin extends psUtility {

	@Test
	public static void Execute() throws Exception {

		SelectRoleType_Page.lnk_I9Administrator().click();
		Log.info("Click action is perfromed on 'I-9 Administrator' link");
		Reporter.log("Select RoleType I-9 Specialist<br>");
	}

}