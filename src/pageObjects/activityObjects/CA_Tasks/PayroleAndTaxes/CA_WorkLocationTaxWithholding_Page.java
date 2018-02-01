package pageObjects.activityObjects.CA_Tasks.PayroleAndTaxes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CA_WorkLocationTaxWithholding_Page extends BaseClass {
	public static WebElement element;

	public CA_WorkLocationTaxWithholding_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement rdbtn_SingleOrMarried() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_SWT_MAR_STAT$0$S\"))");

			Log.info("rdbtn_SingleOrMarried found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("rdbtn_SingleOrMarried not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdbtn_MarriedOneIncome() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_SWT_MAR_STAT$0$M\"))");

			Log.info("rdbtn_MarriedOneIncome found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("rdbtn_MarriedOneIncome not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdbtn_HeadOfHouseHold() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_SWT_MAR_STAT$0$H\"))");

			Log.info("rdbtn_HeadOfHouseHold found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("rdbtn_HeadOfHouseHold not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_RegularWithholdingAllowances() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_CA_WS_A_ALLW$0\"))");

			Log.info("txt_RegulatWithholdingAllowances found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_RegulatWithholdingAllowances not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_ExtimatedDeductions() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_CA_WS_B_ALLW$0\"))");

			Log.info("txt_ExtimatedDeductions found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_ExtimatedDeductions not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_AdditionalAmt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SWT_ADDL_AMT$0\"))");

			Log.info("txt_AdditionalAmt found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_AdditionalAmt not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkBox_NotSubToCaliforniaWitholding() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_MSRRA_EXEMPT$0\"))");

			Log.info("chkBox_NotSubToCaliforniaWitholding found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("chkBox_NotSubToCaliforniaWitholding not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkBox_IAgree() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_ADDR_WRK_SM_OB_I_AGREE\"))");

			Log.info("chkBox_IAgree found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("chkBox_IAgree not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_ElectronicSigature() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAX_WRK_SM_OB_AGREE\"))");

			Log.info("btn_ElectronicSigature found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("btn_ElectronicSigature not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdbtn_ResidentNewYork() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_NY_RESIDENT$0$N\"))");
			Log.info("rdbtn_ResidentNewYork found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("rdbtn_ResidentNewYork not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdbtn_Yonkers() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_NY_YONKR_RES$0$N\"))");
			Log.info("rdbtn_Yonkers found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("rdbtn_Yonkers not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_TotalNumberAllowances() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SWT_ALLOWANCES$0\"))");
			Log.info("txt_TotalNumberAllowances found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_TotalNumberAllowances not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

/*	public static WebElement txt_NewYorkStateAmount() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SWT_ADDL_AMT$0\"))");
			Log.info("txt_NewYorkStateAmount found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_NewYorkStateAmount not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}*/

	/*************** AL **********/
	public static WebElement txt_ClimNoPersonalExempt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_AL_NO_PRS_EX$0\"))");
			Log.info("txt_ClimNoPersonalExempt found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_ClimNoPersonalExempt not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

/*	public static WebElement txt_AdditionalAmt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SWT_ADDL_AMT$0\"))");
			Log.info("txt_AdditionalAmt found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_AdditionalAmt not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}*/

	public static WebElement chk_IAgree() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_ADDR_WRK_SM_OB_I_AGREE\"))");
			Log.info("chk_IAgree found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("chk_IAgree not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_ObAgree() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAX_WRK_SM_OB_AGREE\"))");
			Log.info("btn_ObAgree found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("btn_ObAgree not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	/*************************** CA ********************/
/*	public static WebElement rdbtn_StatusWithldAllow() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_SWT_MAR_STAT$0$S\"))");
			Log.info("rdbtn_StatusWithldAllow found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("rdbtn_StatusWithldAllow not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}*/

/*	public static WebElement txt_EstimatedDeductions() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_CA_WS_B_ALLW$0\"))");
			Log.info("txt_EstimatedDeductions found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_EstimatedDeductions not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}*/

	/************************ CT *********/

	public static WebElement txt_WithHoldingCode() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_CT_WH_CODE$0\"))");
			Log.info("txt_WithHoldingCode found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_WithHoldingCode not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_AddlWithHoldingAmt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_CT_ADDL_AMT$0\"))");
			Log.info("txt_AddlWithHoldingAmt found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_AddlWithHoldingAmt not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	/************************ GA *********/
	public static WebElement txt_Single() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_GA_SINGLE_EX$0\"))");
			Log.info("txt_Single found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_Single not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_DependntAllow() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_NO_OF_DEPDNT$0\"))");
			Log.info("txt_DependntAllow found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_DependntAllow not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_AddnlAllow() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_GA_ADDL_ALLW$0\"))");
			Log.info("txt_AddnlAllow found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_AddnlAllow not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

/*	public static WebElement txt_Addnlwthlding() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SWT_ADDL_AMT$0\"))");
			Log.info("txt_EstimatedDeductions found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_EstimatedDeductions not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}
*/
	/************************ IL *********/
/*	public static WebElement txt_BasicAllow() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SWT_ALLOWANCES$0\"))");
			Log.info("txt_EstimatedDeductions found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_EstimatedDeductions not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}*/

	public static WebElement txt_AddnlAllowences() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SWT_ADDL_ALLOWNCES$0\"))");
			Log.info("txt_AddnlAllowences found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_AddnlAllowences not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

/*	public static WebElement txt_AddnlAmnt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SWT_ADDL_AMT$0\"))");
			Log.info("txt_EstimatedDeductions found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_EstimatedDeductions not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}*/

	/************************ MI *********/
	public static WebElement chk_PermntHome() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_MI_HOME_ZONE$0\"))");
			Log.info("chk_PermntHome found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("chk_PermntHome not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_ResidanceZone() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_RES_STATE$0\"))");
			Log.info("txt_ResidanceZone found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_ResidanceZone not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

	/************************ MN *********/
	/*public static WebElement rdbtn_MartlStatus() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_SWT_MAR_STAT$0$S\"))");
			Log.info("txt_EstimatedDeductions found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_EstimatedDeductions not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}
*/
	public static WebElement rdbtn_Section1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_MN_SECTION$0$Y\"))");
			Log.info("rdbtn_Section1 found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("rdbtn_Section1 not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}
/*
	public static WebElement txt_TotalAllow() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SWT_ALLOWANCES$0\"))");
			Log.info("txt_EstimatedDeductions found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_EstimatedDeductions not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}*/
/*
	public static WebElement txt_AddlAmount() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SWT_ADDL_AMT$0\"))");
			Log.info("txt_EstimatedDeductions found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_EstimatedDeductions not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}*/

	/************************ NY *********/
	public static WebElement rdbtn_ResdNY() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_NY_RESIDENT$0$Y\"))");
			Log.info("rdbtn_ResdNY found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("rdbtn_ResdNY not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}

/*	public static WebElement rdbtn_YonkersResd() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_NY_YONKR_RES$0$N\"))");
			Log.info("txt_EstimatedDeductions found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_EstimatedDeductions not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}*/
	public static WebElement txt_NYAllow() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_NY_CITY_ALLW$0\"))");
			Log.info("txt_NYAllow found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_NYAllow not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}
	
	/************************ MA *********/
	
	public static WebElement txt_PersonalExempt() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_TAL_ICSX_SM_OB_NO_PRS_EXMPT$0\"))");
			Log.info("txt_PersonalExempt found in the CA_WorkLocationTaxWithholding_Page");
		} catch (Exception e) {
			Log.info("txt_PersonalExempt not found in the CA_WorkLocationTaxWithholding_Page");
			throw (e);
		}
		return element;
	}
	
	
}