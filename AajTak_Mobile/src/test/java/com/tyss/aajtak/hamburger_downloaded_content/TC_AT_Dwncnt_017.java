package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Dwncnt_017
 * TestScript Name:AT_Dwncnt_017
 * Description:Verify the video section in downloaded content
 * 
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_017 extends BaseTest {
	@Test(description = "Verify the video section in downloaded content")
	public void AT_Dwncnt_017() throws InterruptedException {
		
		/* Click on the Video section */
		pages.downloadedContentPage.clkVideoSection();
		
		/* Validate Video Content */
		pages.downloadedContentPage.validateVideoTitle();
	}
}
