package appModules.Revision.Content;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.Message_Handler;
import pageObjects.Revision.RV_ApplyRevision_Page;
import utility.psUtility;

public class RV_ApplyRevision_content extends psUtility {
	
	public static String RevisionNo="";
	
	@Test
	public static void Execute() throws Exception {
		/*//to get the scroll view to top position
		JavascriptExecutor js = (JavascriptExecutor)BaseClass.driver;
		js.executeScript("arguments[0].scrollIntoView();", RV_AddAction_Page.span_page_title());*/
		Thread.sleep(1000);		
		RV_ApplyRevision_Page.lnk_Return().click();
		RV_ApplyRevision_Page.btn_Apply().click();
		RV_ApplyRevision_Page.btn_OK().click();
		Message_Handler.btn_ModalBodyClose().click();
		RevisionNo=RV_ApplyRevision_Page.get_RevisionNumber().getText();
		System.out.println("Revision Number:::::"+RevisionNo);
		Reporter.log("Revision Content Created Successfully:"+RevisionNo);
		
		
	}
}
