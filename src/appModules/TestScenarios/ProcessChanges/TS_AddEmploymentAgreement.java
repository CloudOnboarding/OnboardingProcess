package appModules.TestScenarios.ProcessChanges;

import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Setup_ChallengeQuestions;
import appModules.Verification2Factor_Authentication;
import pageObjects.BaseClass;
import pageObjects.TestScenarios.TS_AddEmploymentAgreement_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class TS_AddEmploymentAgreement extends psUtility {
	@Test
	public static void Execute() throws Exception {
		Constant.StopOnFail=false;
		// have to change txt_LookUpDesc every time before running the script.
		// Dependency TA
		setEnvironment(Constant.ExternalURL);
		psUtility.ExternalLogin(OnboardingConstants.TAUser, OnboardingConstants.ONBPassword);
		Verification2Factor_Authentication.Execute();
		Setup_ChallengeQuestions.Execute();
		TS_AddEmploymentAgreement_Page.Lnk_AddRevision().click();
		TS_AddEmploymentAgreement_Page.btn_Add().click();
		select(TS_AddEmploymentAgreement_Page.sel_RevisionType(), "Configuration");
		TS_AddEmploymentAgreement_Page.txt_Descr().sendKeys("Create A New Employment Agreement");
		TS_AddEmploymentAgreement_Page.btn_reserve().click();
		TS_AddEmploymentAgreement_Page.btn_Config().click();
		TS_AddEmploymentAgreement_Page.lnk_EmplAgreement().click();
		TS_AddEmploymentAgreement_Page.lnk_EA00000000().click();
		TS_AddEmploymentAgreement_Page.lnk_InsertChild().click();
		TS_AddEmploymentAgreement_Page.txt_Description().sendKeys("New Agreement");
		TS_AddEmploymentAgreement_Page.txt_LookupDescr().sendKeys("New Agreement");
		TS_AddEmploymentAgreement_Page.btn_Save().click();
		Thread.sleep(2000);
		TS_AddEmploymentAgreement_Page.lnk_EmplAgreement().click();
		Thread.sleep(2000);
		TS_AddEmploymentAgreement_Page.lnk_EmplAgreement().click();
		TS_AddEmploymentAgreement_Page.lnk_EA00000001().click();
		TS_AddEmploymentAgreement_Page.lnk_ManageSmartForms().click();

		// TS15_AddEmploymentAgreement_Page.lnk_InsertFormFields().click();

		/*TS15_AddEmploymentAgreement_Page.lnk_CreateViewFormFields().click();
		setCurrentbrowser();
		TS15_AddEmploymentAgreement_Page.btn_Add().click();
		TS15_AddEmploymentAgreement_Page.txt_FieldDescr().sendKeys("Annual Salary");
		select(TS15_AddEmploymentAgreement_Page.txt_FieldType(), "Number");
		TS15_AddEmploymentAgreement_Page.txt_IntegerPositions().sendKeys("10");
		TS15_AddEmploymentAgreement_Page.btn_Save().click();
		TS15_AddEmploymentAgreement_Page.btn_FromFieldAdd().click();
		TS15_AddEmploymentAgreement_Page.txt_FieldDescr().sendKeys("Hours Per Week");
		select(TS15_AddEmploymentAgreement_Page.txt_FieldType(), "Number");
		TS15_AddEmploymentAgreement_Page.btn_Save().click();
		TS15_AddEmploymentAgreement_Page.btn_FromFieldAdd().click();
		TS15_AddEmploymentAgreement_Page.txt_FieldDescr().sendKeys("Manager");
		select(TS15_AddEmploymentAgreement_Page.txt_FieldType(), "Character");
		TS15_AddEmploymentAgreement_Page.txt_Fieldlength().sendKeys("30");
		TS15_AddEmploymentAgreement_Page.btn_Save().click();
		TS15_AddEmploymentAgreement_Page.btn_FromFieldAdd().click();
		TS15_AddEmploymentAgreement_Page.txt_FieldDescr().sendKeys("Vacation Days Per Year");
		select(TS15_AddEmploymentAgreement_Page.txt_FieldType(), "Number");
		TS15_AddEmploymentAgreement_Page.btn_Save().click();*/
		TS_AddEmploymentAgreement_Page.lnk_InsertFormFields().click();
		select(TS_AddEmploymentAgreement_Page.txt_InputType(), " Edit Box");
		TS_AddEmploymentAgreement_Page.btn_FormFieldLookUp().click();
		TS_AddEmploymentAgreement_Page.lnk_HoursPerWeek().click();
		/*TS15_AddEmploymentAgreement_Page.btn_Ok().click();
		select(TS15_AddEmploymentAgreement_Page.txt_InputType(), "Edit Box");
		TS15_AddEmploymentAgreement_Page.btn_FormFieldLookUp().click();
		TS15_AddEmploymentAgreement_Page.lnk_HourlyWage().click();
		TS15_AddEmploymentAgreement_Page.btn_Ok().click();*/
		
		BaseClass.driver.quit();
		Reporter.log("TenantUser Id:" + OnboardingConstants.TAUser + " Is Create By TA<br>");
		Constant.StopOnFail=true;
		
		
	}
}
