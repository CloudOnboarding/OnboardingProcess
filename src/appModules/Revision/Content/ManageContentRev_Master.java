package appModules.Revision.Content;

import org.openqa.selenium.By;

import appModules.Revision.RV_ApplyRevision;
import appModules.Revision.RV_CreateRevisions;
import pageObjects.BaseClass;
import utility.psUtility;

public class ManageContentRev_Master {
	public static String VendorGroup = "", VerificationVendor = "";

	public static void Execute() throws Exception {

		// Create Revision
		//RV_CreateRevisions.Execute("Content", "Demo Revision Content");
		
		//ChangeAuthNotifyEmail.Execute();
		//ChangeOnbProcNotification.Execute();
		//RV_ImageManagement.Execute();
		ImageManagement.Execute();
		AddSmartChecklists.Execute();
		
		AddSmartForm.Execute();
		VerifivcationVendor.Execute();
		BackgroundCheckVendors.Execute();

		// Below Object just to traverse the frameset
		psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX15\"))");
		VendorGroup = BaseClass.driver.findElement(By.xpath(
				".//span[@sm-id=\"pendRevTdFld\" and text()='Vendor Group']/parent::div/parent::td/following-sibling::td[1]/div/span[1]"))
				.getText();
		VerificationVendor = BaseClass.driver.findElement(By.xpath(
				".//span[@sm-id=\"pendRevTdFld\" and text()='Verification Vendor']/parent::div/parent::td/following-sibling::td[1]/div/span[1]"))
				.getText();

		// Apply Revision
		RV_ApplyRevision.Execute();

	}

}
