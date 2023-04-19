package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Dwncnt_011
 * TestScript Name:AT_Dwncnt_011
 * Description: Verify the photos section in downloaded content
 * 
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_011 extends BaseTest {
	@Test(description = "Verify the photos section in downloaded content")
	public void AT_Dwncnt_011() throws InterruptedException {

		/* Click on Back Button */
		pages.homescreenPage.clkBackbtn();
		
		/* click on hamburger menu */
		pages.hamburgerMenuPage.clkPhotoLnk();
		
		/* It will wait till offline icon is visible */
		pages.photoListPage.waitForDownloadIcon();

		/* Click on Offline or Save Icon */
		pages.photoListPage.clkOnDownloadIcon();
		

		/* Click on Hamburger Menu icon */
		pages.homescreenPage.clkHamburgerIcon();

		/* Click on Downloaded content in Hamburger Menu */
		pages.hamburgerMenuPage.clkDownloadIcn();

		/* Click on photo section in downloaded contents */
		pages.downloadedContentPage.clkTasvireSection();

		/* to validate if photo title is displayed or not */
		pages.downloadedContentPage.validatePhotoTitle();


	}
}