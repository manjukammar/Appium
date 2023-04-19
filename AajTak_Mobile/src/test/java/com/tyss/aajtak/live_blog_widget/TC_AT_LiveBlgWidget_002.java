package com.tyss.aajtak.live_blog_widget;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_LiveBlgWidget_002
 * TestScript_Name :AT_LiveBlgWidget_002
 * Description :Verify that user is navigated to live blog detail screen when user taps on Live Blog
 * 
 * @author Shivananda T S
 *
 */
public class TC_AT_LiveBlgWidget_002 extends BaseTest {

	@Test(description = "Verify that user is navigated to live blog detail screen when user taps on Live Blog")
	public void AT_LiveBlgWidget_002() throws Exception {
		
		/* Tap on the any chunk in the widget */
		pages.liveBlogPage.clkOnAnychunk();

		/*User should be navigated to live blog detail screen when user taps on the Live blog*/
		pages.liveBlogPage.validateliveBlogPageTxt();
		
		/* click on back button */
		pages.homescreenPage.clkBackbtn();
		
		/* close the video player */
		pages.videoListPage.closeTheVideoPlayer();
		
		

	}
}
