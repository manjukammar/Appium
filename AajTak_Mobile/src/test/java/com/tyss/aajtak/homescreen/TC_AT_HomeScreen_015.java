package com.tyss.aajtak.homescreen;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_HomeScreen_015
 * TestScript Name: AT_Home_015
 * Description: Description: Description: Verify that user is able to view the offlined story is available in 'Downloaded Content' tab
 * 
 * Author: Manjappa
 */
public class TC_AT_HomeScreen_015 extends BaseTest {
	@Test(description = "Description: Verify that user is able to view the offlined story is available in 'Downloaded Content' tab")
	public void AT_Home_015() {

		/* Click back button */
		pages.bookmarkContentPage.clkDeviceBackButton(1);

		/* Tap on hamburger Menu */
		pages.hamburgerMenuPage.clkHamburgerIcn();

		/* Tap on Download icon */
		pages.hamburgerMenuPage.clkDownloadIcn();

		/* Validate that the downloaded story is present */
		pages.downloadedContentPage.validateStoryTitle();		
		
		/* Click Device back Button */
		pages.homescreenPage.clkBackbtn();
		
		/* Click on Hamburger close icon */
		pages.hamburgerMenuPage.clkCloseIcn();

	}
}