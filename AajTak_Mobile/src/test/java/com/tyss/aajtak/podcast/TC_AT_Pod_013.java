package com.tyss.aajtak.podcast;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Pod_013
 * TestScript_Name :AT_Pod_013
 * Description : Verify that user is able to scroll down / up thorugh podcast listing screen
 * @author Shivananda T S
 *
 */
public class TC_AT_Pod_013 extends BaseTest {

	@Test(description = "Verify that user is able to scroll down / up thorugh podcast listing screen")
	public void AT_Pod_013() throws Exception {

		/* Tap on the audio thumbnail */
		pages.podcastPage.clkOnPodcastThumbnailsTxt();

		/* Tap on "aur padhe" in podcast landing screen */
		pages.podcastPage.clkOnAurPade();

		/* Scroll down / up through screen */
		pages.podcastPage.scrollDown();
		
	}
}
