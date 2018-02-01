package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TS_SetupOrgContatcts_DefaultTheme_Logo_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public TS_SetupOrgContatcts_DefaultTheme_Logo_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement btn_Menu() throws Exception {
		element = null;
		try {
			//element = psUtility.swithFrame("driver.findElement(By");
			element = psUtility.switchFrame("driver.findElement(By.id(\"configMenu\"))");
			Log.info("btn_Menu found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
		} catch (Exception e) {
			Log.info("btn_Menu not found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_OrganizationManagement() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.linkText(\"Organization Management\"))");
			Log.info("lnk_OrganizationManagement found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
		} catch (Exception e) {
			Log.info("lnk_OrganizationManagement not found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_PrimaryContact() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORGID_SM_CO_PRIM_CNTCT$prompt\"))");
			Log.info("txt_PrimaryContact found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
		} catch (Exception e) {
			Log.info("txt_PrimaryContact not found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_PrimaryContactId() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"RESULT1$0\"))");
			Log.info("lnk_PrimaryContactId found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
		} catch (Exception e) {
			Log.info("lnk_PrimaryContactId not found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_SecondaryContact() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORGID_SM_CO_SEC_CNTCT$prompt\"))");
			Log.info("txt_SecondaryContact found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
		} catch (Exception e) {
			Log.info("txt_SecondaryContact not found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_SecondaryContactId() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"RESULT1$4\"))");
			Log.info("lnk_SecondaryContactId found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
		} catch (Exception e) {
			Log.info("lnk_SecondaryContactId not found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_SupportContact() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_ORGID_SM_CO_SUPP_CNTCT$prompt\"))");
			Log.info("txt_SupportContact found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
		} catch (Exception e) {
			Log.info("txt_SupportContact not found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_SupportContacId() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"RESULT1$7\"))");
			Log.info("lnk_SupportContacId found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
		} catch (Exception e) {
			Log.info("lnk_SupportContacId not found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_DefaultTheme() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_HDR_BRAND_SM_CD_THEME_ID$prompt\"))");
			Log.info("txt_DefaultTheme found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
		} catch (Exception e) {
			Log.info("txt_DefaultTheme not found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_DefaultThemeId() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SEARCH_RESULT1\"))");
			Log.info("lnk_DefaultThemeId found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
		} catch (Exception e) {
			Log.info("lnk_DefaultThemeId not found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement sel_ThemeDriver() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_WRK_SM_CD_ATTRB_TYPE\"))");
			Log.info("sel_ThemeDriver found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
		} catch (Exception e) {
			Log.info("sel_ThemeDriver not found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_DefaultLogo() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_HDR_BRAND_SM_CO_DEFAULT_LOGO$prompt\"))");
			Log.info("txt_DefaultLogo found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
		} catch (Exception e) {
			Log.info("txt_DefaultLogo not found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_DefaultLogoImageID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SEARCH_RESULT1\"))");
			Log.info("lnk_DefaultLogoImageID found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
		} catch (Exception e) {
			Log.info("lnk_DefaultLogoImageID not found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_MobileLogo() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_HDR_BRAND_SM_CO_MOBILE_LOGO$prompt\"))");
			Log.info("txt_MobileLogo found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
		} catch (Exception e) {
			Log.info("txt_MobileLogo not found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_MobileLogoImageID() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SEARCH_RESULT1\"))");
			Log.info("lnk_MobileLogoImageID found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
		} catch (Exception e) {
			Log.info("lnk_MobileLogoImageID not found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
			Log.info("btn_Save found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
		} catch (Exception e) {
			Log.info("btn_Save not found in the TS_SetupOrgContatcts_DefaultTheme_Logo_Page");
			throw (e);
		}
		return element;
	}
}
