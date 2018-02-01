package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;

import pageObjects.BaseClass;

public class WebListener implements WebDriverEventListener {
	public static String ScriptInfo = "";

	@Override
	public void afterAlertAccept(WebDriver arg0) {

	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {

	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		if (Constant.Tab) {
			arg0.sendKeys(Keys.TAB);
		}
		if (Constant.Processwait) {
			psUtility.processWait();
		}
		if (Constant.handlepopup) {
			try {
				Assert.assertTrue(utils.handlePopup());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		if (Constant.Processwait) {
			psUtility.processWait();
		}
		if (Constant.handlepopup) {
			try {
				Assert.assertTrue(utils.handlePopup());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {

	
		 if (Constant.Fragment) { String Javascript =
				  "if(document.location.href.indexOf('/psp/')>0) {var fragment =document.createElement('DIV');fragment.style.position='absolute';fragment.style.fontSize='12px';fragment.style.color='#6d8ef6';fragment.innerHTML='<b>"
				  + ScriptInfo +
				  "</b>';fragment.style.top='0px';fragment.style.margin='auto';fragment.style.zIndex='120';document.body.insertBefore(fragment, document.body.childNodes[0]);}"
				  ; ((JavascriptExecutor) BaseClass.driver).executeScript(Javascript); }
		 
			
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {

	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {

	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {

	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		if (Constant.clear) {
			arg0.clear();
		}
		if (Constant.drawBoarder) {
			psUtility.drawBoarder(arg0);
		}
		if (Constant.locateElmnt) {
			Point location = arg0.getLocation();
			((JavascriptExecutor) arg1).executeScript("scroll(" + location.x + "," + location.y + ")");
		}

	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		psUtility.drawBoarder(arg0);
		Point location = arg0.getLocation();
		((JavascriptExecutor) arg1).executeScript("scroll(" + location.x + "," + location.y + ")");

	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// psUtility.drawBoarder(arg1);

	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {

	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {

	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {

	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {

	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {

	}

	@Override
	public void onException(Throwable arg0, WebDriver arg1) {

	}

}
