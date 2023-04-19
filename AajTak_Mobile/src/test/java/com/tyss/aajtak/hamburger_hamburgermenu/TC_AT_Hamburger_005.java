package com.tyss.aajtak.hamburger_hamburgermenu;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Hamburger_005
 * TestScript Name: AT_Hamburger_005
 * Description:Verify that on tapping Book marks user is navigated to Book marks screen.
 * 
 * @Author: Sreelatha 
 */

public class TC_AT_Hamburger_005 extends BaseTest {

	@Test(description = "Verify that on tapping 'Bookmarks' user is navigated to 'Bookmarks' screen")
	public void AT_Hamburger_005() throws InterruptedException {
		

		/* Click on Book mark content icon */
		pages.hamburgerMenuPage.clkBookmarkIcn();
				
		/* Validate Book mark Content Page */
		pages.bookmarkContentPage.validateBookmarkPage();
		
	}


}