package appModules.OnboardingMaster;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import appModules.Login.External_LogOut;
import pageObjects.BaseClass;
import pageObjects.SmartOnboardingWelcome_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.InvitationConstants;
import utility.OnboardingConstants;
import utility.OrclConn;
import utility.psUtility;

public class CA_OnboardingProcess extends psUtility {
	public static Object CurrentActivity = "";
	public static String ActivityName = "";

	@Test
	public static void Execute() throws Exception {
		//InvitationConstants.iTestCaseRow=44;
		String StepName = "", ActionID = "", RoleType = "", PrevioustAction = "", PreviousRole = "";
		// Boolean HRLogin = false;
		String FlowStopper=ExcelUtils.getCellData(InvitationConstants.iTestCaseRow,
				ExcelUtils.getColContains("StopAction"));
		for (;;) {
			try {
				OrclConn.OpenDBConnection(Constant.Host, Constant.Port, Constant.SID, Constant.dbUser,
						Constant.dbPassword);
				OrclConn.RunQuery(
						"SELECT SM_BP_STEP_NAME,SM_BP_ACTION_ID,SM_BP_ACTIVITY_NAM FROM PS_SM_BP_TASKS_VW WHERE SM_BP_PRCS_INST_ID = (SELECT MAX(SM_BP_PRCS_INST_ID) FROM PS_SM_OB_XREF WHERE SM_OB_INVITN_ID = (SELECT SM_OB_INVITN_ID FROM PS_SM_OB_INV_HDR WHERE SM_OB_TALENT_ID = '"
								+ OnboardingConstants.CandidateId + "')) AND SM_BP_ACTN_STATUS = 'P'");
				OrclConn.rset.next();

				StepName = OrclConn.rset.getString(1);
				ActionID = OrclConn.rset.getString(2);
				ActivityName = OrclConn.rset.getString(3);
				System.out.println("activity name :::" + ActivityName);
				System.out.println("ActionID:::::" + ActionID);
				if (ActionID.contains("E-VERIFY")) {
					ActionID = "E_VERIFY";
				}
				if (ActionID.contains("AWAITNG")) {
					OrclConn.rset.next();

					StepName = OrclConn.rset.getString(1);
					ActionID = OrclConn.rset.getString(2);
					ActivityName = OrclConn.rset.getString(3);
				}
				
				 try {
				     Integer.parseInt(ActionID);
				     if(ActivityName.toUpperCase().contains("SMARTFORM")) {
				    	 ActionID="SMARTFORM";
				     }else {
				    	 ActionID="CHKLIST";
				     }
				     
				 }catch(Exception e) {
				 }
				if (PrevioustAction.equalsIgnoreCase(ActionID)) {
					break;
				}
				/***/
				//Flow Stopper
				if(FlowStopper.equalsIgnoreCase("Pre Submit HR")&&ActionID.equalsIgnoreCase("SUBMIT_HR")) {
					System.out.println("FlowStopper at :::::" + ActionID);
					External_LogOut.Execute();
					BaseClass.driver.quit();
					break;
				}
				
				CurrentActivity = utility.ActionDefinitions.class.getField(ActionID).get(ActionID);
				System.out.println(CurrentActivity.toString());

				if (StepName.contains("HR Tasks")) {
					OrclConn.RunQuery("SELECT SM_CO_ROLETYPE FROM PS_SM_BP_LTASKS_VW WHERE SM_BP_ACTION_ID= '"
							+ OrclConn.rset.getString(2) + "'");
					OrclConn.rset.next();
					RoleType = OrclConn.rset.getString(1);

					if (!RoleType.equalsIgnoreCase(PreviousRole)) {
						if (PreviousRole.length() > 0 || PreviousRole.equalsIgnoreCase("CA")) {
							External_LogOut.Execute();
							BaseClass.driver.quit();
						}
						ONBAdminLogin(OnboardingConstants.TUUser, OnboardingConstants.ONBPassword, RoleType,
								ActivityName);
					}
					OnboardingConstants.CandLogin = false;
				} else {
					if (!OnboardingConstants.CandLogin) {
						if (PreviousRole.length() > 0 && !PreviousRole.equalsIgnoreCase("CA")) {
							External_LogOut.Execute();
							BaseClass.driver.quit();
						}
						ONBAdminLogin(OnboardingConstants.CandUser, OnboardingConstants.ONBPassword, "CA",
								ActivityName);
						if (ActionID.contains("ELEC_DISC")) {
							SmartOnboardingWelcome_Page.lnk_GetStarted().click();
						} else {
							WebElement element = psUtility
									.switchFrame("driver.findElement(By.partialLinkText(\"" + ActivityName + "\"))");
							element.click();
						}
						OnboardingConstants.CandLogin = true;
					}
					RoleType = "CA";
				}
				PrevioustAction = ActionID;
				PreviousRole = RoleType;
				Reporter.log("<b>Excuting Activity: " + CurrentActivity.toString() + "</b><br>");

			} catch (SQLException e) {
				System.out.println(":::::Exit Onboarding Process:::::");
				if (StepName.contains("HR Tasks")) {
					//e.printStackTrace();
					External_LogOut.Execute();
					BaseClass.driver.quit();
				}
				break;
				// e.printStackTrace();
			} catch (NoSuchFieldException e) {
				System.out.println("Action ID " + ActionID + " not mapped in ActionDefinitions.class");
				Reporter.log("<p style='color:red';>Action ID " + ActionID
						+ " not mapped in ActionDefinitions.class</p><br>");
				throw (e);
			}

			OrclConn.OracleCloseConnection();
			invokeActivity(CurrentActivity.toString(), "Execute");
			
			//FlowStopper
			if(FlowStopper.equalsIgnoreCase(ActionID)) {
				System.out.println("FlowStopper at :::::" + ActionID);
				External_LogOut.Execute();
				BaseClass.driver.quit();
				break;
			}
		}
	}

	public static void invokeActivity(String ClassName, String MethodName) {
		try {
			Class<?> c = Class.forName(ClassName);
			Method main = c.getDeclaredMethod(MethodName);
			main.invoke(null);
		} catch (ClassNotFoundException x) {
			System.out.println("Class not found::"+ClassName);
			Reporter.log("<p style='color:red';>Class not found::"+ClassName+"</p><br>");
			x.initCause(x.getCause()).getCause().getMessage();
		} catch (NoSuchMethodException x) {
			System.out.println("MethodName not found::"+MethodName);
			Reporter.log("<p style='color:red';>MethodName not found::"+MethodName+"</p><br>");
			x.initCause(x.getCause()).getCause().getMessage();
		} catch (IllegalAccessException x) {
			x.printStackTrace();
		} catch (InvocationTargetException x) {
			x.initCause(x.getCause()).getCause().getMessage();
			// x.getCause().getMessage();
		}
	}
}
