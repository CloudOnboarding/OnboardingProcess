package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TS_PurgeProcess_page extends BaseClass {
	private static WebElement element;

	public TS_PurgeProcess_page(WebDriver driver) {
		super(driver);
	}

	public static WebElement lnk_ConfigMenu() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"configMenu\"))");
			Log.info("lnk_ConfigMnu found in the TS_PurgeProcess_page");
		} catch (Exception e) {
			Log.info("lnk_ConfigMnu not found in the TS_PurgeProcess_page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_QuickFliter() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@class='form-control input-sm']\"))");
			Log.info("txt_QuickFliter found in the TS_PurgeProcess_page");
		} catch (Exception e) {
			Log.info("txt_QuickFliter not found in the TS_PurgeProcess_page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_CandidateConsole() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Candidate Console\"))");
			Log.info("lnk_CandidateConsole found in the TS_PurgeProcess_page");
		} catch (Exception e) {
			Log.info("lnk_CandidateConsole not found in the TS_PurgeProcess_page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_SelectAction() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame(
					"driver.findElement(By.xpath(\"//table[contains(@id,'DataTables_Table')]/tbody/tr[1]/td[6]/ul/li/a[contains(text(),'Select Actions')]\"))");
			Log.info("lnk_SelectAction found in the TS_PurgeProcess_page");
		} catch (Exception e) {
			Log.info("lnk_SelectAction not found in the TS_PurgeProcess_page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_Purge() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//a[contains(@id,'ACTN_PURGE')]/span\"))");
			Log.info("lnk_Purge found in the TS_PurgeProcess_page");
		} catch (Exception e) {
			Log.info("lnk_Purge not found in the TS_PurgeProcess_page");
			throw (e);
		}
		return element;
	}

	

	public static WebElement btn_ok() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICOK\"))");
			Log.info("btn_ok found in the TS_PurgeProcess_page");
		} catch (Exception e) {
			Log.info("btn_ok not found in the TS_PurgeProcess_page");
			throw (e);
		}
		return element;
	}

}

