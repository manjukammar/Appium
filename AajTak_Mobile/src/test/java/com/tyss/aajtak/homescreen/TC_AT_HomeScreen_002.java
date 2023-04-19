package com.tyss.aajtak.homescreen;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_HomeScreen_002
 * TestScript Name: AT_Home_002
 * Description: Verify that 'Home' is the first section under 'Home' tab.
 * 
 * Author: Manjappa
 */

public class TC_AT_HomeScreen_002 extends BaseTest {

	@Test( description = "Description: Verify that 'Home' is the first section under 'Home' tab")
	public void AT_Home_002() throws InterruptedException {

		/* Validate the superfast card is displayed */
		pages.homescreenPage.validateSuperFastCardIsDisplayed();

	}
}