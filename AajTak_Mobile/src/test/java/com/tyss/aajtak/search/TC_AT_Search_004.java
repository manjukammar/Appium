package com.tyss.aajtak.search;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Search_004
 * TestScript_Name :AT_Search_004 
 * Description : Verify that popular searches options are displayed in the search screen * 
 * @author Shivananda T S
 *
 */
public class TC_AT_Search_004 extends BaseTest {

	@Test(description = " Verify that popular searches options are displayed in the search screen")
	public void AT_Search_004() throws Exception {
		

		/*Validate the visibility of trending or recommended search templates*/
		pages.searchPage.validateTrendingTopicsSearches();
		
	
	}
}
