package com.tyss.aajtak.homescreen;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_HomeScreen_003
 * TestScript Name: AT_Home_010
 * Description: Description: Verify that once user swipes the home screen from top to bottom on home screen, home screen gets refreshed".
 * 
 * Author: Manjappa
 */
public class TC_AT_HomeScreen_003 extends BaseTest {
	@Test( description = "Description: Verify that once user swipes the home screen from top to bottom on home screen, home screen gets refreshed")
	public void AT_Home_017() {
		
		/* Scroll Up the page for page refresh message*/
		pages.homescreenPage.scrollUp();
		
		/* Validate toast message */
		pages.homescreenPage.validateToastMessage();
		

	}
}