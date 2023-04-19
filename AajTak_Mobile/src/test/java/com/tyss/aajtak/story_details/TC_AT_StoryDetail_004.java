package com.tyss.aajtak.story_details;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_StoryDetail_004
 * TestScript Name: AT_StoryDetail_004
 * Description: Verify that user is able to navigate to comments screen by tapping on 'Comments' icon 
 * 
 * @Author: Sanjay 
 */
public class TC_AT_StoryDetail_004 extends BaseTest
	{
	
	@Test(description = "Verify that user is able to navigate to comments screen by tapping on 'Comments' icon ")
	public void AT_StoryDetail_004() throws Exception {
	

		/* Click on Comment icon */
		pages.homescreenPage.clkCommentIcon();

		/* Validate comments page is displayed */
		pages.commentsPage.validateCommentHeading();
	}

}
