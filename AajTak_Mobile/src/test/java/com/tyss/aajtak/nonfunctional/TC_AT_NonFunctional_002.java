package com.tyss.aajtak.nonfunctional;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
* TestCaseId: TC_AT_NonFunctional_002
* TestScript Name: AT_NonFunctional_002
* Description: Verify the user is able to view the splash screen
* 
* Author: Manikandan A
*/
public class TC_AT_NonFunctional_002 extends BaseTest {

	@Test( description = "Verify the user is able to view the splash screen")
	public void AT_NonFunctional_002() throws Exception {
		
		/* validate splash image */
		pages.splashScreenPage.validateSplashImage();
		
	}
	
}
