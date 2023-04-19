package com.tyss.aajtak.news_list;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_NewsList_011
 * TestScript Name: AT_Newslist_011
 * Description: Verify that user is able to view the bookmarked story is available in 'Bookmark' tab.
 * 
 * Author: Manjappa
 */

public class TC_AT_NewsList_011 extends BaseTest {

	@Test( description = "Description: Verify that user is able to view the bookmarked story is available in 'Bookmark' tab")
	public void AT_Newslist_007(){
		
		
		/* Tap on back button */
		pages.homescreenPage.clkBackbtn();

		/* Tap on Hamburger menu */
		pages.hamburgerMenuPage.clkHamburgerIcn();

		/* Tap on Book mark icon */
		pages.hamburgerMenuPage.clkBookmarkIcn();

		/* Verify if bookmarked story is present */
		pages.bookmarkContentPage.validateFirstStoryTitle();	
	
	}

}