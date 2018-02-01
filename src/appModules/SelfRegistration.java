package appModules;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.BaseClass;
import pageObjects.ConfirmSelfRegistration_Page;
import pageObjects.CreateAnAccount_Page;
import pageObjects.Message_Handler;
import pageObjects.Setup_E_Pin_Page;
import pageObjects.VerifiyContactInfo_Page;
import utility.Constant;
import utility.Log;
import utility.OnboardingConstants;
import utility.OrclConn;
import utility.psUtility;

public class SelfRegistration extends psUtility {
	@Test
	public static void Execute(String UserName) throws Exception {
		// Constant.OnboardingUser="TA_0000000069";
		OrclConn.OpenDBConnection(Constant.Host, Constant.Port, Constant.SID, Constant.dbUser, Constant.dbPassword);
		// OrclConn.RunQuery("select SM_CO_URL from PS_SM_CO_ATM_SRXRF where
		// SM_CO_ORG_ID='0000000069'");
		OrclConn.RunQuery("select SM_CO_URL from PS_SM_CO_ATM_SRXRF where SM_CO_ORG_ID='"
				+ OnboardingConstants.OrgId.trim() + "' ORDER BY SM_CO_CREATED_ON DESC");

		OrclConn.rset.next();
		String SelfRegURL = OrclConn.rset.getString(1);
		OrclConn.OracleCloseConnection();
		
		System.out.println( "External selfregistration URL::"+SelfRegURL);

		BaseClass.driver.navigate().to(SelfRegURL);

		System.out.println("::::::::::::Enter url from Mail ::::::::::::::::::::");

		// Enter Create an account details
		CreateAnAccount_Page.txt_UserNameMV().sendKeys(UserName);
		CreateAnAccount_Page.txt_PasswordMV().sendKeys(OnboardingConstants.ONBPassword);
		CreateAnAccount_Page.txt_ConfPasswordMV().sendKeys(OnboardingConstants.ONBPassword);
		Log.info("Entered Create an account details");
		CreateAnAccount_Page.lnk_NextMV().click();
		Log.info("Click action is performed on Next button");

		//Verify Two Factor Authentication
		Verification2Factor_Authentication.Execute();

		// Enter Phone Setup E Pin details
		Setup_E_Pin_Page.txt_ePin().sendKeys("123$%");
		Setup_E_Pin_Page.txt_ConfirmEpin().sendKeys("123$%");
		Log.info("Entered Setup E Pin details");
		Setup_E_Pin_Page.lnk_registerNow().click();
		Log.info("Click action is performed on Register Now link");

		// Verify TA User Registration completed successfully
		//OnbAssertions.Verify_SelfRegistration(UserName);

		//ConfirmSelfRegistration_Page.lnk_Clickhere().click();
		ConfirmSelfRegistration_Page.btn_OK().click();
		Log.info("Click action is performed on  confiramtion Page OK button");

		Reporter.log("SelfRegistration has been Performed Successfully<br>");

	}
}
