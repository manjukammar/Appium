package com.tyss.aajtak.view_profile;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_ViewProfile_001
 * TestScript Name: AT_ViewProfile_001
 * Description: Verify that user is able to navigate to View Profile screen
 * 
 * @Author: Sanjay 
 */

public class TC_AT_ViewProfile_001 extends BaseTest {
	
	@Test(description = "Verify that user is able to navigate to View Profile screen")
	public void AT_ViewProfile_001() throws InterruptedException {
		
//		/* Click on Aage Bado */
//		pages.shuruKarienOnboardingPage.clkAageBadoBtn();
//		
//		/* Validate Super Fast Card Close icon */
//		pages.homescreenPage.validateSuperFastCardCloseIconIsDisplyed();
//		
//		/* Click Super Fast Card Close icon */
//		pages.homescreenPage.clkSuperFastCardCloseIcn();
//		
//		/* Validate AajTak Home Logo Copy */
//		pages.homescreenPage.validateAajTakHomeLogoCopyIsDisplayed();
//			
//		/* Wait until the Hamburger menu is displayed */
//		pages.hamburgerMenuPage.waitForHamburgerIcn();
//		
//		/* Click on hamburger icon */
//		pages.hamburgerMenuPage.clkHamburgerIcn();
		
		/* CLick on login or register option in hambergur menu */
		pages.hamburgerMenuPage.clkLoginOrRegisterBtn();

		/* Set email id for username text field */
		pages.loginOrRegisterPage.setEmailorPhoneTa(prop_constants.getProperty("email"));

		/* Set Password in password text field */
		pages.loginOrRegisterPage.setPasswordTa(prop_constants.getProperty("password"));

		/* Click on login button */
		pages.loginOrRegisterPage.clkLoginBtn();
		
		/* Click on view profile */
		pages.viewProfilePage.clkOnViewProfile();
		
		/* Validate Profile Image */
		pages.viewProfilePage.validateProfileImage();
		
		/* Validate User Name */
		pages.viewProfilePage.validateUserName();
		
		/* Validate User Place*/
		pages.viewProfilePage.validateUserPlace();
		
		/* Validate My Bookmark text*/
		pages.viewProfilePage.validateMyBookmark();
		
		/* Validate My Download Content text */
		pages.viewProfilePage.validateMyDownloadContent();
	}
}



