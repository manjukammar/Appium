package com.tyss.aajtak.story_details;

import java.io.IOException;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;


/*
 * TestCaseId: TC_AT_StoryDetail_019
 * TestScript Name: AT_StoryDetail_019
 * Description: Verify that the inarticle links open in another tab
 * 
 * @Author: Sanjay 
 */
public class TC_AT_StoryDetail_019 extends BaseTest {

	@Test(description = "Verify that the inarticle links open in another tab")
	public void AT_StoryDetail_019() throws InterruptedException, IOException {
		
		/* Click on back button */
		pages.homescreenPage.clkBackbtn();

		/* Click on home tab */
		pages.hamburgerMenuPage.clkHomeLnk();

		/* Click on first news */
		pages.homescreenPage.clkFirstNews1();

		/* Click on in-article link */
		pages.storyDetailPage.clkOnInArticleLink1();

		/* Validate on in-article link */
		pages.storyDetailPage.validateInArticleLink1();
		
		/* Click on back button */
		pages.homescreenPage.clkBackbtn();
		
	}
	
}