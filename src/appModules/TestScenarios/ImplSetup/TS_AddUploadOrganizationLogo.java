package appModules.TestScenarios.ImplSetup;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import appModules.Login.External_LogOut;
import pageObjects.BaseClass;
import pageObjects.TestScenarios.TS_AddUploadOrganizationLogo_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class TS_AddUploadOrganizationLogo extends psUtility {
	
	/**
	 * Test Name      : How to add/upload your organization's logo
	 * Developer      : Gopi
	 * Description    : Login with TA and create a new Revision (Content)
	 *                  Upload a image in the image management box by selecting "add" link
	 *                  
	 * Dependency     : 1) Organization ID, Tenant Admin user is required To execute the script
	 *                  2) Set the connection.Property file  in the folder Files>EnvironemntDetails>Connection.properties
	 *                  3) Upload image should be in  Files>Images with PNG Extension & change the image in RelativePath String  
	 *                   
	 */
@Test
public static void Execute() throws Exception{
	Constant.StopOnFail=false;
	//Login to External URL
		setEnvironment(Constant.ExternalURL);
		psUtility.ExternalLogin(OnboardingConstants.TAUser, OnboardingConstants.ONBPassword);
		Verification2Factor_Authentication.Execute();
		Setup_ChallengeQuestions.Execute();
		//Create a Revision -Content
		TS_AddUploadOrganizationLogo_Page.btn_AddUpdate().click();
		TS_AddUploadOrganizationLogo_Page.btn_AddNewValue().click();
		select(TS_AddUploadOrganizationLogo_Page.sel_RevisionType(), "Content");

		TS_AddUploadOrganizationLogo_Page.txt_Descr().sendKeys("Add new logo");
		TS_AddUploadOrganizationLogo_Page.btn_Save().click();

		String RevisionID = TS_AddUploadOrganizationLogo_Page.GetAttribute_RevisionID().getText();
		Reporter.log("Generated Revision Id :" + RevisionID + "For Image Upload");

		TS_AddUploadOrganizationLogo_Page.btn_Congif().click();
		
		
		TS_AddUploadOrganizationLogo_Page.lnk_Add().click();
		TS_AddUploadOrganizationLogo_Page.txt_Descr120().sendKeys("New logo");
		select(TS_AddUploadOrganizationLogo_Page.sel_ImageType(), "PNG");
		TS_AddUploadOrganizationLogo_Page.btn_Upload1().click();

		/***** File Upload *****/
		eventDriver.unregister(handler);
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.className("bn")));

		String RelativePath = System.getProperty("user.dir") + "\\Files\\Images\\Google.PNG";

		TS_AddUploadOrganizationLogo_Page.txt_FilePath().sendKeys(RelativePath);
		TS_AddUploadOrganizationLogo_Page.btn_Upload2().click();

		eventDriver.register(handler);

		/*********************/
		TS_AddUploadOrganizationLogo_Page.btn_Save1().click();
		
		TS_AddUploadOrganizationLogo_Page.btn_Return().click();
		TS_AddUploadOrganizationLogo_Page.btn_Apply().click();
		TS_AddUploadOrganizationLogo_Page.btn_Ok().click();
		TS_AddUploadOrganizationLogo_Page.btn_Close().click();

		External_LogOut.Execute();
		BaseClass.driver.quit();

		Reporter.log("AddUpload Organization Logo Successfully for RevisionId:" + RevisionID);
		Constant.StopOnFail=true;
}

}
