package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

	public class TS_AuthenticationSchemePreference_Page extends BaseClass {

		private static WebElement element;

		public TS_AuthenticationSchemePreference_Page(WebDriver driver) {
			super(driver);
		}
		public static WebElement Lnk_ConfigMenu() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"configMenu\"))");
				Log.info("lnk_ConfigMnu found in the TS_AuthenticationSchemePreference_Page");
			} catch (Exception e) {
				Log.info("lnk_ConfigMnu not found in the TS_AuthenticationSchemePreference_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement Lnk_authenticationPrefrence() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.linkText(\"Authentication Preferences\"))");
				Log.info("Lnk_authenticationPrefrence found in the TS_AuthenticationSchemePreference_Page");
			} catch (Exception e) {
				Log.info("Lnk_authenticationPrefrence not found in the TS_AuthenticationSchemePreference_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement Chk_TwoFactor () throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_PSSECOPT_SM_CO_TWO_FACTOR\"))");
				Log.info("Chk_TwoFactor found in the TS_AuthenticationSchemePreference_Page");
			} catch (Exception e) {
				Log.info("Chk_TwoFactor not found in the TS_AuthenticationSchemePreference_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement Chk_ChallengeQueation () throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_PSSECOPT_SM_CO_SUBCHALLENGE\"))");
				Log.info("Chk_ChallengeQueation found in the TS_AuthenticationSchemePreference_Page");
			} catch (Exception e) {
				Log.info("Chk_ChallengeQueation not found in the TS_AuthenticationSchemePreference_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement Btn_Save () throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
				Log.info("Btn_Save found in the TS_AuthenticationSchemePreference_Page");
			} catch (Exception e) {
				Log.info("Btn_Save not found in the TS_AuthenticationSchemePreference_Page");
				throw (e);
			}
			return element;
		}
		
		
		
}
