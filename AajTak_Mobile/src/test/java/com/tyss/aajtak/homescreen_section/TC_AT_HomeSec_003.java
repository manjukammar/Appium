package com.tyss.aajtak.homescreen_section;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_HomeSec_003
 * TestScript Name: AT_HomeSec_003
 * Description: Verify that when user Taps on the story the user is taken to the article description page.
 * 
 * Author: Manjappa
 */


public class TC_AT_HomeSec_003 extends BaseTest{

	@Test(description="Description : Verify that when user Taps on the story the user is taken to the article description page")
	public void AT_HomeSec_003() {

		/* Scroll to first news */
		pages.homescreenPage.scrollToFirstNewstitle();
		
		/* Tap on first news */
		pages.homescreenPage.clkFirstNewsTitle();
		
		/* Validate Article link */
		pages.homescreenPage.validateBadiKahbreInSectionIsDisplayed();
		
		
	
	}
}
