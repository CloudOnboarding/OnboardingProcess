package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.psUtility;

public class SetupChallengeQuestions_Page extends BaseClass {

	private static WebElement element;

	public SetupChallengeQuestions_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement txt_SecurityAns_0() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_QTNANS_R_SM_CO_ANSWER$0\"))");
			Log.info("txt_SecurityAns_0 found in SetupChallengeQuestions_Page");
		} catch (Exception e) {
			Log.info("txt_SecurityAns_0 not found in SetupChallengeQuestions_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_SecurityAns_1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_QTNANS_R_SM_CO_ANSWER$1\"))");
			Log.info("txt_SecurityAns_1 found in SetupChallengeQuest_Page");
		} catch (Exception e) {
			Log.info("txt_SecurityAns_1 not found in SetupChallengeQuest_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_SecurityAns_2() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_QTNANS_R_SM_CO_ANSWER$2\"))");
			Log.info("txt_SecurityAns_2 found in SetupChallengeQuest_Page");
		} catch (Exception e) {
			Log.info("txt_SecurityAns_2 not found in SetupChallengeQuest_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_SecurityAns_3() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_QTNANS_R_SM_CO_ANSWER$3\"))");
			Log.info("txt_SecurityAns_3 found in SetupChallengeQuest_Page");
		} catch (Exception e) {
			Log.info("txt_SecurityAns_3 not found in SetupChallengeQuest_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_continue() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_QTN_WRK_SM_CO_CONTINUE_PB\"))");
			Log.info("btn_continue found in SetupChallengeQuest_Page");
		} catch (Exception e) {
			Log.info("btn_continue not found in SetupChallengeQuest_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement get_SetUpChnQnsDivElementTxt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\".//div[contains(@class=,'strong']\"))");
			Log.info("get_SetUpChnQnsDivElementTxt found in SetupChallengeQuest_Page");
		} catch (Exception e) {
			Log.info("get_SetUpChnQnsDivElementTxt not found in SetupChallengeQuest_Page");
			throw (e);
		}
		return element;
	}

}
