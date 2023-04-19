package com.tyss.aajtak.podcast;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Pod_002
 * TestScript_Name :AT_Pod_002
 * Description : Verify that audio is forwarded(10sec) when user taps on forward icon
 * @author Shivananda T S
 *
 */
public class TC_AT_Pod_002 extends BaseTest {

	@Test(description = " Verify that audio is forwarded(10sec) when user taps on forward icon")
	public void AT_Pod_002() throws Exception {
		
		

		/* Click on aage bade button */
		pages.shuruKarienOnboardingPage.clkAageBadoBtn();

		/* Validate super fast card close icon */
		pages.homescreenPage.validateSuperFastCardCloseIconIsDisplyed();

		/* Click on super fast card icon */
		pages.homescreenPage.clkSuperFastCardCloseIcn();

		/* Validate user is navigated to home screen */
		pages.homescreenPage.validateAajTakHomeLogoIsDisplayed();

		/* Wait till home screen loads */
		pages.homescreenPage.waitForVibilityOfHomeTab();
		
		/* Tap on Podcast icon at the Bottom Navigation Bar(BNB) */
		pages.homescreenPage.clkPodcastRadio();

		/* Click on forward icon of 10 sec */
		pages.podcastPage.clkOnForward10sec();

	}

}
