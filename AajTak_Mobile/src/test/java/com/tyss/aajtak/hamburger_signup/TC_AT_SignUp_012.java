package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_012
 * TestScript Name: AT_SignUp_012
 * Description: Verify the show icon button and its function
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_012 extends BaseTest
{
	@Test(description="Verify the show icon button and its function")
	public void AT_SignUp_012() throws InterruptedException
	{
		
		/* Click on Show icon */
		pages.signUpPage.clkOnPasswordHiddenIcon();
		
		/* Validate Password */
		pages.signUpPage.validatePassword(prop_constants.getProperty("valid_password"));
		
	}

}
