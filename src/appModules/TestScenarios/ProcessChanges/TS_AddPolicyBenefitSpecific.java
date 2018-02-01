package appModules.TestScenarios.ProcessChanges;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import pageObjects.BaseClass;
import pageObjects.Message_Handler;
import pageObjects.TestScenarios.TS_AddPolicyBenefitSpecific_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;


public class TS_AddPolicyBenefitSpecific extends psUtility {
	@Test
	public static void Execute() throws Exception {
		Constant.StopOnFail=false;
		//have to change txt_LookUpDesc every time before running the script.
		//Dependency TA
				setEnvironment(Constant.ExternalURL);
				psUtility.ExternalLogin(OnboardingConstants.TAUser, OnboardingConstants.ONBPassword);
				Verification2Factor_Authentication.Execute();
				Setup_ChallengeQuestions.Execute();

		TS_AddPolicyBenefitSpecific_Page.Lnk_ConfigMenu().click();
		TS_AddPolicyBenefitSpecific_Page.Lnk_AddRevision().click();
		TS_AddPolicyBenefitSpecific_Page.lnk_Add().click();
		select(TS_AddPolicyBenefitSpecific_Page.sel_RevisionType(),"Content");
		TS_AddPolicyBenefitSpecific_Page.txt_Descr().sendKeys("Company Policy");
		TS_AddPolicyBenefitSpecific_Page.btn_reserve().click();
		TS_AddPolicyBenefitSpecific_Page.btn_Config().click();
		TS_AddPolicyBenefitSpecific_Page.lnk_AddSmartForm().click();
		TS_AddPolicyBenefitSpecific_Page.txt_FormTitle().sendKeys("Company Policy");
		TS_AddPolicyBenefitSpecific_Page.txt_LookupDesc().sendKeys("Company5");
		select(TS_AddPolicyBenefitSpecific_Page.Sel_ParticipentPool(),"New Hire");
		select(TS_AddPolicyBenefitSpecific_Page.Sel_RequiredOptional(),"Required");
		TS_AddPolicyBenefitSpecific_Page.Txt_OverrideSave().sendKeys("Acknowledge");
		
		//Rich Text Editor
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.cssSelector(".cke_wysiwyg_frame.cke_reset")));
		WebElement element =BaseClass.driver.findElement(By.cssSelector(".cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders>div"));
		JavascriptExecutor executor = (JavascriptExecutor)BaseClass.driver;
		executor.executeScript("arguments[0].innerHTML = arguments[1]", element,"Its company Policy to inform your manager of safety issues you observr. Not doing so can rersultin discpinary action to enddismissal.<br><br><br>Let's keeo our workplace safe.!!<br<br><br>Thanks.<br>Your Company Team");
		Thread.sleep(2000);
		TS_AddPolicyBenefitSpecific_Page.Btn_Save().click();
		//TS14_AddPolicyBenefitSpecific_Page.btn_ReturnToManageRevision().click();
		
		WebElement element1 =TS_AddPolicyBenefitSpecific_Page.btn_ReturnToManageRevision();
		JavascriptExecutor executor1 = (JavascriptExecutor)BaseClass.driver;
		executor1.executeScript("arguments[0].click();", element1);	
		
		TS_AddPolicyBenefitSpecific_Page.btn_Apply().click();
		TS_AddPolicyBenefitSpecific_Page.btn_ok().click();
		TS_AddPolicyBenefitSpecific_Page.Btn_Close().click();
		
		Thread.sleep(2000);
		TS_AddPolicyBenefitSpecific_Page.Lnk_ConfigMenu().click();
		TS_AddPolicyBenefitSpecific_Page.Lnk_AddRevision().click();
		TS_AddPolicyBenefitSpecific_Page.lnk_Add().click();
		select(TS_AddPolicyBenefitSpecific_Page.sel_RevisionType(),"Configuration");
		TS_AddPolicyBenefitSpecific_Page.txt_Descr().sendKeys("Company Policy");
		TS_AddPolicyBenefitSpecific_Page.btn_reserve().click();
		TS_AddPolicyBenefitSpecific_Page.btn_Config().click();
		TS_AddPolicyBenefitSpecific_Page.lnk_Company().click();
		TS_AddPolicyBenefitSpecific_Page.lnk_Retail().click();
		TS_AddPolicyBenefitSpecific_Page.lnk_Policy().click();
		select(TS_AddPolicyBenefitSpecific_Page.Sel_Action(),"Company5");
		TS_AddPolicyBenefitSpecific_Page.Btn_Save().click();
		TS_AddPolicyBenefitSpecific_Page.lnk_ManageContentSecurity().click();
		TS_AddPolicyBenefitSpecific_Page.Btn_AssignAction().click();
		TS_AddPolicyBenefitSpecific_Page.Btn_ok().click();
		TS_AddPolicyBenefitSpecific_Page.Btn_Save().click();
		TS_AddPolicyBenefitSpecific_Page.lnk_ManageBusinessRules().click();
	//	TS14_AddPolicyBenefitSpecific_Page.lable_CompanyPolicies()
		TS_AddPolicyBenefitSpecific_Page.Btn_Save().click();
		//TS14_AddPolicyBenefitSpecific_Page.btn_ReturnToManageRevision().click();
		WebElement element2 =TS_AddPolicyBenefitSpecific_Page.btn_ReturnToManageRevision();
		@SuppressWarnings("unused")
		JavascriptExecutor executor2 = (JavascriptExecutor)BaseClass.driver;
		executor1.executeScript("arguments[0].click();", element2);	
		
		String ConfirmationMessage = Message_Handler.get_ModalBodyText().getText();
		Reporter.log("ConfirmMessage:::" + ConfirmationMessage + "<br>");
		Message_Handler.btn_OK().click();
		
		Message_Handler.btn_ModalBodyClose().click();
		
		BaseClass.driver.quit();
		Reporter.log("TenantUser Id:" + OnboardingConstants.TAUser + " is create by TA<br>");
		Constant.StopOnFail=true;
		
		
		
		
		
		
		
	}

}
