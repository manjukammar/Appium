package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_019
 * TestScript Name: AT_SignUp_019
 * Description: Verify the user is able to view the placeholder in each field
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_019 extends BaseTest{
	@Test(description="Verify the user is able to view the placeholder in each field")
	public void AT_SignUp_019() throws InterruptedException {
		
		/* Click on Sign up link */
		pages.loginOrRegisterPage.clkSignUpLnk();
		
		/* Validate Name in the place holder */
		pages.signUpPage.validateNameText();
		
		/* Validate Email or Phone in the place holder */
		pages.signUpPage.validateEmailOrPhoneText();
		
		/* Validate Password in the place holder */
		pages.signUpPage.validatePasswordText();

	}

}
