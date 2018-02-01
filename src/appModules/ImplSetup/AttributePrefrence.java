package appModules.ImplSetup;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import pageObjects.BaseClass;
import pageObjects.TestScenarios.TS_AttributePrefrence_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class AttributePrefrence extends psUtility{
	
	
	/**
	 * Test Name      : How to change attribute preferences
	 * Developer      : Rahul
	 * Description    : Login with TA
	 *                  Navigate to Attribute preference  and change the preference 
	 *                  
	 * Dependency     : 1) Organization ID, Tenant Admin user is required To execute the script
	 *                  2) Set the connection.Property file  in the folder Files>EnvironemntDetails>Connection.properties
	 *                    
	 *                   
	 */
	@Test
	public static void Execute() throws Exception {
		if(!isElementExists("driver.findElement(By.id(\"configMenu\"))")) {	
			BaseClass.driver.quit();
			//Dependency TA
			setEnvironment(Constant.ExternalURL);
			psUtility.ExternalLogin(OnboardingConstants.TAUser, OnboardingConstants.ONBPassword);
			Verification2Factor_Authentication.Execute();
			Setup_ChallengeQuestions.Execute();
		}	
	    // Navigate to Attribute preference and change the preferences
		TS_AttributePrefrence_Page.Lnk_ConfigMenu().click();
		TS_AttributePrefrence_Page.Lnk_More().click();
		TS_AttributePrefrence_Page.Lnk_AttributePrefrence().click();
		TS_AttributePrefrence_Page.txt_BusinessUnit().sendKeys("Division");
		//TS_AttributePrefrence_Page.chk_invitatioField_sp().click();
		//TS_AttributePrefrence_Page.chk_CJDField_sp().click();
		TS_AttributePrefrence_Page.txt_overridelabel().sendKeys("Benefit Class");
		TS_AttributePrefrence_Page.chk_invitatioField().click();
		TS_AttributePrefrence_Page.chk_CJDField().click();
		//TS_AttributePrefrence_Page.chk_Required().click();
		/*TS_AttributePrefrence_Page.btn_up_EC().click();
		//TS_AttributePrefrence_Page.btn_up_EC().click();
		TS_AttributePrefrence_Page.chk_Required_EC().click();*/
		TS_AttributePrefrence_Page.btn_save().click();
		
		Reporter.log("Attribute Prefrence Changed Performed Successfully<br>");
	}

}
