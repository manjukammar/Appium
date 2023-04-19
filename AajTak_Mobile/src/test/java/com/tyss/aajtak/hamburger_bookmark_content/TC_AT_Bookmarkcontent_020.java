package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;


/*
 * TestCaseId: TC_AT_Bookmarkcontent_020
 * TestScript Name: AT_Bookmarkcontent_020
 * Description: Verify that the user is able to book mark the story/photo/video for first click
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Bookmarkcontent_020 extends BaseTest {

	@Test(description="Verify that the user is able to bookmark the story/photo/video for first click")
	public void AT_Bookmarkcontent_020(){
		
		/* Click on Back Arrow button */
		pages.bookmarkContentPage.clkBackArrowBtn();

		/* Click on Hamburger menu */
		pages.homescreenPage.clkHamburgerIcon();

		/* Click on video link */
		pages.hamburgerMenuPage.clkVideoLnk();

		/* Validate video title from video section */
		pages.videoListPage.getVideoTitle();

		/* Click on video title present */
		pages.videoListPage.clkOnVideoTitle();

		/* Wait for book mark icon */
		pages.videoListPage.waitTillBookmarkIcon();

		/* Click on book mark icon in video list */
		pages.videoListPage.clkOnBookMarkIcon();

		/* Click on Device Back button */
		pages.videoDetailPage.clkDeviceBackButton(1);
		
		/* Close the video player */
		pages.videoListPage.closeTheVideoPlayer();
		
		/* Click on Hamburger menu icon in home screen */
		pages.homescreenPage.clkHamburgerIcon();

		/* Click on book mark content in hamburger menu */
		pages.hamburgerMenuPage.clkBookmarkIcn();

		/* Click on Video section in book mark content */
		pages.bookmarkContentPage.clkVideoSection(prop_constants.getProperty("videos"));
	
		/* Validate the video title element in video section */
		pages.bookmarkContentPage.validateVideoTitle();
	}	

}