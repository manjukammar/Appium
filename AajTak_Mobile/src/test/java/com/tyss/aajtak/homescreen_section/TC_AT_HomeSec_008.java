package com.tyss.aajtak.homescreen_section;

import java.io.IOException;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_HomeSec_008
 * TestScript Name: AT_HomeSec_008
 * Description: Verify that the in article links open in another tab")
 * 
 * Author: Manjappa
 */
public class TC_AT_HomeSec_008 extends BaseTest{
	
	@Test(description = "Description : Verify that the inarticle links open in another tab")
	public void AT_HomeSec_008() throws InterruptedException, IOException {
		
		/* Tap on first news */
		pages.homescreenPage.clkFirstNewsTitle();

		/* Validate Article link */
		pages.homescreenPage.validateBadiKahbreInSectionIsDisplayed();
				
	}
}
