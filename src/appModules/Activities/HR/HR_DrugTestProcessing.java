package appModules.Activities.HR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.HR_Tasks.HR_DrugTestProcessing_Page;
import utility.psUtility;

public class HR_DrugTestProcessing extends psUtility {
	@Test
	public static void Execute() throws Exception {
		HR_DrugTestProcessing_Page.chkbox_agree().click();
		HR_DrugTestProcessing_Page.btn_acknowledg().click();
		
		Reporter.log("DrugTest Processing Completed Successfully<br>");
	}
}
