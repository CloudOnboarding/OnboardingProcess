package appModules.Login;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Assertions.OnbAssertions;
import pageObjects.InternalLogin_Page;
import utility.Constant;
import utility.psUtility;

public class Internal_Login extends psUtility {
	@Test
	public static void Execute() throws Exception {

		InternalLogin_Page.txt_UserName().sendKeys(Constant.Username);
		InternalLogin_Page.txt_Pwd().sendKeys(Constant.Password);
		InternalLogin_Page.btn_Submit().click();

		/* Verify Home page */
		OnbAssertions.Verify_HomePage();
		Reporter.log("Internal Login Action Performed Successfully<br>");

	}
}
