package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_025
 * TestScript Name: AT_SignUp_025
 * Description: Verify that the user is able to Sign Up by checking 'I Agree. Read Privacy Poliy & terms of service'.
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_025 extends BaseTest {
	@Test(description = "Verify that the user is able to Sign Up by checking 'I Agree. Read Privacy Poliy & terms of service'.")
	public void AT_SignUp_025() throws InterruptedException {
		
		/* Click on I Agree Checkbox */
		pages.signUpPage.clkIAgreeCkb();
		
	}
}
