package appModules.Activities.Everify;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.Everify_Tasks.EVerify_Page;
import utility.ExcelUtils;
import utility.InvitationConstants;
import utility.Log;
import utility.psUtility;

public class Everify extends psUtility {
	@Test
	public static void Execute() throws Exception {
		ExcelUtils.setExcelFile(InvitationConstants.InvDataFile,"InvitationData");
		
		select(EVerify_Page.select_SwitcView(),"Awaiting DHS Verification");
		
		// Get the Sub Status
		Reporter.log("Everify Status: " + EVerify_Page.get_SubStatus().getText()+"<br>");
		
		EVerify_Page.btn_InitiateEVerify().click();
		
		Log.info("Click action is performed on :btn_InitiateEVerify");
		Reporter.log("Click action is performed on :btn_InitiateEVerify<br>");
		// Get the Case Number
		Reporter.log("Everify Case Number: " + EVerify_Page.btn_CaseNumber().getText()+"<br>");
		
		
		for(int i=0;i<1;i++) {
			
			 Reporter.log("Everify Status: " + EVerify_Page.get_SubStatus().getText()+"<br>");
			 if(ExcelUtils.getCellData(InvitationConstants.iTestCaseRow, ExcelUtils.getColContains("I9State")).contains(EVerify_Page.get_SubStatus().getText())) {
			    break;	
			 }else {
				EVerify_Page.btn_Next().click();
				Log.info("Click action is performed on :btn_Next()");
				EVerify_Page.btn_Next().click();
				Log.info("Click action is performed on :btn_Next()");
				EVerify_Page.rdbtn_IncorrectData().click();
				Log.info("Click action is performed on(Case for which this is a duplicate contains incorrect data) :rdbtn_IncorrectData()");
				EVerify_Page.btn_submit().click();
				Log.info("Click action is performed on :btn_submit()");
				Reporter.log("Everify Status: " + EVerify_Page.get_SubStatus().getText()+"<br>");
				
				if(ExcelUtils.getCellData(InvitationConstants.iTestCaseRow, ExcelUtils.getColContains("I9State")).contains(EVerify_Page.get_SubStatus().getText())) {
				   break;
				   
			    }else {
			    	if(EVerify_Page.get_SubStatus().getText().equalsIgnoreCase("Confirm Photograph")){
			    		EVerify_Page.btn_Retrieve().click();
			    		EVerify_Page.rbtn_ConfirmPhotoYes().click();
			    		EVerify_Page.btn_ConfirmPhotoNext().click();
			    		Reporter.log("Everify Status: " + EVerify_Page.get_SubStatus().getText()+"<br>");
			    		if(ExcelUtils.getCellData(InvitationConstants.iTestCaseRow, ExcelUtils.getColContains("I9State")).contains(EVerify_Page.get_SubStatus().getText())) {
						  break;} 
			    	}
				   // Smart I-9: Employer Verification SSA Reverify
					EVerify_Page.btn_ReVerify().click();
					Log.info("Click action is performed on :btn_ReVerify()");
					if(!EVerify_Page.get_SubStatus().getText().equalsIgnoreCase("Additional Verification")){
					EVerify_Page.btn_PrintNotice().click();
					Log.info("Click action is performed on :btn_PrintNotice()");}
					
					Reporter.log("Everify Status: " + EVerify_Page.get_SubStatus().getText()+"<br>");
				    if(ExcelUtils.getCellData(InvitationConstants.iTestCaseRow, ExcelUtils.getColContains("I9State")).contains(EVerify_Page.get_SubStatus().getText())) {
					   break;
					}else {
						EVerify_Page.chkbx_IhaveNotified().click();
						Log.info("Click action is performed on :chkbx_IhaveNotified()");
						EVerify_Page.btn_Next().click();
						Log.info("Click action is performed on :btn_Next()");
						EVerify_Page.btn_Next().click();
						Log.info("Click action is performed on :btn_Next()");
						EVerify_Page.btn_ReferCase().click();
						Log.info("Click action is performed on :btn_ReferCase()");
						Reporter.log("Everify Status: " + EVerify_Page.get_SubStatus().getText()+"<br>");
						if(ExcelUtils.getCellData(InvitationConstants.iTestCaseRow, ExcelUtils.getColContains("I9State")).contains(EVerify_Page.get_SubStatus().getText())) {
						   break;
						}else {
							EVerify_Page.btn_CloseCase().click();
							Log.info("Click action is performed on :btn_CloseCase()");

							EVerify_Page.rdbtn_yes().click();
							Log.info("Click action is performed on :rdbtn_yes()");

							EVerify_Page.btn_Next().click();
							Log.info("Click action is performed on :btn_Next()");

							EVerify_Page.rdbtn_DataAlreadyExists().click();
							Log.info("Click action is performed on :rdbtn_Theemployeecontinues()");

							EVerify_Page.btn_submitCloseCase().click();
							Log.info("Click action is performed on :btn_submitCloseCase()");
							Reporter.log("Everify Status: " + EVerify_Page.get_SubStatus().getText()+"<br>");
							if(ExcelUtils.getCellData(InvitationConstants.iTestCaseRow, ExcelUtils.getColContains("I9State")).contains(EVerify_Page.get_SubStatus().getText())) {
							   break;
							}
						}
			          }
			        }
		         }
			 
			 if(ExcelUtils.getCellData(InvitationConstants.iTestCaseRow, ExcelUtils.getColContains("I9State")).length()>0) {
			    if(!ExcelUtils.getCellData(InvitationConstants.iTestCaseRow, ExcelUtils.getColContains("I9State")).contains(EVerify_Page.get_SubStatus().getText())) {
			    	Reporter.log("<p style='color:red';><b> Everify Status is not found - Expected Status : "+ExcelUtils.getCellData(InvitationConstants.iTestCaseRow, ExcelUtils.getColContains("I9State"))+" </b></p> ");
			    	break;
			    }
			 } 
		   }	
		
		EVerify_Page.lnk_FinalizeEVerify().click();
		Log.info("Click action is performed on :lnk_FinalizeEVerify()");

		Reporter.log("Everify completed successfully<br>");
		/*

		/// Two Next Buttons
		EVerify_Page.btn_Next().click();
		Log.info("Click action is performed on :btn_Next()");

		EVerify_Page.btn_Next().click();
		Log.info("Click action is performed on :btn_Next()");

		EVerify_Page.rdbtn_IncorrectData().click();
		Log.info(
				"Click action is performed on(Case for which this is a duplicate contains incorrect data) :rdbtn_IncorrectData()");

		EVerify_Page.btn_submit().click();
		Log.info("Click action is performed on :btn_submit()");

		// Smart I-9: Employer Verification SSA Reverify
		EVerify_Page.btn_ReVerify().click();
		Log.info("Click action is performed on :btn_ReVerify()");

		EVerify_Page.btn_PrintNotice().click();
		Log.info("Click action is performed on :btn_PrintNotice()");

		EVerify_Page.chkbx_IhaveNotified().click();
		Log.info("Click action is performed on :chkbx_IhaveNotified()");

		EVerify_Page.btn_CloseCase().click();
		Log.info("Click action is performed on :btn_CloseCase()");

		EVerify_Page.rdbtn_yes().click();
		Log.info("Click action is performed on :rdbtn_yes()");

		EVerify_Page.btn_Next().click();
		Log.info("Click action is performed on :btn_Next()");

		EVerify_Page.rdbtn_Theemployeecontinues().click();
		Log.info("Click action is performed on :rdbtn_Theemployeecontinues()");

		EVerify_Page.btn_submitCloseCase().click();
		Log.info("Click action is performed on :btn_submitCloseCase()");

		EVerify_Page.lnk_FinalizeEVerify().click();
		Log.info("Click action is performed on :lnk_FinalizeEVerify()");

		Reporter.log("Everify completed successfully<br>");
*/
	}

}
