package com.tyss.aajtak.homescreen;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_HomeScreen_007
 * TestScript Name: AT_Home_007
 * Description: Description: Description: Verify that user is able to tap 'Bookmark' icon below any story.
 * 
 * Author: Manjappa
 */

public class TC_AT_HomeScreen_007 extends BaseTest{

	@Test( description = "Description: Verify that user is able to tap 'Bookmark' icon below any story")
	public void AT_Home_007() {
		
		/*Tap on ant button */
		pages.homescreenPage.clkAntButton();
		
		/* Click book mark icon */
		pages.homescreenPage.clkBookmarkIcon();
		
		/* Validate toast message */
		pages.homescreenPage.validateToastMessage();
		

		
	}
}