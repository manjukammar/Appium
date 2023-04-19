package com.tyss.aajtak.search;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Search_007
 * TestScript_Name :AT_Search_007
 * Description :Verify that the number of search results are displayed in the search results screen
 * 
 * @author Shivananda T S
 *
 */

public class TC_AT_Search_007 extends BaseTest {

	@Test(description = "Verify that the number of search results are displayed in the search results screen")
	public void AT_Search_007() throws Exception
	{
		/* Verify the Search results count in the Search results screen */
		pages.searchPage.validateSearchDetails();

	}
}
