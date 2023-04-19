package com.tyss.aajtak.hamburger_offlinepade;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: AT_OfflinePade_002
 * TestScript Name: TC_AT_OfflinePade_002
 * Description:Description: Verify that if user is able to enable only Wi-Fi under 'Offline Padae' 
 * 
 * @Author: Aishwarya
 */

public class TC_AT_OfflinePade_002 extends BaseTest {

	@Test(description = "Description: Verify that if user is able to enable only Wi-Fi under 'Offline Padae' ")
	public void AT_OfflinePade_002()  {
		
		/* Turn off 2G toggle */
		pages.imageDownloadKarenPage.clkTurnOn2GRdo();
		
		/* Turn off 3G toggle */
		pages.imageDownloadKarenPage.clkTurnOn3G4GRdo();
		
		/* Validate WiFi is enabled */
		pages.imageDownloadKarenPage.validateWifiToggleIsEnabled();
	}


}
