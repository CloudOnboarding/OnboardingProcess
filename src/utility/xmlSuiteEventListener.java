package utility;

import java.util.Arrays;
import java.util.Map;

import org.testng.Assert;
import org.testng.ISuite;
import org.testng.ISuiteListener;

import onbFlowRunner.XmlRunner;

public class xmlSuiteEventListener implements ISuiteListener {

	public String CurrentTestCaseRow = "";
	public boolean isItestRoeExists = false;

	@Override
	public void onFinish(ISuite arg0) {
	}

	@SuppressWarnings("deprecation")
	@Override
	public void onStart(ISuite suite) {
		// Constant.Fragment=true;
		System.setProperty("org.uncommons.reportng.title", "Smart Onboarding Test Report");
		try {
			ExcelUtils.setExcelFile(InvitationConstants.InvDataFile, "InvitationData");
		} catch (Exception e1) {
		}
		Map<String, String> parameters = suite.getXmlSuite().getParameters();
		for (Map.Entry<String, String> parameter : parameters.entrySet()) {

			if (parameter.getKey().equalsIgnoreCase("iTestCaseRow")) {
				isItestRoeExists = true;
				if (XmlRunner.iterateXml) {
					try {

						for (int i = InvitationConstants.iTestCaseRow + 1;; i++) {
							InvitationConstants.iTestCaseRow = i;

							// InvitationConstants.iTestCaseRow+=1;
							if (ExcelUtils
									.getCellData(InvitationConstants.iTestCaseRow, ExcelUtils.getColContains("RunTest"))
									.length() <= 1) {
								break;
							}
							if (ExcelUtils
									.getCellData(InvitationConstants.iTestCaseRow, ExcelUtils.getColContains("RunTest"))
									.equalsIgnoreCase("TRUE")) {

								parameter.setValue("" + InvitationConstants.iTestCaseRow);
								break;

							} else {
								continue;
							}
						}
						CurrentTestCaseRow = "" + InvitationConstants.iTestCaseRow;
					} catch (Exception e) {
						System.out.println("Catch block in xmlSuiteEventListene");
					}
				} else {
					try {
						System.out.println("Run Flag::" + ExcelUtils.getCellData(Integer.parseInt(parameter.getValue()),
								ExcelUtils.getColContains("RunTest")));
						if (ExcelUtils.getCellData(Integer.parseInt(parameter.getValue()),
								ExcelUtils.getColContains("RunTest")).equalsIgnoreCase("TRUE")) {
							parameter.setValue("" + Integer.parseInt(parameter.getValue()));
							CurrentTestCaseRow = parameter.getValue();
							InvitationConstants.iTestCaseRow = Integer.parseInt(CurrentTestCaseRow);
						} else {
							System.out.println("Runtest Flag set to False in Data Sheet or iTestCaseRow:: "
									+ parameter.getValue() + " not Exists");
							Assert.assertTrue(false);
						}
					} catch (Exception e) {
						System.out.println("Runtest Flag set to False in Data Sheet or iTestCaseRow:: "
								+ parameter.getValue() + " not Exists");
						Assert.assertTrue(false);
					}
				}
				// param_TestCaseRow++;
			}
		}
		/***** Suite Name *****/
		if (isItestRoeExists) {
			if (InvitationConstants.iTestCaseRow > 0) {
				try {
					suite.getXmlSuite()
							.setName("WorkState : "
									+ ExcelUtils.getCellData(InvitationConstants.iTestCaseRow,
											ExcelUtils.getColContains("Location"))
									+ "<font color=\" #e74c3c \"><b> |</b></font> ResidentState : "
									+ ExcelUtils.getCellData(InvitationConstants.iTestCaseRow,
											ExcelUtils.getColContains("State"))
									+ "<font color=\" #e74c3c \"><b> |</b></font> I9 State : "
									+ ExcelUtils.getCellData(InvitationConstants.iTestCaseRow,
											ExcelUtils.getColContains("I9State"))
									+ "<font color=\" #e74c3c \"><b> |</b></font> StopAction : "
									+ ExcelUtils.getCellData(InvitationConstants.iTestCaseRow,
											ExcelUtils.getColContains("StopAction")));
					WebListener.ScriptInfo = "Case# : " + InvitationConstants.iTestCaseRow
							+ "<font color=\"#e74c3c\"><b> |</b></font> " + suite.getXmlSuite().getName();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else {
			WebListener.ScriptInfo = suite.getXmlSuite().getName();
		}
	}
}
