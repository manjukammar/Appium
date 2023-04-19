package com.tyss.aajtak.homescreen_section;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_HomeSec_004
 * TestScript Name: AT_HomeSec_004
 * Description: Verify that when user taps on comments icon the user should be navigated to comments page")
 * 
 * Author: Manjappa
 */
public class TC_AT_HomeSec_004 extends BaseTest{

	@Test(description = "Description : Verify that when user taps on comments icon the user should be navigated to comments page")
	public void AT_HomeSec_004() throws InterruptedException {
		
		/* Click ant button */
		pages.homescreenPage.clkAntButton();

		/* Tap on comment icon */
		pages.homescreenPage.clkCommentIcon();
		
		/* Verifying comment text heading in comment detail page */
		pages.commentsPage.validateCommentHeading();
		
		
	}
}
