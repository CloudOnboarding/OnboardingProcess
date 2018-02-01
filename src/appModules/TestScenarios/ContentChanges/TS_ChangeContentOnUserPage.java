package appModules.TestScenarios.ContentChanges;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Verification2Factor_Authentication;
import pageObjects.BaseClass;
import pageObjects.TestScenarios.TS_ChangeContentOnUserPage_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class TS_ChangeContentOnUserPage extends psUtility {
	
	
@Test
public static void Execute() throws Exception{
	
	//Login to External URL
		setEnvironment(Constant.ExternalURL);
		psUtility.ExternalLogin(OnboardingConstants.TAUser, OnboardingConstants.ONBPassword);
		Verification2Factor_Authentication.Execute();
		//Setup_ChallengeQuestions.Execute();
		//Create a Revision -Content
		 
		
		//	RV_CreateRevisions.Execute("Content", "Add Image for TA home Page");
	    TS_ChangeContentOnUserPage_Page.Lnk_ConfigMenu().click();
		TS_ChangeContentOnUserPage_Page.btn_AddUpdate().click();
		TS_ChangeContentOnUserPage_Page.btn_AddNewValue().click();
		select(TS_ChangeContentOnUserPage_Page.sel_RevisionType(), "Content");

		TS_ChangeContentOnUserPage_Page.txt_Descr().sendKeys("Add Image for TA home Page");
		TS_ChangeContentOnUserPage_Page.btn_Save().click();

		String RevisionID = TS_ChangeContentOnUserPage_Page.GetAttribute_RevisionID().getText();
		Reporter.log("Generated Revision Id :" + RevisionID + "For Image Upload");

		TS_ChangeContentOnUserPage_Page.btn_Congif().click();
		TS_ChangeContentOnUserPage_Page.lnk_Add().click();
		TS_ChangeContentOnUserPage_Page.txt_Descr120().sendKeys("Active");
		select(TS_ChangeContentOnUserPage_Page.sel_ImageType(), "PNG");
		TS_ChangeContentOnUserPage_Page.btn_Upload1().click();

		//***** File Upload *****/
		eventDriver.unregister(handler);
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.className("bn")));

		String RelativePath = System.getProperty("user.dir") + "\\Files\\Images\\Active.png.png";

		TS_ChangeContentOnUserPage_Page.txt_FilePath().sendKeys(RelativePath);
		TS_ChangeContentOnUserPage_Page.btn_Upload2().click();

		eventDriver.register(handler);

		TS_ChangeContentOnUserPage_Page.btn_Save1().click();
		WebElement element =TS_ChangeContentOnUserPage_Page.btn_Return();
		JavascriptExecutor executor = (JavascriptExecutor)BaseClass.driver;
		executor.executeScript("arguments[0].click();", element);
		TS_ChangeContentOnUserPage_Page.btn_Apply().click();
		TS_ChangeContentOnUserPage_Page.btn_Ok().click();
		TS_ChangeContentOnUserPage_Page.btn_Close().click();  ;
		
		
		TS_ChangeContentOnUserPage_Page.Lnk_ConfigMenu().click();
		TS_ChangeContentOnUserPage_Page.lnk_OrgnazationHomepageConfig().click();
		TS_ChangeContentOnUserPage_Page.btn_search().click();
		TS_ChangeContentOnUserPage_Page.txt_QuickFilter().sendKeys("ACTIVE_REGULAR_TA_HMPG");
		TS_ChangeContentOnUserPage_Page.lnk_HomePageID().click();
		TS_ChangeContentOnUserPage_Page.MouseHr_columnActions().click();
		TS_ChangeContentOnUserPage_Page.btn_EditContent().click();
		TS_ChangeContentOnUserPage_Page.btn_imageID().click();
		TS_ChangeContentOnUserPage_Page.lnk_lookupImg().click();
		JavascriptExecutor js = (JavascriptExecutor)BaseClass.driver;
		js.executeScript("arguments[0].click();",TS_ChangeContentOnUserPage_Page.btn_ok1());
		js.executeScript("arguments[0].click();",TS_ChangeContentOnUserPage_Page.btn_Save1());
		
		
		TS_ChangeContentOnUserPage_Page.lnk_Home().click();
