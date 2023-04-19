package com.tyss.aajtak.story_details;

import java.io.IOException;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_StoryDetail_018
 * TestScript Name: AT_StoryDetail_018
 * Description: Verify that the user is play the embedded videos in the story detail screen
 * 
 * @Author: Sanjay 
 */

public class TC_AT_StoryDetail_018 extends BaseTest {

	@Test(description = "Verify that the user is play the embedded videos in the story detail screen")
	public void AT_StoryDetail_018() throws InterruptedException, IOException {
		
		
		
		/* click on download icon */
		pages.hamburgerMenuPage.clkDownloadIcn();
		
		/* Click on story section */
		pages.downloadedContentPage.clkStorySection();
		
		/* Click on video title */
		pages.downloadedContentPage.clkOnStoryTitle();
		
		pages.homescreenPage.validateBadiKahbreinIsDisplayed();
		
			}
}

