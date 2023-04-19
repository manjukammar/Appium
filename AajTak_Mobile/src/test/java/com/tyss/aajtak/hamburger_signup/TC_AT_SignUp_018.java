package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_018
 * TestScript Name: AT_SignUp_018
 * Description: Verify the user is already registered
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_018 extends BaseTest {

	@Test(description = "Verify the user is already registered")
	public void AT_SignUp_018() throws InterruptedException {
		
		/* Enter the name in the text field */
		pages.signUpPage.setFirstName(prop_constants.getProperty("valid_name"));
		
		/* Enter the Email or Phone number in the text field */
		pages.signUpPage.setEmailOrPhone(prop_constants.getProperty("correct_email"));
		
		/* Enter the Password in the text field */
		pages.signUpPage.setPassword(prop_constants.getProperty("correct_password"));
		
		/* Click on SignUp Button */
		pages.signUpPage.clkOnSignUp();
		
		/* Validate Toast Message */
		pages.signUpPage.validateToastMessage();
		
		/* Click on Device Back Button */
		pages.homescreenPage.clkBackbtn();
		
		/* Click on Device Back Button */
		pages.homescreenPage.clkBackbtn();
		
	}
}
