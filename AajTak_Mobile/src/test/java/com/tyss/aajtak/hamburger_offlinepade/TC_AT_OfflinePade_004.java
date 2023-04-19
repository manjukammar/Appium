package com.tyss.aajtak.hamburger_offlinepade;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_OfflinePade_004
 * TestScript Name: TC_AT_OfflinePade_004
 * Description:Verify that if user is able to enable only 2G under 'Offline Padae'
 * 
 * @Author: Aishwarya
 */

public class TC_AT_OfflinePade_004  extends BaseTest{

	@Test(description = "Description: Verify that if user is able to enable only 2G under 'Offline Padae'")
	public void AT_OfflinePade_004() {
		
		/* Turn on 2G toggle */
		pages.imageDownloadKarenPage.clkTurnOff2GRdo();
		
		/* Turn off 3G toggle */
		pages.imageDownloadKarenPage.clkTurnOn3G4GRdo();
		
		/* Validate 2G toggle is enabled */
		pages.imageDownloadKarenPage.validate2GToggleIsEnabled();
		
	}


}
