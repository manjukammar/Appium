package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_006
 * TestScript Name: AT_SignUp_006
 * Description: Verify that the user is able to navigate to the login page from signUp page.
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_006 extends BaseTest{
	
	@Test(description = "Verify that the user is able to navigate to the login page from signUp page.")
	public void AT_SignUp_006() throws InterruptedException {
		
		/* Click on Back arrow button */
		pages.signUpPage.clkOnBackArrowBtn();
		
		/* Validating the Login Page */
		pages.loginOrRegisterPage.validateLoginBtn();
		
	}
}
