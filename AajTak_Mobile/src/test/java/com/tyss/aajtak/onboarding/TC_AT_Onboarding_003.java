package com.tyss.aajtak.onboarding;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
* TestCaseId: TC_AT_Onboarding_003
* TestScript Name: AT_Onboarding_003
* Description: Verify that the user get navigated to next screen by swiping horizontally
* 
* Author: Manikandan A
*/
public class TC_AT_Onboarding_003 extends BaseTest {

	@Test(description = "Verify that the user get navigated to next screen by swiping horizontally")
	public void AT_Onboarding_003() throws InterruptedException {

		/* click on back button */
		pages.homescreenPage.clkBackbtn();
		
		/* click on super fast card */
		pages.homescreenPage.clkSuperFastCardCloseIcn();
		
		/* swipe right and left and validate */
		pages.homescreenPage.swipeRightLeftAndValidate();
		
		
	}
}