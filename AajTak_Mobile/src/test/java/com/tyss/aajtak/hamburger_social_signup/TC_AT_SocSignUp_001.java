package com.tyss.aajtak.hamburger_social_signup;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_SocSignUp_001
 * TestScript Name: AT_SocSignUp_001
 * Description: Verify the user is able to view the Login/Register option in the Hamburger Menu
 * 
 * @Author: Sanjay 
 */

public class TC_AT_SocSignUp_001 extends BaseTest{
	@Test(description = "Verify the user is able to view the Login/Register option in the Hamburger Menu")
	public void AT_SocSignUp_001() throws InterruptedException{
		
		
//		/* Click on Aage bado button */
//		pages.shuruKarienOnboardingPage.clkAageBadoBtn();
//
//		/* Validate SuperFastCard close icon is displyed */
//		pages.homescreenPage.validateSuperFastCardCloseIconIsDisplyed();
//
//		/* Click on SuperFastCard Close icon */
//		pages.homescreenPage.clkSuperFastCardCloseIcn();
//
//		/* Validate AajTak Home logo is displayed */
//		pages.homescreenPage.validateAajTakHomeLogoCopyIsDisplayed();
//		
//		/* Click on the HamburgerIcon */
//		pages.homescreenPage.clkHamburgerIcon();

		/* Validate Login Or Register is displayed */
		pages.hamburgerMenuPage.validateLoginOrRegister();
	}
}
