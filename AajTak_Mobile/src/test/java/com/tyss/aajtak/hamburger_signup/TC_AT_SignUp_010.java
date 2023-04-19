package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_010
 * TestScript Name: AT_SignUp_010
 * Description: Verify that user is able to enter the password.
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_010 extends BaseTest{
	
	@Test(description = "Verify that user is able to enter the password.")
	public void AT_SignUp_010() throws InterruptedException {
		
		/*Enter the password in the password text field */
		pages.signUpPage.setPassword(prop_constants.getProperty("valid_password"));
		
		
		
	}
}
