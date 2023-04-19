package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Dwncnt_026
 * TestScript Name:AT_Dwncnt_026
 * Description: Verify that as soon as user clicks on the button, it should appear in Downloaded content screen
 * 
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_026 extends BaseTest {
	@Test(description = "Verify that as soon as user clicks on the button, it should appear in Downloaded content screen")
	public void AT_Dwncnt_026()  throws InterruptedException 
	{
		
		/* Validate Story title */
		pages.downloadedContentPage.validateStoryTitle();
		
		/* Click on Photo Section */
		pages.downloadedContentPage.clkTasvireSection();
		
		/* Validate Photo Title */
		pages.downloadedContentPage.validatePhotoTitle();
		
		/* Click Video Section */
		pages.downloadedContentPage.clkVideoSection();
		
		/* Validate Video Title */
		pages.downloadedContentPage.validateVideoStorytitle();

	}

}
