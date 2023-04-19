package com.tyss.aajtak.hamburger_hamburgermenu;


import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Hamburger_010
 * TestScript Name: AT_Hamburger_010
 * Description:  Verify the user is able to close the 'Hamburger Menu' by tapping on 'Close Button'
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Hamburger_010 extends BaseTest {


	@Test(description = "Verify the user is able to close the 'Hamburger Menu' by tapping on 'Close Button'")
	public void AT_Hamburger_010() throws InterruptedException {
		
		/* Click on Back Arrow button */
		pages.settingsPage.clkOnBackArrowButton();
		
		/* Validate Home Screen page is displayed */
		pages.homescreenPage.validateAajTakHomeLogoIsDisplayed();
		
	}

}