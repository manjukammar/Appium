package com.tyss.aajtak.daily_capsule;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;


/*
 * TestCaseId: AT_DailyCapsule_011
 * TestScript Name: TC_AT_DailyCapsule_011
 * Description: Verify that the share screen closes when user taps on cancel button
 * 
 * @Author: Sudhakar
 */

public class TC_AT_DailyCapsule_011 extends BaseTest {

	@Test( description = "Verify that the share screen closes when user taps on cancel button")
	public void AT_DailyCapsule_011()  {

		
		/* Tap on Close button */
		pages.homescreenPage.clkSuperFastCardShareCloseIcn();
		
		/* Validate card screen */
		pages.homescreenPage.validateDailycapBannerMessageIsDisplyed();

	}

}