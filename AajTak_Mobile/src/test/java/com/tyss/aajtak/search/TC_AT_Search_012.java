package com.tyss.aajtak.search;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Search_009
 * TestScript_Name :AT_Search_009
 * Description : Verify the template of the search results
 * 
 * @author Shivananda T S
 *
 */
public class TC_AT_Search_012 extends BaseTest {

	@Test(description = " Verify the template of the search results")
	public void AT_Search_012() throws Exception {

		/* Verify the Trending/Recommended Searches options below search field */
		pages.searchPage.validatePopularSearch();

		/*
		 * User should be able view the Trending/Recommended headers below the Search
		 * field
		 */
		pages.searchPage.validateTrendingTopicsSearches();
	}

}
