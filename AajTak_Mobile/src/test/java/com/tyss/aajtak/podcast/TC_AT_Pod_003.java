package com.tyss.aajtak.podcast;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Pod_003
 * TestScript_Name :AT_Pod_003
 * Description : Verify that audio is reversed(10sec) when user taps on forward icon
 * @author Shivananda T S
 *
 */
public class TC_AT_Pod_003 extends BaseTest {

	@Test(description = " Verify that audio is reversed(10sec) when user taps on forward icon")
	public void AT_Pod_002() throws Exception {
		
		/* Click on reversed icon of 10 sec */
		pages.podcastPage.clkOnBackward10sec();

	}

}
