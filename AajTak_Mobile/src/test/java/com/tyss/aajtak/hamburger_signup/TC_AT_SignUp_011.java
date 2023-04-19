package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_011
 * TestScript Name: AT_SignUp_011
 * Description: Verify the password field is hidden
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_011 extends BaseTest {
	@Test(description = "Verify the password field is hidden")
	public void AT_SignUp_011() throws InterruptedException
	{

		/* Validate the password is hidden */
		pages.signUpPage.clkOnPasswordHiddenIcon();
		
		pages.signUpPage.validatePassword(prop_constants.getProperty("valid_password"));
	}

}
