package com.tyss.aajtak.podcast;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Pod_008
 * TestScript_Name :AT_Pod_008
 * Description :Verify that user is able to tap on podcast audio listed
 * @author Shivananda T S
 *
 */
public class TC_AT_Pod_008 extends BaseTest {

	@Test(description = "Verify that user is able to tap on podcast audio listed")
	public void AT_Pod_008() throws Exception {

		/*Click on down arrow icon*/
		pages.podcastPage.clkOnDownArrowIcn();

		/* Tap on podcast audio thumbnail */
		pages.podcastPage.clkOnPodcastThumbnailsTxt();
		

	}
}
