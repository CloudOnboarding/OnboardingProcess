package appModules.Activities.Candidate.PayrollAndTaxes;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PayroleAndTaxes.CA_EnterI9_Page;
import utility.ExcelUtils;
import utility.InvitationConstants;
import utility.Log;
import utility.psUtility;

public class CA_EnterI9 extends psUtility {
	@Test
	public static void Execute() throws Exception {
		ExcelUtils.setExcelFile(InvitationConstants.InvDataFile,"InvitationData");
		String i9TestCaseRow= ExcelUtils.getCellData(InvitationConstants.iTestCaseRow, ExcelUtils.getColContains("I9State"));
		ExcelUtils.setExcelFile(InvitationConstants.InvDataFile,"SmartI9Data"); 
		
		switch(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("EligibilityType"))) {
		case  "Citizen": 
			  CA_EnterI9_Page.rdbtn_UScitizen().click();
		      Log.info("Click action is performed on 'US Citizen' radio button");
		      break;
		case  "Noncitizen": 
			  CA_EnterI9_Page.rdbtn_Noncitizen().click();
		      Log.info("Click action is performed on 'Non Citizen' radio button");
		      break;
		case  "LPR":
			  CA_EnterI9_Page.rdbtn_LawfulPermanentResident().click();
	          Log.info("Click action is performed on 'LawfulPermanentResident' radio button");
	          select(CA_EnterI9_Page.select_LPRType(),"Alien Number");
	          CA_EnterI9_Page.txt_AlienNumber().sendKeys(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("Alien/I94AdmissionNumber")));
		      break;
		case  "Alien":
			  CA_EnterI9_Page.rdbtn_Alien().click();
	          Log.info("Click action is performed on 'Alien' radio button");
	          CA_EnterI9_Page.txt_AlienExpDate().sendKeys("12/03/2020");
	          
	          if(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("UsingDocumentNo")).equalsIgnoreCase("AlienReg")){
	          select(CA_EnterI9_Page.select_AlienType(),"Alien Number");
	          CA_EnterI9_Page.txt_AlienRegistrationNumber().sendKeys(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("Alien/I94AdmissionNumber")));}
	          if(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("UsingDocumentNo")).equalsIgnoreCase("I-94Admn")){
	        	  CA_EnterI9_Page.txt_I94AdmissionNbr().sendKeys(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("Alien/I94AdmissionNumber")));
	          }
	          if(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("UsingDocumentNo")).equalsIgnoreCase("ForeignPassport")){
	        	  CA_EnterI9_Page.txt_ForeignPassportNumber().sendKeys(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("Document/PassPort/CardNumber")));
	        	  select(CA_EnterI9_Page.select_CountryIssuance(),"Belgium");
	          }
		      break;
		
		default: break;
		}
		CA_EnterI9_Page.chkBox_Iagree().click();
		Log.info("Click action is performed on 'Agree' check box");
		CA_EnterI9_Page.btn_ElectronicSignature().click();
		Log.info("Click action is performed on 'Electronic Sigature' button");

		Reporter.log("Enter I-9 Completed Successfully <br>");
		
	}
}
