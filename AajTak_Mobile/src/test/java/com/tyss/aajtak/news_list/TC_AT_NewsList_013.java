package com.tyss.aajtak.news_list;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_NewsList_013
 * TestScript Name: AT_Newslist_013
 * Description: Verify that user is able to view the offlined story is available in 'Downloaded Content' tab.
 * 
 * Author: Manjappa
 */
public class TC_AT_NewsList_013 extends BaseTest {

	@Test(description = "Description: Verify that user is able to view the offlined story is available in 'Downloaded Content' tab")
	public void AT_Newslist_013() {
	
		
		/* Tap on back button */
		pages.homescreenPage.clkBackbtn();

		/* Tap on Hamburger menu */
		pages.hamburgerMenuPage.clkHamburgerIcn();

		/* Tap on Hamburger menu */
		pages.hamburgerMenuPage.clkDownloadIcn();
		
	}

}
