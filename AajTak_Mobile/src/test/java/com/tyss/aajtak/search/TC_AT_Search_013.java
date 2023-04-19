package com.tyss.aajtak.search;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Search_013
 * TestScript_Name :AT_Search_013
 * Description : Verify that user is able to view stories, photos and videos in the All tab.
 * 
 * @author Shivananda T S
 *
 */
public class TC_AT_Search_013 extends BaseTest {

	@Test(description = "Verify the article detail screens")
	public void AT_Search_013() throws Exception {

		/* Tap on 'samachar Tab' */
		pages.searchPage.clkOnStory();

		/* Article details screen should be verified */
		pages.searchPage.validateStory();

	}

}
