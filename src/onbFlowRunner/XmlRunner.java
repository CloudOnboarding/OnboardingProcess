package onbFlowRunner;

import java.util.ArrayList;
import java.util.List;
import org.testng.TestNG;
import utility.Constant;
import utility.ExcelUtils;
import utility.InvitationConstants;

public class XmlRunner {
	public static boolean iterateXml=false;

	public static void main(String[] args) throws Exception {
		iterateXml=true;
		ExcelUtils.setExcelFile(InvitationConstants.InvDataFile,"InvitationData");
		TestNG runner = new TestNG();
		List<String> suitefiles = new ArrayList<String>();
		InvitationConstants.iTestCaseRow=0;
	//	suitefiles.add(Constant.RelativePath +"\\TestNgXml\\ONBTestScenarios.xml");
		for (int i = 1;; i++) {
			InvitationConstants.iTestCaseRow+=1;
			if(ExcelUtils.getCellData(InvitationConstants.iTestCaseRow,ExcelUtils.getColContains("RunTest")).length()<=1) {
				break;
			}
			if(ExcelUtils.getCellData(InvitationConstants.iTestCaseRow,ExcelUtils.getColContains("RunTest")).equalsIgnoreCase("TRUE")) {

				suitefiles.add(Constant.RelativePath +"\\TestNgXml\\OnboardingProcess_I9.xml");
			}else {
				continue;
			}
			i=InvitationConstants.iTestCaseRow;
		}
		InvitationConstants.iTestCaseRow=0;
		runner.setTestSuites(suitefiles);
		runner.run();

	}
}
