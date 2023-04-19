package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_001
 * TestScript Name: AT_SignUp_001
 * Description: Verify that the user should be able to view Login/Register button in hamburger menu icon
 * 
 * Author: Bredlin
 */

public class TC_AT_SignUp_001 extends BaseTest {
	
	@Test(description = "Verify that the user should be able to view Login/Register button in hamburger menu icon")
	public void AT_SignUp_001() throws InterruptedException {
		
		/* Click on the Hamburger Icon */
		pages.homescreenPage.clkHamburgerIcon();
		
		/* Validate the Login or Register link */
		pages.hamburgerMenuPage.validateLoginOrRegister();
		
	}
}
