package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Dwncnt_010
 * TestScript Name:AT_Dwncnt_010
 * Description: Verify that the user is able to clear all the stories from the Downloaded stories screen by tapping on Sabhi Saaf Kare
 * 
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_010 extends BaseTest {
	@Test(description = "Verify that the user is able to clear all the stories from the Downloaded stories screen by tapping on Sabhi Saaf Kare")
	public void AT_Dwncnt_010() throws InterruptedException {
		
		/* Click on the back Button */
		pages.homescreenPage.clkBackbtn();
		
		/* Click on Download icon */
		pages.hamburgerMenuPage.clkDownloadIcn();
		
		/* Validate SabhiSafKaren link */
		pages.downloadedContentPage.validateSabhiSafKaren();
		
		/* Click on SabhiSafKaren link */
		pages.downloadedContentPage.clkSabhiSafKaren();
		
		/* Validate the Alert title for SabhiSafKaren */
		pages.downloadedContentPage.validateAlertTitleSabhiSafKaren();
		
		/* Click Haan in the SabhiSafKaren Alert */
		pages.downloadedContentPage.clkHaanOptionForClearDownloadedContent();
	}
}