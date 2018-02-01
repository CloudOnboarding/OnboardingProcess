package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

	public class TS_AddPolicyBenefitSpecific_Page extends BaseClass {

		private static WebElement element;

		public TS_AddPolicyBenefitSpecific_Page(WebDriver driver) {
			super(driver);
		}
		public static WebElement Lnk_ConfigMenu() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"configMenu\"))");
				Log.info("lnk_ConfigMnu found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info("lnk_ConfigMnu not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement Lnk_AddRevision() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.linkText(\"Add/Update Revision\"))");
				Log.info("Lnk_AddRevision found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info("Lnk_AddRevision not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement lnk_Add() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSwitchMode\"))");
				Log.info("lnk_Add found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info("lnk_Add not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
	}
		public static WebElement sel_RevisionType() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_HDR_SM_CD_REV_TYPE\"))");
				Log.info(" sel_RevisionType found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" sel_RevisionType not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}public static WebElement txt_Descr() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_HDR_SM_CD_REV_DESCR\"))");
				Log.info(" txt_Descr found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" txt_Descr not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement btn_reserve() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_WRK_SM_CO_SAVE_PB\"))");
				Log.info(" btn_reserve found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" btn_reserve not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement btn_Config() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_WRK_SM_CD_CONFIGURE\"))");
				Log.info(" btn_Config found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" btn_Config not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement lnk_AddSmartForm() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX11\"))");
				Log.info(" lnk_AddSmartForm found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" lnk_AddSmartForm not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement txt_FormTitle() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_FORM_HDR_SM_SF_FORM_TITLE\"))");
				Log.info(" txt_FormTitle found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" txt_FormTitle not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement txt_LookupDesc() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_FORM_HDR_SM_BP_DESCR120\"))");
				Log.info(" txt_LookupDesc found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" txt_LookupDesc not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement Sel_ParticipentPool() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_FORM_HDR_SM_BP_PARTICIPNT\"))");
				Log.info(" Sel_ParticipentPool found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" Sel_ParticipentPool not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement Sel_RequiredOptional() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_FORM_HDR_SM_BP_ACTIVITY_TYP\"))");
				Log.info(" Sel_RequiredOptional found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" Sel_RequiredOptional not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement Txt_OverrideSave() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_FORM_HDR_SM_SF_SAVE_BTN_LBL\"))");
				Log.info(" Txt_OverrideSave found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" Txt_OverrideSave not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement txt_subjorContent() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.cssSelector(\".cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders>div\"))");
				Log.info(" txt_subjorContent found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" txt_subjorContent not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement Btn_Save() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
				Log.info(" Btn_Save found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" Btn_Save not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;   
		}
		public static WebElement btn_ReturnToManageRevision() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_WRK_SM_CO_RETURN_PB\"))");
				Log.info(" btn_ReturnToManageRevision found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" btn_ReturnToManageRevision not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement btn_Apply() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_WRK_SM_CD_APPLY\"))");
				Log.info(" btn_Apply found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" btn_Apply not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement btn_ok() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"#ICOK\"))");
				Log.info(" btn_ok found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" btn_ok not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement lnk_Company() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.linkText(\"Company\"))");
				Log.info(" lnk_Company found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" lnk_Company not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement lnk_Retail() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\".//*[text()='C000000002']\"))");
				Log.info(" lnk_Retail found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" lnk_Retail not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement lnk_Policy() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\".//*[@id='SM_CD_CC_CFG_VW_DESCR100$0']\"))");
				Log.info(" lnk_Policy found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" lnk_Policy not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement Sel_Action() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_CC_L_SM_BP_CH_ACTION_ID$0\"))");
				Log.info(" Sel_Action found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" Sel_Action not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement lnk_ManageContentSecurity() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_TREE_WRK_SM_CD_REV_SECURITY\"))");
				Log.info(" lnk_ManageContentSecurity found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" lnk_ManageContentSecurity not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement Btn_AssignAction() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_SEC_W_SM_CD_REFRESH\"))");
				Log.info(" Btn_AssignAction found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" Btn_AssignAction not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement Btn_ok() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_ACTSEL_WK_SM_BP_OK\"))");
				Log.info(" Btn_ok found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" Btn_ok not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement lnk_ManageBusinessRules() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_TREE_WRK_SM_CD_REV_RULES\"))");
				Log.info(" lnk_ManageBusinessRules found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" lnk_ManageBusinessRules not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement lable_CompanyPolicies() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\".//*[span='Company Policies']\"))");
				Log.info(" lable_CompanyPolicies found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" lable_CompanyPolicies not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement Btn_Close() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\".//*[@id='sm_ps_alert_modal']/div[2]/div/div[3]/input\"))");
				Log.info(" Btn_Close found in the TS_AddPolicyBenefitSpecific_Page");
			} catch (Exception e) {
				Log.info(" Btn_Close not found in the TS_AddPolicyBenefitSpecific_Page");
				throw (e);
			}
			return element;
		}
		

}
