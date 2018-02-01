package appModules.Revision;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import pageObjects.Revision.RV_CreateRevisions_Page;
import utility.psUtility;

public class RV_ViewEditRevisions extends psUtility {
	@Test
	public static void Execute(String RevisionNum) throws Exception {
		RV_CreateRevisions_Page.lnk_ConfigMnu().click();
		RV_CreateRevisions_Page.lnk_AddUpdRevsn().click();
		RV_CreateRevisions_Page.txt_RevisionNum().sendKeys(RevisionNum,Keys.ENTER);
		//RV_CreateRevisions_Page.btn_Search().click();
		//RV_CreateRevisions_Page.lnk_Result().click();
		RV_CreateRevisions_Page.btn_ViewEdit().click();
		
	}
}
