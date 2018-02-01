package pageObjects.activityObjects.HR_Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class HR_VerifyInformation_Page extends BaseClass {
	public static WebElement element;

	public HR_VerifyInformation_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement chkBox_Acknowledge() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_BP_WRK_SM_BP_AGREE\"))");

			Log.info("chkBox_Acknowledge found in the HR_VerifyInformation_Page");
		} catch (Exception e) {
			Log.info("chkBox_Acknowledge not found in the HR_VerifyInformation_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_ElectronicSign() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_BP_WRK_SM_BP_CERTIFY\"))");

			Log.info("btn_ElectronicSign found in the HR_VerifyInformation_Page");
		} catch (Exception e) {
			Log.info("btn_ElectronicSign not found in the HR_VerifyInformation_Page");
			throw (e);
		}
		return element;
	}

}
