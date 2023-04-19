package com.tyss.aajtak.homescreen_section;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_HomeSec_001
 * TestScript Name: AT_HomeSec_001
 * Description: Verify that the user is able to view hamburger menu icon.
 * 
 * Author: Manjappa
 */
public class TC_AT_HomeSec_001 extends BaseTest {
	
	@Test(description = "Description : Verify that the user is able to view hamburger menu icon")
	public void AT_HomeSec_001() throws InterruptedException {
			
		/* Verify the hamburger menu is present */
		pages.homescreenPage.validateHamburgerIconIsDisplyed();
		
	}

}
