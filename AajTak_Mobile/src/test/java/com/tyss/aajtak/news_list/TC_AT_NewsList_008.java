package com.tyss.aajtak.news_list;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_NewsList_008
 * TestScript Name: AT_Newslist_008
 * Description: Verify that once the user taps on 'Cancel' from the sharing options, user navigates to Newslist screen.
 * 
 * Author: Manjappa
 */
public class TC_AT_NewsList_008 extends BaseTest {

	@Test( description = "Description: Verify that once the user taps on 'Cancel' from the sharing options, user navigates to Newslist screen")
	public void AT_Newslist_008() throws InterruptedException {

		/* Tap on cancel share */
		pages.sharePage.clkShareCancelBtn();

		/* Wait till navigated to newslist screen */
		pages.newsListPage.waitForNewslistTitle();

		/* Validate if the user is navigated to news list screen */
		pages.newsListPage.validateNewslistTitleTxt();

	}

}
