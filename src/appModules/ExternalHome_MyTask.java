package appModules;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.ExternalHome_Page;
import utility.Log;
import utility.psUtility;

public class ExternalHome_MyTask extends psUtility {
	@Test
	public static void Execute() throws Exception {

		ExternalHome_Page.lnk_MyTasks().click();
		Log.info("Click action is performed on lnk_MyTasks");
		Reporter.log("Click Action Is Performed On link MyTasks<br>");
	}

}
