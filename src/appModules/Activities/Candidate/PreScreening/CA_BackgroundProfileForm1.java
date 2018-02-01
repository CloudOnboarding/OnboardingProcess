package appModules.Activities.Candidate.PreScreening;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PreScreening.CA_BackgroundProfileForm1_Page;
import utility.psUtility;

public class CA_BackgroundProfileForm1 extends psUtility {
	@Test
	public static void Execute() throws Exception {
		CA_BackgroundProfileForm1_Page.rdbtn_AuthorizeBackgroundCheck().click();
		CA_BackgroundProfileForm1_Page.btn_Next().click();
		CA_BackgroundProfileForm1_Page.rbtn_OtherNameNo().click();
		CA_BackgroundProfileForm1_Page.txt_MotherMaidenName().sendKeys("John");
		CA_BackgroundProfileForm1_Page.txt_City().sendKeys("Pleasanton");
		select(CA_BackgroundProfileForm1_Page.sel_State(), "California");
		CA_BackgroundProfileForm1_Page.btn_Next().click();
		CA_BackgroundProfileForm1_Page.chk_NameonId().click();
		CA_BackgroundProfileForm1_Page.txt_FirstName().sendKeys("Albert");
		CA_BackgroundProfileForm1_Page.txt_LastName().sendKeys("Joseph");
		CA_BackgroundProfileForm1_Page.btn_Next().click();
		select(CA_BackgroundProfileForm1_Page.sel_FromMonth(), "02 February");
		CA_BackgroundProfileForm1_Page.txt_FromYear().sendKeys("2010");
		select(CA_BackgroundProfileForm1_Page.sel_ToMonth(), "01 January");
		CA_BackgroundProfileForm1_Page.txt_ToYear().sendKeys("2018");
		CA_BackgroundProfileForm1_Page.btn_Next().click();
		CA_BackgroundProfileForm1_Page.chk_EmploymentAddress().click();
		CA_BackgroundProfileForm1_Page.btn_Next().click();
		CA_BackgroundProfileForm1_Page.rbtn_No().click();
		if(isElementExists("driver.findElement(By.id(\"SM_OB_BGV_H_CRH_SM_OB_BGC_FLNY_FLG$100$\"))")) {
		CA_BackgroundProfileForm1_Page.rbtn_misdemeanor_No().click();
		}
		CA_BackgroundProfileForm1_Page.btn_Save().click();
		
		Reporter.log("Background ProfileForm-1 Completed Successfully<br>");
	}
}
