package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TS_AddEmploymentAgreement_Page extends BaseClass {
	private static WebElement element;

	public TS_AddEmploymentAgreement_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement Lnk_ConfigMenu() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"configMenu\"))");
			Log.info("lnk_ConfigMnu found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info("lnk_ConfigMnu not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement Lnk_AddRevision() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Add/Update Revision\"))");
			Log.info("Lnk_AddRevision found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info("Lnk_AddRevision not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Add() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSwitchMode\"))");
			Log.info("btn_Add found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info("btn_Add not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_RevisionType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_HDR_SM_CD_REV_TYPE\"))");
			Log.info(" sel_RevisionType found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info(" sel_RevisionType not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Descr() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_HDR_SM_CD_REV_DESCR\"))");
			Log.info(" txt_Descr found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info(" txt_Descr not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_FieldDescr() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_SF_FRMFLD_RC_SM_SF_FIELD_DESC\"))");
			Log.info(" txt_FieldDescr found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info(" txt_FieldDescr not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_FieldType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_SF_FRMFLD_RC_SM_SF_FIELD_TYPE\"))");
			Log.info(" txt_FieldType found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info(" txt_FieldType not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_reserve() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_WRK_SM_CO_SAVE_PB\"))");
			Log.info(" btn_reserve found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info(" btn_reserve not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Config() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_WRK_SM_CD_CONFIGURE\"))");
			Log.info(" btn_Config found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info(" btn_Config not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_EmplAgreement() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame(
			"driver.findElement(By.xpath(\"//*[@sm-id='attrdescr' and text()='Employment Agreement']\"))");
			Log.info(" lnk_EmplAgreement found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info(" lnk_EmplAgreement not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_EA00000000() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@sm-attrb-id='0000000000']\"))");
			Log.info(" lnk_EA00000000 found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info(" lnk_EA00000000 not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_EA00000001() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\".//*[text()='EA00000001']\"))");
			Log.info(" lnk_EA00000001 found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info(" lnk_EA00000001 not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Description() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_ATTRB_DESCR\"))");
			Log.info(" txt_Description found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info(" txt_Description not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_LookupDescr() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_ATTRB_SM_CD_LOOKUP_DESCR\"))");
			Log.info(" txt_LookupDescr found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info(" txt_LookupDescr not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_InsertChild() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_TREE_WRK_SM_CD_INSERT_CHILD\"))");
			Log.info(" lnk_InsertChild found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info(" lnk_InsertChild not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
			Log.info(" btn_Save found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info(" btn_Save not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_ManageSmartForms() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_TREE_WRK_SM_CD_REV_SFORM\"))");
			Log.info(" lnk_ManageSmartForms found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info(" lnk_ManageSmartForms not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_CreateViewFormFields() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_CONTENT_W_SM_CD_CREATE_FLDS\"))");
			Log.info(" lnk_CreateViewFormFields found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info(" lnk_CreateViewFormFields not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_IntegerPositions() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_SF_FRMFLD_RC_SM_SF_INT_POS\"))");
			Log.info(" txt_IntegerPositions found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info(" txt_IntegerPositions not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_FromFieldAdd() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICAdd\"))");
			Log.info("btn_FromFieldAdd found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info("btn_FromFieldAdd not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_Fieldlength() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_SF_FRMFLD_RC_SM_SF_FIELD_LENGTH\"))");
			Log.info("txt_Fieldlength found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info("txt_Fieldlength not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_InsertFormFields() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.cssSelector(\".cke_button.cke_button__insertformfield.cke_button_off\"))");
			Log.info(" lnk_InsertFormFields found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info(" lnk_InsertFormFields not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_FormFieldLookUp() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.cssSelector(\".cke_dialog_ui_button\"))");
			Log.info("btn_FormFieldLookUp found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info("btn_FormFieldLookUp not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_InputType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.cssSelector(\".cke_dialog_ui_input_select\"))");
			Log.info("txt_InputType found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info("txt_InputType not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_HoursPerWeek() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Hours Per Week\"))");
			
			Log.info(" lnk_CreateViewFormFields found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info(" lnk_CreateViewFormFields not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_HourlyWage() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Hours Per Week\"))");
			
			Log.info(" lnk_CreateViewFormFields found in the TS_AddEmploymentAgreement_Page");
		} catch (Exception e) {
			Log.info(" lnk_CreateViewFormFields not found in the TS_AddEmploymentAgreement_Page");
			throw (e);
		}
		return element;
	}

}
