package pageObjects.Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class RV_ApplyRevision_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public RV_ApplyRevision_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement lnk_Return() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_WRK_SM_CO_RETURN_PB\"))");
			Log.info("lnk_Return found in the RV_ApplyRevision_Page");
		} catch (Exception e) {
			Log.info("lnk_Return not found in the RV_ApplyRevision_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Apply() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_WRK_SM_CD_APPLY\"))");
			Log.info("btn_Apply found in the RV_ApplyRevision_Page");
		} catch (Exception e) {
			Log.info("btn_Apply not found in the RV_ApplyRevision_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_OK() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICOK\"))");
			Log.info("btn_OK found in the RV_ApplyRevision_Page");
		} catch (Exception e) {
			Log.info("btn_OK not found in the RV_ApplyRevision_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement get_RevisionNumber() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//span[@sm-id='RevnbrInptSpan']\"))");
			Log.info(" get_RevisionNumber found in the RV_ApplyRevision_Page");
		} catch (Exception e) {
			Log.info(" get_RevisionNumber not found in the RV_ApplyRevision_Page");
			throw (e);
		}
		return element;
	}
	
	//ystem.out.println(BaseClass.driver.findElement(By.xpath("//span[@sm-id='RevnbrInptSpan']")).getText());
}
