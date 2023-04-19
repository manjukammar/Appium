package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;


/*
 * TestCaseId: TC_AT_Bookmarkcontent_018
 * TestScript Name: AT_Bookmarkcontent_018
 * Description: Verify that the user is able to delete all the videos in the book mark page by tapping on Sabhi Saaf Kare
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Bookmarkcontent_018 extends BaseTest {
	
	@Test(description = "Verify that the user is able to delete all the videos in the bookmark page by tapping on Sabhi Saaf Kare")
	public void AT_Bookmarkcontent_018() throws InterruptedException {
		
		/* Click on Back Arrow button */
		pages.bookmarkContentPage.clkBackArrowBtn();

		/* Click on Hamburger menu */
		pages.homescreenPage.clkHamburgerIcon();

		/* Click on video link */
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

		/* Click on Hamburger menu icon in homescreen */
		pages.homescreenPage.clkHamburgerIcon();

		/* Click on book mark content in hamburger menu */
		pages.hamburgerMenuPage.clkBookmarkIcn();

		/* Click on video section in book mark content */
		pages.bookmarkContentPage.clkVideoSection(prop_constants.getProperty("videos"));

		/* Validate the video title element in video section */
		pages.bookmarkContentPage.validateVideoTitle();

		/* Click on sabhi saf karen */
		pages.bookmarkContentPage.clkSabhiSafKaren();

		/* Validate alert message on sabhi saf karen */
		pages.bookmarkContentPage.validateAlertMessageSabhiSafKaren();
		
		/* Click on Haan in sabhi saf karen on alert message*/
		pages.bookmarkContentPage.clkHaanOptionForClearBookmarkContent();
		
	}
}
