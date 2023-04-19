package com.tyss.aajtak.news_list;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_NewsList_015
 * TestScript Name: AT_Newslist_015
 * Description: Verify that once user swipes the Newslist screen from top to bottom on home screen, Newslist screen gets refreshed.
 * 
 * Author: Manjappa
 */
public class TC_AT_NewsList_015 extends BaseTest {
	@Test(description = "Description: Verify that once user swipes the Newslist screen from top to bottom on home screen, Newslist screen gets refreshed")
	public void AT_Newslist_015() throws InterruptedException {
		
		/* Scroll up page for refresh */
		pages.homescreenPage.scrollUp();
		
		/* Validate toast message */
		pages.newsListPage.validateToastMessage();
		
		/* Click Device back Button */
		pages.homescreenPage.clkBackbtn();
		
		/* Click close icon */
		pages.hamburgerMenuPage.clkCloseIcn();
	}
}
