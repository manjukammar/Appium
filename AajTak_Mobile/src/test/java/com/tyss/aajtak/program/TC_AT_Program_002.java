package com.tyss.aajtak.program;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Program_002
 * TestScript Name: TC_AT_Program_002
 * Description: Verify that the user is able to go to any point in video by using the slider
 * 
 * @Author: Sanjay 
 */

public class TC_AT_Program_002 extends BaseTest {
	
	@Test(description = "Verify that the user is able to go to any point in video by using the slider")
	public void AT_Program_002() throws InterruptedException {
		
		/* Tap on any video */
		pages.liveTvWidgetPage.clkFirstVideoTitle();

		/* Long Press and Slide Video Player */
		pages.videoListPage.longPressandSlideVideoPlayer();
	
		/* click on device back button */
		pages.settingsPage.clkBackButton(2);
		
		/* click on home tab */
		pages.homescreenPage.clkHomeTab();
		
		/* scroll up */
		pages.homescreenPage.scrollUp();
	}
}



