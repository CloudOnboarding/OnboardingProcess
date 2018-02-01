package pageObjects.activityObjects.CA_Tasks.NewHireForms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_UploadDocuments_Page extends BaseClass {
	public static WebElement element;

	public CA_UploadDocuments_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement chkbxFld(int chkbxIndx) throws Exception {//div[contains(@id,'SM_CL_APPL_WRK_SM_CL_CHECK$3')]
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//div[contains(@id,'SM_CL_APPL_WRK_SM_CL_CHECK$"+chkbxIndx+"')]\"))");

			Log.info("chkbxFld_"+chkbxIndx+" found in the CA_UploadDocuments_Page");
		} catch (Exception e) {
			Log.info("chkbxFld_"+chkbxIndx+" not found in the CA_UploadDocuments_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement chkbxDescFld(int chkbxNameIndx) throws Exception {//div[contains(@id,'SM_CL_APPL_WRK_SM_CL_CHECK$3')]//win0divSM_CL_APLITEM_V_SM_CL_DESCR
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//div[contains(@id,'SM_CL_APLITEM_V_SM_CL_DESCR$"+chkbxNameIndx+"')]\"))");

			Log.info("chkbxDescFld_"+chkbxNameIndx+" found in the CA_UploadDocuments_Page");
		} catch (Exception e) {
			Log.info("chkbxDescFld_"+chkbxNameIndx+" not found in the CA_UploadDocuments_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_Attach(int AttcBtnIndx) throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"APPL_ATTACH_PB$"+AttcBtnIndx+"\"))");

			Log.info("btn_Attach"+AttcBtnIndx+" found in the CA_UploadDocuments_Page");
		} catch (Exception e) {
			Log.info("btn_Attach"+AttcBtnIndx+" not found in the CA_UploadDocuments_Page");
			throw (e);
		}

		return element;

	}
	
	public static WebElement btn_Attach1(int AttcBtnIndx) throws Exception {//SM_CL_ATTACH_WK_SM_CL_ATTACH_PB$0
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CL_ATTACH_WK_SM_CL_ATTACH_PB$"+AttcBtnIndx+"\"))");

			Log.info("btn_Attach1_"+AttcBtnIndx+" found in the CA_UploadDocuments_Page");
		} catch (Exception e) {
			Log.info("btn_Attach1_"+AttcBtnIndx+" not found in the CA_UploadDocuments_Page");
			throw (e);
		}
		
		return element;

	}
	public static WebElement txt_FilePath() throws Exception {
		element = null;
		try {//*[@name='#ICOrigFileName']
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@name='#ICOrigFileName']\"))");
			Log.info("txt__FilePath found in the CA_UploadDocuments_Page");
		} catch (Exception e) {
			Log.info("txt__FilePath not found in the CA_UploadDocuments_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_Upload() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@value='Upload']\"))");
			Log.info("btn_Upload found in the CA_UploadDocuments_Page");
		} catch (Exception e) {
			Log.info("btn_Upload not found in the CA_UploadDocuments_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_OK() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"OK_BTN\"))");

			Log.info("btn_OK found in the CA_UploadDocuments_Page");
		} catch (Exception e) {
			Log.info("btn_OK not found in the CA_UploadDocuments_Page");
			throw (e);
		}

		return element;

	}

	public static WebElement btn_Submit() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CL_WRK_SAVEBTN\"))");

			Log.info("btn_Submit found in the CA_UploadDocuments_Page");
		} catch (Exception e) {
			Log.info("btn_Submit not found in the CA_UploadDocuments_Page");
			throw (e);
		}

		return element;

	}

}
