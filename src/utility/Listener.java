package utility;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;

import pageObjects.BaseClass;

public class Listener implements ITestListener, IInvokedMethodListener {

	@Override
	public void onFinish(ITestContext arg0) {
		if (Constant.RunTest) {
			Reporter.log("Completed executing test " + arg0.getName() + "<br>", true);
		} else {
			Reporter.log("Abort executing test " + arg0.getName() + "<br>", true);
		}

	}

	@Override
	public void onStart(ITestContext arg0) {
		if (Constant.RunTest) {
			Reporter.log("About to begin executing test " + arg0.getName() + "<br>", true);
		}
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
	}

	@Override
	public void onTestFailure(ITestResult result) {
		if (Constant.RunTest) {
			System.setProperty("org.uncommons.reportng.escape-output", "false");
			String rs = getMethodContext(result);
			System.err.println(rs + " | FAILED");
			Reporter.log("<p style='color:red';><b>" + rs + " | FAILED</b></p> ");

			try {
				String ScreenshotName = result.getTestClass().getName() + "_" + psUtility.generateFileName(result);

				File directory = new File(Constant.RelativePath + "\\test-output\\html\\");
				if (!directory.exists()) {
					directory.mkdir();
				}

				File scrFile = psUtility.takeScreenshot(BaseClass.driver, ScreenshotName);
				File DestFile = new File(Constant.RelativePath + "\\test-output\\html\\" + ScreenshotName + ".jpg");
				FileUtils.copyFile(scrFile, DestFile);

				Reporter.log("<a href=" + ScreenshotName + ".jpg target='_blank' style='color:red';>Screenshot</a>");

				// Reporter.log("<a
				// href="+psUtility.takeScreenshot(BaseClass.driver,result.getTestClass().getName()+"_"+psUtility.generateFileName(result))+"
				// target='_blank' style='color:red';>Screenshot</a>");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			Reporter.log(
					"<p style='color:red';><b>Execution aborted due to assertion failed in prior script.</b></p> ");
		}
		if (Constant.StopOnFail) {
			Constant.RunTest = false;
		}
		// printTestResults(arg0);
	}

	private String getMethodContext(ITestResult result) {
		// String browser = result.getTestContext().getCurrentXmlTest()
		// .getParameter("browser");
		String testClasss = result.getTestClass().getName();
		String name = result.getName();
		String rs = testClasss + " | " + name;
		return rs;
	}

	private void printTestResults(ITestResult result) throws Exception {
		// Reporter.log("TestName = " + result.getTestName(), true);
		// Reporter.log("Test Method resides in " + result.getTestClass().getName(),
		// true);
		if (result.getParameters().length != 0) {
			@SuppressWarnings("unused")
			String params = null;
			for (Object parameter : result.getParameters()) {
				params += parameter.toString() + ",";
			}
			// Reporter.log("Test Method had the following parameters : " + params, true);
		}
		String status = null, color = "red";
		switch (result.getStatus()) {
		case ITestResult.SUCCESS:
			status = "Pass";
			color = "green";
			break;
		case ITestResult.FAILURE:
			status = "Failed";
			break;
		case ITestResult.SKIP:
			status = "Skipped";
		}
		// Reporter.log("Test Status: " + status, true);

		String rs = getMethodContext(result);
		System.out.println(rs + " | " + status);
		// Reporter.log(rs + " | "+status);
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<p style='color:" + color + "';><b>" + rs + " | " + status + "</b></p> ");

	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		try {
			psUtility.takeScreenshot(BaseClass.driver,
					arg0.getTestClass().getName() + "_" + psUtility.generateFileName(arg0));
			printTestResults(arg0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestStart(ITestResult arg0) {
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		try {
			printTestResults(arg0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		if (Constant.RunTest) {
			String textMsg = "Completed executing " + returnMethodName(arg0.getTestMethod());
			Reporter.log(textMsg, true);
		}
	}

	@Override

	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		String textMsg = "About to begin executing " + returnMethodName(arg0.getTestMethod());

		if (!(returnMethodName(arg0.getTestMethod()).equals("Log.endTestCase"))) {
			if (Constant.RunTest) {
				Reporter.log(textMsg, true);
			} else {
				Assert.assertTrue(false);
			}
		}
	}

	private String returnMethodName(ITestNGMethod method) {
		return method.getRealClass().getSimpleName() + "." + method.getMethodName();
	}

}
