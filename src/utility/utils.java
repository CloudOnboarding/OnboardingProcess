package utility;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.BaseClass;

public class utils {

	public static String FileReader(String FilePath, String param) {
		File file = new File(FilePath);

		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();

		// load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(param);
	}

	public static void CreateZip(String inFolderPath, String outFolderPath) {
		try {
			File inFolder = new File(inFolderPath);
			File outFolder = new File(outFolderPath);

			ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(outFolder)));
			BufferedInputStream in = null;
			byte[] data = new byte[1000];
			String files[] = inFolder.list();

			for (int i = 0; i < files.length; i++) {
				in = new BufferedInputStream(new FileInputStream(inFolder.getPath() + "/" + files[i]), 1000);
				out.putNextEntry(new ZipEntry(files[i]));
				int count;
				while ((count = in.read(data, 0, 1000)) != -1) {
					out.write(data, 0, count);
				}
				out.closeEntry();
			}
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public static void reportNGZip() {
		try {
	        File directory = new File(Constant.RelativePath + "\\test-output\\html");

	        //get all the files from a directory
	        File[] fList = directory.listFiles();

	        for (File file : fList){
	            if (file.isFile()){
	            	if(file.getName().contains(".html")) {
	            		 String content = FileUtils.readFileToString(file, "UTF-8");
		    		     content = content.replaceAll("reportng.js", "reportng.jss");
		    		     FileUtils.writeStringToFile(file, content, "UTF-8");
	            	}
	            }
	        }
		} catch (IOException e) {
		  }
		
		/** Detete .js files from HTML Folder **/
		//File trashFile1 = new File(Constant.RelativePath + "\\test-output\\html\\reportng.js");
		File trashFile2 = new File(Constant.RelativePath + "\\test-output\\html\\sorttable.js");

		File indexHtml = new File(Constant.RelativePath + "\\test-output\\html\\index.html");
		File mainReportHTML = new File(Constant.RelativePath + "\\test-output\\html\\mainReport.html");
		indexHtml.renameTo(mainReportHTML);
		
		File reportngjs = new File(Constant.RelativePath + "\\test-output\\html\\reportng.js");
		File reportngjss = new File(Constant.RelativePath + "\\test-output\\html\\reportng.jss");
		reportngjs.renameTo(reportngjss);
		
		
		//trashFile1.delete();
		trashFile2.delete();

		utils.CreateZip(Constant.RelativePath + "\\test-output\\html",
				Constant.RelativePath + "\\test-output\\results.zip");
	}

	@Test
	public static void CleanProjOutDir() throws IOException {
		File outDir = new File(Constant.RelativePath + "\\test-output");
		if (!outDir.exists()) {
			outDir.mkdir();
		} else {
			FileUtils.deleteDirectory(outDir);
			if (!outDir.exists()) {
				outDir.mkdir();
			}
		}
	}

	public static boolean msgRecogniser(String message) throws IOException {
		boolean msgExsts = false;
		// Open the file
		FileInputStream fstream = new FileInputStream(Constant.RelativePath + "\\Files\\MessageRecognition.properties");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;
		System.out.println("popup message :" + message);
		// Read File Line By Line
		while ((strLine = br.readLine()) != null) {
			// Print the content on the console
			if (message.toUpperCase().contains(strLine.toUpperCase())) {
				msgExsts = true;
				break;
			}
		}

		// Close the input stream
		br.close();

		if (!msgExsts) {
			System.out.println("unhandled popup present on th page");
		}
		return msgExsts;
	}

	public static boolean handlePopup() throws Exception {
		BaseClass.driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
		boolean popupEexsts = true;
		final List<WebElement> iframes = BaseClass.driver.findElements(By.tagName("iframe"));

		if (iframes.size() == 0) {
			for (int i = 1; i <= 2; i++) {
				if (i == 2) {
					BaseClass.driver.switchTo().defaultContent();
				}
				try {
					WebElement popupClassic = BaseClass.driver.findElement(By.id("alertmsg"));
					if (!popupClassic.getText().equalsIgnoreCase("")) {
						System.out.println("popup displayed");
						popupEexsts = utils.msgRecogniser(popupClassic.getText());
						System.out.println("Handle popup::" + popupEexsts);
						break;
					}
				} catch (Exception e) {
				}
				try {
					WebElement popupModern = BaseClass.driver.findElement(By.className("modal-body"));
					if (!popupModern.getText().equalsIgnoreCase("")) {
						System.out.println("popup displayed");
						popupEexsts = utils.msgRecogniser(popupModern.getText());
						System.out.println("Handle popup::" + popupEexsts);
						break;
					}
				} catch (Exception e) {
				}
			}
		}
		BaseClass.driver.manage().timeouts().implicitlyWait(Constant.implicitWaitTime, TimeUnit.SECONDS);
		return popupEexsts;

	}

