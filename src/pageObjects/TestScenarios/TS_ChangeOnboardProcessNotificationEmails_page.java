package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TS_ChangeOnboardProcessNotificationEmails_page extends BaseClass {
	private static WebElement element;

	public TS_ChangeOnboardProcessNotificationEmails_page(WebDriver driver) {
		super(driver);
	}
	 public static WebElement lnk_ManageEvntsNotf() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_TREE_WRK_SM_CD_REV_EVENTS\"))");
				Log.info("lnk_ManageEvntsNotf found in TS_ChangeOnboardProcessNotificationEmails_page");
			} catch (Exception e){
				Log.info("lnk_ManageEvntsNotf not found in TS_ChangeOnboardProcessNotificationEmails_page");
				throw (e);
			}
			return element;
		}
	 
	 public static WebElement lnk_Next() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.linkText(\"Next\"))");
				Log.info("lnk_Next found in TS_ChangeOnboardProcessNotificationEmails_page");
			} catch (Exception e) {
				Log.info("lnk_Next not found in TS_ChangeOnboardProcessNotificationEmails_page");
				throw (e);
			}
			return element;
		}
	 public static WebElement sel_Notify() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_NOTF_SM_BP_PARTICIPANT$0\"))");
				Log.info("sel_Notify found in TS_ChangeOnboardProcessNotificationEmails_page");
			} catch (Exception e){
				Log.info("sel_Notify not found in TS_ChangeOnboardProcessNotificationEmails_page");
				throw (e);
			}
			return element;
		}
	 public static WebElement sel_RoleType() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_NOTF_SM_BP_PARTICIPNT$0\"))");
				Log.info("sel_RoleType found in TS_ChangeOnboardProcessNotificationEmails_page");
			} catch (Exception e){
				Log.info("sel_RoleType not found in TS_ChangeOnboardProcessNotificationEmails_page");
				throw (e);
			}
			return element;
		}
	 public static WebElement sel_NotifTempinpt() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_NOTF_SM_BP_NTF_TEMPLTAE$0\"))");
				Log.info("sel_NotifTempinpt found in TS_ChangeOnboardProcessNotificationEmails_page");
			} catch (Exception e){
				Log.info("sel_NotifTempinpt not found in TS_ChangeOnboardProcessNotificationEmails_page");
				throw (e);
			}
			return element;
		}
	 public static WebElement btn_Save() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave$0\"))");
				Log.info("btn_Save found in TS_ChangeOnboardProcessNotificationEmails_page");
			} catch (Exception e){
				Log.info("btn_Save not found in TS_ChangeOnboardProcessNotificationEmails_page");
				throw (e);
			}
			return element;
		}
	 
	 
	 
	 
}
