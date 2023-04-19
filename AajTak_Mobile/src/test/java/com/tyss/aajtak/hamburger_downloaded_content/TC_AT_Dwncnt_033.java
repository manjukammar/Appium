package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Dwncnt_033
 * TestScript Name: AT_Dwncnt_033
 * Description: Verify that the user is able to clear all the Video's from the Downloaded content page by tapping on Sabhi Saaf Kare
 * 
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_033 extends BaseTest {
	@Test(description = "Verify that the user is able to clear all the Video's from the Downloaded content page by tapping on Sabhi Saaf Kare")
	public void AT_Dwncnt_033() throws InterruptedException {
		
		/* Click on video section in downloaded contents */
		pages.downloadedContentPage.clkVideoSection();
		
		/* Click on Sabhi Saf Karen option */
		pages.downloadedContentPage.clkSabhiSafKaren();
		
		/* Validate that Alert message is present or not */
		pages.downloadedContentPage.validateAlertMessageSabhiSafKaren();
		
		/* Click on Yes to delete all content */
		pages.downloadedContentPage.clkHaanOptionForClearDownloadedContent();
	
	}
}
