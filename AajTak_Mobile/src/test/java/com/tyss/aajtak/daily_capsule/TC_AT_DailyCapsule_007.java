package com.tyss.aajtak.daily_capsule;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_DailyCapsule_007
 * TestScript Name: TC_AT_DailyCapsule_007
 * Description: Verify the user is able to tap on the Superfast card in Home page
 * 
 * @Author: Sudhakar
 */
public class TC_AT_DailyCapsule_007 extends BaseTest {
	@Test(description = "Verify the user is able to tap on the Superfast card in Home page")
	public void AT_DailyCapsule_007(){

		/*Click on Superfast card */
		pages.homescreenPage.clkBadiKhabreInSection();
		
		/* Validate superfast screen */
		pages.homescreenPage.validateDailycapBannerMessageIsDisplyed();
		
	}

}