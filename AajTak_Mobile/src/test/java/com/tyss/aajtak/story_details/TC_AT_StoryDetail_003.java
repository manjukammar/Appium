package com.tyss.aajtak.story_details;

import java.io.IOException;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_StoryDetail_003
 * TestScript Name: AT_StoryDetail_003
 * Description: Verify that user is able to view the below options on the Ant button: Comments icon, Bookmark icon, Download icon and Share icon
 * 
 * @Author: Sanjay 
 */

public class TC_AT_StoryDetail_003 extends BaseTest{
	
	@Test(description = "Verify that user is able to view the below options on the Ant button: Comments icon, Bookmark icon, Download icon and Share icon")
	public void AT_StoryDetail_003() throws Exception, IOException {
		
		
		/* Click on Ant button */
		pages.homescreenPage.clkAntButton();

		/* Validate the comment icon, Bookmark icon, Save icon and Share icon is displayed */
		pages.homescreenPage.validateCommentIconIsDisplyed();
		pages.homescreenPage.validateBookmarkIconIsDisplyed();
		pages.homescreenPage.validateOfflineIconIsDisplyed();
		pages.homescreenPage.validateShareIconIsDisplyed();

				
	}


}
