package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import appModules.OnboardingMaster.CA_OnboardingProcess;
import utility.Log;
import utility.psUtility;

public class MyTask_Page extends BaseClass {
	private static WebElement element;

	public MyTask_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement txt_QuickFilter() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@class='form-control input-sm']\"))");
			Log.info("txt_QuickFilter found in MyTask_Page");
		} catch (Exception e) {
			Log.info("txt_QuickFilter not found in MyTask_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_ActivityName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\""+CA_OnboardingProcess.ActivityName+"\"))");
			Log.info("lnk_ActivityName found in MyTask_Page");
		} catch (Exception e) {
			Log.info("lnk_ActivityName not found in MyTask_Page");
			throw (e);
		}
		return element;
	}
}
