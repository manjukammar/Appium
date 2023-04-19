package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_009
 * TestScript Name: AT_SignUp_009
 * Description: Verify the user should be able to enter the Number in Number/Email  Textfield
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_009 extends BaseTest{
	
	@Test(description = "Verify the user should be able to enter the Number in Number/Email  Textfield")
	public void AT_SignUp_009() throws InterruptedException {
		
		/* Set and validate the Email or Phone text field */
		pages.signUpPage.setEmailOrPhone(prop_constants.getProperty("valid_email"));
	}
}
