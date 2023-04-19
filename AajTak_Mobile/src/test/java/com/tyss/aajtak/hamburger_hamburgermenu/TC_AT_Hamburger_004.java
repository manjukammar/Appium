package com.tyss.aajtak.hamburger_hamburgermenu;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Hamburger_004
 * TestScript Name: AT_Hamburger_004
 * Description: Verify the user is able to view Book marks icon on the menu
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Hamburger_004 extends BaseTest {


	@Test(description = "Verify the user is able to view 'Bookmarks' icon on the menu")
	public void AT_Hamburger_004() throws InterruptedException {
		
		/* Click on Back Arrow button */
		pages.downloadedContentPage.clkBackArrowBtn();
		
		/* Validate Book mark icon is displayed */
		pages.hamburgerMenuPage.validateBookmarkIcn();
		
	}

}