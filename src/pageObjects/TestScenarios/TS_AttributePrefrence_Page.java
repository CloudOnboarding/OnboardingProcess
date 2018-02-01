package pageObjects.TestScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;


	public class TS_AttributePrefrence_Page extends BaseClass {

		private static WebElement element;

		public TS_AttributePrefrence_Page(WebDriver driver) {
			super(driver);
		}
		public static WebElement Lnk_ConfigMenu() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"configMenu\"))");
				Log.info("lnk_ConfigMnu found in the TS_AttributePrefrence_Page");
			} catch (Exception e) {
				Log.info("lnk_ConfigMnu not found in the TS_AttributePrefrence_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement Lnk_More() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.linkText(\"More\"))");
				Log.info("Lnk_More found in the TS_AttributePrefrence_Page");
			} catch (Exception e) {
				Log.info("Lnk_More not found in the TS_AttributePrefrence_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement Lnk_AttributePrefrence() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.linkText(\"Attribute Preferences\"))");
				Log.info("Lnk_AttributePrefrence found in the TS_AttributePrefrence_Page");
			} catch (Exception e) {
				Log.info("Lnk_AttributePrefrence not found in the TS_AttributePrefrence_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement txt_BusinessUnit() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\".//span[@sm-id='AttrTypeInputInptSpan' and text()='Business Unit']/parent::div/parent::div/parent::td/parent::tr/td[5]/div/div/input\"))");
				Log.info("txt_BUsinessUnit found in the TS_AttributePrefrence_Page");
			} catch (Exception e) {
				Log.info("txt_BUsinessUnit not found in the TS_AttributePrefrence_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement chk_invitatioField_sp() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\".//span[@sm-id='AttrTypeInputInptSpan' and text()='Salary Plan']/parent::div/parent::div/parent::td/parent::tr/td[8]/div/input\"))");
				Log.info("chk_invitatioField_sp found in the TS_AttributePrefrence_Page");
			} catch (Exception e) {
				Log.info("chk_invitatioField_sp not found in the TS_AttributePrefrence_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement chk_CJDField_sp() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\".//span[@sm-id='AttrTypeInputInptSpan' and text()='Salary Plan']/parent::div/parent::div/parent::td/parent::tr/td[9]/div/input\"))");
				Log.info("chk_CJDField_sp found in the TS_AttributePrefrence_Page");
			} catch (Exception e) {
				Log.info("chk_CJDField_sp not found in the TS_AttributePrefrence_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement txt_overridelabel() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\".//span[@sm-id='AttrTypeInputInptSpan' and text()='User Defined Attribute 1']/parent::div/parent::div/parent::td/parent::tr/td[5]/div/div/input\"))");
				Log.info("txt_overridelabel found in the TS_AttributePrefrence_Page");
			} catch (Exception e) {
				Log.info("txt_overridelabel not found in the TS_AttributePrefrence_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement chk_invitatioField() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\".//span[@sm-id='AttrTypeInputInptSpan' and text()='User Defined Attribute 1']/parent::div/parent::div/parent::td/parent::tr/td[8]/div/input\"))");
				Log.info("chk_invitatioField found in the TS_AttributePrefrence_Page");
			} catch (Exception e) {
				Log.info("chk_invitatioField not found in the TS_AttributePrefrence_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement chk_CJDField() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\".//span[@sm-id='AttrTypeInputInptSpan' and text()='User Defined Attribute 1']/parent::div/parent::div/parent::td/parent::tr/td[9]/div/input\"))");
				Log.info("chk_CJDField found in the TS_AttributePrefrence_Page");
			} catch (Exception e) {
				Log.info("chk_CJDField not found in the TS_AttributePrefrence_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement chk_Required() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\".//span[@sm-id='AttrTypeInputInptSpan' and text()='User Defined Attribute 1']/parent::div/parent::div/parent::td/parent::tr/td[10]/div/input\"))");
				Log.info("chk_Required_SP found in the TS_AttributePrefrence_Page");
			} catch (Exception e) {
				Log.info("chk_Required_SP not found in the TS_AttributePrefrence_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement btn_up_EC() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\".//span[@sm-id='AttrTypeInputInptSpan' and text()='Employee Class']/parent::div/parent::div/parent::td/parent::tr/td[1]/div/a\"))");
				Log.info("btn_up_EC found in the TS_AttributePrefrence_Page");
			} catch (Exception e) {
				Log.info("btn_up_EC not found in the TS_AttributePrefrence_Page");
				throw (e);
			}
			return element;
		}
	/*	public static WebElement btn_up_EC1() throws Exception {
			element = null;
			try {
				element = psUtility.swithFrame("driver.findElement(By.Xpath(\".//span[@sm-id='AttrTypeInputInptSpan' and text()='Employee Class \r\n" + 
						"\r\n" + 
						"Unit']/parent::div/parent::div/parent::td/parent::tr/td[1]/div/div/input\"))");
				Log.info("btn_up_EC1 found in the TS_AttributePrefrence_Page");
			} catch (Exception e) {
				Log.info("btn_up_EC1 not found in the TS_AttributePrefrence_Page");
				throw (e);
			}
			return element;
		}*/
		public static WebElement chk_Required_EC() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.xpath(\".//span[@sm-id='AttrTypeInputInptSpan' and text()='Employee Class']/parent::div/parent::div/parent::td/parent::tr/td[10]/div/input\"))"); 
				Log.info("chk_Required_EC found in the TS_AttributePrefrence_Page");
			} catch (Exception e) {
				Log.info("chk_Required_EC not found in the TS_AttributePrefrence_Page");
				throw (e);
			}
			return element;
		}
		public static WebElement btn_save() throws Exception {
			element = null;
			try {
				element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave");
				Log.info("btn_save found in the TS_AttributePrefrence_Page");
			} catch (Exception e) {
				Log.info("btn_save not found in the TS_AttributePrefrence_Page");
				throw (e);
			}
			return element;
		}

}
