package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_021
 * TestScript Name: AT_SignUp_021
 * Description: Verify the message displayed if the email is incorrect
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_021 extends BaseTest {
	@Test(description = "Verify the message displayed if the email is incorrect")
	public void AT_SignUp_021() throws InterruptedException {

		/* Enter the Email or Phone in the Email or Phone text field */
		pages.signUpPage.setEmailOrPhone(prop_constants.getProperty("invalid_email"));

		/* Validae the invalid Email error message */
		pages.signUpPage.validateEmailErrorText();
	}

}
