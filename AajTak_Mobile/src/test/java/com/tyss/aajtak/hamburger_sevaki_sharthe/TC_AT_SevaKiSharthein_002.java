package com.tyss.aajtak.hamburger_sevaki_sharthe;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SevaKiSharthein_002
 * TestScript Name: AT_SevaKiSharthein_002
 * Description: Verify that user is navigated to 'Settings' screen by tapping on back button from Seva Ki Sarthae screen
 * 
 * @Author: Sreelatha 
 */

public class TC_AT_SevaKiSharthein_002 extends BaseTest {

	@Test( description = "Verify that user is navigated to 'Settings' screen by tapping on back button from 'Seva Ki Sarthae' screen")
	public void AT_SeKiSa_002() throws InterruptedException {
		
		/* Click on Device back button */
		pages.termsAndConditionsPage.clkDeviceBackBtn();
		
		/* Validate Settings Page is displayed */
		pages.settingsPage.validateSettingsPageTitleTxt();
		
	
	}
}