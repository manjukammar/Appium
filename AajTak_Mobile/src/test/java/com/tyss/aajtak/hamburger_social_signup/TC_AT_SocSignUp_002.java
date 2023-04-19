package com.tyss.aajtak.hamburger_social_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_SocSignUp_002
 * TestScript Name: AT_SocSignUp_002
 * Description: Verify the user is able to navigate to Login page while tapping the option
 * 
 * @Author: Sanjay 
 */

public class TC_AT_SocSignUp_002 extends BaseTest{
	@Test(description = "Verify the user is able to navigate to Login page while tapping the option")
	public void AT_SocSignUp_001() throws InterruptedException{
		
		/* Click on Login Or Register */
		pages.hamburgerMenuPage.clkLoginOrRegisterBtn();
		
		/* Validate Twitter option is displayed */
		pages.loginOrRegisterPage.validateTwitterIcon();

		/* Validate Facebook option is displayed */
		pages.loginOrRegisterPage.validateFacebookLIcon();
		
		pages.loginOrRegisterPage.clkCloseBtn();
	}

}