package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Bookmarkcontent_006
 * TestScript Name: AT_Bookmarkcontent_006
 * Description: Verify that the user is able to delete all the stories in the bookmark page
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Bookmarkcontent_006 extends BaseTest{

	@Test(description = "Verify that the user is able to delete all the stories in the bookmark page")
	public void AT_Bookmarkcontent_006() throws InterruptedException {

		/* Click on Device Back button */
		pages.bookmarkContentPage.clkDeviceBackButton(1);

		/* Click on Hamburger menu icon in home screen */
		pages.homescreenPage.clkHamburgerIcon();
		
		/* Click on Book mark icon in hamburger menu */
		pages.hamburgerMenuPage.clkBookmarkIcn();

		/* Click sabhi saf karen option in Story section */
		pages.bookmarkContentPage.clkSabhiSafKaren();

		/* Validate the alert message on sabhi saf kare */
		pages.bookmarkContentPage.validateAlertMessageSabhiSafKaren();
	
		/* Click on Haan text in alert message */
		pages.bookmarkContentPage.clkHaanOptionForClearBookmarkContent();

	}

}
