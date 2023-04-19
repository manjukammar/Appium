package com.tyss.aajtak.nonfunctional;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
import com.tyss.aajtak.util.MobileActionUtil;
/*
* TestCaseId: TC_AT_NonFunctional_003
* TestScript Name: AT_NonFunctional_003
* Description: Verify the user is able to view the app icon in the device
* 
* Author: Manikandan A
*/
public class TC_AT_NonFunctional_003 extends BaseTest {

	@Test( description = "Verify the user is able to view the app icon in the device")
	public void AT_NonFunctional_003() throws Exception {

		/* close the app */
		MobileActionUtil.closeApp();
		
		/* verify app icon is displayed	in Device menu */	
		pages.splashScreenPage.validateAppIcon();

	

	}

}
