package pageObjects.activityObjects.TA_Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TA_CompleteOrgOnboarding_Page extends BaseClass {

	private static WebElement element;

	public TA_CompleteOrgOnboarding_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement btn_Acknowledge() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_BP_WRK_SM_BP_CERTIFY\")");
			Log.info("btn_Acknowledge found in CompleteOrgOnboarding_Page");
		} catch (Exception e) {
			Log.info("btn_Acknowledge not found in CompleteOrgOnboarding_Page");
			throw (e);
		}
		return element;
	}
}
