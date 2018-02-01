package appModules.OnboardingMaster;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.BaseClass;
import utility.Constant;
import utility.Log;
import utility.OnboardingConstants;
import utility.OrclConn;

public class TA_OnboardingProcess {
	public static String OrgSts=" ";
	@Test
	public static void Execute() throws Exception {

		TA_UserOnbordingProcess.Execute();
		TA_OrgOnbordingProcess.Execute();

		OrclConn.OpenDBConnection(Constant.Host, Constant.Port, Constant.SID, Constant.dbUser, Constant.dbPassword);

		// OrginizationRegistration_Page.OrgnizationID="0000000004"; //Debug variable
		for (int i = 1; i <= 30; i++) {

			OrclConn.RunQuery(
					"SELECT SM_CO_ORG_ID,CASE WHEN SM_CO_ORG_STATUS  = 'A' THEN 'Active' WHEN SM_CO_ORG_STATUS = 'B' THEN 'Blocked' WHEN SM_CO_ORG_STATUS = 'D' THEN 'Purged' WHEN SM_CO_ORG_STATUS = 'I' THEN 'Inactive' WHEN SM_CO_ORG_STATUS = 'S' THEN 'Suspended' WHEN SM_CO_ORG_STATUS = 'N' THEN 'Not Activated' ELSE 'Error' END ORG_STATUS FROM PS_SM_CO_ORGID where SM_CO_ORG_ID='"
							+ OnboardingConstants.OrgId + "'ORDER BY 1");
			OrclConn.rset.next();
			 OrgSts = OrclConn.rset.getString("ORG_STATUS");
			if (OrgSts.equals("Active")) {
				Log.info("Organization Status is " + OrgSts);
				break;
			} else {
				Thread.sleep(4000);
				Log.info("Waiting for to change the Organization Status as Active");
				if (i == 30) {
					Log.info("Takes long time to change the Organization Status as Active - Organization Status : "
							+ OrgSts);
					Reporter.log(
							"Terminate script execution due to takes long time to change the Organization Status as Active - Organization Status : "
									+ OrgSts);
					Assert.assertEquals(OrgSts, "Active");
				}
			}
		}

		OrclConn.OracleCloseConnection();
		// Thread.sleep(60000);
		BaseClass.driver.quit();
		Reporter.log("TenantAdmin User and Orginization Onboarding Completed Successfully<br>");
	}
}
