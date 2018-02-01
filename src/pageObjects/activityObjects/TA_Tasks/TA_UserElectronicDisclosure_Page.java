package pageObjects.activityObjects.TA_Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TA_UserElectronicDisclosure_Page extends BaseClass {

	private static WebElement element;

	public TA_UserElectronicDisclosure_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement chkbox_Agree() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_BP_WRK_SM_BP_AGREE\"))");//
			Log.info("chkbox_Agree found in ElectronicDisclosure_Page");//SM_SF_RT_WRK_SM_SF_ENABLE_AGREE
		} catch (Exception e) {
			Log.info("chkbox_Agree not found in ElectronicDisclosure_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Acknowledged() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_BP_WRK_SM_BP_CERTIFY\"))");//
			Log.info("btn_Acknowledged found in ElectronicDisclosure_Page");//SM_SF_RT_WRK_SAVE_PB
		} catch (Exception e) {
			Log.info("btn_Acknowledged not found in ElectronicDisclosure_Page");
			throw (e);
		}
		return element;
	}

}