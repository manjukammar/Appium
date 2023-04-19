package com.tyss.aajtak.logout;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Logout_002
 * TestScript Name: AT_Logout_002
 * Description: Verify that the user is able to view an confirmation message
 * 
 * @Author: Sanjay 
 */

public class TC_AT_Logout_002 extends BaseTest{
	
	@Test(description="Verify that the user is able to view an confirmation message")
	public void AT_Logout_002() throws InterruptedException {
		
		/* Click on signout */
		pages.logoutPage.clkSignOutBtn();
	
	}
}
