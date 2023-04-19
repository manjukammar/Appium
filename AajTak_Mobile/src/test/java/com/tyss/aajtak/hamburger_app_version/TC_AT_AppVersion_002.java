package com.tyss.aajtak.hamburger_app_version;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_AppVersion_002
 * TestScript Name: TC_AT_AppVersion_002
 * Description: Verify that user is able to go back to 'Home' screen by tapping on back button
 * 
 * @Author: Chithra
 */
public class TC_AT_AppVersion_002 extends BaseTest {

	@Test(description = "Verify that user is able to go back to 'Home' screen by tapping on back button")
	public void AT_AppVersion_002() throws InterruptedException {

		/*Click on Back button */
		pages.settingsPage.clkBackButton(1);
		
		/* Validate Home page */
		pages.homescreenPage.validateAajTakHomeLogoIsDisplayed();
		
	}
}