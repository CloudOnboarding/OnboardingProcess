package appModules.Activities.Candidate.PayrollAndTaxes;

import java.sql.SQLException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PayroleAndTaxes.CA_WorkLocationTaxWithholding_Page;
import utility.Constant;
import utility.OnboardingConstants;
import utility.OrclConn;
import utility.psUtility;

public class CA_WorkLocationTaxWithholding extends psUtility {
	@Test
	public static void Execute() throws Exception {
		try {
			OrclConn.OpenDBConnection(Constant.Host, Constant.Port, Constant.SID, Constant.dbUser, Constant.dbPassword);
			// OrclConn.RunQuery("select SM_CO_URL from PS_SM_CO_ATM_SRXRF where
			OrclConn.RunQuery("SELECT STATE FROM PS_SM_OB_INV_HDR WHERE SM_OB_TALENT_ID='"
					+ OnboardingConstants.CandidateId + "'");

			OrclConn.rset.next();
			String WrkState = OrclConn.rset.getString(1);
			//OrclConn.OracleCloseConnection();
			System.out.println("WrkState:::" + WrkState);
			switch (WrkState) {
			case "AL":
				CA_WorkLocationTaxWithholding_Page.txt_ClimNoPersonalExempt().sendKeys("0");
				CA_WorkLocationTaxWithholding_Page.txt_AdditionalAmt().sendKeys("50");
                      
				break;
			case "AK":
				break;
			case "AZ":
				break;
			case "AR":
				break;
			case "CA":
				CA_WorkLocationTaxWithholding_Page.rdbtn_SingleOrMarried().click();
				CA_WorkLocationTaxWithholding_Page.txt_RegularWithholdingAllowances().sendKeys("1");
				CA_WorkLocationTaxWithholding_Page.txt_ExtimatedDeductions().sendKeys("1");
				break;
			case "CO":
				break;
			case "CT":
				CA_WorkLocationTaxWithholding_Page.txt_WithHoldingCode().sendKeys("A");
				CA_WorkLocationTaxWithholding_Page.txt_AddlWithHoldingAmt().sendKeys("50");
				break;
			case "DE":
				break;
			case "DC":
				break;
			case "FL":
				break;
			case "GA":
				CA_WorkLocationTaxWithholding_Page.txt_Single().sendKeys("1");
				CA_WorkLocationTaxWithholding_Page.txt_DependntAllow().sendKeys("50");
				CA_WorkLocationTaxWithholding_Page.txt_AddnlAllow().sendKeys("50");
				CA_WorkLocationTaxWithholding_Page.txt_AdditionalAmt().sendKeys("10");
				break;
			case "HI":
				break;
			case "ID":
				break;
			case "IL":
				CA_WorkLocationTaxWithholding_Page.txt_TotalNumberAllowances().sendKeys("1");
				CA_WorkLocationTaxWithholding_Page.txt_AddnlAllowences().sendKeys("1");
				CA_WorkLocationTaxWithholding_Page.txt_AdditionalAmt().sendKeys("50");
				break;
			case "IN":
				break;
			case "IA":
				break;
			case "KS":
				break;
			case "KY":
				break;
			case "LA":
				break;
			case "ME":
				CA_WorkLocationTaxWithholding_Page.rdbtn_SingleOrMarried().click();
				CA_WorkLocationTaxWithholding_Page.txt_TotalNumberAllowances().sendKeys("1");
				CA_WorkLocationTaxWithholding_Page.txt_AdditionalAmt().sendKeys("50");
				break;
			case "MD":
				break;
			case "MA":

				CA_WorkLocationTaxWithholding_Page.txt_PersonalExempt().sendKeys("1");
				CA_WorkLocationTaxWithholding_Page.txt_DependntAllow().sendKeys("1");
				CA_WorkLocationTaxWithholding_Page.txt_AdditionalAmt().sendKeys("50");
				break;
			case "MI":
				CA_WorkLocationTaxWithholding_Page.chk_PermntHome().click();
				CA_WorkLocationTaxWithholding_Page.txt_ResidanceZone().sendKeys("MI");
				break;
			case "MN":
				CA_WorkLocationTaxWithholding_Page.rdbtn_SingleOrMarried().click();
				CA_WorkLocationTaxWithholding_Page.rdbtn_Section1().click();
				CA_WorkLocationTaxWithholding_Page.txt_TotalNumberAllowances().sendKeys("1");
				CA_WorkLocationTaxWithholding_Page.txt_AdditionalAmt().sendKeys("50");
				break;
			case "MS":
				break;
			case "MO":
				break;
			case "MT":
				break;
			case "NE":
				break;
			case "NV":
				break;
			case "NH":
				break;
			case "NJ":
				break;
			case "NM":
				break;
			case "NY":
				CA_WorkLocationTaxWithholding_Page.rdbtn_SingleOrMarried().click();
				CA_WorkLocationTaxWithholding_Page.rdbtn_ResdNY().click();
				CA_WorkLocationTaxWithholding_Page.rdbtn_Yonkers().click();
				CA_WorkLocationTaxWithholding_Page.txt_TotalNumberAllowances().sendKeys("1");
				CA_WorkLocationTaxWithholding_Page.txt_NYAllow().sendKeys("1");
				break;
			case "NC":
				break;
			case "ND":
				break;
			case "OH":
				break;
			case "OK":
				break;
			case "OR":
				CA_WorkLocationTaxWithholding_Page.rdbtn_SingleOrMarried().click();
				CA_WorkLocationTaxWithholding_Page.txt_TotalNumberAllowances().sendKeys("50");
				break;
			case "PA":
				break;
			case "PR":
				break;
			case "RI":
				break;
			case "SC":
				break;
			case "SD":
				break;
			case "TN":
				break;
			case "TX":
				break;
			case "UT":
				break;
			case "VT":
				break;
			case "VA":
				break;
			case "WA":
				break;
			case "WV":
				break;
			case "WI":
				break;
			case "WY":
				break;
			default:
				System.out.println("State Is not Listed in CA_WorkLocationTaxWithholding");
				break;
			}

			CA_WorkLocationTaxWithholding_Page.chk_IAgree().click();
			CA_WorkLocationTaxWithholding_Page.btn_ObAgree().click();
			Reporter.log("WorkLocationTax Withholding for "+WrkState+" Completed Successfully<br>");

		} catch (SQLException e) {
			System.out.println("No Rows Return from the Workstate SQL or DB Connectvity Issue");
			Reporter.log("No Rows Return from the Workstate SQL or DB Connectvity Issue");
		}

		Reporter.log("WorkLocationTax Withholding Completed Successfully<br>");
	}
}
