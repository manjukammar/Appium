package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Bookmarkcontent_014
 * TestScript Name: AT_Bookmarkcontent_014
 * Description: Verify the video section in Book mark
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Bookmarkcontent_014 extends BaseTest {
	
	@Test(description= "Verify the video section in bookmark")
	public void AT_Bookmarkcontent_014() throws InterruptedException {
		
		/* Click on Back Arrow button */
		pages.bookmarkContentPage.clkBackArrowBtn();
		
		/* Click on Hamburger menu */
		pages.homescreenPage.clkHamburgerIcon();

		/* Click on video section */
		pages.hamburgerMenuPage.clkVideoLnk();

		/* Validate video title from video section */
		pages.videoListPage.getVideoTitle();
		
		/* Click on video title present */
		pages.videoListPage.clkOnVideoTitle();
		
		/* Wait for bookmark icon */
		pages.videoListPage.waitTillBookmarkIcon();
		
		/* Click on book mark icon in video list */
		pages.videoListPage.clkOnBookMarkIcon();
		 
		/*Click on Device Back button */
		pages.videoListPage.clkDeviceBackButton(1);
		
		/* Click on Hamburger menu icon in home screen */
		pages.homescreenPage.clkHamburgerIcon();

		/* Click on Book mark content in hamburger menu */
		pages.hamburgerMenuPage.clkBookmarkIcn();

		/*Click on Video section in book mark content */
		pages.bookmarkContentPage.clkVideoSection(prop_constants.getProperty("videos"));

		/* Validate the Video title element in video section */
		pages.bookmarkContentPage.validateVideoTitle();

	}

}