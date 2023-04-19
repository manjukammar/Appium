package com.tyss.aajtak.story_details;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_StoryDetail_010
 * TestScript Name: AT_StoryDetail_010
 * Description: Verify that user is able to remove the added 'Bookmark' by tapping on the 'Bookmark' icon of bookmarked story
 * 
 * @Author: Sanjay 
 */
class TC_AT_StoryDetail_010 extends BaseTest {

	@Test(description = "Verify that user is able to remove the added 'Bookmark' by tapping on the 'Bookmark' icon of bookmarked story")
	public void AT_StoryDetail_010() throws Exception {
		/* Click on first story in bookmark  */
		pages.bookmarkContentPage.clkBookmarkFirstStory();

		/* Click on ant button */
		pages.homescreenPage.clkAntButton();

		/* Click on bookmark icon */
		pages.homescreenPage.clkBookmarkIcon();

			   
	}
}
