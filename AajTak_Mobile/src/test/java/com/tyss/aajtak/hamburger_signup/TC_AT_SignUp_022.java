package com.tyss.aajtak.hamburger_signup;


import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_022
 * TestScript Name: AT_SignUp_022
 * Description: Verify the name is invalid
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_022  extends BaseTest {
	@Test(description = "Verify the name is invalid")
	public void AT_SignUp_022() throws InterruptedException {

		/* Enter invalid name in the Name Text field */
		pages.signUpPage.setFirstName(prop_constants.getProperty("invalid_name"));
		
		/* Validate the error message of Name */
		pages.signUpPage.validateNameErrorText();
	}

}
