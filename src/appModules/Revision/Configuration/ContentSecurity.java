package appModules.Revision.Configuration;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Revision.RV_CreateRevisions;
import pageObjects.BaseClass;
import pageObjects.Revision.RV_ApplyRevision_Page;
import pageObjects.Revision.Configuaration.ContentSecurity_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class ContentSecurity extends psUtility {
	public static String RevisionNUmberGet = "";

	@Test
	public static void Execute() throws Exception {
		// Login to external URL
		
		/*setEnvironment(Constant.ExternalURL);
		psUtility.ExternalLogin(OnboardingConstants.TAUser, OnboardingConstants.ONBPassword);
		Verification2Factor_Authentication.Execute();
		Setup_ChallengeQuestions.Execute();
		RV_CreateRevisions.Execute("Process", "Configuaration");*/
		
		
		dynamicLogin(isElementExists("driver.findElement(By.id(\"SM_CD_TREE_WRK_SM_CD_REV_SECURITY\"))"),
				OnboardingConstants.TAUser, "Process");
		
		// to get the scroll view to top position
				JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver;
				js.executeScript("arguments[0].scrollIntoView();", RV_ApplyRevision_Page.lnk_Return());

		// Create New rivision-Content
		
		ContentSecurity_Page.lnk_Edit().click();
		ContentSecurity_Page.btn_AssignActions().click();
		ContentSecurity_Page.btn_OK().click();
		ContentSecurity_Page.btn_Save().click();
		
		Reporter.log("Content Security Performed Successfully<br>");

	}
}
