package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TS_TerminateProcess_Page extends BaseClass {
	private static WebElement element;

	public TS_TerminateProcess_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement lnk_ConfigMenu() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"configMenu\"))");
			Log.info("lnk_ConfigMnu found in the TS_TerminateProcess_Page");
		} catch (Exception e) {
			Log.info("lnk_ConfigMnu not found in the TS_TerminateProcess_Page");
			throw (e);
		}
		return element;
	}

	

	public static WebElement txt_QuickFliter() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@class='form-control input-sm']\"))");
			Log.info("txt_QuickFliter found in the TS_TerminateProcess_Page");
		} catch (Exception e) {
			Log.info("txt_QuickFliter not found in the TS_TerminateProcess_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_CandidateConsole() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Candidate Console\"))");
			Log.info("lnk_CandidateConsole found in the TS_TerminateProcess_Page");
		} catch (Exception e) {
			Log.info("lnk_CandidateConsole not found in the TS_TerminateProcess_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_SelectAction() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame(
					"driver.findElement(By.xpath(\"//table[contains(@id,'DataTables_Table')]/tbody/tr[1]/td[6]/ul/li/a[contains(text(),'Select Actions')]\"))");
			Log.info("lnk_SelectAction found in the TS_TerminateProcess_Page");
		} catch (Exception e) {
			Log.info("lnk_SelectAction not found in the TS_TerminateProcess_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_TerminateProcess() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//a[contains(@id,'ACTN_TERMINATE')]/span\"))");
			Log.info("lnk_ForceComplete found in the TS_TerminateProcess_Page");
		} catch (Exception e) {
			Log.info("lnk_ForceComplete not found in the TS_TerminateProcess_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_Reason() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_BP_RSN_WRK_SM_BP_RSN_CD\"))");
			Log.info("sel_Reason found in the TS_TerminateProcess_Page");
		} catch (Exception e) {
			Log.info("sel_Reason not found in the TS_TerminateProcess_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Comment() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_BP_RSN_WRK_COMMENTS\"))");
			Log.info("txt_Comment found in the TS_TerminateProcess_Page");
		} catch (Exception e) {
			Log.info("txt_Comment not found in the TS_TerminateProcess_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Submit() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_BP_RSN_WRK_SM_BP_OK_BUTTON\"))");
			Log.info("btn_Submit found in the TS_TerminateProcess_Page");
		} catch (Exception e) {
			Log.info("btn_Submit not found in the TS_TerminateProcess_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_ok() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICOK\"))");
			Log.info("btn_ok found in the TS_TerminateProcess_Page");
		} catch (Exception e) {
			Log.info("btn_ok not found in the TS_TerminateProcess_Page");
			throw (e);
		}
		return element;
	}

}
