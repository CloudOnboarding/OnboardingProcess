package appModules;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.MyTask_Page;
import utility.Log;
import utility.OnboardingConstants;
import utility.psUtility;

public class MyTask extends psUtility {
	@Test
	public static void Execute(String ActivityName) throws Exception {

		MyTask_Page.txt_QuickFilter().sendKeys(OnboardingConstants.CandidateId);

		// sendKeys(MyTask_Page.txt_QuickFilter(),"0000000073");
		Log.info("Send balue  action is performed on txt_QuickFilter");

		MyTask_Page.lnk_ActivityName().click();
		Log.info("Send balue  action is performed on txt_QuickFilter");

		setCurrentbrowser();

		Reporter.log("My Task Is Performed Successfully<br>");
	}
}
