package com.tyss.aajtak.app_message;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_AppMsg_008
 * TestScript Name: AT_AppMsg_008
 * Description:  No saved stories/galleries/videos in save content screen
 * 
 * @Author: SreeLatha 
 */
public class TC_AT_AppMsg_008 extends BaseTest {

	@Test(description = "No saved stories/galleries/videos in save content screen")
	public void AT_AppMsg_008() throws InterruptedException {

		/* Click on Aage Bado */
		pages.shuruKarienOnboardingPage.clkAageBadoBtn();
		
		/* Validate Super Fast Card Close icon is displayed */
		pages.homescreenPage.validateSuperFastCardCloseIconIsDisplyed();
		
		/* Click Super fast card Close icon */
		pages.homescreenPage.clkSuperFastCardCloseIcn();
		
		/* Validate AajTak home screen page */
		pages.homescreenPage.validateAajTakHomeLogoIsDisplayed();
		
		/* Click on Hamburger icon */
		pages.homescreenPage.clkHamburgerIcon();

		/* Click on Download icon */
		pages.hamburgerMenuPage.clkDownloadIcn();

		/* Validate Download content page */
		pages.downloadedContentPage.validateDownloadContentPage();
		
		/* Click on Story section */
		pages.downloadedContentPage.clkStorySection();

		/* Validate Content Message */
		pages.downloadedContentPage.validateContentMessage();

		/* Click on Photo section */
		pages.downloadedContentPage.clkTasvireSection();

		/* Validate Content Message */
		pages.downloadedContentPage.validateContentMessage();
		
		/* Click on Video section */
		pages.downloadedContentPage.clkVideoSection();
		
		/* Validate Content Message */
		pages.downloadedContentPage.validateContentMessage();
	}

}