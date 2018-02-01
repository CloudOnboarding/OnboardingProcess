package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TS_ManageChallengeQuest_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public TS_ManageChallengeQuest_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement lnk_Accountname() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@sm-parent='accountMenu']\"))");
			Log.info("lnk_Accountname found in the TS_ManageChallengeQuest_Page");
		} catch (Exception e) {
			Log.info("lnk_Accountname not found in the TS_ManageChallengeQuest_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_MyProfile() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame(
					"driver.findElement(By.xpath(\"//li[@sm-id='myaccountItem']/a[contains(text(),'My Profile')]\"))");
			Log.info("lnk_MyProfile found in the TS_ManageChallengeQuest_Page");
		} catch (Exception e) {
			Log.info("lnk_MyProfile not found in the TS_ManageChallengeQuest_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_ChangeQuestion() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_MYPROF_WK_EDIT_BTN3\"))");
			Log.info("lnk_ChangeQuestion found in the TS_ManageChallengeQuest_Page");
		} catch (Exception e) {
			Log.info("lnk_ChangeQuestion not found in the TS_ManageChallengeQuest_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Edit() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORG_WRK_SM_CO_UPDATE_BTN\"))");
			Log.info("btn_Edit found in the TS_ManageChallengeQuest_Page");
		} catch (Exception e) {
			Log.info("btn_Edit not found in the TS_ManageChallengeQuest_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_Question() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_QTNANS_R_SM_CO_QTN_ID$0\"))");
			Log.info("sel_Question found in the TS_ManageChallengeQuest_Page");
		} catch (Exception e) {
			Log.info("sel_Question not found in the TS_ManageChallengeQuest_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Answer() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_QTNANS_R_SM_CO_ANSWER$0\"))");
			Log.info("txt_Answer found in the TS_ManageChallengeQuest_Page");
		} catch (Exception e) {
			Log.info("txt_Answer not found in the TS_ManageChallengeQuest_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Update() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORG_WRK_SM_CO_UPDATE_BTN\"))");
			Log.info("btn_Update found in the TS_ManageChallengeQuest_Page");
		} catch (Exception e) {
			Log.info("btn_Update not found in the TS_ManageChallengeQuest_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_MYPROF_WK_SAVE_BTN\"))");
			Log.info("btn_Save found in the TS_ManageChallengeQuest_Page");
		} catch (Exception e) {
			Log.info("btn_Save not found in the TS_ManageChallengeQuest_Page");
			throw (e);
		}
		return element;
	}
}
