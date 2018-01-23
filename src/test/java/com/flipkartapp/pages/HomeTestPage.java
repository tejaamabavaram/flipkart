package com.flipkartapp.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class HomeTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "homepage.hmenu.link")
	private QAFWebElement homepageHmenuLink;
	@FindBy(locator = "homepage.menu.link")
	private QAFWebElement homepageMenuLink;
	@FindBy(locator = "homepage.submenu.link")
	private QAFWebElement homepageSubmenuLink;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getHomepageHmenuLink() {
		return homepageHmenuLink;
	}

	public QAFWebElement getHomepageMenuLink() {
		return homepageMenuLink;
	}

	public QAFWebElement getHomepageSubmenuLink() {
		return homepageSubmenuLink;
	}
	
	public void selectHomeCatogeryLink()
	{
		homepageHmenuLink.waitForVisible();
		homepageHmenuLink.click();	
	}
	public void selectCatogery(String category)
	{
		homepageMenuLink.waitForVisible();
		homepageMenuLink.click();
	}
	public void selectSubcatogery(String subcatogery)
	{
		homepageSubmenuLink.waitForVisible();
		homepageSubmenuLink.click();
	}
	

}
