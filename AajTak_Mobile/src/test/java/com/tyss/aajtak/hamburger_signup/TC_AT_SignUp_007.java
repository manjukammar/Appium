package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_007
 * TestScript Name: AT_SignUp_007
 * Description: Verify the user should be able to enter the Name field
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_007 extends BaseTest{
	
	@Test(description = "Verify the user should be able to enter the Name field")
	public void AT_SignUp_007() throws InterruptedException {
		
		/* Enter the valid name in the Name text field */
		pages.signUpPage.setFirstName(prop_constants.getProperty("valid_name"));
		
	}
}
