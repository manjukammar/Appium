package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Dwncnt_018
 * TestScript Name: AT_Dwncnt_018
 * Description: Verify that the title and date of video should appear below each of the section
 * 
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_018 extends BaseTest {
	@Test(description = "Verify that the title and date of video should appear below each of the section")
	public void AT_Dwncnt_018() throws InterruptedException {


		/* Click on back button  */
		pages.videoDetailPage.clkDeviceBackButton(1);
		
		/* Close PIP */
		pages.videoListPage.closeTheVideoPlayer();
		
		/* Click on delete button */
		pages.downloadedContentPage.validateDeleteBtn();
		
	}
}