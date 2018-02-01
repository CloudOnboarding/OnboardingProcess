package pageObjects.Revision.Content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class SmartChecklists_Page extends BaseClass {
	private static WebElement element;
	
	public SmartChecklists_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement lnk_AddSmartChklist() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX12\"))");
			Log.info("lnk_AddSmartChklist found in the SmartChecklists_Page");
		} catch (Exception e) {
			Log.info("lnk_AddSmartChklist not found in the SmartChecklists_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_ChecklistTitle() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_CL_HDR_SM_CL_TITLE\"))");
			Log.info("txt_ChecklistTitle found in the SmartChecklists_Page");
		} catch (Exception e) {
			Log.info("txt_ChecklistTitle not found in the SmartChecklists_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_ParticipantPool() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_CL_HDR_SM_BP_PARTICIPNT\"))");
			Log.info("sel_ParticipantPool found in the SmartChecklists_Page");
		} catch (Exception e) {
			Log.info("sel_ParticipantPool not found in the SmartChecklists_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_OverrideSaveBtnLbl() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_CL_HDR_SM_CL_SAVE_BTN_LBL\"))");
			Log.info("txt_OverrideSaveBtnLbl found in the SmartChecklists_Page");
		} catch (Exception e) {
			Log.info("txt_OverrideSaveBtnLbl not found in the SmartChecklists_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Description(int DescIndx) throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_CL_TMPL_L_SM_CL_DESCR$"+DescIndx+"\"))");
			Log.info("txt_Description found in the SmartChecklists_Page");
		} catch (Exception e) {
			Log.info("txt_Description not found in the SmartChecklists_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbx_EnableUploads(int UplIndx) throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_WRK_SM_CD_CL_ALW_UPLD$"+UplIndx+"\"))");
			Log.info("chkbx_EnableUploads found in the SmartChecklists_Page");
		} catch (Exception e) {
			Log.info("chkbx_EnableUploads not found in the SmartChecklists_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_EditDtls() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"EDIT_PB$0\"))");
			Log.info("lnk_EditDtls found in the SmartChecklists_Page");
		} catch (Exception e) {
			Log.info("lnk_EditDtls not found in the SmartChecklists_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement chkbx_Required() throws Exception {	
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_CL_TMPL_A_SM_CL_IS_REQUIRED$0\"))");
			Log.info("chkbx_Required found in the SmartChecklists_Page");
		} catch (Exception e) {
			Log.info("chkbx_Required not found in the SmartChecklists_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_OK() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
			Log.info("btn_OK found in the SmartChecklists_Page");
		} catch (Exception e) {
			Log.info("btn_OK not found in the SmartChecklists_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_AddTask() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"GRID_ADD$0\"))");
			Log.info("btn_AddTask found in the SmartChecklists_Page");
		} catch (Exception e) {
			Log.info("btn_AddTask not found in the SmartChecklists_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
			Log.info("btn_Save found in the SmartChecklists_Page");
		} catch (Exception e) {
			Log.info("btn_Save not found in the SmartChecklists_Page");
			throw (e);
		}
		return element;
	}
	
}
