package com.tyss.aajtak.homescreen;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_HomeScreen_001
 * TestScript Name: TC_AT_Home_001
 * Description: Verify once user launch the app,'Home' tab is selected by default.
 * 
 * Author: Manjappa
 */
public class TC_AT_HomeScreen_001 extends BaseTest {

	@Test( description = "Description: Verify once user launch the app,'Home' tab is selected by default")
	public void AT_Home_001() throws InterruptedException {
	
		/* Wait till home screen loads */
		pages.homescreenPage.waitForVibilityOfHomeTab();
		
		/*Validate if home screen is selected by default*/
		pages.homescreenPage.validateHomeTabIsSelected();
		
		pages.homescreenPage.scrollUp();
		
	}
}