
package com.tyss.aajtak.app_launch;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
import com.tyss.aajtak.util.MobileActionUtil;
/*
 * TestCaseId: TC_AT_AppLaunch_001
 * TestScript Name: TC_AT_AppLaunch_001
 * Description:  Verify that user is able to launch the app by tapping on app icon
 * 
 * @Author: SreeLatha 
 */
public class TC_AT_AppLaunch_002 extends BaseTest {

	@Test(description = "Verify that user is able to launch the app by tapping on app icon")
	public void AT_AppLaunch_001() throws Exception {
	
		/* close app */
		MobileActionUtil.closeApp();
		
		/* verify app icon is displayed	in Device menu */	
		pages.splashScreenPage.validateAppIconInMenu();
		
		/* verify app icon is displayed	in Device menu */	
		pages.splashScreenPage.tapAppIconInMenu();
		
	}

}
