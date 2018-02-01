package pageObjects.activityObjects.Everify_Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class EVerify_Page extends BaseClass {
	public static WebElement element;

	public EVerify_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement btn_InitiateEVerify() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_WRK_SM_I9_EVERIFY_PB\"))");

			Log.info("btn_InitiateEVerify found in the EVerify_Page");
		} catch (Exception e) {
			Log.info("btn_InitiateEVerify not found in the EVerify_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_ReVerify() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_WRK_SM_I9_REVERIFY\"))");

			Log.info("btn_ReVerify found in the EVerify_Page");
		} catch (Exception e) {
			Log.info("btn_ReVerify not found in the EVerify_Page");
			throw (e);
		}
		return element;
	}
	
	 public static WebElement btn_ReferCase() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_WRK_SM_I9_REVERIFY\"))");

			Log.info("btn_ReferCase found in the EVerify_Page");
		} catch (Exception e) {
			Log.info("btn_ReferCase not found in the EVerify_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_PrintNotice() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_WRK_SM_I9_PRINTNOTICE\"))");

			Log.info("btn_PrintNotice found in the EVerify_Page");
		} catch (Exception e) {
			Log.info("btn_PrintNotice not found in the EVerify_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbx_IhaveNotified() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_WRK_SM_I9_CONFIRM_TNC\"))");

			Log.info("chkbx_IhaveNotified found in the EVerify_Page");
		} catch (Exception e) {
			Log.info("chkbx_IhaveNotified not found in the EVerify_Page");
			throw (e);
		}
		return element;
	}
//SM_DF_INST_WRK_SM_DF_VIEW_NAME
	public static WebElement btn_CloseCase() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_WRK_SM_I9_CLOSECASE_BT\"))");

			Log.info("btn_CloseCase found in the EVerify_Page");
		} catch (Exception e) {
			Log.info("btn_CloseCase not found in the EVerify_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement select_SwitcView() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_DF_INST_WRK_SM_DF_VIEW_NAME\"))");

			Log.info("select_SwitcView found in the EVerify_Page");
		} catch (Exception e) {
			Log.info("select_SwitcView not found in the EVerify_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdbtn_yes() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_CLOSECASE\"))");

			Log.info("rdbtn_yes found in the EVerify_Page");
		} catch (Exception e) {
			Log.info("rdbtn_yes not found in the EVerify_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdbtn_IncorrectData() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@sm-id='IncorrectdataInpt']\"))");

			Log.info("rdbtn_IncorrectData found in the EVerify_Page");
		} catch (Exception e) {
			Log.info("rdbtn_IncorrectData not found in the EVerify_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdbtn_no() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_CLOSECASE$6$\"))");

			Log.info("rdbtn_no found in the EVerify_Page");
		} catch (Exception e) {
			Log.info("rdbtn_no not found in the EVerify_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_CaseNumber() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_CASE_NBR\"))");

			Log.info("btn_CaseNumber found in the EVerify_Page");
		} catch (Exception e) {
			Log.info("btn_CaseNumber not found in the EVerify_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Next() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_DF_HOOK_WK_SM_DF_NEXT_TASK\"))");

			Log.info("btn_Next found in the EVerify_Page");
		} catch (Exception e) {
			Log.info("btn_Next not found in the EVerify_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdbtn_DataAlreadyExists() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_HR_PERSON_SM_I9_ENTER_DATA$11$\"))");

			Log.info("rdbtn_DataAlreadyExists found in the EVerify_Page");
		} catch (Exception e) {
			Log.info("rdbtn_DataAlreadyExists not found in the EVerify_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_submitCloseCase() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_WRK_SM_I9_CLOSECASE\"))");

			Log.info("btn_submitCloseCase found in the EVerify_Page");
		} catch (Exception e) {
			Log.info("btn_submitCloseCase not found in the EVerify_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_submit() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_WRK_SM_I9_SUBMIT\"))");

			Log.info("btn_submit found in the EVerify_Page");
		} catch (Exception e) {
			Log.info("btn_submit not found in the EVerify_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_FinalizeEVerify() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_AF_ACTION_Finalize E-Verify\"))");

			Log.info("lnk_FinalizeEVerify found in the EVerify_Page");
		} catch (Exception e) {
			Log.info("lnk_FinalizeEVerify not found in the EVerify_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement get_SubStatus() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//span[@sm-id='docSubStatusValSpan']\"))");

			Log.info("get_SubStatus found in the EVerify_Page");
		} catch (Exception e) {
			Log.info("get_SubStatus not found in the EVerify_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_Retrieve() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_WRK_SM_I9_RETVPHOTO\"))");

			Log.info("btn_Retrieve found in the EVerify_Page");
		} catch (Exception e) {
			Log.info("btn_Retrieve not found in the EVerify_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement rbtn_ConfirmPhotoYes() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_WRK_SM_I9_PHOTOMATCH_LBL\"))");

			Log.info("rbtn_Yes found in the EVerify_Page");
		} catch (Exception e) {
			Log.info("rbtn_Yes not found in the EVerify_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_ConfirmPhotoNext() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_I9_WRK_SM_I9_REVERIFY\"))");

			Log.info("btn_ConfirmPhotoNext found in the EVerify_Page");
		} catch (Exception e) {
			Log.info("btn_ConfirmPhotoNext not found in the EVerify_Page");
			throw (e);
		}
		return element;
	}
	
	
}
