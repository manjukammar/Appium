package com.tyss.aajtak.daily_capsule;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_DailyCapsule_015
 * TestScript Name: TC_AT_DailyCapsule_015
 * Description: Verify that the user is able to view the Superfast card news in detail
 * 
 * @Author: Sudhakar
 */


public class TC_AT_DailyCapsule_015 extends BaseTest {

	@Test( description = "Verify that the user is able to view the Superfast card news in detail")
	public void AT_DailyCapsule_015()  {
		
		/* Click on Super fast card */
		pages.homescreenPage.clkBadiKhabreInSection();
		
		/* Click on Superfast banner */
		pages.homescreenPage.clkSuperfastCardDescription();
		
		/* Validate Article detail screen */
		pages.storyDetailPage.validateBhadikhabarae();
		
		/* Click on Device back button */
		pages.storyDetailPage.clkBackbtn();
		
	}
}