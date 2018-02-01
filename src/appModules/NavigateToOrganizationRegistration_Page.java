package appModules;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Assertions.OnbAssertions;
import pageObjects.BaseClass;
import pageObjects.ManageOrginization_Page;
import utility.Constant;
import utility.Log;
import utility.psUtility;

public class NavigateToOrganizationRegistration_Page extends psUtility {

	@Test
	public static void Execute() throws Exception {

		BaseClass.driver.get(Constant.NavigateURL);

		Log.info("Navigate to Organization Registration Page");
		/* Verifying SmartORG-Invite Button */
		OnbAssertions.Verify_SmartORGInvite();

		ManageOrginization_Page.btn_SmartORGInvite().click();
		Log.info("Click action is perfromed on SmartORGInvite Button");

		Reporter.log("Navigate To Organization Registration Page Is Performed Successfully<br>");

	}
}
