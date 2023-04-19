package com.tyss.aajtak.homescreen;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_HomeScreen_006
 * TestScript Name: AT_Home_006
 * Description: Description: Verify that by tapping on the close button of the 'Comment' screen, user is navigated to 'Home' screen.
 * 
 * Author: Manjappa
 */

public class TC_AT_HomeScreen_006 extends BaseTest {

	@Test( description = "Description: Verify that by tapping on the close button of the 'Comment' screen, user is navigated to 'Home' screen")
	public void AT_Home_006() {

		/* Click back  button */
		pages.homescreenPage.clkBackbtn();
		
		/* Validate Badi Kabre' screen*/
		pages.homescreenPage.validateBadiKahbreInSectionIsDisplayed();
		
	}		
}