	@Test
	public static void convertToPOM() throws IOException { // Open the file
		FileInputStream fstream = new FileInputStream(Constant.RelativePath + "\\Files\\POM Convert\\Source.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
		String[] ClassName = br.readLine().split("=");
		String[] ClassName1 = br.readLine().split("=");
		PrintWriter writer = new PrintWriter(Constant.RelativePath + "\\Files\\POM Convert\\" + ClassName[1] + ".java",
				"UTF-8");
		PrintWriter writer1 = new PrintWriter(
				Constant.RelativePath + "\\Files\\POM Convert\\" + ClassName1[1] + ".java", "UTF-8");

		// POM Class Header
		writer.println("package pageObjects;");
		writer.println("import org.openqa.selenium.WebDriver;");
		writer.println("import org.openqa.selenium.WebElement;");
		writer.println("import pageObjects.BaseClass;");
		writer.println("import utility.Log;");
		writer.println("import utility.psUtility;");
		writer.println("public class " + ClassName[1] + " extends BaseClass {");
		writer.println("private static WebElement element;");
		writer.println("public static boolean GetStartedLnkExts;");
		writer.println("public " + ClassName[1] + "(WebDriver driver) {");
		writer.println("super(driver);");
		writer.println("}");

		// AppMod Class Header
		writer1.println("package appModules;");
		writer1.println("import org.testng.annotations.Test;");
		writer1.println("import pageObjects.*;");
		writer1.println("import utility.psUtility;");
		writer1.println("import org.openqa.selenium.support.ui.Select;");
		writer1.println("public class " + ClassName1[1] + " extends psUtility {");
		writer1.println("@Test");
		writer1.println("public static void Execute() throws Exception{");

		String strLine;
		// Read File Line By Line

		while ((strLine = br.readLine()) != null) {
			String[] splitLine = strLine.split("=");
			String[] splitLine1 = splitLine[1].split("\\.");
			// System.out.println(Arrays.toString(splitLine1));
			String element = "";

			for (int i = 0; i < splitLine1.length - 1; i++) {

				if (splitLine1[i].contains(")))")) {
					element += splitLine1[i].replace(")))", "))");
				} else {
					element += splitLine1[i].replace("new Select(", "");
				}

				if (i != splitLine1.length - 2)
					element += ".";
			}
			// System.out.println("element::::"+element);
			// POM Writer

			// Object Methods
			writer.println(" public static WebElement " + splitLine[0] + "() throws Exception{");
			writer.println("   element = null;");
			writer.println("   try{");
			writer.println("      element=psUtility.swithFrame(" + (char) 34 + element.replace("\"", "\\\"") + (char) 34
					+ ");");
			writer.println("      Log.info(\"" + splitLine[0] + " found in the " + ClassName[1] + "\");");
			writer.println("   }catch (Exception e){");
			writer.println("   Log.info(\"" + splitLine[0] + " not found in the " + ClassName[1] + "\");");
			writer.println("   throw(e);");
			writer.println("   }");
			writer.println("  return element;");
			writer.println(" }");

			// AppMod Writer
			if (splitLine1[splitLine1.length - 1].contains("selectBy")) {
				String value = splitLine1[splitLine1.length - 1].replace("selectByVisibleText(", "");

				writer1.println("select(" + ClassName[1] + "." + splitLine[0] + "()," + value);
			} else {
				writer1.println(ClassName[1] + "." + splitLine[0] + "()." + splitLine1[splitLine1.length - 1]);
			}

		}
		// Close the input stream
		br.close();
		writer.println("}");
		writer.close();

		writer1.println("}");
		writer1.println("}");
		writer1.close();
	}
	
	@Test()
	@Parameters("StopFlag")
	public static void StopOnFail(Boolean StopFlag) {
		Constant.StopOnFail=StopFlag;
		System.out.println("StopFlag::::"+StopFlag);
	}
	
	
	 @Test
	 @Parameters("iTestCaseRow")
	 public static void iTestCaseRow(String iTestCaseRow) {
		
		//System.out.println("In Utilits value :::"+InvitationConstants.iTestCaseRow);
	  InvitationConstants.iTestCaseRow=Integer.parseInt(iTestCaseRow);
	 }
	
}
