package com.tyss.aajtak.story_details;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_StoryDetail_008
 * TestScript Name: AT_StoryDetail_008
 * Description: Verify that user is able to tap 'Bookmark' icon 
 * 
 * @Author: Sanjay 
 */
public class TC_AT_StoryDetail_008 extends BaseTest {

	@Test(description = "Verify that user is able to tap 'Bookmark' icon ")
	public void AT_StoryDetail_008() throws Exception {



		/* Click on Ant button */
		pages.homescreenPage.clkAntButton();

		/* Click on bookmark icon */
		pages.homescreenPage.clkBookmarkIcon();


	}
}
