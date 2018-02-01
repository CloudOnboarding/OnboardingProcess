package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TS_ChangeAuthenticationNotificationEmails_Page extends BaseClass {
	private static WebElement element;

	public TS_ChangeAuthenticationNotificationEmails_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement lnk_NotifTempl() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_WRK_SM_CO_NTF_TEMPLATE\"))");
			Log.info("lnk_NotifTempl found in the TS_ChangeAuthenticationNotificationEmails_Page");
		} catch (Exception e) {
			Log.info("lnk_NotifTempl not found in the TS_ChangeAuthenticationNotificationEmails_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement lnk_HighlightFields() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.cssSelector(\".cke_button_label.cke_button__highlightvars_label\"))");
			Log.info("lnk_HighlightFields found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("lnk_HighlightFields not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_AddNotifTempl() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//a[@sm-id='addnotifTemplBtn']\"))");
			Log.info("lnk_AddNotifTempl found in the TS_ChangeAuthenticationNotificationEmails_Page");
		} catch (Exception e) {
			Log.info("lnk_AddNotifTempl not found in the TS_ChangeAuthenticationNotificationEmails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_emailid() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_NT_SM_CO_NTF_EMAILID\"))");
			Log.info("txt_emailid found in the TS_ChangeAuthenticationNotificationEmails_Page");
		} catch (Exception e) {
			Log.info("txt_emailid not found in the TS_ChangeAuthenticationNotificationEmails_Page");
			throw (e);
		}
		return element;
	}
	
	


	public static WebElement btn_Return() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICCancel\"))");
			Log.info("btn_Return found in the TS_ChangeAuthenticationNotificationEmails_Page");
		} catch (Exception e) {
			Log.info("btn_Return not found in the TS_ChangeAuthenticationNotificationEmails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_NotifEvntPrompt() throws Exception {
		element = null;
		try {
			// span[contains(text(),'On User
			// Launch')]/parent::div/parent::div/parent::td/following-sibling::td/div/div/span/button
			// element =
			// psUtility.swithFrame("driver.findElement(By.id(\"NOTF_TMPL_DESCR$prompt$4\"))");

			element = psUtility.switchFrame(
					"driver.findElement(By.xpath(\"//span[contains(text(),'On User Launch')]/parent::div/parent::div/parent::td/following-sibling::td/div/div/span/button[contains(@id,'NOTF_TMPL_DESCR')]\"))");
			Log.info("btn_NotifEvntPrompt found in the TS_ChangeAuthenticationNotificationEmails_Page");
		} catch (Exception e) {
			Log.info("btn_NotifEvntPrompt not found in the TS_ChangeAuthenticationNotificationEmails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_QuickFilter() throws Exception {
		element = null;
		try {
			element = psUtility
					.switchFrame("driver.findElement(By.xpath(\"//input[@class='form-control input-sm']\"))");
			Log.info("txt_QuickFilter found in TS_ChangeAuthenticationNotificationEmails_Page");
		} catch (Exception e) {
			Log.info("txt_QuickFilter not found in TS_ChangeAuthenticationNotificationEmails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_Result1() throws Exception {
		element = null;
		try {
			element = psUtility
					.switchFrame("driver.findElement(By.xpath(\"//*[starts-with(@id,'SM_CD_CONTENT_VAL')]\"))");
			Log.info("lnk_Result1 found in TS_ChangeAuthenticationNotificationEmails_Page");
		} catch (Exception e) {
			Log.info("lnk_Result1 not found in TS_ChangeAuthenticationNotificationEmails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_AddEditSubj() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_NTF_WRK_SM_CO_EDIT\"))");
			Log.info("lnk_AddEditSubj found in TS_ChangeAuthenticationNotificationEmails_Page");
		} catch (Exception e) {
			Log.info("lnk_AddEditSubj not found in TS_ChangeAuthenticationNotificationEmails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Desc() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_NT_SM_CO_DESCR120\"))");
			Log.info("txt_Desc found in TS_ChangeAuthenticationNotificationEmails_Page");
		} catch (Exception e) {
			Log.info("txt_Desc not found in TS_ChangeAuthenticationNotificationEmails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_Priority() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_NT_SM_CO_NTF_PRIORITY\"))");
			Log.info("txt_Priority found in TS_ChangeAuthenticationNotificationEmails_Page");
		} catch (Exception e) {
			Log.info("txt_Priority not found in TS_ChangeAuthenticationNotificationEmails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_Sender() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_NT_SM_CO_NTF_SENDER\"))");
			Log.info("txt_Sender found in TS_ChangeAuthenticationNotificationEmails_Page");
		} catch (Exception e) {
			Log.info("txt_Sender not found in TS_ChangeAuthenticationNotificationEmails_Page");
			throw (e);
		}
		return element;
	}

	// body[@class='cke_editable cke_editable_themed cke_contents_ltr
	// cke_show_borders']/div/p
	public static WebElement txt_subjorContent() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame(
					"driver.findElement(By.cssSelector(\".cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders>div\"))");
			Log.info("txt_subj found in TS_ChangeAuthenticationNotificationEmails_Page");
		} catch (Exception e) {
			Log.info("txt_subj not found in TS_ChangeAuthenticationNotificationEmails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Ok() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
			Log.info("btn_Ok found in RV_AddAction_Page");
		} catch (Exception e) {
			Log.info("btn_Ok not found in RV_AddAction_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_AddEditContent() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_NTF_WRK_SM_CO_EDIT_CONTENT\"))");
			Log.info("lnk_AddEditContent found in TS_ChangeAuthenticationNotificationEmails_Page");
		} catch (Exception e) {
			Log.info("lnk_AddEditContent not found in TS_ChangeAuthenticationNotificationEmails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_AuthenticateEdit() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_TREE_WRK_SM_CD_REV_ATHEVNTS\"))");
			Log.info("lnk_AuthenticateEdit found in TS_ChangeAuthenticationNotificationEmails_Page");
		} catch (Exception e) {
			Log.info("lnk_AuthenticateEdit not found in TS_ChangeAuthenticationNotificationEmails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_NotfTemResult() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"SM_CO_USR_SELFREG_TEMPLATE\"))");
			Log.info("lnk_NotfTemResult found in TS_ChangeAuthenticationNotificationEmails_Page");
		} catch (Exception e) {
			Log.info("lnk_NotfTemResult not found in TS_ChangeAuthenticationNotificationEmails_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement Element_DivId() throws Exception {
		element = null;
		try {
			// element =
			// psUtility.switchFrame("driver.findElement(By.id(\"cke_1_contents\"))");
			element = psUtility.switchFrame("driver.findElement(By.cssSelector(\"div[id^='cke_']\"))");
			Log.info("Element_DivId found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("Element_DivId not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_insertBind() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame(
					"driver.findElement(By.cssSelector(\".cke_button_label.cke_button__insertbinds_label\"))");
			Log.info("btn_insertBind found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_insertBind not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_BindVariable() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\".//*[text()='*Bind variable']/parent::div/div/div/input\"))");
			Log.info("btn_BindVariable found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_BindVariable not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_BindOK() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[text()='OK']\"))");
			Log.info("btn_BindOK found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_BindOK not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	/*
	 * public static WebElement Element_DivIdEmailContent() throws Exception {
	 * element = null; try { element =
	 * psUtility.switchFrame("driver.findElement(By.id(\"cke_28_contents\"))");
	 * Log.info("Element_DivId found in the TS_ChangeContentOnUserPage_Page"); }
	 * catch (Exception e) {
	 * Log.info("Element_DivId not found in the TS_ChangeContentOnUserPage_Page");
	 * throw (e); } return element; }
	 * 
	 */

}
