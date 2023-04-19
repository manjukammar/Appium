package com.tyss.aajtak.homescreen;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_HomeScreen_011
 * TestScript Name: AT_Home_011
 * Description: Description: Description: Verify that once the user taps on 'Cancel' from the sharing options, user navigates to 'Home' screen.
 * 
 * Author: Manjappa
 */

public class TC_AT_HomeScreen_011 extends BaseTest {
	@Test(description = "Description: Verify that once the user taps on 'Cancel' from the sharing options, user navigates to 'Home' screen")
	public void AT_Home_011() {

		/* Click on cancel button */
		pages.sharePage.clkShareCancelBtn();
		
		/* Validate previous page*/
		pages.homescreenPage.validateBadiKahbreInSectionIsDisplayed();

		
	}
}