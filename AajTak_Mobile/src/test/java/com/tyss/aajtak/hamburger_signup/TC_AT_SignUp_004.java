package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_004
 * TestScript Name: AT_SignUp_004
 * Description: Verify that the user is on the signUp page
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_004 extends BaseTest{
	
	@Test(description = "Verify that the user is on the signUp page")
	public void AT_SignUp_004() throws InterruptedException {
		
		/* Click on Sign up link*/
		pages.loginOrRegisterPage.clkSignUpLnk();
		
	}
}
