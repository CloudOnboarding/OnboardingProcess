package pageObjects.activityObjects.CA_Tasks.PayroleAndTaxes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_FederalTaxWithholding_Page extends BaseClass {
	public static WebElement element;

	public CA_FederalTaxWithholding_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement rdbtn_Single() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_W4FTX_SM_OB_SWT_MAR_STAT$0$S\"))");

			Log.info("rdbtn_Single found in the CA_FederalTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("rdbtn_Single not found in the CA_FederalTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdbtn_Married() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_W4FTX_SM_OB_SWT_MAR_STAT$0$M\"))");

			Log.info("rdbtn_Married found in the CA_FederalTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("rdbtn_Married not found in the CA_FederalTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdbtn_HigherSingleRate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_W4FTX_SM_OB_SWT_MAR_STAT$0$MS\"))");

			Log.info("rdbtn_HigherSingleRate found in the CA_FederalTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("rdbtn_HigherSingleRate not found in the CA_FederalTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkBox_LastnameDiffer() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_W4FTX_W4_NAME_CHECK$0\"))");

			Log.info("chkBox_LastnameDiffer found in the CA_FederalTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("chkBox_LastnameDiffer not found in the CA_FederalTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_ClimeAllowances() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_W4FTX_FWT_ALLOWANCES$0\"))");

			Log.info("txt_ClimeAllowances found in the CA_FederalTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_ClimeAllowances not found in the CA_FederalTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_AdditionalAmt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_W4FTX_FWT_ADDL_AMT$0\"))");

			Log.info("txt_AdditionalAmt found in the CA_FederalTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_AdditionalAmt not found in the CA_FederalTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_BothConditions() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_W4FTX_SM_OB_EXEMPT$0\"))");

			Log.info("txt_BothConditions found in the CA_FederalTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_BothConditions not found in the CA_FederalTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkBox_IAgree() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_ADDR_WRK_SM_OB_I_AGREE\"))");

			Log.info("chkBox_IAgree found in the CA_FederalTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("chkBox_IAgree not found in the CA_FederalTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_ElectronicSigature() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAX_WRK_SM_OB_AGREE\"))");

			Log.info("btn_ElectronicSigature found in the CA_FederalTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("btn_ElectronicSigature not found in the CA_FederalTaxWithholding_Page");
			throw (e);
		}
		return element;
	}
}
