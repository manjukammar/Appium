package com.tyss.aajtak.logout;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Logout_004
 * TestScript Name: AT_Logout_004
 * Description: Verify the user is able to view the toast message
 * 
 * @Author: Sanjay 
 */

public class TC_AT_Logout_004 extends BaseTest{

	@Test(description="Verify the user is able to view the toast message")
	public void AT_Logout_004(){

		/* Validate the visibility of welcome text */
		pages.homescreenPage.validateWelcomeIsDisplyed();
	}
}
