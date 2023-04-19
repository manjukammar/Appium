package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_023
 * TestScript Name: AT_SignUp_023
 * Description: Verify that the user is able to navigate to the Privacy Policy Page, by tapping on Privacy Policy link sign up screen
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_023  extends BaseTest {
	@Test(description = "Verify that the user is able to navigate to the Privacy Policy Page, by tapping on Privacy Policy link sign up screen")
	public void AT_SignUp_023() throws InterruptedException {
		
		/* Click on Privacy Policy */
		pages.signUpPage.clkOnPrivacyPolicy();
		
		pages.signUpPage.validatePrivacyPolicyText();
		
		/* Click on Back Button */
		pages.signUpPage.clkBackbtn();
		
		
	}
}
