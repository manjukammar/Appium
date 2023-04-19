package com.tyss.aajtak.news_list;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_NewsList_001
 * TestScript Name: AT_Newslist_001
 * Description: Verify that the user is able to navigate to the news listing screen from hamburger menu.
 * 
 * Author: Manjappa
 */
public class TC_AT_NewsList_001 extends BaseTest {

	@Test(description = "Description: Verify that the user is able to navigate to the news listing screen from hamburger menu")
	public void AT_Newslist_001() throws InterruptedException {	
		
				
		/* Tap on Hamburger menu */
		pages.homescreenPage.clkHamburgerIcon();
		
		/* Scroll to manoranjan tab*/
		pages.hamburgerMenuPage.scrollToManoranjanCategory();
		
		/* Tap on the news list section in hamburger menu */
		pages.hamburgerMenuPage.clkManoranjanLnk();
		
		/* Wait till the selected tab appears */
		pages.homescreenPage.waitForVibilityOfManoranjanTab();
		
		/* Validate if user is in the newslist tab selected*/
		pages.homescreenPage.validateManoranjanTabIsDisplyed();
		
	}

}
