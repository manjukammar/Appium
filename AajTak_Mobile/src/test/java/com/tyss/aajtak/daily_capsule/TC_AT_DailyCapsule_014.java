package com.tyss.aajtak.daily_capsule;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_DailyCapsule_014
 * TestScript Name: TC_AT_DailyCapsule_014
 * Description: Verify that user is able to navigate back from the story detail screen by tapping on the back button 
 * 
 * @Author: Sudhakar
 */

public class TC_AT_DailyCapsule_014 extends BaseTest {

	@Test(description = "Verify that user is able to navigate back from the story detail screen by tapping on the back button")
	public void AT_DailyCapsule_014() {

		
		/* Validate Home page */
		pages.homescreenPage.validateAajTakHomeLogoIsDisplayed();

	}
}