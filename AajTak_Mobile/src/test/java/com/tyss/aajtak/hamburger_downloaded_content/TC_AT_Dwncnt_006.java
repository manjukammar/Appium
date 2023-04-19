package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Dwncnt_006
 * TestScript Name:AT_Dwncnt_006
 * Description: Verify that the user is able to navigate to the article description page
 * 
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_006 extends BaseTest {
	@Test(description = "Verify that the user is able to navigate to the article description page")
	public void AT_Dwncnt_006() throws InterruptedException {

	pages.downloadedContentPage.clkPhotoTitle();
	
	pages.storyDetailPage.validateFirstStoryTitle();

	}
}