package com.tyss.aajtak.hamburger_privacypolicy;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_PrivacyPolicy_002
 * TestScript Name: AT_PrivacyPolicy_002
 * Description: Verify that user is navigated to 'Settings' screen by tapping on back button from 'Privacy Policy' screen
 * 
 * @Author: Sreelatha 
 */

public class TC_AT_PrivacyPolicy_002 extends BaseTest{

	@Test(description ="Description : Verify that user is navigated to 'Settings' screen by tapping on back button from 'Privacy Policy' screen")
	public void AT_PrivacyPolicy_002() throws InterruptedException {
		
		/* Click on Device back button */
		pages.privacyPolicyPage.clkOnBackBtn();

		/* Validate Settings page is displayed */
		pages.settingsPage.validateSettingsPageTitleTxt();
	
	}

}
