package com.tyss.aajtak.hamburger_app_memoryclear_Karna;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;


/*
 * TestCaseId: AT_APPMem_001
 * TestScript Name: TC_AT_APPMem_001
 * Description: Verify if 'App Memory Clear Kare' is tappable
 * 
 * @Author: Sanjay 
 */

public class TC_AT_APPMem_001 extends BaseTest{

	@Test(description = "Verify if 'App Memory Clear Kare' is tappable")
	public void AT_APPMem_001() throws InterruptedException {

//		/* Click on Aage Bado */
//		pages.shuruKarienOnboardingPage.clkAageBadoBtn();
//		
//		/* Validate Super Fast Card Close icon is displayed */
//		pages.homescreenPage.validateSuperFastCardCloseIconIsDisplyed();
//		
//		/* Click Super fast card Close icon */
//		pages.homescreenPage.clkSuperFastCardCloseIcn();
//		
//		/* Validate AajTak home screen page */
//		pages.homescreenPage.validateAajTakHomeLogoCopyIsDisplayed();
//
//		/* Click on Hamburger Menu icon */
//		pages.homescreenPage.clkHamburgerIcon();
//
//		/* Validate settings option is present or not */
//		pages.hamburgerMenuPage.validateSettingsLnk();
//
//		/* Click on settings option */
//		pages.hamburgerMenuPage.clkSettingsLnk();

		/* Validate whether App Memory Clear Karen is present or not */
		pages.settingsPage.validateAppMemoryClearKarenTxt();

		/* Click on App Memory Clear karen option */
		pages.settingsPage.clkOnAppMemoryClearKarenTxt();
	}

}
