package com.tyss.aajtak.story_details;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_StoryDetail_017
 * TestScript Name: AT_StoryDetail_017
 * Description: Verify that the user is able to swipe through the Article
 * 
 * @Author: Sanjay 
 */
public class TC_AT_StoryDetail_017 extends BaseTest {

	@Test(description = "Verify that the user is able to swipe through the Article")
	public void AT_StoryDetail_017() throws Exception {


		/* Click on cancel share button */
		pages.sharePage.clkShareCancelBtn();
		
		/* Swipe Up & Down through the Article Detail */
		pages.homescreenPage.swipeThroughArticle();
		
		/* Click on back button */
		pages.homescreenPage.clkBackbtn();

	}

}
