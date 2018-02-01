package appModules.Activities.I9Admin;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.Message_Handler;
import pageObjects.activityObjects.I9Admin_Tasks.CompleteI9_ListA_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.InvitationConstants;
import utility.OnboardingConstants;
import utility.OrclConn;
import utility.psUtility;

public class CompleteI9 extends psUtility {
	@Test
	public static void Execute() throws Exception {
		
		String GetI9IDVar=CompleteI9_ListA_Page.get_I9ID().getText();
		System.out.println("GetI9IDVar::::"+GetI9IDVar);
		
		ExcelUtils.setExcelFile(InvitationConstants.InvDataFile,"InvitationData");
		String i9TestCaseRow= ExcelUtils.getCellData(InvitationConstants.iTestCaseRow, ExcelUtils.getColContains("I9State"));
		ExcelUtils.setExcelFile(InvitationConstants.InvDataFile,"SmartI9Data");
		
		if(i9TestCaseRow.contains("Verification in Process")){
			//Update The SSN number for Verification in process case
			OrclConn.OpenDBConnection(Constant.Host, Constant.Port, Constant.SID, Constant.dbUser, Constant.dbPassword);
			OrclConn.RunQuery("update ps_sm_i9_hr_person  set sm_i9_ssn='000000008' where sm_co_org_id='"+ OnboardingConstants.OrgId.trim() + "' and sm_i9_id='"+ GetI9IDVar.trim() + "'");
			OrclConn.OracleCloseConnection();
		}
		CompleteI9_ListA_Page.lnk_SelectDocument().click();

		if(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("DocumentTypeList")).equalsIgnoreCase("A")){
			select(CompleteI9_ListA_Page.select_Section2Verification(), "List A");
			if(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("EligibilityType")).equalsIgnoreCase("Citizen")||ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("EligibilityType")).equalsIgnoreCase("Noncitizen")){
				CompleteI9_ListA_Page.txt_DocumentNumber().sendKeys(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("Document/PassPort/CardNumber")));
				CompleteI9_ListA_Page.txt_DocumentExpirationDate().click();
				CompleteI9_ListA_Page.txt_DocumentExpirationDate().sendKeys(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("Document/CardExpirationDate")));
			}
			if(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("EligibilityType")).equalsIgnoreCase("Alien") ){
				if(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("DocumentTitle")).equalsIgnoreCase("Employment")){
					CompleteI9_ListA_Page.rdbtn_ListAEmpAuthorizationDoc().click();
					CompleteI9_ListA_Page.txt_CardNumber().sendKeys(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("Document/PassPort/CardNumber")));
					CompleteI9_ListA_Page.txt_CardExpirationDate().click();
					CompleteI9_ListA_Page.txt_CardExpirationDate().sendKeys(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("Document/CardExpirationDate")));
				}
				if(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("DocumentTitle")).equalsIgnoreCase("Foreign")){
					CompleteI9_ListA_Page.rdbtn_AleinForeignPassport().click();
					if(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("UsingDocumentNo")).equalsIgnoreCase("ForeignPassport")){
					   CompleteI9_ListA_Page.txt_I94AdmissionNumber().sendKeys("20120070001");
					}else{
					   CompleteI9_ListA_Page.txt_PassportNumber().sendKeys(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("Document/PassPort/CardNumber")));
					   CompleteI9_ListA_Page.txt_PassportDocExpDate().click();
					   CompleteI9_ListA_Page.txt_CountryOfIssuance().sendKeys("USA");
					}
					
					if (isElementExists("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_I94_DOCEXPDT\"))")) {
					   CompleteI9_ListA_Page.txt_I94DocExpDate().sendKeys("03/12/2020");
					   CompleteI9_ListA_Page.txt_I94DocExpDate().click();
					}
					   CompleteI9_ListA_Page.txt_PassportDocExpDate().sendKeys(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("Document/CardExpirationDate")));
				}
			}
			if(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("EligibilityType")).equalsIgnoreCase("LPR")){
				
				if(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("DocumentTitle")).equalsIgnoreCase("Permanent")){
					CompleteI9_ListA_Page.rdbtn_PermanentResidentCard().click();
					CompleteI9_ListA_Page.txt_CardNumber().sendKeys(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("Document/PassPort/CardNumber")));
				}
				if(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("DocumentTitle")).equalsIgnoreCase("Foreign")){
					CompleteI9_ListA_Page.rdbtn_LPRForeignPassport().click();
					CompleteI9_ListA_Page.txt_PassportNumber().sendKeys(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("Document/PassPort/CardNumber")));
					CompleteI9_ListA_Page.txt_PassportDocExpDate().sendKeys(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("Document/CardExpirationDate")));
					CompleteI9_ListA_Page.txt_PassportDocExpDate().click();
				}
			}
			if(isElementExists("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_ISSUE_AUTH_A\"))")) {
			CompleteI9_ListA_Page.txt_IssuingAuthority().sendKeys("U.S. Department of State.");
			}
			if(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("UsingDocumentNo")).equalsIgnoreCase("I-94Admn")){
				CompleteI9_ListA_Page.txt_I94IssuingAuthority().sendKeys("U.S. Customs and Border Protection");	
			}
	  }
	  if(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("DocumentTypeList")).equalsIgnoreCase("BandC")) {
			select(CompleteI9_ListA_Page.select_Section2Verification(),"List B and List C");
			CompleteI9_ListA_Page.rdbtn_ListBDocDriverLicense().click();
			CompleteI9_ListA_Page.rdbtn_SocialSecurityCard().click();;
			CompleteI9_ListA_Page.rdbtn_DocNameDriverLicense().click();
			select(CompleteI9_ListA_Page.select_DocumentState(),"Mississippi");
			CompleteI9_ListA_Page.txt_ListBDocumentNumber().sendKeys(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("Document/PassPort/CardNumber")));
			CompleteI9_ListA_Page.txt_ListBDocExpDate().sendKeys(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("Document/CardExpirationDate")));
			CompleteI9_ListA_Page.txt_ListBDocExpDate().click();
			CompleteI9_ListA_Page.txt_IssuingAuthorityListC().sendKeys("U.S. Department of Health and Human Services");;
	  }
		
	    
		CompleteI9_ListA_Page.txt_HIreDate().click();
		//CompleteI9_ListA_Page.txt_HIreDate().sendKeys("T");
		CompleteI9_ListA_Page.LongTxt_AdditionalInformation().sendKeys("Demo Information");

		CompleteI9_ListA_Page.btn_saveListA().click();
		Message_Handler.btn_ModalBodyClose().click();
		CompleteI9_ListA_Page.btn_Return().click();

		CompleteI9_ListA_Page.chkbx_IAgree().click();
		CompleteI9_ListA_Page.btn_SavePage().click();

		// Complete I9 final action
		CompleteI9_ListA_Page.lnk_Complete().click();
		

		/*
		 * External_LogOut.Execute(); BaseClass.driver.quit();
		 */

		Reporter.log("CompleteI9 Completed successfully<br>");

	}
}
