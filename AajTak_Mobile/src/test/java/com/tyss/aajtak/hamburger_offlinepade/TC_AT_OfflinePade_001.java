package com.tyss.aajtak.hamburger_offlinepade;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_OfflinePade_001
 * TestScript Name: TC_AT_OfflinePade_001
 * Description:Description: Verify that 2G is disabled, 3G/4G & WiFi is enabled by default once user taps 'Offline Padae'
 * 
 * @Author: Aishwarya
 */

public class TC_AT_OfflinePade_001 extends BaseTest {
	
	@Test(description = "Description: Verify that 2G is disabled, 3G/4G & WiFi is enabled by default once user taps 'Offline Padae'")
	public void AT_OfflinePade_001()  {
		
		/* Tap on Hamburger menu */
		pages.homescreenPage.clkHamburgerIcnCopy();
		
		/* Click on Settings tab */
		pages.hamburgerMenuPage.clkSettingsLnk();
		
		/* Click on Image download karen */
		pages.settingsPage.clkOnImageDownloadKarenTxt();
		
		/* Validate 2G is enabled by default */
		pages.imageDownloadKarenPage.validate2GToggleIsEnabled();
		
		/* Validate 3G is enabled by deafault */
		pages.imageDownloadKarenPage.validate3G4GToggleIsEnabled();
		
		/* Validate WiFi is enabled by default */
		pages.imageDownloadKarenPage.validateWifiToggleIsEnabled();
		
		
		
		
		
		
		
	}


}
