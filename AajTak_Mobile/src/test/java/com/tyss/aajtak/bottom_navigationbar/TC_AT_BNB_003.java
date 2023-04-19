package com.tyss.aajtak.bottom_navigationbar;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_BNB_003
 * TestScript Name: TC_AT_BNB_003
 * Description: Access the Podcast icon under bottom navigation bar user should be navigate to Podcast screen
 * 
 * @Author: Sudhakar
 */

public class TC_AT_BNB_003 extends BaseTest {

	@Test(description = "Access the Podcast icon under bottom navigation bar user should be navigate to Podcast screen")
	public void AT_BNB_003() {

		/* Click on Podcast Bottom navigation bar */
		pages.bottomNavigationBarPage.clkBottomCircleFifthOption();

		/* Validate Podcast page */
		pages.podcastPage.validatePodcastLandingPage();

	}
}
