package com.tyss.aajtak.view_profile;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_ViewProfile_004
 * TestScript Name: AT_ViewProfile_004
 * Description: Verify that the user is able to navigate to the bookmarked contents page
 * 
 * @Author: Sanjay 
 */

public class TC_AT_ViewProfile_004 extends BaseTest {

	@Test(description = "Verify that the user is able to navigate to the bookmarked contents page")
	public void AT_ViewProfile_004() throws InterruptedException {
		
		/* Click on My back arrow button */
		pages.downloadedContentPage.clkBackArrowBtn();
		
		/* Click on My bookmark content icon */
		pages.viewProfilePage.clkOnMyBookmarkContentIcon();

		/* Validate the story section in Bookmark content page */
		pages.bookmarkContentPage.validateStorySection(prop_constants.getProperty("story"));
		
		/* Validate the photo section in Bookmark content page */
		pages.bookmarkContentPage.validateTasvireSection(prop_constants.getProperty("photos"));
		
		/* Validate the video section in Bookmark content page */
		pages.bookmarkContentPage.validateVideoSection(prop_constants.getProperty("videos"));
	}
}
