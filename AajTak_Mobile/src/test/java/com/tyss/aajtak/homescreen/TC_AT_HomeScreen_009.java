package com.tyss.aajtak.homescreen;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_HomeScreen_009
 * TestScript Name: AT_Home_009
 * Description: Description: Description: Verify that user is able to tap 'Offline Story' icon below any story.
 * 
 * Author: Manjappa
 */
public class TC_AT_HomeScreen_009 extends BaseTest {

	@Test( description = "Description: Verify that user is able to tap 'Offline Story' icon below any story")
	public void AT_Home_009() {
		
		/*Tap on ant button */
		pages.homescreenPage.clkAntButton();
		
		/*Click on download icon*/
		pages.homescreenPage.clkOnOfflineIcon();

		/* Validate toast message */
		pages.homescreenPage.validateToastMessage();


		
	}
}