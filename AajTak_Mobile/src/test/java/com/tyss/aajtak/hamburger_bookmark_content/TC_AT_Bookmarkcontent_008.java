package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;


/*
 * TestCaseId: TC_AT_Bookmarkcontent_008
 * TestScript Name: AT_Bookmarkcontent_008
 * Description: Verify the photos section in Book mark
 * 
 * @Author: Sreelatha 
 */

public class TC_AT_Bookmarkcontent_008 extends BaseTest {
	
	@Test(description = "Verify the photos section in Bookmark")
	public void AT_Bookmarkcontent_008() throws InterruptedException
	{
		/* Click on Back Arrow button */
		pages.bookmarkContentPage.clkBackArrowBtn();
		
		/* Click on hamburger menu */
		pages.homescreenPage.clkHamburgerIcon();
			
		/* Click on photo section */
		pages.hamburgerMenuPage.clkPhotoLnk();
		
		/*Validate the photo title from photo section*/
		pages.photoListPage.getVerifyPhotoTitleDesc();
		
		/*Wait till the element book mark icon is present */
		pages.photoListPage.waitForBookmarkIcon();
		
		/*Click on book mark icon in photo section */
		pages.photoListPage.clkOnBookmarkIcon();
		
		/*Click on hamburger menu icon in home screen*/
		pages.homescreenPage.clkHamburgerIcon();
		
		/*click on  book mark content in hamburger menu */
		pages.hamburgerMenuPage.clkBookmarkIcn();
		
		/*Click on photo section in book mark content page */
		pages.bookmarkContentPage.clkTasvireSection(prop_constants.getProperty("photos"));
		
		/* Validate Book mark Photo title */
		pages.bookmarkContentPage.validateBookmarkPhotoTitle();
		
	}

}
