package com.tyss.aajtak.aajscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_BNB_001
 * TestScript Name: TC_AT_BNB_001
 * Description: Verify that user is able to see bottom navigation bar in the bottom of the screen
 * 
 * @Author: 
 */

public class TC_AT_BNB_001 extends BaseTest{

	@Test(description = "Verify that user is able to see bottom navigation bar in the bottom of the screen")
	public void AT_BNB_001() throws InterruptedException, IOException {

		
		pages.shuruKarienOnboardingPage.clkAageBadoBtn();

		pages.homescreenPage.validateSuperFastCardCloseIconIsDisplyed();
		
		pages.homescreenPage.clkSuperFastCardCloseIcn();

		pages.homescreenPage.validateAajTakHomeLogoIsDisplayed();
		
		pages.homescreenPage.clkHamburgerIcon();
		
		
		/* Click on video link */
		pages.hamburgerMenuPage.clkVideoLnk();
		
		/* Click on first video */
		pages.videoListPage.clkOnVideoTitle();
		
		Thread.sleep(10000);
		
		/* Click on Back button */
		pages.homescreenPage.clkBackbtn();
		
		/* Click on PIP icon */
		pages.videoListPage.closeTheVideoPlayer();
		
		
		
//		pages.shuruKarienOnboardingPage.clkAageBadoBtn();
//
//		pages.homescreenPage.validateSuperFastCardCloseIconIsDisplyed();
//		
//		pages.homescreenPage.clkSuperFastCardCloseIcn();
//
//		pages.homescreenPage.validateAajTakHomeLogoIsDisplayed();
//	
//		pages.bottomNavigationBarPage.clkBottomCircleFifthOption();
//		
//		pages.homescreenPage.clkHomeTab();
	}

}
