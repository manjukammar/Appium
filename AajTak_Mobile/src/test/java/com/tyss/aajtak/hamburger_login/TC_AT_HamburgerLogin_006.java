package com.tyss.aajtak.hamburger_login;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_HamburgerLogin_006
 * TestScript Name: AT_HamburgerLogin_006
 * Description: Verify that user is able to  login via gmail
 * 
 * @Author: Sanjay 
 */

public class TC_AT_HamburgerLogin_006 extends BaseTest{


	@Test(description="Description : Verify that user is able to logout ")
	public void  AT_hamburgerLogin_006()  throws InterruptedException
	{
		
		/* Click on logout option in hambergur menu */
		pages.hamburgerMenuPage.clkLogoutIcn();

		/* Click logout option in alert pop up */
		pages.logoutPage.clkLogoutTapBtn();

		/* Validate homescreen hamburger menu */
		pages.hamburgerMenuPage.validateAapkaSwaagathHeLnk();
	}

}
