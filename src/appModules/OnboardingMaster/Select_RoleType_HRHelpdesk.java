package appModules.OnboardingMaster;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.ExternalHome_Page;
import pageObjects.SelectRoleType_Page;
import utility.Log;
import utility.psUtility;

public class Select_RoleType_HRHelpdesk extends psUtility {

	@Test
	public static void Execute() throws Exception {

		SelectRoleType_Page.lnk_HRHelpdesk().click();
		Log.info("Click action is perfromed on 'HR Helpdesk' link");
		ExternalHome_Page.lnk_MyTasks().click();
		Log.info("Click action is perfromed on 'My Task' link");

		Reporter.log("Select RoleType HR Helpdesk<br>");
	}

}