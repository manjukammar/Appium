package com.tyss.aajtak.view_profile;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_ViewProfile_003
 * TestScript Name: AT_ViewProfile_003
 * Description: Verify that the user is able to navigate to Download Content
 * 
 * @Author: Sanjay 
 */

public class TC_AT_ViewProfile_003 extends BaseTest {
	@Test(description = "Verify that the user is able to navigate to Download Content")
	public void AT_ViewProfile_003() throws InterruptedException {
		
		/* Click on downloaded content icon */
		pages.viewProfilePage.clkOnMyDownloadContentIcon();


		/* Validate that the downloaded page is present and the sections such as story, photo, video is present */
		pages.downloadedContentPage.validateStorySection();
		pages.downloadedContentPage.validateTasvireSection();
		pages.downloadedContentPage.validateVideoSection();
	}
}
