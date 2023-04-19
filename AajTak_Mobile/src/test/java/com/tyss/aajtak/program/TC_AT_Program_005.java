package com.tyss.aajtak.program;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Program_005
 * TestScript Name: TC_AT_Program_005
 * Description: Verify that the user can save the similar videos listed
 * 
 * @Author: Sanjay 
 */

public class TC_AT_Program_005 extends BaseTest {
	
	
	@Test(description = "Verify that the user can save the similar videos listed")
	public void AT_Program_005() throws InterruptedException {
		
		/* Click on Live TV */
		pages.homescreenPage.clkLivetvLnk();
		
		/* Click on Karyakram section */
		pages.liveTvWidgetPage.clkKaryakaramTxt();
		
		/* Click on any video */
		pages.liveTvWidgetPage.clkFirstStoryBlackAndWhiteImg();
		
		/* Click on Ant button */
		pages.liveTvWidgetPage.clkAntButton();
		
		/* Click on Download icon */
		pages.liveTvWidgetPage.clkDownloadIcn();
		
		
	}
}



