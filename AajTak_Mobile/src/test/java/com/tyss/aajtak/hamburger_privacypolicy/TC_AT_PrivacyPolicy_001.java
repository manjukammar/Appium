package com.tyss.aajtak.hamburger_privacypolicy;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_PrivacyPolicy_001
 * TestScript Name: AT_PrivacyPolicy_001
 * Description: Verify that user is able to navigate to 'Privacy Policy' screen by tapping on 'Privacy Policy' from 'Settings
 * 
 * @Author: Sreelatha 
 */

public class TC_AT_PrivacyPolicy_001  extends BaseTest {
	// 800
	@Test(description = "Verify that user is able to navigate to 'Privacy Policy' screen by tapping on 'Privacy Policy' from 'Settings")
	public void AT_PrivacyPolicy_001() throws InterruptedException {

		
		/* Click on Back Arrow icon */
		pages.homescreenPage.clkBackbtn();
		
		/* Click on Privacy policy text */
		pages.settingsPage.clkOnPrivacyPolicyTxt();

		/* Validate Privacy policy page */
		pages.privacyPolicyPage.validatePrivacyPolicyPage();
	
	}


}
