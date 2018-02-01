package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InternalLogin_Page extends BaseClass {
	private static WebElement element;

	public InternalLogin_Page(WebDriver driver) {
		super(driver);

	}

	public static WebElement txt_UserName() {
		element = null;
		try {
			element = driver.findElement(By.id("userid"));
			// Log.info("Product Name for purchased product is found on the Check Out
			// Page");
		} catch (Exception e) {
			// Log.error("Price for purchased product on Check Out page is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement txt_Pwd() {
		element = null;
		try {
			element = driver.findElement(By.id("pwd"));
			// Log.info("Product Name for purchased product is found on the Check Out
			// Page");
		} catch (Exception e) {
			// Log.error("Price for purchased product on Check Out page is not found");
			throw (e);
		}
		return element;
	}

	public static WebElement btn_Submit() {
		element = null;
		try {
			element = driver.findElement(By.name("Submit"));
			// Log.info("Product Name for purchased product is found on the Check Out
			// Page");
		} catch (Exception e) {
			// Log.error("Price for purchased product on Check Out page is not found");
			throw (e);
		}
		return element;
	}

}
