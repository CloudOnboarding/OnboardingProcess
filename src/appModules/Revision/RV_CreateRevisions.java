package appModules.Revision;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.Revision.RV_CreateRevisions_Page;
import utility.OnboardingConstants;
import utility.psUtility;

public class RV_CreateRevisions extends psUtility {
	public static String RevNum="",RevisnType="";
	@Test
	public static void Execute(String RevisionType, String Description) throws Exception {
		
		RV_CreateRevisions_Page.lnk_ConfigMnu().click();
		RV_CreateRevisions_Page.lnk_AddUpdRevsn().click();
		RV_CreateRevisions_Page.lnk_AddMode().click();
		select(RV_CreateRevisions_Page.sel_RevisionType(),RevisionType);
		RV_CreateRevisions_Page.txt_Descr().sendKeys(Description);
		RV_CreateRevisions_Page.btn_Save().click();
		RevNum=RV_CreateRevisions_Page.get_RevNum().getText();
		RevisnType=RevisionType;
		RV_CreateRevisions_Page.btn_Config().click();
		
		Reporter.log(RevisionType+" Revision Created Successfully<br>");
	}
}
