package com.tyss.aajtak.hamburger_image_downloadkarna;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_ImgDownload_001
 * TestScript Name: AT_ImgDownload_001
 * Description: Verify that user is able to view three options for downloading images
 * 
 * @Author: Sreelatha 
 */

public class TC_AT_ImgDownload_001 extends BaseTest {

	@Test(description = "Verify that user is able to view three options for downloading images")
	public void AT_ImgDownload_001() throws InterruptedException {

		
		/* Click on Hamburger Menu icon */
		pages.homescreenPage.clkHamburgerIcon();

		/* Scroll to Settings */
		pages.hamburgerMenuPage.scrollToSettings();

		/* Click on Settings */
		pages.hamburgerMenuPage.clkSettingsLnk();

		/* Click on Image Download karen */
		pages.settingsPage.clkOnImageDownloadKarenTxt();

		/* Validate 2G is displayed */
		pages.imageDownloadKarenPage.validate2GToggleTxt();

		/* Validate 3G or 4G is displayed */
		pages.imageDownloadKarenPage.validate3G4GToggleTxt();

		/* Validate Wifi is displayed */
		pages.imageDownloadKarenPage.validateWifiToggleTxt();

	}
}
