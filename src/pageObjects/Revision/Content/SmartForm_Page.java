package pageObjects.Revision.Content;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class SmartForm_Page extends BaseClass {
	private static WebElement element;

	public SmartForm_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement txt_FormTitle() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_FORM_HDR_SM_SF_FORM_TITLE\"))");
			Log.info("txt_FormTitle found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("txt_FormTitle not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}
	 public static WebElement lnk_RightMenu(String MenuItem) throws Exception {
		  element = null;
		  try {
		   element = psUtility.switchFrame("driver.findElement(By.xpath(\"//span[text()='"+MenuItem+"']\"))");
		   Log.info("lnk_RightMenu "+MenuItem+" found in the SmartForm_Page");
		  } catch (Exception e) {
		   Log.info("lnk_RightMenu "+MenuItem+" not found in the SmartForm_Page");
		   throw (e);
		  }
		  return element;
		 }

	public static WebElement txt_lkpDesc() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_FORM_HDR_SM_BP_DESCR120\"))");
			Log.info("txt_lkpDesc found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("txt_lkpDesc not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_ParticipantPool() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_FORM_HDR_SM_BP_PARTICIPNT\"))");
			Log.info("sel_ParticipantPool found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("sel_ParticipantPool not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_Required() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_FORM_HDR_SM_BP_ACTIVITY_TYP\"))");
			Log.info(" sel_Required found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info(" sel_Required not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_SaveButton() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_FORM_HDR_SM_SF_SAVE_BTN_LBL\"))");
			Log.info("txt_SaveButton found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("txt_SaveButton not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbx_EnableAgree() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_FORM_HDR_SM_SF_ENABLE_AGREE\"))");
			Log.info("chkbx_EnableAgree found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("chkbx_EnableAgree not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_AcknowledgeText() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_FORM_HDR_SM_SF_ACK_TEXT\"))");
			Log.info("txt_AcknowledgeText found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("txt_AcknowledgeText not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement rdBtn_Yes() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_FORM_HDR_SM_SF_ENABLE_PRINT\"))");
			Log.info("rdBtn_Yes found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("rdBtn_Yes not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_PrintSource() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_FORM_HDR_SM_SF_PRINT_SOURCE\"))");
			Log.info("sel_PrintSource found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("sel_PrintSource not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_CreateFormField() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_CONTENT_W_SM_CD_CREATE_FLDS\"))");
			Log.info("lnk_CreateFormField found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("lnk_CreateFormField not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_AddNewValue() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSwitchMode\"))");
			Log.info("btn_AddNewValue found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("btn_AddNewValue not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_FldDesc() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_SF_FRMFLD_RC_SM_SF_FIELD_DESC\"))");
			Log.info("txt_FldDesc found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("txt_FldDesc not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_FldType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_SF_FRMFLD_RC_SM_SF_FIELD_TYPE\"))");
			Log.info("sel_FldType found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("sel_FldType not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
			Log.info("btn_Save found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("btn_Save not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement get_FldName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//span[@sm-id='FieldNameInptSpan']\"))");
			Log.info(" get_FldName found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info(" get_FldName not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_Add() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICAdd\"))");
			Log.info("btn_Add found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("btn_Add not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_AddSmartForm() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX11\"))");
			Log.info("lnk_AddSmartForm found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("lnk_AddSmartForm not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chkbx_EnableAttachments() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_FORM_HDR_SM_BP_ENABLE_ATCH\"))");
			Log.info("chkbx_EnableAttachments found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("chkbx_EnableAttachments not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_AttachmentID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_FORM_FILE_SM_CO_ATCH_ID$0\"))");
			Log.info("txt_AttachmentID found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("txt_AttachmentID not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_StaticImg() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame(
					"driver.findElement(By.cssSelector(\".cke_button_label.cke_button__insertimage_label\"))");
			Log.info("btn_StaticImg found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("btn_StaticImg not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement img_logo(String ImgName) throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//span[text()='" + ImgName + "']\"))");
			Log.info("img_logo found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("img_logo not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement Element_DivId() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.cssSelector(\"div[id^='cke_']\"))");
			Log.info("Element_DivId found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("Element_DivId not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_RespTable() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame(
					"driver.findElement(By.cssSelector(\".cke_button_label.cke_button__addresptable_label\"))");
			Log.info("btn_RespTable found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("btn_RespTable not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_InsrtFormField() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame(
					"driver.findElement(By.cssSelector(\".cke_button_label.cke_button__insertformfield_label\"))");
			Log.info("btn_RespTable found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("btn_RespTable not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_RespTableOK() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.cssSelector(\".cke_dialog_ui_button\"))");
			Log.info("btn_RespTableOK found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("btn_RespTableOK not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement element_Column2() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame(
					"driver.findElement(By.cssSelector(\"table.sm-resp-grid.sm-resp-grid-sm.cke_show_border>tbody>tr>td:nth-child(2)\"))");
			Log.info("element_Column2 found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("element_Column2 not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement element_Column1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame(
					"driver.findElement(By.cssSelector(\"table.sm-resp-grid.sm-resp-grid-sm.cke_show_border>tbody>tr>td:nth-child(1)\"))");
			Log.info("element_Column1 found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("element_Column1 not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement Ele_SetCellVal(int row,int Col) throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame(
					"driver.findElement(By.xpath(\"/html/body/div/table/tbody/tr["+row+"]/td["+Col+"]\"))");
			Log.info("Ele_SetCellVal found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("Ele_SetCellVal not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement Ele_trTabout() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame(
					"driver.findElement(By.xpath(\"/html/body/table/tbody\"))");
			Log.info("Ele_trTabout found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("Ele_trTabout not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_Width() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame(
					"driver.findElement(By.xpath(\"//*[text()='Width']/parent::div/div/div/input\"))");
			Log.info("txt_Width found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("txt_Width not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_Form_Field() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame(
					"driver.findElement(By.xpath(\"//*[text()='*Form Field']/parent::div/div/div/input\"))");
			Log.info("txt_Form_Field found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("txt_Form_Field not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement sel_InputType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame(
					"driver.findElement(By.xpath(\"//*[text()='*Input Type']/parent::div/div/div/select\"))");
			Log.info("sel_InputType found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("sel_InputType not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement sel_LabelType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame(
					"driver.findElement(By.xpath(\"//*[text()='*Label Type']/parent::div/div/div/select\"))");
			Log.info("sel_LabelType found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("sel_LabelType not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_OK(String PopupPageName) throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame(
				     "driver.findElement(By.xpath(\"//*[text()='"+PopupPageName+"']/parent::div/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a\"))");
			Log.info("btn_OK found in the SmartForm_Page");
		} catch (Exception e) {
			Log.info("btn_OK not found in the SmartForm_Page");
			throw (e);
		}
		return element;
	}
}
