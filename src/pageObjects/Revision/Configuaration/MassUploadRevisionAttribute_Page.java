package pageObjects.Revision.Configuaration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class MassUploadRevisionAttribute_Page extends BaseClass {
	private static WebElement element;

	public MassUploadRevisionAttribute_Page(WebDriver driver) {
		super(driver);
	}
	 public static WebElement lnk_MassUpload() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_TREE_WRK_SM_CO_UPLOAD\"))");
				Log.info("lnk_MassUpload found in MassUploadRevisionAttribute_Page");
			} catch (Exception e){
				Log.info("lnk_MassUpload not found in MassUploadRevisionAttribute_Page");
				throw (e);
			}
			return element;
		}
	 public static WebElement sel_AttributeType() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REVATR_WK_SM_CD_ATTRB_TYPE\"))");
				Log.info("sel_AttributeType found in MassUploadRevisionAttribute_Page");
			} catch (Exception e){
				Log.info("sel_AttributeType not found in MassUploadRevisionAttribute_Page");
				throw (e);
			}
			return element;
		}
	 public static WebElement btn_Upload() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_WRK_SM_CO_UPLOAD\"))");
				Log.info("btn_Upload found in the MassUploadRevisionAttribute_Page");
			} catch (Exception e) {
				Log.info("btn_Upload not found in the MassUploadRevisionAttribute_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement txt_FilePath() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.name(\"#ICOrigFileName\"))");
				Log.info("txt_FilePath found in the MassUploadRevisionAttribute_Page");
			} catch (Exception e) {
				Log.info("txt_FilePath not found in the MassUploadRevisionAttribute_Page");
				throw (e);
			}
			return element;
		}

		public static WebElement btn_Upload2() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@value='Upload']\"))");
				Log.info("btn_Upload2 found in the MassUploadRevisionAttribute_Page");
			} catch (Exception e) {
				Log.info("btn_Upload2 not found in the MassUploadRevisionAttribute_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement btn_Push() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.name(\"SM_CD_WRK_APPLY$0\"))");
				Log.info("btn_Push found in the MassUploadRevisionAttribute_Page");
			} catch (Exception e) {
				Log.info("btn_Push not found in the MassUploadRevisionAttribute_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement btn_Return() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.name(\"SM_CO_WRK_OK_BTN\"))");
				Log.info("btn_Return found in the MassUploadRevisionAttribute_Page");
			} catch (Exception e) {
				Log.info("btn_Return not found in the MassUploadRevisionAttribute_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement btn_Discard() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_WRK_DELETE_PB$0\"))");
				Log.info("btn_Discard found in the MassUploadRevisionAttribute_Page");
			} catch (Exception e) {
				Log.info("btn_Discard not found in the MassUploadRevisionAttribute_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement btn_yes() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"#ICYes\"))");
				Log.info("btn_yes found in the MassUploadRevisionAttribute_Page");
			} catch (Exception e) {
				Log.info("btn_yes not found in the MassUploadRevisionAttribute_Page");
				throw (e);
			}
			return element;
		}

}
