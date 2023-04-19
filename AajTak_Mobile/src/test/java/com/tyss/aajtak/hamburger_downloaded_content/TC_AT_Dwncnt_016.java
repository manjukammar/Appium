package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Dwncnt_016
 * TestScript Name:AT_Dwncnt_016
 * Description: Verify that the user is able to clear all the photo galleries from the Downloaded content page by tapping on Sabhi Saaf Kare
 * 
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_016 extends BaseTest {
	@Test(description = "Verify that the user is able to clear all the photo galleries from the Downloaded content page by tapping on Sabhi Saaf Kare")
	public void AT_Dwncnt_016() throws InterruptedException {
		
		/* Click close button in the photo gallery */
		pages.photoDetailPage.clkcloseGalleryIcon();
		
		/* Click on sabhi saa karen option */
		pages.downloadedContentPage.clkSabhiSafKaren();
		
		/* Click on Yes on alert pop up */
		pages.downloadedContentPage.clkHaanOptionForClearDownloadedContent();
		
		/* It will verify that whether the no content message is present or not */
		pages.downloadedContentPage.validateContentMessage();
	}
}
