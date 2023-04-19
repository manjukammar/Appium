package com.tyss.aajtak.story_details;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_StoryDetail_014
 * TestScript Name: AT_StoryDetail_014
 * Description: Verify that user is able to share story by tapping on the 'Share' icon 
 * 
 * @Author: Sanjay 
 */
public class TC_AT_StoryDetail_014 extends BaseTest {
	
	@Test(description = "Verify that user is able to share story by tapping on the 'Share' icon ")
	public void AT_StoryDetail_014() throws Exception {
		
	
		/* Click on Ant button */
		pages.homescreenPage.clkAntButton();

		/* Click on share icon */
		pages.homescreenPage.clkShareIcon();

		/* fetch the text of all other share options */
		pages.sharePage.validateWhatsappShare();
		pages.sharePage.validateTwitterShare();
		pages.sharePage.validateShareAnytxt();
		pages.sharePage.validateFaceBookShare();
				
		
	}

}
