package com.tyss.aajtak.onboarding;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
import com.tyss.aajtak.util.MobileActionUtil;

/*
* TestCaseId: TC_AT_Onboarding_001
* TestScript Name: AT_Onboarding_001
* Description: Verify that the user is navigated to the next screen by clicking 'Aage Bado' button
* 
* Author: Manikandan A
*/
public class TC_AT_Onboarding_001 extends BaseTest {

	@Test( description = "Verify that the user is navigated to the next screen by clicking 'Aage Bado' button")
	public void AT_Onboarding_001() throws InterruptedException {

		/* launch the app */
		MobileActionUtil.launchApp();
		
		/* validate Aage Bado button */
		pages.shuruKarienOnboardingPage.validateAageBado();
		
		/* click on Aage Bado button */
		pages.shuruKarienOnboardingPage.clkAageBadoBtn();
		
	}
}
