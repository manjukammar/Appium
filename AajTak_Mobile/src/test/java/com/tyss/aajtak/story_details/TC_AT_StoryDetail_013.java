package com.tyss.aajtak.story_details;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_StoryDetail_013
 * TestScript Name: AT_StoryDetail_013
 * Description: Verify that user is able to view the offlined story is available in 'Downloaded Content' tab
 * 
 * @Author: Sanjay 
 */
public class TC_AT_StoryDetail_013 extends BaseTest{
	
	@Test(description = "Verify that user is able to view the offlined story is available in 'Downloaded Content' tab")
	public void AT_StoryDetail_013() throws Exception {

		
		
		/* Click on ant icon */
		pages.homescreenPage.clkAntButton();

		/* Click on offline icon */
		pages.homescreenPage.clkOnOfflineIcon();

		/* Click on back button */
		pages.homescreenPage.clkBackbtn();

		/* Click on hamburger icon */
		pages.homescreenPage.clkHamburgerIcon();

		/* Click on download content icon */
		pages.hamburgerMenuPage.clkDownloadIcn();
		
		/* Click on story title */
		pages.downloadedContentPage.clkOnStoryTitle();
		
	}

}
