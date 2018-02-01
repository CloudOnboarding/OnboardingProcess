package appModules;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.SetupChallengeQuestions_Page;
import utility.Log;
import utility.psUtility;

public class Setup_ChallengeQuestions extends psUtility {
	@Test
	public static void Execute() throws Exception {

		if (isElementExists("driver.findElement(By.id(\"SM_CO_QTNANS_R_SM_CO_ANSWER$0\"))")) {
			/* Enter Challenge Question details */
			SetupChallengeQuestions_Page.txt_SecurityAns_0().sendKeys("1");
			SetupChallengeQuestions_Page.txt_SecurityAns_1().sendKeys("1");
			SetupChallengeQuestions_Page.txt_SecurityAns_2().sendKeys("1");
			SetupChallengeQuestions_Page.txt_SecurityAns_3().sendKeys("1");
			Log.info("Entered the Challenge Question Details");
			SetupChallengeQuestions_Page.btn_continue().click();
			Log.info("Click action is performed on Continue button");

			/* Verify Challenge Question details entered successfully */
			// OnbAssertions.Verify_SetUpQns();
		}

		Reporter.log("Setup Challenge Questions has Been Performed Successfully<br>");

	}
}
