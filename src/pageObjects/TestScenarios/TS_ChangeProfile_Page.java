package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class TS_ChangeProfile_Page extends BaseClass {
	private static WebElement element;
	public static boolean GetStartedLnkExts;

	public TS_ChangeProfile_Page(WebDriver driver) {
		super(driver);
	}

	public static WebElement txt_FirstName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_NAME_WORK_FIRST_NAME\"))");
		//	element = psUtility.swithFrame("driver.findElement(By.xpath(\"//input[@sm-id='FirstNameInptWrpr']\"))");
			Log.info("txt_FirstName found in the TS_ChangeProfile_Page");
		} catch (Exception e) {
			Log.info("txt_FirstName not found in the TS_ChangeProfile_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_LastName() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_NAME_WORK_LAST_NAME\"))");
			Log.info("txt_LastName found in the TS_ChangeProfile_Page");
		} catch (Exception e) {
			Log.info("txt_LastName not found in the TS_ChangeProfile_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Email() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_MYPROF_WK_SM_CO_MYPRF_EMAIL\"))");
			Log.info("txt_Email found in the TS_ChangeProfile_Page");
		} catch (Exception e) {
			Log.info("txt_Email not found in the TS_ChangeProfile_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_SendEmailVerfCode() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[contains(@id,'SM_CO_VERIFY_WK_SM_CO_2FACT_SEND')]\"))");
			Log.info("btn_SendEmailVerfCode found in the TS_ChangeProfile_Page");
		} catch (Exception e) {
			Log.info("btn_SendEmailVerfCode not found in the TS_ChangeProfile_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Verify() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[contains(@id,'SM_CO_VERIFY_WK_SM_CO_2FACT_VALID')]\"))");
			Log.info("btn_EmailVerify found in the TS_ChangeProfile_Page");
		} catch (Exception e) {
			Log.info("btn_EmailVerify not found in the TS_ChangeProfile_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_PhoneNum() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_MYPROF_WK_SM_CO_MYPRF_PHONE\"))");
			Log.info("txt_PhoneNum found in the TS_ChangeProfile_Page");
		} catch (Exception e) {
			Log.info("txt_PhoneNum not found in the TS_ChangeProfile_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_SendPhVerfCode() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[contains(@id,'SM_CO_VERIFY_WK_SM_CO_2FACT_SEND')]\"))");
			Log.info("btn_SendPhVerfCode found in the TS_ChangeProfile_Page");
		} catch (Exception e) {
			Log.info("btn_SendPhVerfCode not found in the TS_ChangeProfile_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_EnterCode() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[contains(@id,'SM_CO_VERIFY_WK_SM_CO_2FACT_CODE')]\"))");
			Log.info("txt_PhoneEnterCode found in the TS_ChangeProfile_Page");
		} catch (Exception e) {
			Log.info("txt_PhoneEnterCode not found in the TS_ChangeProfile_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Address() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[contains(@id,'ADDRESS1_1')]\"))");
			Log.info("txt_Address found in the TS_ChangeProfile_Page");
		} catch (Exception e) {
			Log.info("txt_Address not found in the TS_ChangeProfile_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_City() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[contains(@id,'CITY_1')]\"))");
			
			Log.info("txt_City found in the TS_ChangeProfile_Page");
		} catch (Exception e) {
			Log.info("txt_City not found in the TS_ChangeProfile_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Postal() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[contains(@id,'POSTAL_1')]\"))");
			
			Log.info("txt_Postal found in the TS_ChangeProfile_Page");
		} catch (Exception e) {
			Log.info("txt_Postal not found in the TS_ChangeProfile_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_County() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[contains(@id,'COUNTY_1')]\"))");
			
			Log.info("txt_County found in the TS_ChangeProfile_Page");
		} catch (Exception e) {
			Log.info("txt_County not found in the TS_ChangeProfile_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement chk_CopySameAddress() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_MYPROF_WK_SM_CO_SAME_ADDRESS\"))");
			Log.info("chk_CopySameAddress found in the TS_ChangeProfile_Page");
		} catch (Exception e) {
			Log.info("chk_CopySameAddress not found in the TS_ChangeProfile_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Save() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CO_MYPROF_WK_SAVE_BTN\"))");
			Log.info("btn_Save found in the TS_ChangeProfile_Page");
		} catch (Exception e) {
			Log.info("btn_Save not found in the TS_ChangeProfile_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_Accountname() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@sm-parent='accountMenu']\"))");
			Log.info("lnk_Accountname found in the TS_ChangeProfile_Page");
		} catch (Exception e) {
			Log.info("lnk_Accountname not found in the TS_ChangeProfile_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_MyProfile() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//li[@sm-id='myaccountItem']/a[contains(text(),'My Profile')]\"))");
			Log.info("lnk_MyProfile found in the TS_ChangeProfile_Page");
		} catch (Exception e) {
			Log.info("lnk_MyProfile not found in the TS_ChangeProfile_Page");
			throw (e);
		}
		return element;
	}
	public static WebElement select_State() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//select[contains(@id,'STATE_1')]\"))");
			Log.info("select_State  found in TS_ChangeProfile_Page");
		} catch (Exception e) {
			Log.info("select_State  not found in TS_ChangeProfile_Page");
			throw (e);
		}
		return element;
	}
		public static WebElement span_emaiVerfStatus() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\"//div[@sm-id='verify1Html']/span\"))");
				Log.info("span_emaiVerfStatus  found in TS_ChangeProfile_Page");
			} catch (Exception e) {
				Log.info("span_emaiVerfStatus  not found in TS_ChangeProfile_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement span_phoneVerfStatus() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\"//div[@sm-id='verify3Html']/span\"))");
				Log.info("span_phoneVerfStatus  found in TS_ChangeProfile_Page");
			} catch (Exception e) {
				Log.info("span_phoneVerfStatus  not found in TS_ChangeProfile_Page");
				throw (e);
			}
			return element;
		}
}
