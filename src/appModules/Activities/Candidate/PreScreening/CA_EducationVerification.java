package appModules.Activities.Candidate.PreScreening;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PreScreening.CA_EducationVerification_Page;
import utility.psUtility;

public class CA_EducationVerification extends psUtility {
	@Test
	public static void Execute() throws Exception {
		CA_EducationVerification_Page.txt_SchoolName().sendKeys("St.Anns");
		CA_EducationVerification_Page.txt_AttendanceFrom().sendKeys("10/09/2008");
		CA_EducationVerification_Page.txt_AttendanceFrom().click();
		CA_EducationVerification_Page.txt_Attendanceto().sendKeys("10/09/2010");
		CA_EducationVerification_Page.txt_Attendanceto().click();
		CA_EducationVerification_Page.txt_City().sendKeys("Pleasanton");
		select(CA_EducationVerification_Page.sel_State(), "California");
		CA_EducationVerification_Page.txt_Address1().sendKeys("Own drv");
		CA_EducationVerification_Page.txt_Address2().sendKeys("54892");
		CA_EducationVerification_Page.txt_Postal().sendKeys("54899");
		CA_EducationVerification_Page.txt_County().sendKeys("USA");
		CA_EducationVerification_Page.rdbtn_Graduate_No().click();
		CA_EducationVerification_Page.chkbox_certify().click();
		CA_EducationVerification_Page.btn_save().click();
		
		Reporter.log("Education Verification Completed Successfully<br>");
	}
}
