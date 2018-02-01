package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;
public class TS15_ChangeProfile_Page extends BaseClass {
private static WebElement element;
public static boolean GetStartedLnkExts;
public TS15_ChangeProfile_Page(WebDriver driver) {
super(driver);
}
 public static WebElement txt_FirstName() throws Exception{
   element = null;
   try{
      element=psUtility.swithFrame("driver.findElement(By.id(\"SM_CO_NAME_WORK_FIRST_NAME\"))");
      Log.info("txt_FirstName found in the TS15_ChangeProfile_Page");
   }catch (Exception e){
   Log.info("txt_FirstName not found in the TS15_ChangeProfile_Page");
   throw(e);
   }
  return element;
 }
 public static WebElement txt_LastName() throws Exception{
   element = null;
   try{
      element=psUtility.swithFrame("driver.findElement(By.id(\"SM_CO_NAME_WORK_LAST_NAME\"))");
      Log.info("txt_LastName found in the TS15_ChangeProfile_Page");
   }catch (Exception e){
   Log.info("txt_LastName not found in the TS15_ChangeProfile_Page");
   throw(e);
   }
  return element;
 }
 public static WebElement txt_Email() throws Exception{
   element = null;
   try{
      element=psUtility.swithFrame("driver.findElement(By.id(\"SM_CO_MYPROF_WK_SM_CO_MYPRF_EMAIL\")).sendKeys(\"jasong@smarterp");
      Log.info("txt_Email found in the TS15_ChangeProfile_Page");
   }catch (Exception e){
   Log.info("txt_Email not found in the TS15_ChangeProfile_Page");
   throw(e);
   }
  return element;
 }
 public static WebElement btn_SendEmailVerfCode() throws Exception{
   element = null;
   try{
      element=psUtility.swithFrame("driver.findElement(By.id(\"SM_CO_VERIFY_WK_SM_CO_2FACT_SEND$101$$0\"))");
      Log.info("btn_SendEmailVerfCode found in the TS15_ChangeProfile_Page");
   }catch (Exception e){
   Log.info("btn_SendEmailVerfCode not found in the TS15_ChangeProfile_Page");
   throw(e);
   }
  return element;
 }
 public static WebElement txt_EmailEnterCode() throws Exception{
   element = null;
   try{
      element=psUtility.swithFrame("driver.findElement(By.id(\"SM_CO_VERIFY_WK_SM_CO_2FACT_CODE$105$$0\"))");
      Log.info("txt_EmailEnterCode found in the TS15_ChangeProfile_Page");
   }catch (Exception e){
   Log.info("txt_EmailEnterCode not found in the TS15_ChangeProfile_Page");
   throw(e);
   }
  return element;
 }
 public static WebElement btn_EmailVerify() throws Exception{
   element = null;
   try{
      element=psUtility.swithFrame("driver.findElement(By.id(\"SM_CO_VERIFY_WK_SM_CO_2FACT_VALID$106$$0\"))");
      Log.info("btn_EmailVerify found in the TS15_ChangeProfile_Page");
   }catch (Exception e){
   Log.info("btn_EmailVerify not found in the TS15_ChangeProfile_Page");
   throw(e);
   }
  return element;
 }
 public static WebElement txt_PhoneNum() throws Exception{
   element = null;
   try{
      element=psUtility.swithFrame("driver.findElement(By.id(\"SM_CO_MYPROF_WK_SM_CO_MYPRF_PHONE\"))");
      Log.info("txt_PhoneNum found in the TS15_ChangeProfile_Page");
   }catch (Exception e){
   Log.info("txt_PhoneNum not found in the TS15_ChangeProfile_Page");
   throw(e);
   }
  return element;
 }
 public static WebElement btn_SendPhVerfCode() throws Exception{
   element = null;
   try{
      element=psUtility.swithFrame("driver.findElement(By.id(\"SM_CO_VERIFY_WK_SM_CO_2FACT_SEND$0\"))");
      Log.info("btn_SendPhVerfCode found in the TS15_ChangeProfile_Page");
   }catch (Exception e){
   Log.info("btn_SendPhVerfCode not found in the TS15_ChangeProfile_Page");
   throw(e);
   }
  return element;
 }
 public static WebElement txt_PhoneEnterCode() throws Exception{
   element = null;
   try{
      element=psUtility.swithFrame("driver.findElement(By.id(\"SM_CO_VERIFY_WK_SM_CO_2FACT_CODE$0\"))");
      Log.info("txt_PhoneEnterCode found in the TS15_ChangeProfile_Page");
   }catch (Exception e){
   Log.info("txt_PhoneEnterCode not found in the TS15_ChangeProfile_Page");
   throw(e);
   }
  return element;
 }
 public static WebElement btn_PhoneVerify() throws Exception{
   element = null;
   try{
      element=psUtility.swithFrame("driver.findElement(By.id(\"SM_CO_VERIFY_WK_SM_CO_2FACT_VALID$0\"))");
      Log.info("btn_PhoneVerify found in the TS15_ChangeProfile_Page");
   }catch (Exception e){
   Log.info("btn_PhoneVerify not found in the TS15_ChangeProfile_Page");
   throw(e);
   }
  return element;
 }
 public static WebElement txt_Address() throws Exception{
   element = null;
   try{
      element=psUtility.swithFrame("driver.findElement(By.id(\"ADDRESS1_1$0\"))");
      Log.info("txt_Address found in the TS15_ChangeProfile_Page");
   }catch (Exception e){
   Log.info("txt_Address not found in the TS15_ChangeProfile_Page");
   throw(e);
   }
  return element;
 }
 public static WebElement txt_City() throws Exception{
   element = null;
   try{
      element=psUtility.swithFrame("driver.findElement(By.id(\"CITY_1$0\"))");
      Log.info("txt_City found in the TS15_ChangeProfile_Page");
   }catch (Exception e){
   Log.info("txt_City not found in the TS15_ChangeProfile_Page");
   throw(e);
   }
  return element;
 }
 public static WebElement txt_Postal() throws Exception{
   element = null;
   try{
      element=psUtility.swithFrame("driver.findElement(By.id(\"POSTAL_1$0\"))");
      Log.info("txt_Postal found in the TS15_ChangeProfile_Page");
   }catch (Exception e){
   Log.info("txt_Postal not found in the TS15_ChangeProfile_Page");
   throw(e);
   }
  return element;
 }
 public static WebElement txt_County() throws Exception{
   element = null;
   try{
      element=psUtility.swithFrame("driver.findElement(By.id(\"COUNTY_1$0\"))");
      Log.info("txt_County found in the TS15_ChangeProfile_Page");
   }catch (Exception e){
   Log.info("txt_County not found in the TS15_ChangeProfile_Page");
   throw(e);
   }
  return element;
 }
 public static WebElement chk_CopySameAddress() throws Exception{
   element = null;
   try{
      element=psUtility.swithFrame("driver.findElement(By.id(\"SM_CO_MYPROF_WK_SM_CO_SAME_ADDRESS\"))");
      Log.info("chk_CopySameAddress found in the TS15_ChangeProfile_Page");
   }catch (Exception e){
   Log.info("chk_CopySameAddress not found in the TS15_ChangeProfile_Page");
   throw(e);
   }
  return element;
 }
 public static WebElement btn_Save() throws Exception{
   element = null;
   try{
      element=psUtility.swithFrame("driver.findElement(By.id(\"SM_CO_MYPROF_WK_SAVE_BTN\"))");
      Log.info("btn_Save found in the TS15_ChangeProfile_Page");
   }catch (Exception e){
   Log.info("btn_Save not found in the TS15_ChangeProfile_Page");
   throw(e);
   }
  return element;
 }
}
