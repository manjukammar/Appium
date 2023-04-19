package com.tyss.aajtak.homescreen_section;


import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_HomeSec_005
 * TestScript Name: AT_HomeSec_005
 * Description: Verify that the user is able to offline for each stories listed".
 * 
 * Author: Manjappa
 */
public class TC_AT_HomeSec_005 extends BaseTest {

	@Test(description ="Description : Verify that the user is able to offline for each stories listed")
	public void AT_HomeSec_005() throws InterruptedException {
		
		/* Click on back button */
		pages.homescreenPage.clkBackbtn();
		
		/* Tap on Ant */
		pages.homescreenPage.clkAntButton();
		
		/* Click on Download icon */
		pages.homescreenPage.clkOnOfflineIcon();
		
		/* Validate toast message */
		pages.homescreenPage.validateToastMessage();
	}			
}
