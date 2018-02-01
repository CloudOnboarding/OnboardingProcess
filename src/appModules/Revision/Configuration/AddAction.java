package appModules.Revision.Configuration;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Revision.RV_CreateRevisions;
import pageObjects.BaseClass;
import pageObjects.Revision.Configuaration.ContentSecurity_Page;
import pageObjects.Revision.Configuaration.I9Criteria_Page;
import pageObjects.Revision.Configuaration.RV_AddAction_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.OnboardingConstants;
import utility.psUtility;

public class AddAction extends psUtility {

	@Test
	public static void Execute() throws Exception {

dynamicLogin(isElementExists("driver.findElement(By.id(\"SM_CD_TREE_WRK_SM_CD_REV_RULES\"))"),
				OnboardingConstants.TAUser, "Process");

		ExcelUtils.setExcelFile(Constant.ActionId, "ActionId");

		ContentSecurity_Page.lnk_Edit2().click();
		String prevActivity = "x";
		// Define revision Actions from Excel File

		for (int Step = 0;; Step++) {
			try {
				System.out.println("Collection Name:::" + ExcelUtils.getCellData(1, Step));

				if (!prevActivity.equalsIgnoreCase(ExcelUtils.getCellData(0, Step))) {
					RV_AddAction_Page.lnk_stageName(ExcelUtils.getCellData(0, Step)).click();
					prevActivity = ExcelUtils.getCellData(0, Step);
				}
				for (int Actn = 2;; Actn++) {
					System.out.println("ActionID:::" + ExcelUtils.getCellData(Actn, Step));

					// Think time to disappear the save confirmation popup.
					Thread.sleep(2000);
					// Click Add link at specific Action Collection
					psUtility.switchFrame("driver.findElement(By.linkText(\"Add\"))");
					BaseClass.driver.findElement(
							By.xpath("//span[@class='stage-name' and text()='" + ExcelUtils.getCellData(1, Step)
									+ "']/parent::div/following-sibling::div/a[@class='add-action']"))
							.click();

					// Add Action
					RV_AddAction_Page.txt_QuickFilter().sendKeys(ExcelUtils.getCellData(Actn, Step));
					RV_AddAction_Page.chkbx_ActionID().click();

					// Get Action Name
					String ActionName = RV_AddAction_Page.get_ActionName().getText();
					System.out.println("ActionName:::" + ActionName);

					RV_AddAction_Page.btn_OK().click();

					// Click on Action for Routing Criteria Page
					// psUtility.swithFrame("driver.findElement(By.partialLinkText("+ActionName+"))");

					// Routing Criteria page
					String ActionId = ExcelUtils.getCellData(Actn, Step);

					if (ActionId.contains("FEDTAX_WTH") || ActionId.contains("WRKTAX_WTH")
							|| ActionId.contains("RESTAX_WTH") || ActionId.contains("CAN_TD1")
							|| ActionId.contains("CAN_PRV") || ActionId.contains("SEND_TO_HR")) {

					} else if (ActionId.contains("ENTER_I9") || ActionId.contains("COMPL_I9")
							|| ActionId.contains("E-VERIFY") || ActionId.contains("I9_HOLD")) {
						psUtility.switchFrame("driver.findElement(By.linkText(\"Add\"))");
						BaseClass.driver.findElement(By.partialLinkText(ActionName)).click();
						I9criteria.Execute();
					} else {
						psUtility.switchFrame("driver.findElement(By.linkText(\"Add\"))");
						BaseClass.driver.findElement(By.partialLinkText(ActionName)).click();
						I9Criteria_Page.Rdbtn_AlwaysRoute().click();
						I9Criteria_Page.btn_Save().click();
					}

					// Break loop at end-of action names for each cloumn in file
					if (ExcelUtils.getCellData(Actn + 1, Step).equals("")
							|| ExcelUtils.getCellData(Actn + 1, Step).length() <= 1) {
						System.out.println("Break inner loop");
						break;
					}
				}
				// Break loop at end-of Step names in file
				if (ExcelUtils.getCellData(0, Step + 1).equals("")
						|| ExcelUtils.getCellData(1, Step + 1).length() <= 1) {
					System.out.println("Break outer loop");
					break;
				}

			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}

		/*
		 * psUtility.switchFrame("driver.findElement(By.linkText(\"Add\"))");
		 * BaseClass.driver.findElement(By.
		 * partialLinkText("Electronic Disclosure - Opt Out")).click();
		 * 
		 * psUtility.switchFrame(
		 * "driver.findElement(By.id(\"SM_CD_REV_SEC_W_SM_CD_OK\"))");
		 * BaseClass.driver.findElement(By.xpath("//button[@sm-id='addTempPb']")).click(
		 * );
		 * 
		 * psUtility.switchFrame("driver.findElement(By.partialLinkText(\"Action\"))");
		 * BaseClass.driver.findElement(By.partialLinkText("Action")).click();
		 * BaseClass.driver.findElement(By.partialLinkText("AC00000001")).click();
		 * 
		 * psUtility.switchFrame(
		 * "driver.findElement(By.id(\"SM_CD_REV_SEC_W_SM_CD_OK\"))");
		 * BaseClass.driver.findElement(By.id("SM_CD_REV_SEC_W_SM_CD_OK")).click();
		 */

		RV_AddAction_Page.btn_Save().click();

		// RV_AddAction_Page.btn_Cancel().click();

		Reporter.log("Add Business process Rules Completed Successfully<br>");

	}
}