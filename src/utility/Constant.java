package utility;

import java.awt.Toolkit;

public class Constant {
	static Toolkit toolkit = Toolkit.getDefaultToolkit();
	public static final String RelativePath = System.getProperty("user.dir");
	public static final String EnvFliePath = RelativePath + "\\Files\\EnvironemntDetails\\Connection.properties";
	public static final String ActionId = RelativePath + "\\Files\\TestData\\Revision_ActionDefinitions.xlsx";
	// Browser Servers for Firefox
	public static final String Brwsr_FireFox = "webdriver.gecko.driver";
	public static final String geckodriverPath = RelativePath + "/Drivers/geckodriver018.exe";
	// Browser Server for Chrome
	public static final String Brwsr_Chrome = "webdriver.chrome.driver";
	public static final String ChromePath = RelativePath + "/Drivers/chromedriver.exe";

	// Internal URL Details for Peoplesoft
	public static final String InternalURL = utils.FileReader(EnvFliePath, "URL");
	public static final String Username = utils.FileReader(EnvFliePath, "Username");
	public static final String Password = utils.FileReader(EnvFliePath, "Password");
	public static final String NavigateURL = utils.FileReader(EnvFliePath, "NavigateURL");
	public static final String OrgHost = utils.FileReader(EnvFliePath, "OrgHost");

	// External URL --changes depend up on host set in create organization
	public static final String ExternalURL = utils.FileReader(EnvFliePath, "ExternalURL");

	// Script Execution time to load (if every URl doesn't store in 20 seconds
	// script will abort)
	// Browser width and height outset
	public static final int implicitWaitTime = 30;
	public static final int Width = (int) toolkit.getScreenSize().getWidth();
	public static final int Height = (int) toolkit.getScreenSize().getHeight();

	// Work in progress
	public static final String Path_TestData = "D://ToolsQA//OnlineStore//src//testData//";
	public static final String File_TestData = "TestData.xlsx";
	public static final String Path_ScreenShot = RelativePath + "/Screenshots/";

	// public static final String MUsername = "CA1";

	// Password For External URL
	//public static final String MPassword = "Serps*123";
	//public static String pageName = "pageName";

	// Initially Onboarding UserName Set to Null
	// public static String OnboardingUser = null;
	/* public static String Candidateid = null; */
	// Database Connection Details

	public static String Host = utils.FileReader(EnvFliePath, "Host");
	public static String Port = utils.FileReader(EnvFliePath, "Port");
	public static String SID = utils.FileReader(EnvFliePath, "SID");
	public static String dbUser = utils.FileReader(EnvFliePath, "dbUser");
	public static String dbPassword = utils.FileReader(EnvFliePath, "dbPassword");

	// RunTest flag for listener class
	public static boolean RunTest = true;
	public static boolean StopOnFail = true;
	
	//Weblistener Controls
	public static boolean Fragment=true;
	public static boolean Tab=true;
	public static boolean Processwait=true;
	public static boolean clear=true;
	public static boolean handlepopup=true;
	public static boolean drawBoarder=true;
	public static boolean locateElmnt=true;
	
	
	

}
