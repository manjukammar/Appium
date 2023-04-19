package com.tyss.aajtak.hamburger_login;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_HamburgerLogin_004
 * TestScript Name: AT_HamburgerLogin_004
 * Description: Verify that the user is able to navigate to the Forgot password page
 * 
 * @Author: Sanjay 
 */

public class TC_AT_HamburgerLogin_004 extends BaseTest {

	@Test(description = "Description : Verify that the user is able to navigate to the Forgot password page")
	public void AT_HamburgerLogin_004() throws InterruptedException {

		/* Click on login or register option in hambergur menu */
		pages.hamburgerMenuPage.clkLoginOrRegisterBtn();

		/* Click on forgot password option in login screen */
		pages.loginOrRegisterPage.clkForgotPasswordBtn();

		/* Validate the forgot password page element in forgot password page */
		pages.forgotPasswordPage.validateForgotPasswordPage();
		
		/* Click Device back Button */
		pages.homescreenPage.clkBackbtn();
		
		pages.loginOrRegisterPage.clkCloseBtn();
	}

}