package com.tyss.aajtak.hamburger_feedback;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_Feedback_001
 * TestScript Name: TC_AT_Feedback_001
 * Description:Verify that user is able to go to feedback screen by tapping on the 'Feedback' from 'Settings'
 * 
 * @Author: Aishwarya
 */

public class TC_AT_Feedback_001 extends BaseTest{
		@Test(description = "Verify that user i0s able to go to feedback screen by tapping on the 'Feedback' from 'Settings'")
		public void AT_Feedback_001() {
			
			
			/* Click on Hamburger icon */
			pages.homescreenPage.clkHamburgerIcon();

			/* Scroll to Settings Page */
			pages.hamburgerMenuPage.scrollToSettings();
			
			/* Tap on Settings icon */
			pages.hamburgerMenuPage.clkSettingsLnk();
			
			/* Tap on Feedback icon */
			pages.settingsPage.clkFeedbackTab();
			
			/* Validate feedback page */
			pages.feedBackPage.validateFeedbackTitle();
			
			
		}
}
