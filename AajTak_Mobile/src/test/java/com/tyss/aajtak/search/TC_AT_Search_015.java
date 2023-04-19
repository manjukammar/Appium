package com.tyss.aajtak.search;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/**
 * TestCaseId : TC_AT_Search_015 
 * TestScript_Name :AT_Search_015 
 * Description :Verify the video detail screens
 * 
 * @author Shivananda T S
 *
 */
public class TC_AT_Search_015 extends BaseTest {

	@Test(description = "Verify the video detail screens")
	public void AT_Search_014() throws Exception {
		
		/* Tap on 'video Tab' */
		pages.searchPage.clkOnVideoTitleTxt();

		/* video details screen should be verified */
		pages.searchPage.validateVideo();

		
		/* Click on Home tab */
		pages.homescreenPage.clkHomeTab();
	}

}
