package appModules.OnboardingMaster;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.SelectRoleType_Page;
import utility.Log;
import utility.psUtility;

public class Select_RoleType_HRAdmin extends psUtility {

	@Test
	public static void Execute() throws Exception {
		
		
		SelectRoleType_Page.lnk_HRAdministrator().click();
		Log.info("Click action is perfromed on 'HR Administrator' link");

		Reporter.log("Select RoleType HR Administrator<br>");

	}

}