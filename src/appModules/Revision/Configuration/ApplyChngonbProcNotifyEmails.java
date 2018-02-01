package appModules.Revision.Configuration;


import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Revision.RV_CreateRevisions;
import pageObjects.TestScenarios.TS_ChangeAuthenticationNotificationEmails_Page;
import pageObjects.TestScenarios.TS_ChangeOnboardProcessNotificationEmails_page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.psUtility;

public class ApplyChngonbProcNotifyEmails extends psUtility {

	@Test
	public static void Execute() throws Exception {
		/*
		setEnvironment(Constant.ExternalURL);
		RV_CreateRevisions.RevNum = "0000000003";
		RV_CreateRevisions.RevisnType = "Process";*/
		
		dynamicLogin(isElementExists("driver.findElement(By.id(\"SM_CD_TREE_WRK_SM_CD_REV_EVENTS\"))"), OnboardingConstants.TAUser,"Process");
		TS_ChangeOnboardProcessNotificationEmails_page.lnk_ManageEvntsNotf().click();
		select(TS_ChangeOnboardProcessNotificationEmails_page.sel_Notify(), "Participant Pool");
		select(TS_ChangeOnboardProcessNotificationEmails_page.sel_RoleType(), "HR Specialist");
		//select(TS_ChangeOnboardProcessNotificationEmails_page.sel_NotifTempinpt(), "PreScreen Submitted - Notification to  HR");
		
		
		select(TS_ChangeOnboardProcessNotificationEmails_page.sel_NotifTempinpt(), "Confirm Onboarding Submit for Review-New");
		
		
		TS_ChangeAuthenticationNotificationEmails_Page.btn_Ok().click();
		
		
		Reporter.log("Apply Change Onboarding Process Notification Emails Completed Successfully<br>");
	}
}
