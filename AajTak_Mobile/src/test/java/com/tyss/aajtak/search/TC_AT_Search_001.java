package com.tyss.aajtak.search;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/**
 * TestCaseId : TC_AT_Search_001 
 * TestScript_Name :AT_Search_001
 * Description :Verify that user is navigated to search screen when user taps on the searchicon
 * 
 * @author Shivananda T S
 *
 */
public class TC_AT_Search_001 extends BaseTest {

	@Test(description = " Verify that user is navigated to search screen when user taps on the search icon")
	public void AT_Search_001() throws Exception {

		/* Wait till home screen loads */
		pages.homescreenPage.waitForVibilityOfHomeTab();

		/* Navigate to home screen */
		pages.homescreenPage.validateHamburgerIconIsDisplyed();

		/* wait until to search option to be visible to click */
		pages.searchPage.waitForSearch();

		/* Tap on Search icon present in Top right corner */
		pages.searchPage.clkOnSearchIcn();

		/* User should be navigated to the Search screen */
		pages.searchPage.validateSearchScreen();
	}
}
