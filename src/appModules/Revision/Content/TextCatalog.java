package appModules.Revision.Content;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Revision.RV_CreateRevisions;
import pageObjects.BaseClass;
import pageObjects.Revision.Content.RV_BGChkVendor_Page;
import pageObjects.Revision.Content.RV_PDFTemplate_Page;
import pageObjects.Revision.Content.RV_TextCatalog_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class TextCatalog extends psUtility {
	@Test
	public static void Execute() throws Exception {
		/*setEnvironment(Constant.ExternalURL);
		RV_CreateRevisions.RevNum = "0000000006";
		RV_CreateRevisions.RevisnType = "Content";*/

		dynamicLogin(isElementExists("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX10\"))"),
				OnboardingConstants.TAUser, "Content");
		RV_TextCatalog_Page.lnk_Add().click();
		RV_TextCatalog_Page.txt_Description().sendKeys("DemoTextCatalog");

		Thread.sleep(2000);
		/*****Rich Text******/
		RV_TextCatalog_Page.Element_DivId().click();

		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));

		WebElement element = BaseClass.driver    
				.findElement(By.cssSelector(".cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders"));
		/*JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].innerHTML = arguments[1]", element, "Demo Test");*/
		
		
		element.sendKeys("Dear Associate,\r\n" + 
				"\r\n" + 
				"It is our pleasure to welcome you as a new member of SmartERP Solutions Inc.!\r\n" + 
				"\r\n" + 
				"As part of our relationship, SmartERP Solutions Inc. will issue weekly paychecks as well as make all required and/or authorized deductions during the period that you work for us. Attached you will find an enrollment packet that must be completed. After you have received your first paycheck, you should carefully review all information including tax status, name and address to verify that your tax deduction preferences have been followed.\r\n" + 
				"\r\n" + 
				"Once again, we are delighted that you have become associated with SmartERP Solutions Inc. If you have any questions during your assignment, please do not hesitate to call us.\r\n" + 
				"\r\n" + 
				"Sincerely,\r\n" + 
				"SmartERP Solutions Inc. Team");
        /***********/
		RV_TextCatalog_Page.btn_Save().click();

		Reporter.log("Text Catalog Created Successfully<br>");


	}
}
