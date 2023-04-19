package com.tyss.aajtak.bottom_navigationbar;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;


/*
 * TestCaseId: AT_BNB_005
 * TestScript Name: TC_AT_BNB_005
 * Description: Access the navigation back button in Podcast screen user should navigate to previous screen
 * 
 * @Author: Sudhakar
 */
public class TC_AT_BNB_005 extends BaseTest {

	@Test(description = "Access the navigation back button in Podcast screen user should navigate to previous screen")
	public void AT_BNB_005() {
		
		/* Click on back button */
		pages.homescreenPage.clkBackbtn();
		
		/* Validate Home screen */
		pages.homescreenPage.validateAajTakHomeLogoIsDisplayed();
		
	}
}
