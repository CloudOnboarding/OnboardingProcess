package pageObjects.Revision.Configuaration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class ManageAdhocReport_page extends BaseClass {
	private static WebElement element;

	public ManageAdhocReport_page(WebDriver driver) {
		super(driver);
	}
	 public static WebElement lnk_ManageAdhocReport() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_TREE_WRK_SM_CD_REV_ADHC\"))");
				Log.info("lnk_ManageAdhocReport found in ManageAdhocReport_page");
			} catch (Exception e){
				Log.info("lnk_ManageAdhocReport not found in ManageAdhocReport_page");
				throw (e);
			}
			return element;
		}
	 public static WebElement btn_PDFTemplate() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_PDF_TMP_V_SM_PDF_DESCR$prompt$0\"))");
				Log.info("btn_PDFTemplate found in ManageAdhocReport_page");
			} catch (Exception e){
				Log.info("btn_PDFTemplate not found in ManageAdhocReport_page");
				throw (e);
			}
			return element;
		}
	 public static WebElement txt_QuickFilter() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@class='form-control input-sm']\"))");
				Log.info("txt_QuickFilter found in ManageAdhocReport_page");
			} catch (Exception e) {
				Log.info("txt_QuickFilter not found in ManageAdhocReport_page");
				throw (e);
			}
			return element;
		}
	 public static WebElement lnk_SearchClick() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.name(\"RESULT0$0\"))");
				Log.info("lnk_SearchClick found in ManageAdhocReport_page");
			} catch (Exception e){
				Log.info("lnk_SearchClick not found in ManageAdhocReport_page");
				throw (e);
			}
			return element;
		}
	 public static WebElement lnk_DefineCriteria() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ADHC_WRK_SM_CD_DEFINE_RULE$0\"))");
				Log.info("lnk_DefineCriteria found in ManageAdhocReport_page");
			} catch (Exception e){
				Log.info("lnk_DefineCriteria not found in ManageAdhocReport_page");
				throw (e);
			}
			return element;
		}
	 public static WebElement rdbtn_AlwaysRoute() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_RLCHD_STG_SM_CD_ALWAYSROUTE\"))");
				Log.info("rdbtn_AlwaysRoute found in ManageAdhocReport_page");
			} catch (Exception e){
				Log.info("rdbtn_AlwaysRoute not found in ManageAdhocReport_page");
				throw (e);
			}
			return element;
		}
	 public static WebElement btn_save() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
				Log.info("btn_save found in ManageAdhocReport_page");
			} catch (Exception e){
				Log.info("btn_save not found in ManageAdhocReport_page");
				throw (e);
			}
			return element;
		}
	 public static WebElement sel_ParticipantPool() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ADHC_PRTC_SM_BP_PARTICIPNT$0\"))");
				Log.info("sel_ParticipantPool found in ManageAdhocReport_page");
			} catch (Exception e){
				Log.info("sel_ParticipantPool not found in ManageAdhocReport_page");
				throw (e);
			}
			return element;
		}

}
