package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Dwncnt_002
 * TestScript Name:AT_Dwncnt_002
 * Description: Verify the downloaded content screen has three tab
 * 
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_002 extends BaseTest {
	@Test(description = "Verify the downloaded content screen has three tab")
	public void AT_Dwncnt_002() throws Exception {
		
		/* Click on Download Icon */
		pages.hamburgerMenuPage.clkDownloadIcn();
		
		/* Validate Photos Section */
		pages.downloadedContentPage.validateTasvireSection();
		
		/* Validate Story Section */
		pages.downloadedContentPage.validateStorySection();
		
		/* Validate Videos Section */
		pages.downloadedContentPage.validateVideoSection();
		
		
		
		
	}

}
