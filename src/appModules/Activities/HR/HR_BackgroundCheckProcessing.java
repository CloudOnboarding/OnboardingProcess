package appModules.Activities.HR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.HR_Tasks.HR_BackgroundCheckProcessing_Page;
import utility.psUtility;

public class HR_BackgroundCheckProcessing extends psUtility {
	@Test
	public static void Execute() throws Exception {
		HR_BackgroundCheckProcessing_Page.btn_acknowledg().click();
		
		Reporter.log("Background Check Processing Completed Successfully<br>");
	}
}
