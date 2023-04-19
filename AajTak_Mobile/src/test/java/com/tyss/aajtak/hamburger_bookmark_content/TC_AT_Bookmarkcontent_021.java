package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Bookmarkcontent_021
 * TestScript Name: AT_Bookmarkcontent_021
 * Description: Verify that the user is able to remove the story/photo/video by clicking again on the icon
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Bookmarkcontent_021 extends BaseTest {
	
	@Test(description = "Verify that the user is able to remove the story/photo/video by clicking again on the icon")
	public void AT_Bookmarkcontent_021() throws InterruptedException {

		/* Click on Back Arrow button */
		pages.bookmarkContentPage.clkBackArrowBtn();
		
		/* Click on Hamburger menu */
		pages.homescreenPage.clkHamburgerIcon();

		/* Click on Video link */
		pages.hamburgerMenuPage.clkVideoLnk();

		/* Validate video title from video section */
		pages.videoListPage.getVideoTitle();

		/* Click on video title */
		pages.videoListPage.clkOnVideoTitle();

		/* Wait for book mark icon */
		pages.videoListPage.waitTillBookmarkIcon();

		/* Click on book mark icon in video list */
		pages.videoListPage.clkOnBookMarkIcon();

		/* Click on Device Back button */
		pages.videoListPage.clkDeviceBackButton(1);

		/* Click on Hamburger menu icon in home screen */
		pages.homescreenPage.clkHamburgerIcon();

		/* Click on book mark content in hamburger menu */
		pages.hamburgerMenuPage.clkBookmarkIcn();

		/* Click on video section in book mark content */
		pages.bookmarkContentPage.clkVideoSection(prop_constants.getProperty("videos"));

		/* Click on Close Video player */
		pages.bookmarkContentPage.closeTheVideoPlayer();
		
		/* Validate content message */
		pages.bookmarkContentPage.validateContentMessage();
	}

}