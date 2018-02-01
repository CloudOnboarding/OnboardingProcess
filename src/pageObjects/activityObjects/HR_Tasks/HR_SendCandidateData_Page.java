package pageObjects.activityObjects.HR_Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class HR_SendCandidateData_Page extends BaseClass {
	public static WebElement element;

	public HR_SendCandidateData_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement btn_DownloadSignedForms() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_WRK_SM_OB_DOWNLOAD_PB\"))");

			Log.info("btn_DownloadSignedForms found in the HR_SendCandidateData_Page");
		} catch (Exception e) {
			Log.info("btn_DownloadSignedForms not found in the HR_SendCandidateData_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbx_ProcessComplete() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_BP_WRK_SM_BP_AGREE\"))");

			Log.info("chkbx_ProcessComplete found in the HR_SendCandidateData_Page");
		} catch (Exception e) {
			Log.info("chkbx_ProcessComplete not found in the HR_SendCandidateData_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement chkbx_ProcessComplete1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_WRK_SM_OB_I_AGREE\"))");

			Log.info("chkbx_ProcessComplete found in the HR_SendCandidateData_Page");
		} catch (Exception e) {
			Log.info("chkbx_ProcessComplete not found in the HR_SendCandidateData_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_SavetoHRMS() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_WRK_SAVE_ALL\"))");

			Log.info("btn_SavetoHRMS found in the HR_SendCandidateData_Page");
		} catch (Exception e) {
			Log.info("btn_SavetoHRMS not found in the HR_SendCandidateData_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_SaveSendCandidatetoHRMS() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_BP_WRK_SM_BP_CERTIFY\"))");

			Log.info("btn_SaveSendCandidatetoHRMS found in the HR_SendCandidateData_Page");
		} catch (Exception e) {
			Log.info("btn_SaveSendCandidatetoHRMS not found in the HR_SendCandidateData_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_SaveSendCandidatetoHRMS1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_WRK_SUBMIT_PB\"))");

			Log.info("btn_SaveSendCandidatetoHRMS found in the HR_SendCandidateData_Page");
		} catch (Exception e) {
			Log.info("btn_SaveSendCandidatetoHRMS not found in the HR_SendCandidateData_Page");
			throw (e);
		}
		return element;
	}

}
