package com.tyss.aajtak.news_list;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_NewsList_006
 * TestScript Name: AT_Newslist_006
 * Description: Verify that by tapping on the close button of the 'Comment' screen, user is navigated to 'neswlist' screen.
 * 
 * Author: Manjappa
 */
public class TC_AT_NewsList_006 extends BaseTest {

	@Test(description = "Description: Verify that by tapping on the close button of the 'Comment' screen, user is navigated to 'neswlist' screen")
	public void AT_Newslist_006() throws InterruptedException {
		
		/*Click back button */
		pages.homescreenPage.clkBackbtn();
		
		/*Wait till navigated to newslist screen*/
		pages.newsListPage.waitForNewslistTitle();
		
		/*Validate if the user is navigated to news list screen */
		pages.newsListPage.validateNewslistTitleTxt();
		
	}

}
