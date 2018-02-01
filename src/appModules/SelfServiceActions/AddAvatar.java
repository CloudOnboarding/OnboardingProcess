package appModules.SelfServiceActions;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import pageObjects.BaseClass;
import pageObjects.TestScenarios.TS_AddAvatar_Page;
import pageObjects.TestScenarios.TS_AddUploadOrganizationLogo_Page;
import pageObjects.TestScenarios.TS_ChangeEpin_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class AddAvatar extends psUtility {
	
	/**
	 * Test Name      : Add Avatar
	 * Developer      : Srinivas
	 * Description    : Navigate to My profile and upload a pic for Add Avatar
	 *                  
	 *                  
	 * Dependency     : 1)ORId is required 
	 *                  2)TA is required
	 *                  
	 *                   
	 */
	@Test
	public static void Execute() throws Exception {
		
	//	setEnvironment(Constant.ExternalURL);
		if(!isElementExists("driver.findElement(By.xpath(\"//*[@sm-parent='accountMenu']\"))")) {
			BaseClass.driver.quit();
			// Login to external URL
			setEnvironment(Constant.ExternalURL);
	
			psUtility.ExternalLogin(OnboardingConstants.TAUser, OnboardingConstants.ONBPassword);
			Verification2Factor_Authentication.Execute();
			Setup_ChallengeQuestions.Execute();
		}
		// Navigate to my profile to AddAvatar
		TS_ChangeEpin_Page.lnk_Accountname().click();
		TS_ChangeEpin_Page.lnk_MyProfile().click();

		TS_AddAvatar_Page.lnk_AddAvatar().click();
		select(TS_AddAvatar_Page.sel_ImageType(), "PNG Files [*.png]");
		TS_AddAvatar_Page.btn_Upload1().click();
		
		
		/***** File Upload *****/
		eventDriver.unregister(handler);
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.className("bn")));
		String RelativePath = System.getProperty("user.dir") + "\\Files\\Images\\Photo.PNG";

		TS_AddAvatar_Page.txt_FilePath().sendKeys(RelativePath);
		TS_AddAvatar_Page.btn_Upload2().click();
		TS_AddAvatar_Page.btn_Save().click();

		eventDriver.register(handler);

		/*********************/
		Reporter.log("AddAvatar Performed Successfully<br>");
	}
}
