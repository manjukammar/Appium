package com.tyss.aajtak.story_details;
import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_StoryDetail_011
 * TestScript Name: AT_StoryDetail_011
 * Description: Verify that user is able to tap 'Offline Story' icon below any story
 * 
 * @Author: Sanjay 
 */

public class TC_AT_StoryDetail_011 extends BaseTest {
	
	@Test(description = "Verify that user is able to tap 'Offline Story' icon below any story")
	public void AT_StoryDetail_011() throws Exception {
		
		
		/* Click on Ant button */
		pages.homescreenPage.clkAntButton();

		/* Click on offline icon */
		pages.homescreenPage.clkOnOfflineIcon();
		
		
	}

}
