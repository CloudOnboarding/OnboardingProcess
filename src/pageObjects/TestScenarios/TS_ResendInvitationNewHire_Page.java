package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TS_ResendInvitationNewHire_Page extends BaseClass {
	private static WebElement element;

	public TS_ResendInvitationNewHire_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement Lnk_ConfigMenu() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"configMenu\"))");
			Log.info("lnk_ConfigMnu found in the TS_ResendInvitationNewHire_Page");
		} catch (Exception e) {
			Log.info("lnk_ConfigMnu not found in the TS_ResendInvitationNewHire_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement Lnk_CandidateConsole() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Candidate Console\"))");
			Log.info("Lnk_CandidateConsole found in the TS_ResendInvitationNewHire_Page");
		} catch (Exception e) {
			Log.info("Lnk_CandidateConsole not found in the TS_ResendInvitationNewHire_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_QuickFliter() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@class='form-control input-sm']\"))");
			Log.info("txt_QuickFliter found in the TS_ResendInvitationNewHire_Page");
		} catch (Exception e) {
			Log.info("txt_QuickFliter not found in the TS_ResendInvitationNewHire_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Lnk_SelectAction() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//table[contains(@id,'DataTables_Table')]/tbody/tr[1]/td[6]/ul/li/a[contains(text(),'Select Actions')]\"))");
			Log.info("Lnk_SelectAction found in the TS_ResendInvitationNewHire_Page");
		} catch (Exception e) {
			Log.info("Lnk_SelectAction not found in the TS_ResendInvitationNewHire_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement lnk_ResendLogin() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//a[contains(@id,'ACTN_RESEND_LOGIN')]/span\"))");
			Log.info("lnk_ResendLogin found in the TS_ResendInvitationNewHire_Page");
		} catch (Exception e) {
			Log.info("lnk_ResendLogin not found in the TS_ResendInvitationNewHire_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_ok() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICOK\"))");
			Log.info("btn_ok found in the TS_ResendInvitationNewHire_Page");
		} catch (Exception e) {
			Log.info("btn_ok not found in the TS_ResendInvitationNewHire_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement Btn_Close() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[contains(@value,'Close')]\"))");
			Log.info("Btn_Close found in the TS_ResendInvitationNewHire_Page");
		} catch (Exception e) {
			Log.info("Btn_Close not found in the TS_ResendInvitationNewHire_Page");
			throw (e);
		}
		return element;
	}
	
	
}
