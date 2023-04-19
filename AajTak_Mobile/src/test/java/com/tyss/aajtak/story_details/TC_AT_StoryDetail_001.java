package com.tyss.aajtak.story_details;
import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_StoryDetail_001
 * TestScript Name: AT_StoryDetail_001
 * Description: Verify that user is navigate to the story detail screen when user taps on a story
 * 
 * @Author: Sanjay 
 */


public class TC_AT_StoryDetail_001 extends BaseTest {

	@Test( description = "Verify that user is navigate to the story detail screen when user taps on a story")
	public void AT_StoryDetail_001() throws Exception {
		
		
		/* Click on first news title */
		pages.homescreenPage.clkFirstNews();	

		/* Validate the badi kahbrein section */
		pages.homescreenPage.validateBhadiKhabarae();
	}
}
