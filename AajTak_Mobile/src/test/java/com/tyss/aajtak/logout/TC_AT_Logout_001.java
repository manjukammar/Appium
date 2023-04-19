package com.tyss.aajtak.logout;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Logout_001
 * TestScript Name: AT_Logout_001
 * Description: Verify that the user is able to view Logout option in the Hamburger menu if it is a logged in used
 * 
 * @Author: Sanjay 
 */

public class TC_AT_Logout_001 extends BaseTest{
	
	@Test(description="Verify that the user is able to view Logout option in the Hamburger menu if it is a logged in used")
	public void AT_Logout_001() throws Exception {
		
//		/* Click on Aage Bado */
//		pages.shuruKarienOnboardingPage.clkAageBadoBtn();
//		
//		/* Validate Super Fast Card Close icon is displayed */
//		pages.homescreenPage.validateSuperFastCardCloseIconIsDisplyed();
//		
//		/* Click Super fast card Close icon */
//		pages.homescreenPage.clkSuperFastCardCloseIcn();
//		
//		/* Validate AajTak home screen page */
//		pages.homescreenPage.validateAajTakHomeLogoCopyIsDisplayed();
//		
//		/* Wait till hamburger icon is present */
//		pages.homescreenPage.waitForVibilityOfHamburgerIcon();
//		
//		/* Click on hambergur menu */
//		pages.homescreenPage.clkHamburgerIcon();
//		
//		/* CLick on login or register option in hambergur menu */
//		pages.hamburgerMenuPage.clkLoginOrRegisterBtn();
//
//		/* Set email id for username text field */
//		pages.loginOrRegisterPage.setEmailorPhoneTa(prop_constants.getProperty("email"));
//
//		/* Set Password in password text field */
//		pages.loginOrRegisterPage.setPasswordTa(prop_constants.getProperty("password"));
//
//		/* Click on login button */
//		pages.loginOrRegisterPage.clkLoginBtn();
		
		/* Validate logout button is present */
		pages.logoutPage.verifySignOutButton();
		
	}
}
