package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_024
 * TestScript Name: AT_SignUp_024
 * Description: Verify that the user is able to navigate to the Terms Of Service, by tapping on Terms Of Service from sign up screen
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_024  extends BaseTest {
@Test(description = "Verify that the user is able to navigate to the Terms Of Service, by tapping on Terms Of Service from sign up screen")
public void AT_SignUp_024() throws InterruptedException {
		
	/* Click on Agree Terms and Conditions */
	pages.signUpPage.clkSevaKiShathreLnk();
	
	/* Click on Back Button */
	pages.signUpPage.validateTermsAndConditionText();
	
	pages.signUpPage.clkBackbtn();
	
	}
}
