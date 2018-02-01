package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TS_ChangeContentOnUserPage_Page extends BaseClass {

	private static WebElement element;
	

	

	public TS_ChangeContentOnUserPage_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement btn_AddUpdate() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Add/Update Revision\"))");
			Log.info("btn_AddUpdate found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_AddUpdate not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_AddNewValue() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSwitchMode\"))");
			Log.info("btn_AddNewValue found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_AddNewValue not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_RevisionType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_HDR_SM_CD_REV_TYPE\"))");
			Log.info("sel_RevisionType found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("sel_RevisionType not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Descr() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_HDR_SM_CD_REV_DESCR\"))");
			Log.info("txt_Descr found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("txt_Descr not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_WRK_SM_CO_SAVE_PB\"))");
			Log.info("btn_Save found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_Save not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement GetAttribute_RevisionID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//span[@sm-id='RevnbrInptSpan']\"))");
			Log.info("GetAttribute_RevisionID found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("GetAttribute_RevisionID not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Congif() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_WRK_SM_CD_CONFIGURE\"))");
			Log.info("btn_Congif found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_Congif not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_Add() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX5\"))");
			Log.info("lnk_Add found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("lnk_Add not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Descr120() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_IMG_SM_CO_DESCR120\"))");
			Log.info("txt_Descr120 found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("txt_Descr120 not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_ImageType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_IMG_SM_CO_IMAGE_TYPE\"))");
			Log.info("sel_ImageType found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("sel_ImageType not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Upload1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_WRK_SM_CO_UPLOAD\"))");
			Log.info("btn_Upload1 found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_Upload1 not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_FilePath() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.name(\"#ICOrigFileName\"))");
			Log.info("txt_FilePath found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("txt_FilePath not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Upload2() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@value='Upload']\"))");
			Log.info("btn_Upload2 found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_Upload2 not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Save1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
			Log.info("btn_Save1 found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_Save1 not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Return() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_WRK_SM_CO_RETURN_PB\"))");
			Log.info("btn_Return found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_Return not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Apply() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_WRK_SM_CD_APPLY\"))");
			Log.info("btn_Apply found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_Apply not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Ok() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICOK\"))");
			Log.info("btn_Ok found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_Ok not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Close() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@value='Close']\"))");
			Log.info("btn_Close found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_Close not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement Lnk_ConfigMenu() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"configMenu\"))");
			Log.info("lnk_ConfigMnu found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("lnk_ConfigMnu not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_OrgnazationHomepageConfig() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Organization Homepage Config\"))");
			Log.info("lnk_OrgnazationHomepageConfig found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("lnk_OrgnazationHomepageConfig not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_search() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSearch\"))");
			Log.info("btn_search found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_search not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_QuickFilter() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@class='form-control input-sm']\"))");
			Log.info("txt_QuickFilter found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("txt_QuickFilter not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_HomePageID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"ACTIVE_REGULAR_TA_HMPG\"))");
			Log.info("lnk_HomePageID found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("lnk_HomePageID not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	

	public static WebElement MouseHr_columnActions() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//div[@id='home-page-content']/div[1]/div[2]/div/div/span\"))");
			Log.info(" MouseHr_columnActions found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info(" MouseHr_columnActions not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	

	public static WebElement btn_EditContent() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@value='Edit Content']\"))");
			Log.info(" btn_EditContent found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info(" btn_EditContent not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_imageID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"image_id_prompt\"))");
			Log.info("btn_imageID found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_imageID not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_lookupImg() throws Exception { 
		element = null;      //*[@class=\\\"smco_img_div\\\"][1]
		try {
			//element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@id='ps-page-container']/div/div/div[1]/div[2]/span\"))");
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//span[text()='CompanyBackground']\"))");
			
			Log.info("lnk_lookupImg found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("lnk_lookupImg not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_ok1() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"save-col\"))");
			Log.info("btn_ok1 found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_ok1 not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}  
	
	public static WebElement lnk_Home() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"smhome\"))");
			Log.info("lnk_Home found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("lnk_Home not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_AddMixedContent() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_WRK_GROUPBOX20\"))");
			Log.info("lnk_AddMixedContent found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("lnk_AddMixedContent not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_Description() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_MXD_CNT_H_DESCR100\"))");
			Log.info("txt_Description found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("txt_Description not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_ContentLabel() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_MXD_ITEMS_SM_CO_CONTENT_LBL$0\"))");
			Log.info("txt_ContentLabel found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("txt_ContentLabel not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_ContentExplanation() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_WRK_SM_CO_CONTENT_EXPL$0\"))");
			Log.info("lnk_ContentExplanation found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("lnk_ContentExplanation not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement Element_DivId() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"cke_1_contents\"))");
			Log.info("Element_DivId found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("Element_DivId not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	
	
	public static WebElement lnk_RichTextContent() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.cssSelector(\".cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders\"))");
			Log.info("lnk_ContentExplanation found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("lnk_ContentExplanation not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement lnk_Link() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.cssSelector(\".cke_button_icon.cke_button__link_icon\"))");
			Log.info("lnk_Link found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("lnk_Link not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_url() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[text()='URL']/following-sibling::div/div/input\"))");
			Log.info("txt_url found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("txt_url not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_target() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Target\"))");
			Log.info("lnk_target found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("lnk_target not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement sel_target() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[text()='Target']//following-sibling::div/div/select\"))");
			Log.info("sel_target found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("sel_target not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_okTarget() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.cssSelector(\".cke_dialog_ui_button.cke_dialog_ui_button_ok\"))");
			Log.info("btn_okTarget found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_okTarget not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_okSave() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
			Log.info("btn_okSave found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_okSave not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement MouseHr_columnActions2() throws Exception {
		element = null;
		try {
	element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@id='home-page-content']/div[4]/div[1]/span\"))");
			Log.info(" MouseHr_columnActions2 found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info(" MouseHr_columnActions2 not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_AddColumn() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@id='home-page-content']/div[3]/div[1]/div/input[3]\"))");
			Log.info(" btn_AddColumn found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info(" btn_AddColumn not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement MouseHr_News() throws Exception {
		element = null;
		try {
	element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@id='home-page-content']/div[4]/div[2]/div[3]/div[1]/span\"))");
			Log.info(" MouseHr_News found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info(" MouseHr_News not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement MouseHr_GearICon() throws Exception {
		element = null;
		try {
	element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@id='home-page-content']/div[2]/div[1]/span\"))");
			Log.info(" MouseHr_News found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info(" MouseHr_News not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement sel_DrivenByCatagory() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"driven_by_cat\"))");
			Log.info("sel_DrivenByCatagory found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("sel_DrivenByCatagory not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement sel_ContentType() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"content_type\"))");
			Log.info("sel_ContentType found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("sel_ContentType not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_ContentID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"content_id_prompt\"))");
			Log.info("btn_ContentID found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_ContentID not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_DescSearch() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_MXDCNT_VW_DESCR100\"))");
			Log.info("txt_DescSearch found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("txt_DescSearch not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement btn_lookup() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@value='Look Up']\"))");
			Log.info("btn_lookup found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("btn_lookup not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_Description() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@sm-id='srchRsltFldTD']\"))");
			Log.info("lnk_Description found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("lnk_Description not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_width() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"col_width\"))");
			Log.info("txt_width found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("txt_width not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_PaddingTop() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"content_pad_top\"))");
			Log.info("txt_PaddingTop found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("txt_PaddingTop not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_PaddingRight() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"content_pad_right\"))");
			Log.info("txt_PaddingRight found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("txt_PaddingRight not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_PaddingBottom() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"content_pad_bottom\"))");
			Log.info("txt_PaddingBottom found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("txt_PaddingBottom not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement txt_PaddingLeft() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"content_pad_left\"))");
			Log.info("txt_PaddingLeft found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("txt_PaddingLeft not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement MouseHr_FAQ() throws Exception {
		element = null;
		try {
	element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@id='home-page-content']/div[4]/div[2]/div[2]/div[1]/span\"))");
			Log.info(" MouseHr_FAQ found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info(" MouseHr_News not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement MouseHr_TrainingVideos() throws Exception {
		element = null;
		try {
	element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@id='home-page-content']/div[4]/div[2]/div[1]/div[1]/span\"))");
			Log.info(" MouseHr_TrainingVideos found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info(" MouseHr_TrainingVideos not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement lnk_OnboardingDocument() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Link to SmartOnboarding Documentation\"))");
			Log.info("lnk_OnboardingDocument found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("lnk_OnboardingDocument not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_OnboardingDocumentURL() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Smart OnBoarding Documentation\"))");
			Log.info("lnk_OnboardingDocumentURL found in the TS_ChangeContentOnUserPage_Page");
		} catch (Exception e) {
			Log.info("lnk_OnboardingDocumentURL not found in the TS_ChangeContentOnUserPage_Page");
			throw (e);
		}
		return element;
	}

}
