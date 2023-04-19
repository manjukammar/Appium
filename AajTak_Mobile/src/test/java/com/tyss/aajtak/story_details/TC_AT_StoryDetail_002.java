package com.tyss.aajtak.story_details;

import java.io.IOException;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_StoryDetail_002
 * TestScript Name: AT_StoryDetail_002
 * Description: Verify that user should be able view the time of updation of the story.
 * 
 * @Author: Sanjay 
 */

public class TC_AT_StoryDetail_002 extends BaseTest{
	
	@Test(description = "Verify that user should be able view the time of updation of the story.")
	public void AT_StoryDetail_002() throws InterruptedException, IOException {
		
		
		/* Wait till story updated time is visible */
		pages.storyDetailPage.waitTillStoryUpdatedTime();

		/* Validate story updated time is present or not */
		pages.storyDetailPage.validateStoryUpdatedTime();

	}
}


