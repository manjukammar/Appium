package com.tyss.aajtak.logout;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Logout_003
 * TestScript Name: AT_Logout_003
 * Description: Verify the user is able to logout from the app
 * 
 * @Author: Sanjay 
 */

public class TC_AT_Logout_003 extends BaseTest {

	@Test(description="Verify the user is able to logout from the app")
	public void AT_Logout_003() throws InterruptedException {

		/* Validate the confirmation message */
		pages.logoutPage.verifyAlertMessageOnSignout();
		
		/* Click on Yes option */
		pages.logoutPage.clkLogoutTapBtn();



	}

}
