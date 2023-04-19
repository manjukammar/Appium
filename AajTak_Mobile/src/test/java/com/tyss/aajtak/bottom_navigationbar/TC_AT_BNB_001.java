package com.tyss.aajtak.bottom_navigationbar;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_BNB_001
 * TestScript Name: TC_AT_BNB_001
 * Description: Verify that user is able to see bottom navigation bar in the bottom of the screen
 * 
 * @Author: Sudhakar
 */

public class TC_AT_BNB_001 extends BaseTest {

	@Test(description = "Verify that user is able to see bottom navigation bar in the bottom of the screen")
	public void AT_BNB_001() throws InterruptedException {
		
		/* Validate bottom navigation bar */
		pages.bottomNavigationBarPage.validateBottomNavigateRoundCube();
	}

}
