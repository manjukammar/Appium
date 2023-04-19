package com.tyss.aajtak.hamburger_offlinepade;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_OfflinePade_003
 * TestScript Name: TC_AT_OfflinePade_003
 * Description:Verify that if user is able to enable only 3G/4G under 'Offline Padae' 
 * 
 * @Author: Aishwarya
 */

public class TC_AT_OfflinePade_003 extends BaseTest{

	@Test(description = "Description: Verify that if user is able to enable only 3G/4G under 'Offline Padae'")
	public void AT_OfflinePade_003()  {

		/* Turn on 3G toggle */
		pages.imageDownloadKarenPage.clkTurnOff3G4GRdo();
		
		/* Turn off Wifi toggle*/
		pages.imageDownloadKarenPage.clkTurnOnWifiRdo();
		
		/* Validate 3G toggle is enabled */
		pages.imageDownloadKarenPage.validate3G4GToggleIsEnabled();
		
		
		
	}


}
