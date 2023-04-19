package com.tyss.aajtak.search;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Search_006
 * TestScript_Name :AT_Search_006
 * Description : Verify that user is able to view the search results when user selects any tags from the Trending searches.
 * 
 * @author Shivananda T S
 *
 */
public class TC_AT_Search_006 extends BaseTest {

	@Test(description = " Verify that user is able to view the search results when user selects any tags from the Trending searches.")
	public void AT_Search_006() throws Exception {
		
		/* Tap on clear icon in the textfield */
		pages.searchPage.clkOnClearIcon();

		/* Tap on clear icon in the textfield */
		pages.searchPage.clkOnSearchCancelIcon();

		/* Tap on Search icon present in Top right corner */
		pages.searchPage.clkOnSearchIcn();

		/* Tap on any Trending/Recommended Search tags */
		pages.searchPage.clkOnTrendingSearchTag();

		/*
		 * User should be able to view the search results when user selects any tags
		 * from the Trending searches
		 */
		pages.searchPage.validateSearchDetails();
	}

}
