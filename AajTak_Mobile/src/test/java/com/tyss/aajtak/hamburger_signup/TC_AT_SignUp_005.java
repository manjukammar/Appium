package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_005
 * TestScript Name: AT_SignUp_005
 * Description: Verify the fields present in the SignUp page
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_005 extends BaseTest{
	
	@Test(description = "Verify the fields present in the SignUp page")
	public void AT_SignUp_005() throws InterruptedException {
		
		/* Validate Name Text */
		pages.signUpPage.validateNameText();
		
		/* Validate Email or Phone Text */
		pages.signUpPage.validateEmailOrPhoneText();
		
		/* Validate Password Text */
		pages.signUpPage.validatePasswordText();
		
		/* Validate SignUp Button */
		pages.signUpPage.validatesignUp();
		
		
	}
}
