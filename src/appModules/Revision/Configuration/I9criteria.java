package appModules.Revision.Configuration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utility.OnboardingConstants;
import utility.psUtility;
import pageObjects.BaseClass;
import pageObjects.Revision.Configuaration.*;

public class I9criteria extends psUtility {

	@Test
	public static void Execute() throws Exception {
		
		
		I9Criteria_Page.Rdbtn_RouteCriteria().click();
		I9Criteria_Page.Prmpt_PrcsVar().click();
		I9Criteria_Page.lnk_PrcsVarType().click();
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.id("ptifrmtgtframe")));
		I9Criteria_Page.lnk_PrcsVar().click();
		BaseClass.driver.switchTo().frame(BaseClass.driver.findElement(By.id("ptifrmtgtframe")));
		I9Criteria_Page.lnk_WrkResdState().click();
		select(I9Criteria_Page.sel_operator(), "Equal To");
		I9Criteria_Page.txt_PrcsVal().sendKeys("USA");
		I9Criteria_Page.btn_Save().click();
	}//sm-modal-frame//ptifrmtgtframe
}
