package com.tyss.aajtak.story_details;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_StoryDetail_007
 * TestScript Name: AT_StoryDetail_007
 * Description: Verify that by tapping on the back button of the 'Comment' screen, user is navigated to story detail screen
 * 
 * @Author: Sanjay 
 */
public class TC_AT_StoryDetail_007 extends BaseTest{
	
	@Test(description = "Verify that by tapping on the back button of the 'Comment' screen, user is navigated to story detail screen")
	public void AT_StoryDetail_007() throws Exception {
			
		/* Click on back button */
		pages.commentsPage.clkBackarrow();

		/* Validate the badi kahbrein section */
		pages.homescreenPage.validateBhadiKhabarae();
	}

}
