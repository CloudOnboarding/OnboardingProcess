package pageObjects.Revision.Configuaration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class I9Criteria_Page extends BaseClass{
	
	private static WebElement element;

	public I9Criteria_Page(WebDriver driver) {
		super(driver);
	}
	public static WebElement Rdbtn_RouteCriteria() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_RLCHD_STG_SM_CD_ALWAYSROUTE$81$\"))");
			Log.info("Rdbtn_RouteCriteria found in I9Criteria_Page");
		} catch (Exception e) {
			Log.info("Rdbtn_RouteCriteria not found in I9Criteria_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement Rdbtn_AlwaysRoute() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_RLCHD_STG_SM_CD_ALWAYSROUTE\"))");
			Log.info("Rdbtn_AlwaysRoute found in I9Criteria_Page");
		} catch (Exception e) {
			Log.info("Rdbtn_AlwaysRoute not found in I9Criteria_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Prmpt_PrcsVar() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.cssSelector(\"button.btn.btn-secondary.pvar-picker\"))");
			Log.info("Prmpt_PrcsVar found in I9Criteria_Page");
		} catch (Exception e) {
			Log.info("Prmpt_PrcsVar not found in I9Criteria_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_PrcsVarType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Invitation\"))");
			Log.info("lnk_PrcsVarType found in I9Criteria_Page");
		} catch (Exception e) {
			Log.info("lnk_PrcsVarType not found in I9Criteria_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_PrcsVar() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.partialLinkText(\"Worksite Location Details\"))");
			Log.info("lnk_PrcsVar found in I9Criteria_Page");
		} catch (Exception e) {
			Log.info("lnk_PrcsVar not found in I9Criteria_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_WrkResdState() throws Exception {
		element = null;
		try {
			//element = psUtility.switchFrame("driver.findElement(By.partialLinkText(\"Compare Work/Residence States\"))");
			element = psUtility.switchFrame("driver.findElement(By.partialLinkText(\"Worksite Country Code\"))");
			Log.info("lnk_WrkResdState found in I9Criteria_Page");
		} catch (Exception e) {
			Log.info("lnk_WrkResdState not found in I9Criteria_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement sel_operator() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_RLCRT_STG_SM_BP_CRTA_TYPE$0\"))");
			Log.info("sel_operator found in I9Criteria_Page");
		} catch (Exception e) {
			Log.info("sel_operator not found in I9Criteria_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_PrcsVal() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"FROM_VALUE_NP$0\"))");
			Log.info("txt_PrcsVal found in I9Criteria_Page");
		} catch (Exception e) {
			Log.info("txt_PrcsVal not found in I9Criteria_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@value='Save']\"))");
			Log.info("btn_Save found in I9Criteria_Page");
		} catch (Exception e) {
			Log.info("btn_Save not found in I9Criteria_Page");
			throw (e);
		}
		return element;
	}
}
