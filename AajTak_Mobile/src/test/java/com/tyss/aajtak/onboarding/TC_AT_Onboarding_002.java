package com.tyss.aajtak.onboarding;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
* TestCaseId: TC_AT_Onboarding_002
* TestScript Name: AT_Onboarding_002
* Description: Verify that the user get navigated to 'Settings' screen when user taps on 'Anya settings' link
* 
* Author: Manikandan A
*/
import com.tyss.aajtak.util.MobileActionUtil;
/*
* TestCaseId: TC_AT_Onboarding_002
* TestScript Name: AT_Onboarding_002
* Description: Verify that the user get navigated to 'Settings' screen when user taps on 'Anya settings' link
* 
* Author: Manikandan A
*/
public class TC_AT_Onboarding_002 extends BaseTest {

	@Test(description = "Verify that the user get navigated to 'Settings' screen when user taps on 'Anya settings' link")
	public void AT_Onboarding_002(){

		/* close the app */
		MobileActionUtil.closeApp();
		
		/* launch the app */
		MobileActionUtil.launchApp();
		
		/* validate Anya Settings button */
		pages.shuruKarienOnboardingPage.validateAnyaSettingsBtn();
		
		/* click on Anya Settings button */
		pages.shuruKarienOnboardingPage.clkAnyaSettingsBtn();


	}
}