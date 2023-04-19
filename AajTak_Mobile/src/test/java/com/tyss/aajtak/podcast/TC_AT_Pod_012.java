package com.tyss.aajtak.podcast;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Pod_012
 * TestScript_Name :AT_Pod_012
 * Description : Verify that user is able to scroll down / up thorugh podcast home screen
 * @author Shivananda T S
 *
 */
public class TC_AT_Pod_012 extends BaseTest {

	@Test(description = "Description: Verify that user is able to scroll down / up thorugh podcast home screen")
	public void AT_Pod_012() throws Exception {

		/* Click on device back button */
		pages.hamburgerMenuPage.clkBackbtn();

		/* Scroll through up and down on podcast screen */
		pages.podcastPage.scrollToAudiolisted();
	}
}
