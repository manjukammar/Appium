package com.tyss.aajtak.podcast;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/**
 * TestCaseId : TC_AT_Pod_015 
 * TestScript_Name :AT_Pod_015
 *  Description : Verify that user is able to close icon in sticky player
 * 
 * @author Shivananda T S
 *
 */
public class TC_AT_Pod_015 extends BaseTest {

	@Test(description = "Verify that user is able to close icon in sticky player")
	public void AT_Pod_015() throws InterruptedException {

		/* Tap on back button/tap on any icon at the BNB Bar */
		pages.homescreenPage.clkHomeIcon();

		/* Tap on Sticky player to expand */
		pages.podcastPage.clkOnStickyPlayerArrow();
		
		/*Tap on close icon in sticky player*/
		pages.podcastPage.clkOnStickyPlayerClose();

		/* Sticky player should be closed and podcast should be stopped */
		pages.homescreenPage.validateHomeTabIsDisplyed();

	}
}
