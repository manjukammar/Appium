package com.tyss.aajtak.homescreen_section;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_HomeSec_011
 * TestScript Name: AT_HomeSec_011
 * Description: Verify that when user Taps on video, it should go the video detail page containing this video"
 * 
 * Author: Manjappa
 */
public class TC_AT_HomeSec_011 extends BaseTest {
	
	@Test(description = "Description : Verify that when user Taps on video, it should go the video detail page containing this video")
	public void AT_HomeSec_011() throws InterruptedException {

		/* Tap on back button */
		pages.homescreenPage.clkBackbtn();

		/* Tap on hamburger icon */
		pages.homescreenPage.clkHamburgerIcon();

		/* Tap on video link */
		pages.hamburgerMenuPage.clkVideoLnk();

		/* Tap on video */
		pages.videoListPage.clkOnVideoTitle();

		/* Validate video details page */
		pages.videoDetailPage.validateVideoToolbarTitle();
		
		/* Click Device back Button */
		pages.homescreenPage.clkBackbtn();
		
		/* Click on Hamburger close icon */
		pages.videoListPage.closeTheVideoPlayer();
		
		/* Click on Home tab */
		pages.homescreenPage.clkHomeTabTxt();
	   
	}
}
