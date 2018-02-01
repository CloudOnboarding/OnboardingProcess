package appModules;
import org.testng.annotations.Test;
import pageObjects.*;
import utility.psUtility;
import org.openqa.selenium.support.ui.Select;
public class TS15_ChangeProfile extends psUtility {
@Test
public static void Execute() throws Exception{
TS15_ChangeProfile_Page.txt_FirstName().sendKeys("jason");
TS15_ChangeProfile_Page.txt_LastName().sendKeys("Gillespie");
TS15_ChangeProfile_Page.txt_Email().com");
TS15_ChangeProfile_Page.btn_SendEmailVerfCode().click();
TS15_ChangeProfile_Page.txt_EmailEnterCode().sendKeys("294108");
TS15_ChangeProfile_Page.btn_EmailVerify().click();
TS15_ChangeProfile_Page.txt_PhoneNum().sendKeys("4445556666");
TS15_ChangeProfile_Page.btn_SendPhVerfCode().click();
TS15_ChangeProfile_Page.txt_PhoneEnterCode().sendKeys("900894");
TS15_ChangeProfile_Page.btn_PhoneVerify().click();
TS15_ChangeProfile_Page.txt_Address().sendKeys("12 Subway Road");
TS15_ChangeProfile_Page.txt_City().sendKeys("Pleasanton");
TS15_ChangeProfile_Page.txt_Postal().sendKeys("96533");
TS15_ChangeProfile_Page.txt_County().sendKeys("Alameda");
TS15_ChangeProfile_Page.chk_CopySameAddress().click();
TS15_ChangeProfile_Page.btn_Save().click();
}
}
