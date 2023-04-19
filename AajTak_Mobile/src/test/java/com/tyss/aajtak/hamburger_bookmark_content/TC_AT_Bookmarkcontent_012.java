package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Bookmarkcontent_012
 * TestScript Name: AT_Bookmarkcontent_012
 * Description: Verify that the user is able to delete all the photo in the book mark page
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Bookmarkcontent_012 extends BaseTest {
	
	@Test(description = "Verify that the user is able to delete all the photo in the bookmark page")
	public void AT_Bookmarkcontent_012() throws InterruptedException {

		/* Click on Back Arrow button */
		pages.bookmarkContentPage.clkBackArrowBtn();

		/* Click on Hamburger menu */
		pages.homescreenPage.clkHamburgerIcon();

		/* Click on Photo link */
		pages.hamburgerMenuPage.clkPhotoLnk();

		/* Validate the photo title from photo section */
		pages.photoListPage.getVerifyPhotoTitleDesc();

		/* Wait for book mark icon */
		pages.photoListPage.waitForBookmarkIcon();

		/* Click on book mark icon in photo section */
		pages.photoListPage.clkOnBookmarkIcon();
		
		/* Click on hamburger menu icon in home screen */
		pages.homescreenPage.clkHamburgerIcon();

		/* click on book mark content in hamburger menu */
		pages.hamburgerMenuPage.clkBookmarkIcn();

		/* Click on photo section in book mark content page */
		pages.bookmarkContentPage.clkTasvireSection(prop_constants.getProperty("photos"));

		/* Validate Book mark Photo title */
		pages.bookmarkContentPage.validateBookmarkPhotoTitle();

		/* Click on SabhiSafKaren */
		pages.bookmarkContentPage.clkSabhiSafKaren();

		/* Click on Haan Option For Clear Bookmark Content */
		pages.bookmarkContentPage.clkHaanOptionForClearBookmarkContent();

	}

}
