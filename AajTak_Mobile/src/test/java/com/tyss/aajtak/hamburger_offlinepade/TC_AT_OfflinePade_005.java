package com.tyss.aajtak.hamburger_offlinepade;


import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_OfflinePade_005
 * TestScript Name: TC_AT_OfflinePade_005
 * Description:Verify that when user taps on back button control navigated to the 'Settings' screen
 * 
 * @Author: Aishwarya
 */
public class TC_AT_OfflinePade_005 extends BaseTest{
	
	@Test(description = "Description: Verify that when user taps on back button control navigated to the 'Settings' screen")
	public void AT_OfflinePade_005() {
		
		/* Click on back button */
		pages.imageDownloadKarenPage.clkBackButton(1);
		
		/* Validate settings page */
		pages.settingsPage.validateSettingsPageTitleTxt();
				
	     
	}
}
