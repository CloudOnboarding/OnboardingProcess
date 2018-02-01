package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TS_OrganizationThemeChange_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public TS_OrganizationThemeChange_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement btn_Menu() throws Exception {
		element = null;
		try {
			//element = psUtility.swithFrame("driver.findElement(By.xpath(\"//li[@id='configMenu']/a/i\"))");
			
			element = psUtility.switchFrame("driver.findElement(By.id(\"configMenu\"))");
			Log.info("btn_Menu found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("btn_Menu not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}



	public static WebElement getattribute_ThemeId() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//span[@sm-id='ThemeIDInptSpan']\"))");
			Log.info("getattribute_ThemeId found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("getattribute_ThemeId not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_ThemeBuilder() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Theme Builder\"))");
			Log.info("lnk_ThemeBuilder found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("lnk_ThemeBuilder not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_AddNewValue() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSwitchMode\"))");
			Log.info("btn_AddNewValue found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("btn_AddNewValue not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Add() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSearch\"))");
			Log.info("btn_Add found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("btn_Add not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_desc() throws Exception {//SM_CD_THEME_BLD_SM_CD_DESCR120
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_THEME_BLD_SM_CD_DESCR120\"))");
			Log.info("txt_desc found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("txt_desc not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_Header() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Header\"))");
			Log.info("lnk_Header found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("lnk_Header not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_HearerFontColor() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_THEME_BLD_SM_CD_HDR_FONT_CLR\"))");
			Log.info("txt_HearerFontColor found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("txt_HearerFontColor not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_PrimaryIconHoverColor() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_THEME_BLD_SM_CD_PRM_ICNH_CLR\"))");
			Log.info("txt_PrimaryIconHoverColor found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("txt_PrimaryIconHoverColor not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_OnboardingNavigation() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Onboarding Navigation\"))");
			Log.info("lnk_OnboardingNavigation found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("lnk_OnboardingNavigation not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_BackgroundColor() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_THEME_BLD_SM_CD_LN_BGCLR\"))");
			Log.info("txt_BackgroundColor found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("txt_BackgroundColor not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_SelectedActivityBgcClr() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_THEME_BLD_SM_CD_LN_ST_BGCLR\"))");
			Log.info("txt_SelectedActivityBgcClr found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("txt_SelectedActivityBgcClr not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_FormControls() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Form Controls\"))");
			Log.info("lnk_FormControls found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("lnk_FormControls not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_ProcessingImageColor() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_THEME_BLD_SM_CD_PRCS_IMG_CLR\"))");
			Log.info("txt_ProcessingImageColor found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("txt_ProcessingImageColor not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_FontColor() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_THEME_BLD_SM_CD_PRIM_FNT_CLR\"))");
			Log.info("txt_ProcessingImageColor found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("txt_ProcessingImageColor not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement txt_LinkFontColor() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_THEME_BLD_SM_CD_LINK_FNT_CLR\"))");
			Log.info("txt_LinkFontColor found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("txt_LinkFontColor not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_ButtonBackgroundColor() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_THEME_BLD_SM_CD_BTN_BG_CLR\"))");
			Log.info("btn_ButtonBackgroundColor found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("btn_ButtonBackgroundColor not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_Footer() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Footer\"))");
			Log.info("lnk_Footer found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("lnk_Footer not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_Miscellaneous() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Miscellaneous\"))");
			Log.info("lnk_Miscellaneous found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("lnk_Miscellaneous not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_LoginLogoWidth() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_THEME_BLD_SM_CD_LGN_LG_WIDTH\"))");
			Log.info("txt_LoginLogoWidth found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("txt_LoginLogoWidth not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
			Log.info("btn_save found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("btn_save not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_OrganizationManagement() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Organization Management\"))");
			Log.info("lnk_OrganizationManagement found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("lnk_OrganizationManagement not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_defaultTheme() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_HDR_BRAND_SM_CD_THEME_ID$prompt\"))");
			Log.info("txt_defaultTheme found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("txt_defaultTheme not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_QuickFilter() throws Exception {
		element = null;
		
	//	BaseClass.driver.findElement(By.className("form-control input-sm"));
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@class='form-control input-sm']\"))");
			Log.info("txt_QuickFilter found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("txt_QuickFilter not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement lnk_Result(String ThemeId) throws Exception {
		element = null;
		
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\""+ThemeId+"\"))");
			Log.info("lnk_Result found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("lnk_Result not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_lookup() throws Exception {
		element = null;
		
	//	BaseClass.driver.findElement(By.className("form-control input-sm"));
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@sm-id='srchBtnBtn']\"))");
			Log.info("btn_lookup found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("btn_lookup not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}
		
	
	public static WebElement txt_PrimaryContact() throws Exception {
		element = null;
		
	//	BaseClass.driver.findElement(By.className("form-control input-sm"));
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORGID_SM_CO_PRIM_CNTCT\"))");
			Log.info("txt_PrimaryContact found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("txt_PrimaryContact not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}
		

	public static WebElement btn_PromptPrimaryContact() throws Exception {
		element = null;
		
	//	BaseClass.driver.findElement(By.className("form-control input-sm"));
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORGID_SM_CO_PRIM_CNTCT$prompt\"))");
			Log.info("btn_PromptPrimaryContact found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("btn_PromptPrimaryContact not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}
		
	

	public static WebElement lnk_LookUpContact() throws Exception {
		element = null;
		
	//	BaseClass.driver.findElement(By.className("form-control input-sm"));
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SEARCH_RESULT1\"))");
			Log.info("lnk_LookUpPrimaryContact found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("lnk_LookUpPrimaryContact not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btn_PromptSecondaryContact() throws Exception {
		element = null;
		
	//	BaseClass.driver.findElement(By.className("form-control input-sm"));
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORGID_SM_CO_SUPP_CNTCT$prompt\"))");
			Log.info("btn_PromptPrimaryContact found in the TS_OrganizationThemeChange_Page");
		} catch (Exception e) {
			Log.info("btn_PromptPrimaryContact not found in the TS_OrganizationThemeChange_Page");
			throw (e);
		}
		return element;
	}
		
	

	
	
}
