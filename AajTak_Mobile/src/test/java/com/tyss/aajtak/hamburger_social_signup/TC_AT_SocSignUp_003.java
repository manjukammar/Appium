package com.tyss.aajtak.hamburger_social_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_SocSignUp_003
 * TestScript Name: AT_SocSignUp_003
 * Description: Verify that the user is able to view twitter and facebook Icons on the page
 * 
 * @Author: Sanjay 
 */

public class TC_AT_SocSignUp_003 extends BaseTest{
	@Test(description = "Verify that the user is able to view twitter and facebook Icons on the page")
	public void AT_SocSignUp_001() throws InterruptedException{
		
		pages.hamburgerMenuPage.clkLoginOrRegisterBtn();
		
		/* Click on  Facebook login */
		pages.loginOrRegisterPage.clkfacebookLoginIcon();
		
		pages.homescreenPage.clkBackbtn();
		
		pages.loginOrRegisterPage.clkCloseBtn();
	}
}