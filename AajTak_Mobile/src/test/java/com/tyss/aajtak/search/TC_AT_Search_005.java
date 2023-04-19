package com.tyss.aajtak.search;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Search_005
 * TestScript_Name :AT_Search_005
 * Description :Verify that user is able to select any tags from the Recomended searches
 * 
 * @author Shivananda T S
 *
 */
public class TC_AT_Search_005 extends BaseTest {

	@Test(description = "Verify that user is able to select any tags from the Recomended searches")
	public void AT_Search_005() throws Exception {

		/* Tap on clear icon in the textfield */
		pages.searchPage.clkOnClearIcon();

		/* Tap on clear icon in the textfield */
		pages.searchPage.clkOnSearchCancelIcon();

		/* Tap on Search icon present in Top right corner */
		pages.searchPage.clkOnSearchIcn();

		/* Tap on any Trending/Recommended Search tags */
		pages.searchPage.clkOnSecondPopularSearch();
	}

}
