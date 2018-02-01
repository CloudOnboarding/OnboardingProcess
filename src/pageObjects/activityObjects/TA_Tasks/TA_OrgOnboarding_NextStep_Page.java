package pageObjects.activityObjects.TA_Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TA_OrgOnboarding_NextStep_Page extends BaseClass {

	private static WebElement element;

	public TA_OrgOnboarding_NextStep_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement btn_Continue() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_SF_RT_WRK_SAVE_PB\")");
			Log.info("btn_Continue found in OrgOnboarding_nextStep_Page");
		} catch (Exception e) {
			Log.info("btn_Continue not found in OrgOnboarding_nextStep_Page");
			throw (e);
		}
		return element;
	}

}
