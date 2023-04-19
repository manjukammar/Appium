package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Dwncnt_027
 * TestScript Name:AT_Dwncnt_027
 * Description: Verify that the progress bar should visible in the Downloaded content while downloading
 * 
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_027 extends BaseTest {
	
	@Test(description = "Verify that the progress bar should visible in the Downloaded content while downloading")
	public void AT_Dwncnt_027() throws InterruptedException {
		
		/* Click on the Hamburger Icon */
		pages.homescreenPage.clkHamburgerIcon();
		
		/* Click on Download Icon */
		pages.hamburgerMenuPage.clkDownloadIcn();
		
		/* Wait for the progress bar */
		pages.downloadedContentPage.waitForProgressBar();
	}

}
