package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Dwncnt_025
 * TestScript Name:AT_Dwncnt_025
 * Description: Verify the message displayed while saving the stories,photos or videos
 * 
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_025 extends BaseTest{
	
	@Test(description = "Verify the message displayed while saving the stories,photos or videos")
	public void AT_Dwncnt_025() throws InterruptedException {
		
		/* Validate Toast Message */
		pages.signUpPage.validateToastMessage();
		
		/* Click on the back button */
		pages.videoListPage.clkBackBtn();

		/* Close PIP */
		pages.videoListPage.closeTheVideoPlayer();
	}
}
