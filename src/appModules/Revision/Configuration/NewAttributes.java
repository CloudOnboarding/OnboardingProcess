package appModules.Revision.Configuration;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.TestScenarios.TS_NewAttributeValue_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class NewAttributes extends psUtility {

	@Test
	public static void Execute() throws Exception {
		// Add a child attribute for department
		/*	setEnvironment(Constant.ExternalURL);
		RV_CreateRevisions.RevNum = "0000000004";
		RV_CreateRevisions.RevisnType = "Process";
*/
		dynamicLogin(isElementExists("driver.findElement(By.linkText(\"Department\"))"), OnboardingConstants.TAUser,"Process");
		TS_NewAttributeValue_Page.lnk_Department().click();
		TS_NewAttributeValue_Page.lnk_ExpandArrow().click();
		TS_NewAttributeValue_Page.lnk_BusinessDevelopment().click();
		TS_NewAttributeValue_Page.lnk_insertchild().click();
		TS_NewAttributeValue_Page.txt_LongDesc().sendKeys("Inside Sales");
		TS_NewAttributeValue_Page.txt_Desc().sendKeys("Inside Sales");
		TS_NewAttributeValue_Page.txt_DesiredLookUpDesc().sendKeys("Inside Sales");
		TS_NewAttributeValue_Page.btn_save().click();
		
		Reporter.log("Add New Attribute Performed Successfully<br>");

	}
}
