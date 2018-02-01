package appModules;
 
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.Message_Handler;
import pageObjects.Invitation.CandidateSearch_Page;
import pageObjects.Invitation.JobInformation_Page;
import pageObjects.Invitation.PersonalInformation_Page;
import utility.ExcelUtils;
import utility.InvitationConstants;
import utility.OnboardingConstants;
import utility.psUtility;

public class CreateInvitation extends psUtility {
	public static String InvLocVarGet;
	public static int iTestCaseRow = 0;
	@Test
	public static void Execute() throws Exception {
		
		if(InvitationConstants.iTestCaseRow==0) {
			iTestCaseRow=1;
		}else {
			iTestCaseRow=InvitationConstants.iTestCaseRow;
		}
	
		ExcelUtils.setExcelFile(InvitationConstants.InvDataFile,"InvitationData");
		/* Enter CreateInvitation details */
		// CandidateSearch
		select(CandidateSearch_Page.select_InvitationSource(), "New");
		CandidateSearch_Page.lnk_Next().click();
		// Thread.sleep(5000);
		// PersonalInformation
		select(PersonalInformation_Page.select_NamePrefix(), ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("NamePrefix")));
		PersonalInformation_Page.txt_FirstName().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("FirstName")));
		PersonalInformation_Page.txt_MiddleName().sendKeys("Kim");
		PersonalInformation_Page.txt_LastName().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("LastName")));
		select(PersonalInformation_Page.select_NameSuffix(), "Junior");
		
		select(PersonalInformation_Page.select_Contry(),ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("Country")));
		
		PersonalInformation_Page.txt_Address1().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("Address1")));
		PersonalInformation_Page.txt_Address2().sendKeys("Suite 380");
		PersonalInformation_Page.txt_Address3().sendKeys("2nd Cross");
		
	
		
		PersonalInformation_Page.txt_City().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("City")));
		select(PersonalInformation_Page.select_State(), ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("State")));
		PersonalInformation_Page.txt_Postal().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("Postal")));
		
		//Element Only available when Country USA
		if(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("Country")).equalsIgnoreCase("United States")) {
		PersonalInformation_Page.txt_County().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("County")));
		}
		
		
		PersonalInformation_Page.txt_Telephone().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("Telephone")));
		select(PersonalInformation_Page.select_PhoneType(), ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("PhoneType")));
		PersonalInformation_Page.chkbx_PhonePreffered().click();
		PersonalInformation_Page.txt_EmailId().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("EmailAddress")));
		select(PersonalInformation_Page.select_EmailType(), ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("EmailType")));
		PersonalInformation_Page.chkbx_EmailPreffered().click();
		CandidateSearch_Page.lnk_Next().click();
		// Thread.sleep(5000);
		// JobInformation
		JobInformation_Page.txt_StartDate().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("StartDate")));
		// JobInformation_Page.txt_BusinessProcessID(), iTestCaseRow, ExcelUtils.getColContains("BusinessProcessID));
		JobInformation_Page.btn_BusinessProcessPrompt().click();
		JobInformation_Page.lnk_BusinessProcessId().click();
		JobInformation_Page.txt_RegularTemporary().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("Regular_Temporary")));
		JobInformation_Page.txt_FullPartTime().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("Full_PartTime")));
		JobInformation_Page.txt_Company().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("Company")));
		JobInformation_Page.txt_BusinessUnit().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("BusinessUnit")));
		JobInformation_Page.txt_Department().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("Department")));
		JobInformation_Page.txt_Location().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("Location")));
		InvLocVarGet=JobInformation_Page.txt_Location().getAttribute("value");
		JobInformation_Page.txt_JobCode().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("JobCode")));
		JobInformation_Page.txt_EmployeeClass().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("EmployeeClass")));
		JobInformation_Page.txt_AppointmentType().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("AppointmentType")));
		JobInformation_Page.txt_ClientId().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("ClientID")));
		JobInformation_Page.txt_PayGroup().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("Paygroup")));
		JobInformation_Page.txt_SalaryPlan().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("SalaryPlan")));
		JobInformation_Page.txt_EmploymentAgreement().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("EmploymentAgreement")));
		
		if(PersonalInformation_Page.select_State().getAttribute("value").equalsIgnoreCase("QC"))
		   select(JobInformation_Page.select_Language(), "Canadian French");
		else 
		   select(JobInformation_Page.select_Language(), "English");
		
		select(JobInformation_Page.select_BackgroundRequired(), ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("BackgroundRequired")));
		if(JobInformation_Page.select_BackgroundRequired().getAttribute("value").toUpperCase().equals("Y")){
			/*if(RV_ApplyRevision.RevisionNo.length()>0) {
				JobInformation_Page.txt_BackgroundCheckVendor().sendKeys(ManageContentRev_Master.VendorGroup);
				JobInformation_Page.txt_ProfileFormID().sendKeys("7YRLWSTD");//7YRLWSTD
			}else {
				JobInformation_Page.txt_BackgroundCheckVendor().sendKeys(OnboardingConstants.VendorGroup);//ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("BackgroundCheckVendor")));
				JobInformation_Page.txt_ProfileFormID().sendKeys("7YRLWSTD");//(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("ProfileFormID")));
			}*/
			
			JobInformation_Page.txt_BackgroundCheckVendorPrompt().click();
			JobInformation_Page.lnk_SerchResFldLookup().click();
			
			JobInformation_Page.txt_ProfileFormIDPrompt().click();
			JobInformation_Page.lnk_SerchResFldLookup().click();
			
			select(JobInformation_Page.sel_CreditCheckRequired(),ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("CreditCheckRequired")));
		}
		
		select(JobInformation_Page.select_EduEmpl_VerificationReq(), ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("Edu_EmplVerificationRequired")));
		if(JobInformation_Page.select_EduEmpl_VerificationReq().getAttribute("value").toUpperCase().equals("Y")){
			/*if(RV_ApplyRevision.RevisionNo.length()>0) {
				JobInformation_Page.txt_VerificationVendorID().sendKeys(ManageContentRev_Master.VerificationVendor);
			}else {
			    JobInformation_Page.txt_VerificationVendorID().sendKeys(OnboardingConstants.VerificationVendor);//(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("VerificationVendorID")));
			}*/
			JobInformation_Page.txt_VerifVendorIDPrompt().click();
			JobInformation_Page.lnk_SerchResFldLookup().click();
			
			select(JobInformation_Page.sel_EducationVerificationRequired1(),ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("EducationVerificationRequired1")));
			if(JobInformation_Page.sel_EducationVerificationRequired1().getAttribute("value").toUpperCase().equals("Y")){
			  select(JobInformation_Page.sel_EducationVerificationRequired2(),ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("EducationVerificationRequired2")));
			}
			select(JobInformation_Page.sel_EmploymentVerificationRequired(),ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("EmploymentVerificationRequired")));
			if(JobInformation_Page.sel_EmploymentVerificationRequired().getAttribute("value").toUpperCase().equals("Y")){
			  JobInformation_Page.txt_Past1().sendKeys(ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("Past1")));
			  select(JobInformation_Page.sel_Past2(),ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("Past2")));
			}
		}
		
		select(JobInformation_Page.select_DrugTestReq(), ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("DrugTestRequired")));
		if(JobInformation_Page.select_DrugTestReq().getAttribute("value").toUpperCase().equals("Y")){
			select(JobInformation_Page.sel_TestPanel(),ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("TestPanel")));
		}
		
		select(JobInformation_Page.select_MedicalScreeningReq(), ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("MedicalScreeningRequired")));
		select(JobInformation_Page.select_HepatitisBReq(), ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("HepatitisBImmunizationRequired")));
		select(JobInformation_Page.select_HoldPreScreenProcess(), ExcelUtils.getCellData(iTestCaseRow, ExcelUtils.getColContains("HoldforPreScreenProcessing")));
		
		if(isElementExists("driver.findElement(By.id(\"SM_DF_HOOK_WK_SM_DF_NEXT_TASK\"))")){
			CandidateSearch_Page.lnk_Next().click();
			JobInformation_Page.chkbox_ManagerialPosition().click();
			JobInformation_Page.chkbox_ReportRequire().click();
			JobInformation_Page.chkbox_RegularAccess().click();
			JobInformation_Page.chkbox_CompanyBank().click();
			JobInformation_Page.chkbox_TransferMoney().click();
			JobInformation_Page.chkbox_FinancialContract().click();
			JobInformation_Page.chkbox_ProprietaryInformation().click();
			JobInformation_Page.chkbox_Workday().click();
		}
		
		JobInformation_Page.btn_Save().click();
		JobInformation_Page.btn_ViewInvitation().click();

		Reporter.log("CandidateId Generated: " + PersonalInformation_Page.nonEdit_CandidateId().getText() + "<br>");
		Reporter.log("CandidateID Status   : " + PersonalInformation_Page.nonEdit_InvitationStatus().getText() + "<br>");

		// Constant.OnboardingUser=OnboardingConstants.CandUser;

		OnboardingConstants.CandidateId = PersonalInformation_Page.nonEdit_CandidateId().getText();
		
		
		OnboardingConstants.CandUser = "CA_" + OnboardingConstants.CandidateId;
		PersonalInformation_Page.btn_Launch().click();
		// Confirmation Message for Canditate Creation
		String ConfirmationMessage = Message_Handler.get_ModalBodyText().getText();
		System.out.println("Canditate ID:::"+OnboardingConstants.CandidateId);
		Reporter.log("ConfirmMessage:::" + ConfirmationMessage + "<br>");
		Message_Handler.btn_OK().click();

		// Validation Required********

	}
}
