package com.tyss.aajtak.bottom_navigationbar;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_BNB_004
 * TestScript Name: TC_AT_BNB_004
 * Description: Access the Podcast under bottom navigation bar when data is off -'Aap abhi offline hai' message should be displayed
 * 
 * @Author: Sudhakar
 */

public class TC_AT_BNB_004 extends BaseTest {
	@Test(description = "Access the Podcast under bottom navigation bar when data is off -'Aap abhi offline hai' message should be displayed")
	public void AT_BNB_004(){
		
		/* Tap on Home tab */
		pages.homescreenPage.clkHomeTab();
		
		/* Turn off the Internet */
		pages.bottomNavigationBarPage.turnOffTheConnection();
		
		/* Tap on Podcast tab */
		pages.bottomNavigationBarPage.clkBottomCircleFifthOption();

		/* Verify the message */
		pages.podcastPage.validateOfflineNote();
		
		/* Turn on the Internet */
		pages.bottomNavigationBarPage.turnOnTheConnection();

	}

}
