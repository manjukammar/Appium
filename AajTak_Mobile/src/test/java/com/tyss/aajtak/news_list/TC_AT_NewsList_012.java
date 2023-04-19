package com.tyss.aajtak.news_list;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_NewsList_012
 * TestScript Name: AT_Newslist_012
 * Description: Verify that user is able to remove the added 'Bookmark' by tapping on the 'Bookmark' icon of bookmarked story.
 * 
 * Author: Manjappa
 */

public class TC_AT_NewsList_012 extends BaseTest {

	@Test(description = "Description: Verify that user is able to remove the added 'Bookmark' by tapping on the 'Bookmark' icon of bookmarked story")
	public void AT_Newslist_009() throws InterruptedException {

		
		/* Click on download content */
		pages.bookmarkContentPage.clkBookmarkFirstStory();

		/* Tap ant button */
		pages.homescreenPage.clkAntButton();

		/* Tap on Book mark icon */
		pages.homescreenPage.clkBookmarkIcon();
		
		/* Validate toast message */
		pages.newsListPage.validateToastMessage();
		
	}

}