//		RV_CreateRevisions.Execute("Content", "Add Link to SmartOnboarding Documentation");
			TS_ChangeContentOnUserPage_Page.Lnk_ConfigMenu().click();
			TS_ChangeContentOnUserPage_Page.btn_AddUpdate().click();
			TS_ChangeContentOnUserPage_Page.btn_AddNewValue().click();
			select(TS_ChangeContentOnUserPage_Page.sel_RevisionType(), "Content");
			TS_ChangeContentOnUserPage_Page.txt_Descr().sendKeys("Add Link to SmartOnboarding Documentation");
			TS_ChangeContentOnUserPage_Page.btn_Save().click();
			TS_ChangeContentOnUserPage_Page.btn_Congif().click();
			TS_ChangeContentOnUserPage_Page.lnk_AddMixedContent().click();
			TS_ChangeContentOnUserPage_Page.txt_Description().sendKeys("Link to SmartOnboarding Documentation");
			TS_ChangeContentOnUserPage_Page.txt_ContentLabel().sendKeys("Link to SmartOnboarding Documentation");
			TS_ChangeContentOnUserPage_Page.lnk_ContentExplanation().click();
			//Rich Text Editor
			BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector(".cke_wysiwyg_frame.cke_reset")));
			TS_ChangeContentOnUserPage_Page.lnk_RichTextContent().sendKeys("Click on Link below to View the SmartOnboarding Documentation",Keys.ENTER,"Smart OnBoarding Documentation",Keys.chord(Keys.SHIFT, Keys.HOME));
			TS_ChangeContentOnUserPage_Page.lnk_Link().click();
			Thread.sleep(1000);
			TS_ChangeContentOnUserPage_Page.txt_url().sendKeys("docs.smarterp.com");
			TS_ChangeContentOnUserPage_Page.lnk_target().click();
			select(TS_ChangeContentOnUserPage_Page.sel_target(), "New Window (_blank)");
			Thread.sleep(2000);
			js.executeScript("arguments[0].click();",TS_ChangeContentOnUserPage_Page.btn_okTarget());
			TS_ChangeContentOnUserPage_Page.btn_okSave().click();
			eventDriver.unregister(handler);
			TS_ChangeContentOnUserPage_Page.btn_okSave().click();
			eventDriver.register(handler);
			js.executeScript("arguments[0].click();", TS_ChangeContentOnUserPage_Page.btn_Return());
			TS_ChangeContentOnUserPage_Page.btn_Apply().click();
			TS_ChangeContentOnUserPage_Page.btn_Ok().click();
			TS_ChangeContentOnUserPage_Page.btn_Close().click();    
			
     		TS_ChangeContentOnUserPage_Page.Lnk_ConfigMenu().click();
			TS_ChangeContentOnUserPage_Page.lnk_OrgnazationHomepageConfig().click();
			TS_ChangeContentOnUserPage_Page.btn_search().click();
			TS_ChangeContentOnUserPage_Page.txt_QuickFilter().sendKeys("ACTIVE_REGULAR_TA_HMPG");
			TS_ChangeContentOnUserPage_Page.lnk_HomePageID().click();
			js.executeScript("arguments[0].scrollIntoView();",TS_ChangeContentOnUserPage_Page.MouseHr_GearICon());
			//to get the scroll view to top position
			Thread.sleep(3000);
			TS_ChangeContentOnUserPage_Page.MouseHr_columnActions2().click();
			Thread.sleep(2000);
			js.executeScript("arguments[0].click();",TS_ChangeContentOnUserPage_Page.btn_AddColumn());
			select(TS_ChangeContentOnUserPage_Page.sel_DrivenByCatagory(), "No");
			select(TS_ChangeContentOnUserPage_Page.sel_ContentType(), "Mixed Content");
			TS_ChangeContentOnUserPage_Page.btn_ContentID().click();
			eventDriver.unregister(handler);
			TS_ChangeContentOnUserPage_Page.txt_DescSearch().sendKeys("Link to SmartOnboarding Documentation",Keys.ENTER);
			eventDriver.register(handler);
			TS_ChangeContentOnUserPage_Page.lnk_Description().click();
			TS_ChangeContentOnUserPage_Page.txt_width().sendKeys("25");
			TS_ChangeContentOnUserPage_Page.txt_PaddingTop().sendKeys("20");
			TS_ChangeContentOnUserPage_Page.txt_PaddingRight().sendKeys("20");
			TS_ChangeContentOnUserPage_Page.txt_PaddingBottom().sendKeys("20");
			TS_ChangeContentOnUserPage_Page.txt_PaddingLeft().sendKeys("20");
			TS_ChangeContentOnUserPage_Page.btn_ok1().click();
			
			TS_ChangeContentOnUserPage_Page.MouseHr_News().click();
			js.executeScript("arguments[0].click();",TS_ChangeContentOnUserPage_Page.btn_EditContent());
			TS_ChangeContentOnUserPage_Page.txt_width().sendKeys("25");
			TS_ChangeContentOnUserPage_Page.btn_ok1().click();
			
			TS_ChangeContentOnUserPage_Page.MouseHr_FAQ().click();
			js.executeScript("arguments[0].click();",TS_ChangeContentOnUserPage_Page.btn_EditContent());
			TS_ChangeContentOnUserPage_Page.txt_width().sendKeys("25");
			TS_ChangeContentOnUserPage_Page.btn_ok1().click();
			
			TS_ChangeContentOnUserPage_Page.MouseHr_TrainingVideos().click();
			js.executeScript("arguments[0].click();",TS_ChangeContentOnUserPage_Page.btn_EditContent());
			TS_ChangeContentOnUserPage_Page.txt_width().sendKeys("25");
			TS_ChangeContentOnUserPage_Page.btn_ok1().click();
			TS_ChangeContentOnUserPage_Page.btn_Save1().click();
			
			TS_ChangeContentOnUserPage_Page.lnk_Home().click();   
		    TS_ChangeContentOnUserPage_Page.lnk_OnboardingDocument().click();
		    TS_ChangeContentOnUserPage_Page.lnk_OnboardingDocumentURL().click();
			
			
			
			
		    Reporter.log("Change Content On User Page Completed Successfully<br>");
		
		    
		
}

}
