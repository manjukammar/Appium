
package com.tyss.aajtak.app_launch;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_AppLaunch_001
 * TestScript Name: AT_AppLaunch_001
 * Description:  Verify that when user is able to view the first onboarding screen with "Aage Bado" button when user launch the App.
 * 
 * @Author: SreeLatha 
 */
public class TC_AT_AppLaunch_001 extends BaseTest {

	@Test(description = "Verify that when user is able to view the first onboarding screen with \"Aage Bado\" button when user launch the App.")
	public void AT_AppLaunch_001() throws Exception {
	
		/* Validate AageBado */
		pages.shuruKarienOnboardingPage.validateAagebadoOrHomePageDisplayed();
		
	}

}
