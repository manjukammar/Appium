
package com.tyss.aajtak.edit_profile;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_EditProf_001
 * TestScript Name: TC_AT_EditProf_001
 * Description: Verify that user is able to navigate to edit Profile screen
 * 
 * @Author: Chithra
 */

public class TC_AT_EditProf_001 extends BaseTest {

	@Test(description="Verify that user is able to navigate to edit Profile screen")
	public void AT_EditProf_001()  
	{   
		
//		/* Click on Aage bado button */
//		pages.shuruKarienOnboardingPage.clkAageBadoBtn();
//
//		/* Validate SuperFastCard close icon*/
//		pages.homescreenPage.validateSuperFastCardCloseIconIsDisplyed();
//
//		/* Click on SuperFastCard Close icon */
//		pages.homescreenPage.clkSuperFastCardCloseIcn();
//
//		/* Validate AajTak Home logo is displayed */
//		pages.homescreenPage.validateAajTakHomeLogoCopyIsDisplayed();
//
//		/* Click on Hamburger menu */
//		pages.homescreenPage.clkHamburgerIcon();
//		
//		/* Click on Meri profile option */
//		pages.hamburgerMenuPage.clkLoginOrRegisterBtn();
//		
//		pages.loginOrRegisterPage.setEmailorPhoneTa("mulageabhi111@gmail.com");
//		
//		pages.loginOrRegisterPage.setPasswordTa("@aajtak2023");
//		
//		/* Click on login button */
//		pages.loginOrRegisterPage.clkLoginBtn();
		
		

		/* Click on Meri profile option */
		pages.viewProfilePage.clkOnViewProfile();

		/* Tap on Edit icon */
		pages.editProfilePage.clkProfileSelection();


	}
}