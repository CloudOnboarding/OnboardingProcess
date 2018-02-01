package appModules.TestScenarios.ImplSetup;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Login.External_LogOut;
import pageObjects.BaseClass;
import pageObjects.TestScenarios.TS_NewAttributeValue_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class TS_NewAttributeValue extends psUtility {
	
	
	/**
	 * Test Name      : How to add a new attribute value directly in a Configuration revision
	 * Developer      : Rahul
	 * Description    : Login with TA and create a new Revision (Content)
	 *                  Create a new attribute for department- as child
	 *                  
	 * Dependency     : 1) Organization ID, Tenant Admin user is required To execute the script
	 *                  2) Set the connection.Property file  in the folder Files>EnvironemntDetails>Connection.properties
	 *                   
	 */
	@Test
	public static void Execute() throws Exception {
		Constant.StopOnFail=false;
		//Login to External URL
		setEnvironment(Constant.ExternalURL);
		psUtility.ExternalLogin(OnboardingConstants.TAUser, OnboardingConstants.ONBPassword);
		Verification2Factor_Authentication.Execute();
		Setup_ChallengeQuestions.Execute();
		
		//Create a new Revision-configuration
		TS_NewAttributeValue_Page.lnk_ConfigMenu().click();
		TS_NewAttributeValue_Page.lnk_AddRevision().click();
		TS_NewAttributeValue_Page.lnk_Add().click();
		select(TS_NewAttributeValue_Page.sel_RevisionType(),"Process");
		TS_NewAttributeValue_Page.txt_Descr().sendKeys("Add New Attribute");
		TS_NewAttributeValue_Page.btn_reserve().click();
		String RevisionID=TS_NewAttributeValue_Page.getAttribute_RevisionID().getText();
		System.out.println(RevisionID);
		Reporter.log("New RevisionID is created:"+RevisionID+" <br>");
		TS_NewAttributeValue_Page.btn_Config().click();
		
		//Add a child attribute for department
		TS_NewAttributeValue_Page.lnk_Department().click();
		TS_NewAttributeValue_Page.lnk_ExpandArrow().click();
		TS_NewAttributeValue_Page.lnk_BusinessDevelopment().click();
		TS_NewAttributeValue_Page.lnk_insertchild().click();
		TS_NewAttributeValue_Page.txt_LongDesc().sendKeys("Inside Sales");
		TS_NewAttributeValue_Page.txt_Desc().sendKeys("Inside Sales");
		TS_NewAttributeValue_Page.txt_DesiredLookUpDesc().sendKeys("Inside Sales");
		TS_NewAttributeValue_Page.btn_save().click();
		
		//Apply the new revision -configuration
		WebElement element =TS_NewAttributeValue_Page.btn_ReturnToManageRevision();
		JavascriptExecutor executor = (JavascriptExecutor)BaseClass.driver;
		executor.executeScript("arguments[0].click();", element);
		
		TS_NewAttributeValue_Page.btn_Apply().click();
		TS_NewAttributeValue_Page.btn_Ok().click();
		TS_NewAttributeValue_Page.btn_Close().click();
		
		//External URL logout
		External_LogOut.Execute();
		BaseClass.driver.quit();
		
		Reporter.log("New Department Attribute Added For Revision"+RevisionID+"<br>");
		Constant.StopOnFail=true;
		
		
		
	}
	
	

}
