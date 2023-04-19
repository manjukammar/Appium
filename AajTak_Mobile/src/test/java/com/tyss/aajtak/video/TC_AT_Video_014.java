package com.tyss.aajtak.video;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Video_014
 * TestScript Name: TC_AT_Video_014
 * Description: Verify that user is able to swipe to close the video after minimizing
 * 
 * @Author: Sanjay 
 */

public class TC_AT_Video_014 extends BaseTest {
	
	@Test(description = "Verify that user is able to swipe to close the video after minimizing")
	public void AT_Video_014(){
		
		/* Click on video link */
		pages.hamburgerMenuPage.clkVideoLnk();
		
		/* Click on first video */
		pages.videoListPage.clkOnVideoTitle();
		
		/* Click on Back button */
		pages.homescreenPage.clkBackbtn();
		
		/* Click on PIP icon */
		pages.videoListPage.closeTheVideoPlayer();
		
	}
}



