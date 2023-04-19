package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_003
 * TestScript Name: AT_SignUp_003
 * Description: Verify that the user is on the Login page.
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_003 extends BaseTest{
	
	@Test(description = "Verify that the user is on the Login page.")
	public void AT_SignUp_003() throws InterruptedException {

		/* Validate SignUp link */
		pages.loginOrRegisterPage.validateSignUpKarenBtn();
		
	}
}