package com.tyss.aajtak.homescreen;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_HomeScreen_014
 * TestScript Name: AT_Home_014
 * Description: Description: Description: Verify that user is able to view the bookmarked story is available in 'Bookmark'tab
 * 
 * Author: Manjappa
 */
public class TC_AT_HomeScreen_014 extends BaseTest {

	@Test(description = "Description: Verify that user is able to view the bookmarked story is available in 'Bookmark'tab")
	public void AT_Home_014() {

		/* Tap an Ant button */
		pages.homescreenPage.clkAntButton();
		
		/* Click book mark icon */
		pages.homescreenPage.clkBookmarkIcon();
		
		/*Click back button*/
		pages.homescreenPage.clkBackbtn();
		
		/*Tap on hamburger Menu*/
		pages.hamburgerMenuPage.clkHamburgerIcn();
		
		/*Tap on Bookmark content*/
		pages.hamburgerMenuPage.clkBookmarkIcn();
		
		/*Validate that the bookmarked story is present*/
		pages.bookmarkContentPage.validateBookmarkPage();

	}
}