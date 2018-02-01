package pageObjects.activityObjects.CA_Tasks.PayroleAndTaxes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_ResidenceTaxWithholding_Page extends BaseClass {
	public static WebElement element;

	public CA_ResidenceTaxWithholding_Page(WebDriver driver) {
		super(driver);
	}

	/********************* AR - Arkansas ***************************/
	public static WebElement chkbx_Youclaimyourself() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_AR_EXEMPT_U$0\"))");

			Log.info("chkbx_ExempClaimed found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("chkbx_ExempClaimed not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_NoOfChildren() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_NO_OF_DEPDNT$0\"))");

			Log.info("txt_NoOfChildren found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_NoOfChildren not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_AdditionalAmount() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SWT_ADDL_AMT$0\"))");

			Log.info("txt_AdditionalAmount found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_AdditionalAmount not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdbtn_LowIncomeTaxRates() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_AR_TAX_RATES$0$N\"))");

			Log.info("rdbtn_LowIncomeTaxRates found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("rdbtn_LowIncomeTaxRates not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	/********************* AZ - Arizona ***************************/
	public static WebElement rdbtn_ElectArizona() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_AZ_SWT_EXEMP$0$N\"))");

			Log.info("rdbtn_ElectArizona found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("rdbtn_ElectArizona not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	/***************************************************************************
	 * CO - Colorado,DE - Delaware, HI - Hawaii,ID - Idaho,KS - Kansas,LA,
	 * MD -Marylan,MT - Montanad,NE - Nebraska,NJ - New Jersey,NM - New Mexico,
	 * OK -Oklahoma,SC - South Carolina,UT - Utah,VT - Vermont
	 **************************************************************************/
	public static WebElement rdbtn_Single() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_SWT_MAR_STAT$0$S\"))");

			Log.info("rdbtn_Single found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("rdbtn_Single not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_TotalNumberAllowances() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SWT_ALLOWANCES$0\"))");

			Log.info("txt_TotalNumberAllowances found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_TotalNumberAllowances not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	/********************* DC - District of Columbia ***************************/
	public static WebElement txt_TotalNumberAllowancesSecA() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_DC_ALLW_SECA$0\"))");

			Log.info("txt_TotalNumberAllowancesSecA found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_TotalNumberAllowancesSecA not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_TotalNumberAllowancesSecB() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_DC_ALLW_SECB$0\"))");

			Log.info("txt_TotalNumberAllowancesSecB found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_TotalNumberAllowancesSecB not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdbtn_MyDomicile() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_DC_OTHR_STAT$0$N\"))");

			Log.info("rdbtn_MyDomicile found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("rdbtn_MyDomicile not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	/********************* IA - Iowa ***************************/
	public static WebElement txt_PersonalAllowances() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_PERSNAL_ALLW$0\"))");

			Log.info("txt_PersonalAllowances found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_PersonalAllowances not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	/********************* IN - Indiana,LA ***************************/
	public static WebElement txt_CountyOfResidence() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_IN_CNTY_RES$0\"))");

			Log.info("txt_CountyOfResidence found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_CountyOfResidence not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_CountyOfPrincipal() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_IN_CNTY_EMPL$0\"))");

			Log.info("txt_CountyOfPrincipal found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_CountyOfPrincipal not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_OneExemption() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_SINGL_EXEMPT$0\"))");

			Log.info("txt_OneExemption found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_OneExemption not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_AdditionalCountyAmt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_COUNTY_EX$0\"))");

			Log.info("txt_AdditionalCountyAmt found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_AdditionalCountyAmt not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	/********************* KY - Kentucky ***************************/
	public static WebElement txt_MarriedExemption() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_MARRD_EXEMPT$0\"))");

			Log.info("txt_MarriedExemption found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_MarriedExemption not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	/*********************
	 * MO - Missouri,MS - Mississippi,RI,WI - Wisconsin
	 ***************************/
	public static WebElement txt_ExemptStatus() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_EXEMPT$0\"))");

			Log.info("txt_ExemptStatus found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_ExemptStatus not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	/********************* NC - North Carolina ***************************/
	public static WebElement txt_NCAdditionalAmt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_NC_ADDL_AMT$0\"))");

			Log.info("txt_NCAdditionalAmt found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_NCAdditionalAmt not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	/********************* OH - Ohio ***************************/
	public static WebElement txt_PersonalExemption() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_NO_PRS_EXMPT$0\"))");

			Log.info("txt_PersonalExemption found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_PersonalExemption not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	/********************* VA - Virginia ***************************/
	public static WebElement chkBox_ServicememberCivilReliefAct() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_MSRRA_EXEMPT$0\"))");

			Log.info("chkBox_ServicememberCivilReliefAct found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("chkBox_ServicememberCivilReliefAct not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}
	
	/********************* WV - West Virginia ***************************/
//   "WV"=West Virginia 
	public static WebElement chkBox_IAgree() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_ADDR_WRK_SM_OB_I_AGREE\"))");

			Log.info("chkBox_IAgree found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("chkBox_IAgree not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_ElectronicSigature() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAX_WRK_SM_OB_AGREE\"))");

			Log.info("btn_ElectronicSigature found in the CA_ResidenceTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("btn_ElectronicSigature not found in the CA_ResidenceTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

}
