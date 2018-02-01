package pageObjects.Invitation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Log;
import utility.psUtility;

public class CandidateSearch_Page extends BaseClass {

	private static WebElement element;

	public CandidateSearch_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement select_InvitationSource() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_OB_INV_HDR_SM_OB_INVTN_SOURCE\"))");
			Log.info("select_InvitationSource found in the CandidateSearch_Page");
		} catch (Exception e) {
			Log.info("select_InvitationSource not found in the CandidateSearch_Page");
			throw (e);
		}
		return element;
	}

	public static WebElement lnk_Next() throws Exception {
		element = null;
		// System.out.println("Entered into Next Link: Before Click Next Action");
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"SM_DF_HOOK_WK_SM_DF_NEXT_TASK\"))");
			// System.out.println("Entered into Next Link: Return Next Action");
			Log.info("lnk_Next found in the CandidateSearch_Page");
		} catch (Exception e) {
			Log.info("lnk_Next not found in the CandidateSearch_Page");
			throw (e);
		}
		return element;
	}
}
