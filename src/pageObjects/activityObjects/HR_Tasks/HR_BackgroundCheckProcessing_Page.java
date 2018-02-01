package pageObjects.activityObjects.HR_Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class HR_BackgroundCheckProcessing_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public HR_BackgroundCheckProcessing_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement btn_acknowledg() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_BGC_WRK_SM_OB_SUBMIT\"))");
			Log.info("btn_acknowledg found in the HR_BackgroundCheckProcessing_Page");
		} catch (Exception e) {
			Log.info("btn_acknowledg not found in the HR_BackgroundCheckProcessing_Page");
			throw (e);
		}
		return element;
	}
}
