package appModules.Activities.Candidate.Welcome;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.Welcome.CA_BiographicInformation_Page;
import utility.ExcelUtils;
import utility.InvitationConstants;
import utility.Log;
import utility.psUtility;

//@Listeners({utility.Listener.class,utility.CustomeReport.class}) 
//@Listeners() 
public class CA_BiographicInformation extends psUtility {
	
	@Test
	public static void Execute() throws Exception {
		
		ExcelUtils.setExcelFile(InvitationConstants.InvDataFile,"InvitationData");
		String i9TestCaseRow= ExcelUtils.getCellData(InvitationConstants.iTestCaseRow, ExcelUtils.getColContains("I9State"));
		String Country=ExcelUtils.getCellData(InvitationConstants.iTestCaseRow, ExcelUtils.getColContains("Country"));
		ExcelUtils.setExcelFile(InvitationConstants.InvDataFile,"SmartI9Data"); 
 
		/* Enter Candidate Biographic Information details */

		/*
		 * select(CA_BiographicInformation_Page.select_Prefix(),"");
		 * Log.info("Select action is performed on select_Prefix");
		 * 
		 * CA_BiographicInformation_Page.txt_FirstName().sendKeys("");
		 * Log.info("sendKeys action is performed on txt_FirstName");
		 * CA_BiographicInformation_Page.txt_MiddleName().sendKeys( "");
		 * Log.info("sendKeys action is performed on txt_MiddleName");
		 * CA_BiographicInformation_Page.txt_LastName().sendKeys( "");
		 * Log.info("sendKeys action is performed on txt_LastName");
		 */
		select(CA_BiographicInformation_Page.select_Suffix(), "Sr.");
		Log.info("select action is performed on select_Suffix");

		// Personal Details
		select(CA_BiographicInformation_Page.Select_Gender(), "Male");
		Log.info("select action is performed on Select_Gender");
		select(CA_BiographicInformation_Page.select_MaritalStatus(), "Single");
		Log.info("select action is performed on select_MaritalStatus");
		select(CA_BiographicInformation_Page.Select_CountryFoBirth(), "Iceland");
		Log.info("select action is performed on Select_CountryFoBirth");
		CA_BiographicInformation_Page.txt_DOB().sendKeys(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("DOB")));
		Log.info("sendKeys action is performed on txt_DOB");

		// Phone Number

		/*CA_BiographicInformation_Page.txt_HomePhone().sendKeys("8897477733");
		Log.info("sendKeys action is performed on txt_HomePhone");
*/
		// Email
		/*
		 * CA_BiographicInformation_Page.txt_Email().sendKeys( "");
		 * Log.info("sendKeys action is performed on txt_Email ");
		 */
		CA_BiographicInformation_Page.txt_ConfirmEmail().sendKeys("Demo@smarterp.com");
		Log.info("sendKeys action is performed on txt_ConfirmEmail");

		// Address
		CA_BiographicInformation_Page.chkBx_MailingAddress().click();
		Log.info("click action is performed on chkBx_MailingAddress");

		System.out.println("ExcelUtils.getCellData("+InvitationConstants.iTestCaseRow+","+ ExcelUtils.getColContains("Country")+")");
		
		//For USA SSN Case
		if(Country.equalsIgnoreCase("United States")) {	
		CA_BiographicInformation_Page.txt_SSN().sendKeys(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("SSN")));
		Log.info("sendKeys action is performed on txt_SSN");
		CA_BiographicInformation_Page.txt_CofirmSSN().sendKeys(ExcelUtils.getCellData(ExcelUtils.getRowContains(i9TestCaseRow, 0), ExcelUtils.getColContains("SSN")));
		Log.info("sendKeys action is performed on txt_CofirmSSN");
		}
		
		//For Canada SIN Cases
		if(Country.equalsIgnoreCase("Canada")) {
		CA_BiographicInformation_Page.txt_SSN().sendKeys("906666300");
		Log.info("sendKeys action is performed on txt_SSN");
		CA_BiographicInformation_Page.txt_CofirmSSN().sendKeys("906666300");
		Log.info("sendKeys action is performed on txt_CofirmSSN");
		CA_BiographicInformation_Page.txt_NIDexpireDt().sendKeys("11/02/2020");
		CA_BiographicInformation_Page.txt_NIDexpireDt().click();
		}
		
		
		// Emergency Contacts
		CA_BiographicInformation_Page.txt_EmergencyContFirstName().sendKeys("Mary");
		Log.info("sendKeys action is performed on txt_EmergencyContFirstName");
		CA_BiographicInformation_Page.txt_EmergencyContLastName().sendKeys("Smith");
		Log.info("sendKeys action is performed on txt_EmergencyContLastName ");
		select(CA_BiographicInformation_Page.select_NameSuffix(), "Sr.");
		Log.info("Click action is performed on select_NameSuffix");
		select(CA_BiographicInformation_Page.select_RelationShip(), "Employee");
		Log.info("Click action is performed on select_RelationShip");
		select(CA_BiographicInformation_Page.select_PhoneType(), "Home");
		Log.info("Click action is performed on select_PhoneType");
		CA_BiographicInformation_Page.txt_PrimaryPhone().sendKeys("4447773333");
		Log.info("sendKeys action is performed on txt_PrimaryPhone");

		// Save
		CA_BiographicInformation_Page.btn_Save().click();
		Log.info("click action is performed on  btn_Save");

		Reporter.log("BiographicInformation Completed Successfully<br>");
	}

}
