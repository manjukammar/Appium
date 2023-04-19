package com.tyss.aajtak.podcast;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Pod_004
 * TestScript_Name :AT_Pod_004
 * Description :  Verify that user is able to swipe up the mini player
 * @author Shivananda T S
 *
 */
public class TC_AT_Pod_004 extends BaseTest {

	@Test(description = " Verify that user is able to swipe up the mini player")
	public void AT_Pod_004() throws Exception {

		/*Swipe up the Mini player  */
		pages.podcastPage.swipeUpMiniPlayer();
		
		/*Validate mini player podcast page*/
		pages.podcastPage.validateMiniPlayerPodcastPage();

	

	}
}
