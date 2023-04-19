package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Dwncnt_003
 * TestScript Name: AT_Dwncnt_003
 * Description: Verify the contents of the story page
 * 
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_003 extends BaseTest {

	@Test(description = "Verify the contents of the story page")
	public void AT_Dwncnt_003() throws InterruptedException {

		/* Click on Story Section */
		pages.downloadedContentPage.clkStorySection();
		
		/* Validate the story Title */
		pages.downloadedContentPage.validatePhotoTitle();
		
		
		
	}
}