package com.tyss.aajtak.hamburger_app_version;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: AT_AppVersion_001
 * TestScript Name: TC_AT_AppVersion_001
 * Description: Verify that user is able to view the 'App Version' by tapping on 'Settings' icon
 * 
 * @Author: Chithra
 */
public class TC_AT_AppVersion_001 extends BaseTest {

	@Test(description="Verify that user is able to view the 'App Version' by tapping on 'Settings' icon")
	public void AT_AppVersion_001()  {
		
		/* Click on device back button */
		pages.settingsPage.clkBackButton(1);
		
		/* Validate App version is visible */
		pages.settingsPage.validateAppVersionTab();
		
	}
}