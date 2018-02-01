package pageObjects.activityObjects.TA_Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TA_OrgElectronicDiscloser_Page extends BaseClass {

	private static WebElement element;

	public TA_OrgElectronicDiscloser_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement btn_Acklmnt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_SF_RT_WRK_SAVE_PB\")");
			Log.info("btn_Acklmnt found in OrgElectronicDiscloser_Page");
		} catch (Exception e) {
			Log.info("btn_Acklmnt not found in OrgElectronicDiscloser_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement chkbox_Agree() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_SF_RT_WRK_SM_SF_ENABLE_AGREE\"))");//
			Log.info("chkbox_Agree found in OrgElectronicDiscloser_Page");//
		} catch (Exception e) {
			Log.info("chkbox_Agree not found in OrgElectronicDiscloser_Page");
			throw (e);
		}
		return element;
	}


}
