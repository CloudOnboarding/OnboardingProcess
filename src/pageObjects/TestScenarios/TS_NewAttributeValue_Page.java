package pageObjects.TestScenarios;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;


		public class TS_NewAttributeValue_Page extends BaseClass {

			private static WebElement element;

			public TS_NewAttributeValue_Page(WebDriver driver) {
				super(driver);
			}
			
			public static WebElement lnk_ConfigMenu() throws Exception {
				element = null;
				try {
					element = psUtility.switchFrame("driver.findElement(By.id(\"configMenu\"))");
					Log.info("lnk_ConfigMnu found in the TS_NewAttributeValue_Page");
				} catch (Exception e) {
					Log.info("lnk_ConfigMnu not found in the TS_NewAttributeValue_Page");
					throw (e);
				}
				return element;
			}
			
			public static WebElement getAttribute_RevisionID() throws Exception {
				element = null;
				try {
					element = psUtility.switchFrame("driver.findElement(By.xpath(\"//span[@sm-id='RevnbrInptSpan']\"))");
					Log.info("getAttribute_RevisionID found in the TS_NewAttributeValue_Page");
				} catch (Exception e) {
					Log.info("getAttribute_RevisionID not found in the TS_NewAttributeValue_Page");
					throw (e);
				}
				return element;
			}
			public static WebElement lnk_AddRevision() throws Exception {
				element = null;
				try {
					element = psUtility.switchFrame("driver.findElement(By.linkText(\"Add/Update Revision\"))");
					Log.info("Lnk_AddRevision found in the TS_NewAttributeValue_Page");
				} catch (Exception e) {
					Log.info("Lnk_AddRevision not found in the TS_NewAttributeValue_Page");
					throw (e);
				}
				return element;
			}
				public static WebElement lnk_Add() throws Exception {
					element = null;
					try {
						element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSwitchMode\"))");
						Log.info("lnk_Add found in the TS_NewAttributeValue_Page");
					} catch (Exception e) {
						Log.info("lnk_Add not found in the TS_NewAttributeValue_Page");
						throw (e);
					}
					return element;
			}
				public static WebElement sel_RevisionType() throws Exception {
					element = null;
					try {
						element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_HDR_SM_CD_REV_TYPE\"))");
						Log.info(" sel_RevisionType found in the TS_NewAttributeValue_Page");
					} catch (Exception e) {
						Log.info(" sel_RevisionType not found in the TS_NewAttributeValue_Page");
						throw (e);
					}
					return element;
				}

				public static WebElement txt_Descr() throws Exception {
					element = null;
					try {
						element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_HDR_SM_CD_REV_DESCR\"))");
						Log.info(" txt_Descr found in the TS_NewAttributeValue_Page");
					} catch (Exception e) {
						Log.info(" txt_Descr not found in the TS_NewAttributeValue_Page");
						throw (e);
					}
					return element;
				}
				public static WebElement btn_reserve() throws Exception {
					element = null;
					try {
						element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_WRK_SM_CO_SAVE_PB\"))");
						Log.info(" btn_reserve found in the TS_NewAttributeValue_Page");
					} catch (Exception e) {
						Log.info(" btn_reserve not found in the TS_NewAttributeValue_Page");
						throw (e);
					}
					return element;
				}
				public static WebElement btn_Config() throws Exception {
					element = null;
					try {
						element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_WRK_SM_CD_CONFIGURE\"))");
						Log.info(" btn_Config found in the TS_NewAttributeValue_Page");
					} catch (Exception e) {
						Log.info(" btn_Config not found in the TS_NewAttributeValue_Page");
						throw (e);
					}
					return element;
				}
				public static WebElement lnk_Department() throws Exception {
					element = null;
					try {
						element = psUtility.switchFrame("driver.findElement(By.linkText(\"Department\"))");
						Log.info(" lnk_Department found in the TS_NewAttributeValue_Page");
					} catch (Exception e) {
						Log.info(" lnk_Department not found in the TS_NewAttributeValue_Page");
						throw (e);
					}
					return element;
				}
				public static WebElement lnk_ExpandArrow() throws Exception {
					element = null;
					try {
						element = psUtility.switchFrame("driver.findElement(By.xpath(\".//*[text()='DP00000011']/parent::label/i[1]\"))");
						Log.info(" lnk_ExpandArrow found in the TS_NewAttributeValue_Page");
					} catch (Exception e) {
						Log.info(" lnk_ExpandArrow not found in the TS_NewAttributeValue_Page");
						throw (e);
					}
					return element;
				}
				public static WebElement lnk_BusinessDevelopment() throws Exception {
					element = null;
					try {
						element = psUtility.switchFrame("driver.findElement(By.xpath(\".//*[text()='DP00000011']\"))");
						Log.info(" lnk_BusinessDevelopment found in the TS_NewAttributeValue_Page");
					} catch (Exception e) {
						Log.info(" lnk_BusinessDevelopment not found in the TS_NewAttributeValue_Page");
						throw (e);
					}
					return element;
				}
				public static WebElement lnk_insertchild() throws Exception {
					element = null;
					try {
						element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_TREE_WRK_SM_CD_INSERT_CHILD\"))");
						Log.info(" lnk_insertchild found in the TS_NewAttributeValue_Page");
					} catch (Exception e) {
						Log.info(" lnk_insertchild not found in the TS_NewAttributeValue_Page");
						throw (e);
					}
					return element;
				}
				public static WebElement txt_LongDesc() throws Exception {
					element = null;
					try {
						element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_ATTRB_DESCRLONG\"))");
						Log.info(" txt_LongDesc found in the TS_NewAttributeValue_Page");
					} catch (Exception e) {
						Log.info(" txt_LongDesc not found in the TS_NewAttributeValue_Page");
						throw (e);
					}
					return element;
				}
				public static WebElement txt_Desc() throws Exception {
					element = null;
					try {
						element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_ATTRB_DESCR\"))");
						Log.info(" txt_Desc found in the TS_NewAttributeValue_Page");
					} catch (Exception e) {
						Log.info(" txt_Desc not found in the TS_NewAttributeValue_Page");
						throw (e);
					}
					return element;
				}
				public static WebElement txt_DesiredLookUpID() throws Exception {
					element = null;
					try {
						element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_ATTRB_SM_CD_LOOKUP_ID\"))");
						Log.info(" txt_DesiredLookUpID found in the TS_NewAttributeValue_Page");
					} catch (Exception e) {
						Log.info(" txt_DesiredLookUpID not found in the TS_NewAttributeValue_Page");
						throw (e);
					}
					return element;
				}
				public static WebElement txt_DesiredLookUpDesc() throws Exception {
					element = null;
					try {
						element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_ATTRB_SM_CD_LOOKUP_DESCR\"))");
						Log.info(" txt_DesiredLookUpDesc found in the TS_NewAttributeValue_Page");
					} catch (Exception e) {
						Log.info(" txt_DesiredLookUpDesc not found in the TS_NewAttributeValue_Page");
						throw (e);
					}
					return element;
				}
				public static WebElement btn_save() throws Exception {
					element = null;
					try {
						element = psUtility.switchFrame("driver.findElement(By.id(\"#ICSave\"))");
						Log.info(" btn_save found in the TS_NewAttributeValue_Page");
					} catch (Exception e) {
						Log.info(" btn_save not found in the TS_NewAttributeValue_Page");
						throw (e);
					}
					return element;
				}
				public static WebElement btn_ReturnToManageRevision() throws Exception {
					element = null;
					try {
						element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_REV_WRK_SM_CO_RETURN_PB\"))");
						Log.info(" btn_ReturnToManageRevision found in the TS_NewAttributeValue_Page");
					} catch (Exception e) {
						Log.info(" btn_ReturnToManageRevision not found in the TS_NewAttributeValue_Page");
						throw (e);
					}
					return element;
				}
				public static WebElement btn_Apply() throws Exception {
					element = null;
					try {
						element = psUtility.switchFrame("driver.findElement(By.id(\"SM_CD_WRK_SM_CD_APPLY\"))");
						Log.info(" btn_Apply found in the TS_NewAttributeValue_Page");
					} catch (Exception e) {
						Log.info(" btn_Apply not found in the TS_NewAttributeValue_Page");
						throw (e);
					}
					return element;
				}
				public static WebElement btn_Close() throws Exception {
					element = null;
					try {
						element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@value='Close']\"))");
						Log.info(" btn_Close found in the TS_NewAttributeValue_Page");
					} catch (Exception e) {
						Log.info(" btn_Close not found in the TS_NewAttributeValue_Page");
						throw (e);
					}
					return element;
				}
				public static WebElement btn_Ok() throws Exception {
					element = null;
					try {
						element = psUtility.switchFrame("driver.findElement(By.id(\"#ICOK\"))");
						Log.info(" btn_Ok found in the TS_NewAttributeValue_Page");
					} catch (Exception e) {
						Log.info(" btn_Ok not found in the TS_NewAttributeValue_Page");
						throw (e);
					}
					return element;
				}
				

}
