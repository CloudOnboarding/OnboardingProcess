package pageObjects.activityObjects.CA_Tasks.SubmitToHr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_SubmitToHR_Page extends BaseClass {
	public static WebElement element;

	public CA_SubmitToHR_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement rdbtn_SubmitHrReview() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_WRK_SM_OB_AGREE\"))");

			Log.info("rdbtn_SubmitHrReview found in the CA_SubmitToHr_Page");
		} catch (Exception e) {
			Log.info("rdbtn_SubmitHrReview not found in the CA_SubmitToHr_Page");
			throw (e);
		}
		return element;
	}

}
