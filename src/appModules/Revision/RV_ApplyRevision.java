package appModules.Revision;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Login.External_LogOut;
import pageObjects.BaseClass;
import pageObjects.Message_Handler;
import pageObjects.Revision.RV_ApplyRevision_Page;
import utility.OnboardingConstants;
import utility.psUtility;

public class RV_ApplyRevision extends psUtility {
	
	public static String RevisionNo="",FrameSrc="";
	
	@Test
	public static void Execute() throws Exception {
		dynamicLogin(isElementExists("driver.findElement(By.id(\"SM_CD_REV_WRK_SM_CO_RETURN_PB\"))"), OnboardingConstants.TAUser,"Any");
		WebElement element =RV_ApplyRevision_Page.lnk_Return();
		JavascriptExecutor executor = (JavascriptExecutor)BaseClass.driver;
		executor.executeScript("arguments[0].click();", element);
		
			
		//RV_ApplyRevision_Page.lnk_Return().click();
		RV_ApplyRevision_Page.btn_Apply().click();
		RV_ApplyRevision_Page.btn_OK().click();
		Message_Handler.btn_ModalBodyClose().click();
		RevisionNo=RV_ApplyRevision_Page.get_RevisionNumber().getText();
		System.out.println("Revision Number:::::"+RevisionNo);
		Reporter.log("Revision Content Applied Successfully:"+RevisionNo);
		
		RV_CreateRevisions.RevNum="";
		External_LogOut.Execute();
		//BaseClass.driver.quit();
		
		
	}
	
}
