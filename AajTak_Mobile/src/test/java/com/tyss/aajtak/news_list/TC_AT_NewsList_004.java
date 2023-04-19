package com.tyss.aajtak.news_list;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_NewsList_004
 * TestScript Name: AT_Newslist_004
 * Description: Verify that user is able to tap 'Bookmark' icon below any story.
 * 
 * Author: Manjappa
 */
public class TC_AT_NewsList_004 extends BaseTest {

	@Test( description = "Description: Verify that user is able to tap 'Bookmark' icon below any story")
	public void AT_Newslist_004() throws InterruptedException {

		/* Tap on ant button */
		pages.homescreenPage.clkAntButton();
		
		/* Click on Book mark icon */
		pages.newsListPage.clkBookmarkIcon();
		
		/* Validate toast message */
		pages.newsListPage.validateToastMessage();
		
	}

}