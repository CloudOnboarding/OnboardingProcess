package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
import utility.psUtility;

public class Message_Handler extends BaseClass {
	private static WebElement element;

	public Message_Handler(WebDriver driver) {
		super(driver);

	}

	public static WebElement get_ModalBodyText() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.className(\"modal-body\"))");
			Log.info("get_ModalBodyText found");
		} catch (Exception e) {
			Log.info("get_ModalBodyText not found");
			throw (e);
		}
		return element;
	}

	public static WebElement get_ResendMessage() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//div[@class='modal-body' and contains(text(),'Login details have been resent')]\"))");
			Log.info("get_ResendMessage found");
		} catch (Exception e) {
			Log.info("get_ResendMessage not found");
			throw (e);
		}
		return element;
	}

	
	
	public static WebElement get_VerfyText() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@class='modal-body' and contains(text(),'Your Verification Code is')]\"))");
			Log.info("get_VerfyText found");
		} catch (Exception e) {
			Log.info("get_VerfyText not found");
			throw (e);
		}
		return element;
	}

	public static WebElement get_popupText() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.id(\"alertmsg\"))");
			Log.info("get_popupText found");
		} catch (Exception e) {
			Log.info("get_popupText not found");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_ModalBodyClose() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@value='Close']\"))");
			Log.info("btn_ModalBodyClose found");
		} catch (Exception e) {
			Log.info("btn_ModalBodyClose not found");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_OK() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//input[@id='#ICOK']\"))");
			Log.info("btn_OK found");
		} catch (Exception e) {
			Log.info("btn_OK not found");
			throw (e);
		}
		return element;
	}
	
	public static WebElement get_Purgr2ndConfirm() throws Exception {
		element = null;
		try {
			element = psUtility.switchFrame("driver.findElement(By.xpath(\"//*[@class='modal-body' and contains(text(),'Do you really want to delete all the data')]\"))");
			Log.info("get_VerfyText found");
		} catch (Exception e) {
			Log.info("get_VerfyText not found");
			throw (e);
		}
		return element;
	}
}
