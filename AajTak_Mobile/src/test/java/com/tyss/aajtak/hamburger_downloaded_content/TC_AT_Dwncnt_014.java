package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Dwncnt_014
 * TestScript Name:AT_Dwncnt_014
 * Description: Verify that when user clicks on any gallery get navigated to the photo detail page
 * 
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_014 extends BaseTest {
	@Test(description = "Verify that when user clicks on any gallery get navigated to the photo detail page")
	public void AT_Dwncnt_014() throws InterruptedException {

		/* Click on the Photo Title */
		pages.downloadedContentPage.clkPhotoTitle();
		
		
		
	}
}