package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Dwncnt_024
 * TestScript Name:AT_Dwncnt_024
 * Description: Verify that the user is able to Download the stories, photos or videos
 * 
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_024 extends BaseTest {
	@Test(description = "Verify that the user is able to Download the stories, photos or videos")
	public void AT_Dwncnt_024()  throws InterruptedException 	{
	

		/* Click on the back button */
		pages.homescreenPage.clkBackbtn();

		/* Click on the Photo Tab */
		pages.hamburgerMenuPage.clkPhotoLnk();
		
		/* Click on the Download Icon */
		pages.photoListPage.clkOnDownloadIcon();
		
		/* Validate Toast Message */
		//pages.signUpPage.validateToastMessage();
	
		/* Click on the Home Tab */
		pages.homescreenPage.clkHomeTab();
		
		/* Wait for the first News title */
		pages.homescreenPage.waitForVibilityOfFirstNewsTitle();
		
		/* Click in the First News */
		pages.homescreenPage.clkFirstNews();
		
		/* Click on More Options */
		pages.storyDetailPage.clkOnMoreOptions();
		
		/* Click on Download icon */
		pages.storyDetailPage.clkDownloadStory();
		
		/* Validate Toast Message */
		pages.signUpPage.validateToastMessage();
		
		/* Click on Back Button */
		pages.storyDetailPage.clkBackbtn();
		
		/* Click on Hamburger Icon */
		pages.homescreenPage.clkHamburgerIcon();
		
		/* Click on Videos in Top Category */
		pages.hamburgerMenuPage.clkVideoLnk();
		
		/* Click on Video Title */
		pages.videoListPage.clkOnVideoTitle();
		
		/* Click on More Options */
		pages.storyDetailPage.clkOnMoreOptions();
		
		/* Click on Download Story */
		pages.storyDetailPage.clkDownloadStory();
		
		
		
		
	}

}
