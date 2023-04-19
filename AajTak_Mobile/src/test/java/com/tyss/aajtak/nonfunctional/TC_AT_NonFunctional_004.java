package com.tyss.aajtak.nonfunctional;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
import com.tyss.aajtak.util.MobileActionUtil;
/*
* TestCaseId: TC_AT_NonFunctional_004
* TestScript Name: AT_NonFunctional_004
* Description: Verify the user is able to launch the application
* 
* Author: Manikandan A
*/

public class TC_AT_NonFunctional_004 extends BaseTest {

	@Test(description = "Verify the user is able to launch the application")
	public void AT_NonFunctional_004() throws Exception {

		
		/* Launch the app */
		MobileActionUtil.launchApp();
		
		/* validate app launched */
		pages.shuruKarienOnboardingPage.validateAppLaunched();
		

	}

}
