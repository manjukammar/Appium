package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_013
 * TestScript Name: AT_SignUp_013
 * Description: Verify that the Name field validation
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_013 extends BaseTest{
	
	
	@Test(description="Verify that the Name field validation")
	public void AT_SignUp_013() throws InterruptedException
	{

		/* Set Name and Validate the field */
		pages.signUpPage.setAndValidateName(prop_constants.getProperty("valid_name"));

	}

}
