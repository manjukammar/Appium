package com.tyss.aajtak.hamburger_login;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_HamburgerLogin_001
 * TestScript Name: AT_HamburgerLogin_001
 * Description: Verify that user is able to  login via gmail
 * 
 * @Author: Sanjay 
 */

public class TC_AT_HamburgerLogin_001 extends BaseTest {

	@Test(description="Description : Verify that user is able to  login via gmail")
	public void  AT_hamburgerLogin_001()  throws InterruptedException{

		
		/* Click on hambergur menu icon in homescreen */
		pages.homescreenPage.clkHamburgerIcon();

		/* CLick on login or register option in hambergur menu */
		pages.hamburgerMenuPage.clkLoginOrRegisterBtn();

		/* Set email id for username text field */
		pages.loginOrRegisterPage.setEmailorPhoneTa(prop_constants.getProperty("email"));

		/* Set Password in password text field */
		pages.loginOrRegisterPage.setPasswordTa(prop_constants.getProperty("password"));

		/* Click on login button */
		pages.loginOrRegisterPage.clkLoginBtn();

		/* Validate that it will navigate to user account */
		pages.hamburgerMenuPage.validateNamskarUserNameTxt();

	}
}