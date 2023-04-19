package com.tyss.aajtak.homescreen;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_HomeScreen_008
 * TestScript Name: AT_Home_008
 * Description: Verify that user is able to remove the added 'Bookmark' by tapping on the 'Bookmark' icon of bookmarked story".
 * 
 * Author: Manjappa
 */

public class TC_AT_HomeScreen_008 extends BaseTest {

	@Test(description = "Description: Verify that user is able to remove the added 'Bookmark' by tapping on the 'Bookmark' icon of bookmarked story")
	public void AT_Home_008() {

		/*Tap on ant button */
		pages.homescreenPage.clkAntButton();
			
		/*Click on bookmark icon*/
		pages.homescreenPage.clkBookmarkIcon();
		
		/* Validate toast message */
		pages.homescreenPage.validateToastMessage();
	    	
	}	
}