package com.tyss.aajtak.homescreen_section;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_HomeSec_006
 * TestScript Name: AT_HomeSec_006
 * Description:Verify that the user is able to bookmark for each stories listed"
 * 
 * Author: Manjappa
 */
public class TC_AT_HomeSec_006 extends BaseTest {

	@Test(description = "Description : Verify that the user is able to bookmark for each stories listed")
	public void AT_HomeSec_006() throws InterruptedException {
		
		/* Click on Ant button */
		pages.homescreenPage.clkAntButton();

		/* Click on bookmark icon */
		pages.homescreenPage.clkBookmarkIcon();
		
	}
}
