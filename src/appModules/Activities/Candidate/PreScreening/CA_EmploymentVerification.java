package appModules.Activities.Candidate.PreScreening;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PreScreening.CA_EmploymentVerification_Page;
import utility.psUtility;

public class CA_EmploymentVerification extends psUtility {
	@Test
	public static void Execute() throws Exception {
		CA_EmploymentVerification_Page.txt_EmployerName().sendKeys("SmartERP");
		CA_EmploymentVerification_Page.txt_Phoneno().sendKeys("8259631475");
		CA_EmploymentVerification_Page.txt_Address1().sendKeys("Chabot Dr");
		CA_EmploymentVerification_Page.txt_Address2().sendKeys("45698");
		CA_EmploymentVerification_Page.txt_City().sendKeys("Pleasanton");
		select(CA_EmploymentVerification_Page.sel_State(), "California");
		CA_EmploymentVerification_Page.txt_Postal().sendKeys("85236");
		CA_EmploymentVerification_Page.txt_County().sendKeys("USA");
		CA_EmploymentVerification_Page.txt_FromDt().sendKeys("08/30/2016");
		CA_EmploymentVerification_Page.txt_FromDt().click();
		CA_EmploymentVerification_Page.txt_ToDt().sendKeys("08/30/2016");
		CA_EmploymentVerification_Page.txt_ToDt().click();
		CA_EmploymentVerification_Page.txt_Position().sendKeys("Sr.Manager");
		CA_EmploymentVerification_Page.txt_salary().sendKeys("4500");
		select(CA_EmploymentVerification_Page.sel_currency(), "USD");
		select(CA_EmploymentVerification_Page.sel_EmplmntType(), "Full Time");
		CA_EmploymentVerification_Page.chkbx_currentEmplyr().click();
		CA_EmploymentVerification_Page.chkbx_Certify().click();
		CA_EmploymentVerification_Page.btn_Save().click();
		
		Reporter.log("Employment Verification Completed Successfully<br>");
	}
}
