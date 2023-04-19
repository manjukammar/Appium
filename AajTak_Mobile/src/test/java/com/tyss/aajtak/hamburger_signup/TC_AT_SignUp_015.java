package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_015
 * TestScript Name: AT_SignUp_015
 * Description: Verify the validation for email id
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_015 extends BaseTest{
	
	@Test(description="Verify the validation for email id")
	public void AT_SignUp_015() throws InterruptedException {
		
		/* Set and validate email in the Email 0r Phone Text field */
		pages.signUpPage.setAndValidateEmailOrPhone(prop_constants.getProperty("valid_email"));

	}


}
