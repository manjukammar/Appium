package com.tyss.aajtak.homescreen;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_HomeScreen_013
 * TestScript Name: AT_Home_013
 * Description: Description: Description: Verify that when user taps on 'Cancel' or any where on the screen in the anya share sheet, user navigates to 'Home' screen
 * 
 * Author: Manjappa
 */
public class TC_AT_HomeScreen_013 extends BaseTest {

	@Test( description = "Description: Verify that when user taps on 'Cancel' or any where on the screen in the anya share sheet, user navigates to 'Home' screen")
	public void AT_Home_013() {

		/*Click back button*/
		pages.homescreenPage.clkBackbtn();
		
		/*Verify bhadi khabarae is displayed*/		
		pages.homescreenPage.validateBadiKahbreInSectionIsDisplayed();		

	}
}