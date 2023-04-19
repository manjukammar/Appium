package com.tyss.aajtak.hamburger_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SignUp_002
 * TestScript Name: AT_SignUp_002
 * Description: Verify that the is able to navigate to Login/Register page.
 * 
 * Author: Bredlin
 */
public class TC_AT_SignUp_002 extends BaseTest {

	@Test(description = "Verify that the is able to navigate to Login/Register page.")
	public void AT_SignUp_002() throws InterruptedException {

		/* Click on Login or Register Link */
		pages.hamburgerMenuPage.clkLoginOrRegisterBtn();

	}
}
