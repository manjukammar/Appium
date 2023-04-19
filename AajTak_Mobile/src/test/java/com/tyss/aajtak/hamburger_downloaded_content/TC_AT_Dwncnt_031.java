package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Dwncnt_031
 * TestScript Name: AT_Dwncnt_031
 * Description: Verify that user is navigated to previous screen by tapping on back button from Downloaded contents
 * 
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_031 extends BaseTest {
	@Test(description = "Verify that user is navigated to previous screen by tapping on back button from Downloaded contents")
	public void AT_Dwncnt_031() throws InterruptedException {
	
		
		/* Click on back button */
		pages.homescreenPage.clkBackbtn();
		
		/* Validate that it is navigated to Hamburger menu Page */
		pages.homescreenPage.validateHamburgerIconIsDisplyed();
		
		/* Click on the Close Button */
		pages.hamburgerMenuPage.clkCloseIcn();
		
		pages.homescreenPage.clkHomeTab();

	}

}
