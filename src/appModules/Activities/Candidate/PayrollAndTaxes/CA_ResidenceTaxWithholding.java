package appModules.Activities.Candidate.PayrollAndTaxes;


import java.sql.SQLException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.activityObjects.CA_Tasks.PayroleAndTaxes.CA_ResidenceTaxWithholding_Page;
import utility.Constant;
import utility.Log;
import utility.OnboardingConstants;
import utility.OrclConn;
import utility.psUtility;

public class CA_ResidenceTaxWithholding extends psUtility {
	@Test
	public static void Execute() throws Exception {
		//ExcelUtils.setExcelFile(InvitationConstants.InvDataFile,"InvitationData");
	try {
		OrclConn.OpenDBConnection(Constant.Host, Constant.Port, Constant.SID, Constant.dbUser, Constant.dbPassword);
		OrclConn.RunQuery("SELECT STATE FROM PS_SM_OB_ADDRESSES WHERE SM_OB_INVITN_ID=(SELECT SM_OB_INVITN_ID FROM PS_SM_OB_INV_HDR WHERE SM_OB_TALENT_ID='"
		+ OnboardingConstants.CandidateId + "') AND ADDRESS_TYPE='HOME'");

		OrclConn.rset.next();
		String ResidState = OrclConn.rset.getString(1);
		
		 switch(ResidState) {
		  case  "AL": 
		   break;
		  case  "AK": 
		   break;
		  case  "AZ": 
			    CA_ResidenceTaxWithholding_Page.rdbtn_ElectArizona().click();
				Log.info("Click action is performed on 'Elect an Arizona withholding' radio button");
		        break;
		  case  "AR": 
			    CA_ResidenceTaxWithholding_Page.chkbx_Youclaimyourself().click();
				Log.info("Click action is performed on 'You claim yourself' checkbox");
				CA_ResidenceTaxWithholding_Page.txt_NoOfChildren().sendKeys("1");
				Log.info(1 + " is entered in 'Number of Children' text box");
				CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional amount' text box");
				CA_ResidenceTaxWithholding_Page.rdbtn_LowIncomeTaxRates().click();
				Log.info("Click action is performed on 'Low income tax rates' radio button");
		        break;
		  case  "CA": 
		   break;
		  case  "CO": 
			    CA_ResidenceTaxWithholding_Page.rdbtn_Single().click();
				Log.info("Click action is performed on 'Single' radio button");
				CA_ResidenceTaxWithholding_Page.txt_TotalNumberAllowances().sendKeys("1");
				Log.info(1 + " is entered in 'Total number of allowances' text box");
				CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional amount' text box");
		        break;
		  case  "CT": 
		   break;
		  case  "DE": 
			    CA_ResidenceTaxWithholding_Page.rdbtn_Single().click();
				Log.info("Click action is performed on 'Single' radio button");
				CA_ResidenceTaxWithholding_Page.txt_TotalNumberAllowances().sendKeys("1");
				Log.info(1 + " is entered in 'Total number of allowances' text box");
				CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional amount' text box");
		        break;
		  case  "DC": 
			    CA_ResidenceTaxWithholding_Page.rdbtn_Single().click();
				Log.info("Click action is performed on 'Single' radio button");
				CA_ResidenceTaxWithholding_Page.txt_TotalNumberAllowancesSecA().sendKeys("1");
				Log.info(1 + " is entered in 'Total number of allowances Sec A' text box");
				CA_ResidenceTaxWithholding_Page.txt_TotalNumberAllowancesSecB().sendKeys("2");
				Log.info(1 + " is entered in 'Total number of allowances Sec B' text box");
				CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional amount' text box");
				CA_ResidenceTaxWithholding_Page.rdbtn_MyDomicile().click();
				Log.info("Click action is performed on 'My domicile' radio button");
		   break;
		  case  "FL": 
		   break;
		  case  "GA": 
		   break;
		  case  "HI": 
			    CA_ResidenceTaxWithholding_Page.rdbtn_Single().click();
				Log.info("Click action is performed on 'Single' radio button");
				CA_ResidenceTaxWithholding_Page.txt_TotalNumberAllowances().sendKeys("1");
				Log.info(1 + " is entered in 'Total number of allowances' text box");
				CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional amount' text box");
		        break;
		  case  "ID":
			    CA_ResidenceTaxWithholding_Page.rdbtn_Single().click();
				Log.info("Click action is performed on 'Single' radio button");
				CA_ResidenceTaxWithholding_Page.txt_TotalNumberAllowances().sendKeys("1");
				Log.info(1 + " is entered in 'Total number of allowances' text box");
				CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional amount' text box");
		        break;
		  case  "IL": 
		   break;
		  case  "IN": 
		        CA_ResidenceTaxWithholding_Page.txt_CountyOfResidence().sendKeys("Indiana");;
			    Log.info("Indiana is entered in 'Entitled to one exemption' text box");
			    CA_ResidenceTaxWithholding_Page.txt_CountyOfPrincipal().sendKeys("Indiana");;
			    Log.info("Indiana is entered in 'Entitled to one exemption' text box");
		        CA_ResidenceTaxWithholding_Page.txt_OneExemption().sendKeys("1");;
			    Log.info(1 + " is entered in 'Entitled to one exemption' text box");
			    CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
			    Log.info(4000 + " is entered in 'Additional state amount' text box");
			    //CA_ResidenceTaxWithholding_Page.txt_AdditionalCountyAmt().sendKeys("2000");
			    //Log.info(2000 + " is entered in 'Additional county amount' text box");
		          break;
		  case  "IA": 
			    CA_ResidenceTaxWithholding_Page.rdbtn_Single().click();
				Log.info("Click action is performed on 'Single' radio button");
				CA_ResidenceTaxWithholding_Page.txt_PersonalAllowances().sendKeys("1");
				Log.info(1 + " is entered in 'Personal allowances' text box");
				CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional amount' text box");
		        break;
		  case  "KS": 
			    CA_ResidenceTaxWithholding_Page.rdbtn_Single().click();
				Log.info("Click action is performed on 'Single' radio button");
				CA_ResidenceTaxWithholding_Page.txt_TotalNumberAllowances().sendKeys("1");
				Log.info(1 + " is entered in 'Total number of allowances' text box");
				CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional amount' text box");
		        break;
		  case  "KY": 
			    CA_ResidenceTaxWithholding_Page.txt_OneExemption().sendKeys("1");;
				Log.info(1 + " is entered in 'SINGLE exemption' text box");
				CA_ResidenceTaxWithholding_Page.txt_MarriedExemption().sendKeys("0");;
				Log.info(0 + " is entered in 'MARRIED exemption' text box");
				CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional state amount' text box");
		        break;
		  case  "LA":
			    CA_ResidenceTaxWithholding_Page.rdbtn_Single().click();
				Log.info("Click action is performed on 'Single' radio button");
			    CA_ResidenceTaxWithholding_Page.txt_OneExemption().sendKeys("1");;
				Log.info(1 + " is entered in 'Total number of exemptions' text box");
				CA_ResidenceTaxWithholding_Page.txt_TotalNumberAllowances().sendKeys("1");
				Log.info(1 + " is entered in 'Total number of dependents' text box");
		        break;
		  case  "ME": 
		   break;
		  case  "MD": 
			    CA_ResidenceTaxWithholding_Page.rdbtn_Single().click();
				Log.info("Click action is performed on 'Single' radio button");
				CA_ResidenceTaxWithholding_Page.txt_TotalNumberAllowances().sendKeys("1");
				Log.info(1 + " is entered in 'Total number of exemptions' text box");
				CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional withholding' text box");
		        break;
		  case  "MA": 
		   break;
		  case  "MI": 
		   break;
		  case  "MN": 
		   break;
		  case  "MS": 
			    CA_ResidenceTaxWithholding_Page.txt_ExemptStatus().sendKeys("Exempt");
				Log.info("Exempt is entered in 'Service Member Civil Relief' text box");
		        break;
		  case  "MO": 
			    CA_ResidenceTaxWithholding_Page.rdbtn_Single().click();
				Log.info("Click action is performed on 'Single' radio button");
				CA_ResidenceTaxWithholding_Page.txt_ExemptStatus().sendKeys("Exempt");
				Log.info("Exempt is entered in 'Exempt Status' text box");
		        break;
		  case  "MT": 
			    CA_ResidenceTaxWithholding_Page.rdbtn_Single().click();
				Log.info("Click action is performed on 'Single' radio button");
				CA_ResidenceTaxWithholding_Page.txt_TotalNumberAllowances().sendKeys("1");
				Log.info(1 + " is entered in 'Total number of allowances' text box");
				CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional amount' text box");
		        break;
		  case  "NE":
			    /*CA_ResidenceTaxWithholding_Page.rdbtn_Single().click();
				Log.info("Click action is performed on 'Single' radio button");
				CA_ResidenceTaxWithholding_Page.txt_TotalNumberAllowances().sendKeys("1");
				Log.info(1 + " is entered in 'Total number of allowances' text box");*/
				CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional amount' text box");
		        break;
		  case  "NV": 
		   break;
		  case  "NH": 
		   break;
		  case  "NJ": 
			    CA_ResidenceTaxWithholding_Page.rdbtn_Single().click();
				Log.info("Click action is performed on 'Single' radio button");
				CA_ResidenceTaxWithholding_Page.txt_TotalNumberAllowances().sendKeys("1");
				Log.info(1 + " is entered in 'Total number of allowances' text box");
				CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional amount' text box");
		        break;
		  case  "NM": 
			    CA_ResidenceTaxWithholding_Page.rdbtn_Single().click();
				Log.info("Click action is performed on 'Single' radio button");
				CA_ResidenceTaxWithholding_Page.txt_TotalNumberAllowances().sendKeys("1");
				Log.info(1 + " is entered in 'Total number of allowances' text box");
				CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional amount' text box");
		        break;
		  case  "NY": 
		   break;
		  case  "NC": 
			    CA_ResidenceTaxWithholding_Page.txt_NoOfChildren().sendKeys("1");
				Log.info(1 + " is entered in 'Total number of allowances' text box");
				CA_ResidenceTaxWithholding_Page.txt_NCAdditionalAmt().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional amount' text box");
				CA_ResidenceTaxWithholding_Page.rdbtn_Single().click();
				Log.info("Click action is performed on 'Single' radio button");
		        break;
		  case  "ND": 
		   break;
		  case  "OH": 
			    CA_ResidenceTaxWithholding_Page.txt_PersonalExemption().sendKeys("1");
				Log.info(1 + " is entered in 'Personal exemption' text box");
				CA_ResidenceTaxWithholding_Page.txt_NoOfChildren().sendKeys("1");
				Log.info(1 + " is entered in 'Exemptions for dependents' text box");
				CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional amount' text box");
		        break;
		  case  "OK": 
			    CA_ResidenceTaxWithholding_Page.rdbtn_Single().click();
				Log.info("Click action is performed on 'Single' radio button");
				CA_ResidenceTaxWithholding_Page.txt_TotalNumberAllowances().sendKeys("1");
				Log.info(1 + " is entered in 'Total number of allowances' text box");
				CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional amount' text box");
		        break;
		  case  "OR": 
		   break;
		  case  "PA": 
		   break;
		  case  "PR": 
		   break;
		  case  "RI": 
			    CA_ResidenceTaxWithholding_Page.txt_ExemptStatus().sendKeys("Exempt");
				Log.info("Exempt is entered in 'Exempt Status' text box");
		        break;
		  case  "SC": 
			    CA_ResidenceTaxWithholding_Page.rdbtn_Single().click();
				Log.info("Click action is performed on 'Single' radio button");
				CA_ResidenceTaxWithholding_Page.txt_TotalNumberAllowances().sendKeys("1");
				Log.info(1 + " is entered in 'Total number of allowances' text box");
				CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional amount' text box");
		        break;
		  case  "SD": 
		   break;
		  case  "TN": 
		   break;
		  case  "TX": 
		   break;
		  case  "UT":
			    CA_ResidenceTaxWithholding_Page.rdbtn_Single().click();
				Log.info("Click action is performed on 'Single' radio button");
				CA_ResidenceTaxWithholding_Page.txt_TotalNumberAllowances().sendKeys("1");
				Log.info(1 + " is entered in 'Total number of allowances' text box");
				CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional amount' text box");
		        break;
		  case  "VT": 
			    CA_ResidenceTaxWithholding_Page.rdbtn_Single().click();
				Log.info("Click action is performed on 'Single' radio button");
				CA_ResidenceTaxWithholding_Page.txt_TotalNumberAllowances().sendKeys("1");
				Log.info(1 + " is entered in 'Total number of allowances' text box");
				CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional amount' text box");
		        break;
		  case  "VA": 
			    CA_ResidenceTaxWithholding_Page.chkBox_ServicememberCivilReliefAct().click();
				Log.info("Click action is performed on 'Service member Civil Relief Act' check box");
		   break;
		  case  "WA": 
		   break;
		  case  "WV": 
			    CA_ResidenceTaxWithholding_Page.txt_OneExemption().sendKeys("1");
				Log.info(1 + " is entered in 'SINGLE exemption' text box");
				CA_ResidenceTaxWithholding_Page.txt_NoOfChildren().sendKeys("1");
				Log.info(1 + " is entered in 'Exemptions for dependents' text box");
				CA_ResidenceTaxWithholding_Page.txt_AdditionalAmount().sendKeys("4000");
				Log.info(4000 + " is entered in 'Additional amount' text box");
		        break;
		  case  "WI": 
			    CA_ResidenceTaxWithholding_Page.rdbtn_Single().click();
				Log.info("Click action is performed on 'Single' radio button");
				CA_ResidenceTaxWithholding_Page.txt_ExemptStatus().sendKeys("Exempt");
				Log.info("Exempt is entered in 'Claim complete exemption' text box");
		        break;
		  case  "WY": 
		   break;
		  default: 
			  System.out.println("Residence Tax Withholding Is not Listed in CA_ResidenceTaxWithholding");
		   break;
		  }
	
		CA_ResidenceTaxWithholding_Page.chkBox_IAgree().click();
		Log.info("Click action is performed on 'Agree' check box");
		CA_ResidenceTaxWithholding_Page.btn_ElectronicSigature().click();
		Log.info("Click action is performed on 'Electronic Sigature' button");
		Reporter.log("Residence Tax Withholding for "+ResidState+" Completed Successfully<br>");
		
	} catch (SQLException e) {
		System.out.println("No Rows Return from the Residence SQL or DB Connectvity Issue");
		Reporter.log("No Rows Return from the Residence state SQL or DB Connectvity Issue");
	}
		
	}
}
