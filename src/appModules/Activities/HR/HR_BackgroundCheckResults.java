package appModules.Activities.HR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.HR_Tasks.HR_BackgroundCheckResults_Page;
import utility.psUtility;

public class HR_BackgroundCheckResults extends psUtility {
	@Test
	public static void Execute() throws Exception {
		HR_BackgroundCheckResults_Page.chkbox_agree().click();
		HR_BackgroundCheckResults_Page.btn_acknowledg().click();
		
		Reporter.log("Background Check Results Completed Successfully<br>");
	}
}
