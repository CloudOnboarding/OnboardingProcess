package appModules.Revision.Content;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Revision.RV_CreateRevisions;
import pageObjects.BaseClass;
import pageObjects.Revision.Content.SmartForm_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class AddSmartForm extends psUtility {
	@Test
	public static void Execute() throws Exception { // Defining a notification template in manage content revision
		/*setEnvironment(Constant.ExternalURL);
     	RV_CreateRevisions.RevNum = "0000000003";
		RV_CreateRevisions.RevisnType = "Content";*/
		
		
		dynamicLogin(isElementExists("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX11\"))"),
				OnboardingConstants.TAUser, "Content");
		SmartForm_Page.lnk_AddSmartForm().click();

		SmartForm_Page.txt_FormTitle().sendKeys("OSHA Field Safety and Health Manual_SMARTFORM");
		// SmartForm_Page.txt_lkpDesc().sendKeys("Tell us about your self");
		select(SmartForm_Page.sel_ParticipantPool(), "New Hire");
		select(SmartForm_Page.sel_Required(), "Required");
		SmartForm_Page.txt_SaveButton().sendKeys("Submit");

		// Enable I Agree
		SmartForm_Page.chkbx_EnableAgree().click();
		SmartForm_Page.txt_AcknowledgeText()
				.sendKeys("It's mandatory for you to acknowledge receiving and reading this policy");

		SmartForm_Page.rdBtn_Yes().click();
		select(SmartForm_Page.sel_PrintSource(), "Current Form");

		// Create Form Fields
		SmartForm_Page.lnk_CreateFormField().click();
		setCurrentbrowser();
		SmartForm_Page.btn_AddNewValue().click();
		SmartForm_Page.txt_FldDesc().sendKeys("First Name");
		select(SmartForm_Page.sel_FldType(), "Long Character");
		SmartForm_Page.btn_Save().click();
		String Fld1=SmartForm_Page.get_FldName().getText();
		System.out.println("fld1::::"+Fld1);
		SmartForm_Page.btn_Add().click();

		SmartForm_Page.txt_FldDesc().sendKeys("Last Name");
		select(SmartForm_Page.sel_FldType(), "Long Character");
		SmartForm_Page.btn_Save().click();
		String Fld2=SmartForm_Page.get_FldName().getText();
		System.out.println("fld1::::"+Fld2);
		
		/*SmartForm_Page.btn_Add().click();
		 SmartForm_Page.txt_FldDesc().sendKeys("Fact");
		select(SmartForm_Page.sel_FldType(), "Long Character");
		SmartForm_Page.btn_Save().click();
		SmartForm_Page.btn_Add().click();

		SmartForm_Page.txt_FldDesc().sendKeys("6 Words");
		select(SmartForm_Page.sel_FldType(), "Long Character");
		SmartForm_Page.btn_Save().click();*/
		BaseClass.driver.close();
		BaseClass.driver.switchTo().window(parentWindowHnd);

		// Enable Attachment
		SmartForm_Page.chkbx_EnableAttachments().click();
		/*
		 * SmartForm_Page.txt_AttachmentID().sendKeys("BG_AUTH");//have to pass the flow
		 * attanment id
		 */
		SmartForm_Page.btn_RespTable().click();
		SmartForm_Page.btn_OK("Add Table").click();

		// eventDriver.unregister(handler);
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));
		// SmartForm_Page.element_Column1().click();

		JavascriptExecutor executor = (JavascriptExecutor) BaseClass.driver;
		executor.executeScript("arguments[0].innerHTML =arguments[1];", SmartForm_Page.element_Column1(),
				"OSHA Field Safety and Health Manual");

		executor.executeScript("arguments[0].innerHTML =arguments[1];", SmartForm_Page.element_Column2(), "");

		SmartForm_Page.element_Column2().click();

		SmartForm_Page.Element_DivId().click();
		eventDriver.unregister(handler);

		// Right click and set column properties
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));
		SmartForm_Page.element_Column2();
		Actions action = new Actions(BaseClass.driver);
		/*action.contextClick(SmartForm_Page.element_Column2()).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
				.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).perform();*/
		
		//Right Click for Column Properties
		action.contextClick(SmartForm_Page.element_Column2()).perform();
		SmartForm_Page.Element_DivId();
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector(".cke_panel_frame")));
		SmartForm_Page.lnk_RightMenu("Column Properties").click();

		SmartForm_Page.txt_Width().clear();
		SmartForm_Page.txt_Width().sendKeys("40%");
		SmartForm_Page.btn_OK("Properties").click();

		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));
		SmartForm_Page.element_Column2().click();

		// Static Image
		SmartForm_Page.btn_StaticImg().click();
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.xpath("//*[@id=\"SMCOGalleryWrapper\"]/iframe")));
		SmartForm_Page.img_logo("CompanyLogo").click();

		SmartForm_Page.Element_DivId().click();
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));
		SmartForm_Page.element_Column2();
		/*// Actions action = new Actions(BaseClass.driver);
		action.contextClick(SmartForm_Page.element_Column2()).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP)
				.sendKeys(Keys.ARROW_UP).sendKeys(Keys.RETURN).perform();*/
		
		//Right Click for Column Properties
				action.contextClick(SmartForm_Page.element_Column2()).perform();
				SmartForm_Page.Element_DivId();
				BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector(".cke_panel_frame")));
				SmartForm_Page.lnk_RightMenu("Add Row Below").click();

		/** 2nd Row **/
		/*
		 * //SmartForm_Page.Ele_trTabout().click();
		 * SmartForm_Page.btn_RespTable().click();
		 * SmartForm_Page.btn_OK("Add Table").click();
		 */
		SmartForm_Page.Element_DivId().click();
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));
		// SmartForm_Page.element_Column1().click();

		executor.executeScript("arguments[0].innerHTML =arguments[1];", SmartForm_Page.Ele_SetCellVal(2, 1),
				"Purpose:");

		executor.executeScript("arguments[0].innerHTML =arguments[1];", SmartForm_Page.Ele_SetCellVal(2, 2), "This Instruction establishes a Safety and Health Management System\r\n" + 
				"(SHMS\r\n" + 
				") for Occupational Safety and Health Administration (OSHA) \r\n" + 
				"employees.");

		SmartForm_Page.Element_DivId().click();
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));
		SmartForm_Page.element_Column2();
		/*// Actions action = new Actions(BaseClass.driver);
		action.contextClick(SmartForm_Page.Ele_SetCellVal(2, 2)).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP)
				.sendKeys(Keys.ARROW_UP).sendKeys(Keys.RETURN).perform();
		*/
		
		//Right Click for Column Properties
		action.contextClick(SmartForm_Page.Ele_SetCellVal(2, 2)).perform();
		SmartForm_Page.Element_DivId();
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector(".cke_panel_frame")));
		SmartForm_Page.lnk_RightMenu("Add Row Below").click();
		
		SmartForm_Page.Element_DivId().click();
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));
		
		//Right Click for Column Properties
				action.contextClick(SmartForm_Page.Ele_SetCellVal(3, 2)).perform();
				SmartForm_Page.Element_DivId();
				BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector(".cke_panel_frame")));
				SmartForm_Page.lnk_RightMenu("Add Row Below").click();
		
		
		/** 3rd Row **/
		SmartForm_Page.Element_DivId().click();
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));

		executor.executeScript("arguments[0].innerHTML =arguments[1];", SmartForm_Page.Ele_SetCellVal(3, 1),
				"First Name");

		executor.executeScript("arguments[0].innerHTML =arguments[1];", SmartForm_Page.Ele_SetCellVal(3, 2), "");

		SmartForm_Page.Element_DivId().click();
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));
		//SmartForm_Page.element_Column2().click();
		SmartForm_Page.Ele_SetCellVal(3, 2).click();
		SmartForm_Page.btn_InsrtFormField().click();
		select(SmartForm_Page.sel_InputType(),"Long Edit Box");
		SmartForm_Page.txt_Form_Field().clear();
		SmartForm_Page.txt_Form_Field().sendKeys(Fld1.trim());
		select(SmartForm_Page.sel_LabelType(),"None");
		SmartForm_Page.btn_OK("Insert Form Field").click();
		// Actions action = new Actions(BaseClass.driver);
		
		/*	*//** 4th Row **/

		SmartForm_Page.Element_DivId().click();
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector("div[id^='cke_']>iframe")));

		executor.executeScript("arguments[0].innerHTML =arguments[1];", SmartForm_Page.Ele_SetCellVal(4, 1),
				"Last Name");

		executor.executeScript("arguments[0].innerHTML =arguments[1];", SmartForm_Page.Ele_SetCellVal(4, 2), "");
		SmartForm_Page.Ele_SetCellVal(4, 2).click();
		SmartForm_Page.btn_InsrtFormField().click();
		select(SmartForm_Page.sel_InputType(),"Long Edit Box");// Long Edit Box
		SmartForm_Page.txt_Form_Field().clear();
		SmartForm_Page.txt_Form_Field().sendKeys(Fld2.trim());
		select(SmartForm_Page.sel_LabelType(),"None");
		SmartForm_Page.btn_OK("Insert Form Field").click();
		eventDriver.register(handler);
		SmartForm_Page.txt_AttachmentID().sendKeys("BG_AUTH");
		
		SmartForm_Page.btn_Save().click();

		Reporter.log("SmartForm Completed Successfully<br>");
	}
}
