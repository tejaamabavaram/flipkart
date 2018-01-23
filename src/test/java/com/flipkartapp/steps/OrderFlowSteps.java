package com.flipkartapp.steps;

import org.testng.annotations.Test;
import com.flipkartapp.pages.HomeTestPage;
import com.flipkartapp.pages.HomescreenTestPage;

public class OrderFlowSteps {
	@Test
	public void testOrderFlow()
	{
		HomescreenTestPage homescreenpage = new HomescreenTestPage();
		//homescreenpage.launchApp();
		homescreenpage.closeSkipButton();
		HomeTestPage hometestpage = new HomeTestPage();
		hometestpage.selectHomeCatogeryLink();
		hometestpage.selectCatogery("Electronics");
		hometestpage.selectSubcatogery("Laptops");
	}

}
