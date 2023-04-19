package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_020
 * TestScript Name: AT_SignUp_020
 * Description: Verify the message displayed if the password is incorrect
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_020 extends BaseTest{
	@Test(description = "Verify the message displayed if the password is incorrect")
	public void AT_SignUp_020() throws InterruptedException {
		
		pages.signUpPage.setPassword(prop_constants.getProperty("invalid_password"));
		
		/* Validating the Password error message */
		pages.signUpPage.validatePasswordErrorTxt();
	}
}
