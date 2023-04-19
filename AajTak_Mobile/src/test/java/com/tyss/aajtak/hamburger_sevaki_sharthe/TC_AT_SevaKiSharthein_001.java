package com.tyss.aajtak.hamburger_sevaki_sharthe;

import org.testng.annotations.Test;


import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_SevaKiSharthein_001
 * TestScript Name: AT_SevaKiSharthein_001
 * Description: Verify that user is able to navigate to Seva Ki Sarthae screen by tapping on Seva Ki Sarthae from Settings
 *
 * @Author: Sreelatha 
 */

public class TC_AT_SevaKiSharthein_001 extends BaseTest {
	
	@Test(description = "Verify that user is able to navigate to 'Seva Ki Sarthae' screen by tapping on 'Seva Ki Sarthae' from 'Settings'")
	public void AT_SeKiSa_001() throws InterruptedException {
	
		/* Click on Sevaki sharte text */
		pages.settingsPage.clkOnSevaKiSharteTxt();
		
		/* Validate Terms and Conditions page */
		pages.termsAndConditionsPage.validateTermsAndConditions();
		
		
	}
}