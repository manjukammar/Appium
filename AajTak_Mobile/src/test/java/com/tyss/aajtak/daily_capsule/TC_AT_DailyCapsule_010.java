package com.tyss.aajtak.daily_capsule;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_DailyCapsule_010
 * TestScript Name: TC_AT_DailyCapsule_010
 * Description: Verify that the user is able to view share options while tapping on the share sheet.
 * 
 * @Author: Sudhakar
 */
public class TC_AT_DailyCapsule_010 extends BaseTest {

	@Test(description = "Verify that the user is able to view share options while tappin on the share sheet.")
	public void AT_DailyCapsule_010() {

		
		/* Click on Share keren */
		pages.homescreenPage.clkSuperfastShareIcon();
		
		/* Validate options are displayed */
		pages.homescreenPage.validateSuperfastcardShareOptionsAreDisplayed();
		
		
		
		}
	

}