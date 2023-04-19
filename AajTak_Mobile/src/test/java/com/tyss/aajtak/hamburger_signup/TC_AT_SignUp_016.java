package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_016
 * TestScript Name: AT_SignUp_016
 * Description: Verify the validation for phone number
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_016 extends BaseTest{
	@Test(description="Verify the validation for phone number")
	public void AT_SignUp_016() throws InterruptedException {
	
		/* Set and validate email in the Email 0r Phone Text field */
		pages.signUpPage.setEmailOrPhone(prop_constants.getProperty("valid_phone"));
		
	}

}
