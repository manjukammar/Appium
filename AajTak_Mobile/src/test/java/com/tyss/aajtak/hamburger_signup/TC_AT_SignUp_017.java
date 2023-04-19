package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_017
 * TestScript Name: AT_SignUp_017
 * Description: Verify the validation for Password
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_017 extends BaseTest{
	@Test(description="Verify the validation for Password")
	public void AT_SignUp_017() throws InterruptedException {
		
		/* Enter email in the Email or Phone Number text field */
		pages.signUpPage.setAndValidatePassword(prop_constants.getProperty("valid_password"));
		
		
		
		

	}
}
