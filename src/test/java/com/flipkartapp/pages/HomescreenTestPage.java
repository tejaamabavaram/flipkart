package com.flipkartapp.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class HomescreenTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "homescreen.btn.skip")
	private QAFWebElement homescreenBtnSkip;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getHomescreenBtnSkip() {
		return homescreenBtnSkip;
	}
	

	public void launchApp() {
		driver.get("/");
		
	}

	public void closeSkipButton() {
		try {
		FluentWait<WebDriver> wait5 = new FluentWait<WebDriver>(driver);
		wait5.withTimeout(240, TimeUnit.SECONDS);
		wait5.pollingEvery(5, TimeUnit.SECONDS);
		homescreenBtnSkip.click();
		wait5.ignoring(Exception.class);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		/*homescreenBtnSkip.waitForVisible();
		homescreenBtnSkip.click();*/
	}

}
