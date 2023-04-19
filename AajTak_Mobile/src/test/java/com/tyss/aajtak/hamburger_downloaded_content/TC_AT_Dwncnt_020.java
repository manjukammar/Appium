package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Dwncnt_020
 * TestScript Name: AT_Dwncnt_020
 * Description: Verify that the title and date of video should appear below each of the section
 * 
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_020 extends BaseTest {
	@Test(description = "Verify that the title and date of video should appear below each of the section")
	public void AT_Dwncnt_020() throws InterruptedException {

		/* Click the Video Title */
		pages.downloadedContentPage.clkVideoTitle();

		/* Validate the Video Title */
		//pages.videoDetailPage.validateVideoToolbarTitle();
		
		

		
	}
}