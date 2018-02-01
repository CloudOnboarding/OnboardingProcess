package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.psUtility;

public class ExternalHome_Page extends BaseClass {

	private static WebElement element;
	public static boolean EHomeLnkExts;

	public ExternalHome_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement lnk_Home() {
		element = null;
		try {
			element = driver.findElement(By.linkText("homeLink"));
			EHomeLnkExts = driver.findElements(By.linkText("homeLink")).size() != 0;
			Log.info("lnk_Home found in ExternalHome_page");
		} catch (Exception e) {
			Log.info("lnk_Home not found in ExternalHome_page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_Accountname() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@sm-parent='accountMenu']\"))");
			Log.info("lnk_Accountname found in the ExternalHome_page");
		} catch (Exception e) {
			Log.info("lnk_Accountname not found in the ExternalHome_page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_Logout() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@sm-id='signoffLbl']\"))");
			Log.info("lnk_Logout found in the ExternalHome_page");
		} catch (Exception e) {
			Log.info("lnk_Logout not found in the ExternalHome_page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_CreateInvitation() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.partialLinkText(\"Create Invitation\"))");
			Log.info("lnk_CreateInvitation_TU found in the ExternalHome_Page");
		} catch (Exception e) {
			Log.info("lnk_CreateInvitation_TU not found in the ExternalHome_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_CandidateConsole() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.partialLinkText(\"Candidate Console\"))");
			Log.info("lnk_CandidateConsole_TU found in the ExternalHome_Page");
		} catch (Exception e) {
			Log.info("lnk_CandidateConsole_TU not found in the ExternalHome_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_MyTasks() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.partialLinkText(\"My Tasks\"))");
			Log.info("lnk_MyTasks found in the ExternalHome_Page");
		} catch (Exception e) {
			Log.info("lnk_MyTasks not found in the ExternalHome_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_ManageUserContacts() throws Exception {
		element = null;
		try {

			element = psUtility.switchFrame("driver.findElement(By.partialLinkText(\"Manage Users/Contacts\"))");
			Log.info("lnk_ManageUserContacts found in the ExternalHome_Page");
		} catch (Exception e) {
			Log.info("lnk_ManageUserContacts not found in the ExternalHome_Page");
			throw (e);
		}
		return element;
	}

}
