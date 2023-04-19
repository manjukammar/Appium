package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Bookmarkcontent_001
 * TestScript Name: AT_Bookmarkcontent_001
 * Description: Verify the screen has three tab
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Bookmarkcontent_001 extends BaseTest {

	@Test(description = "Verify the screen has three tab")
	public void AT_Bookmarkcontent_001() throws InterruptedException {

		/* Click on Back Arrow button */
		pages.bookmarkContentPage.clkBackArrowBtn();
		
		/* Click on Hamburger icon */
		pages.homescreenPage.clkHamburgerIcon();

		/* Validate Book mark icon is displayed */
		pages.hamburgerMenuPage.validateBookmarkIcn();

		/* click on Book mark icon in hamburger menu */
		pages.hamburgerMenuPage.clkBookmarkIcn();

		/* Validate Book mark page is displayed */
		pages.bookmarkContentPage.validateBookmarkPage();

		/* Validate Story section is displayed */
		pages.bookmarkContentPage.validateStorySection(prop_constants.getProperty("story"));

		/* Validate Photo section is displayed */
		pages.bookmarkContentPage.validateTasvireSection(prop_constants.getProperty("photos"));

		/* Validate Video section is displayed */
		pages.bookmarkContentPage.validateVideoSection(prop_constants.getProperty("videos"));

	}

}