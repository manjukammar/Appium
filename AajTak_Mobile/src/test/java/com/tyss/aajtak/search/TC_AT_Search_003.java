package com.tyss.aajtak.search;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Search_003
 * TestScript_Name :AT_Search_003 
 * Description :Verify that user is able to enter the text in the search text field
 * 
 * @author Shivananda T S
 *
 */
public class TC_AT_Search_003 extends BaseTest {

	// Pending: Unable to enter From the keyBoard
	@Test(description = "Verify that user is able to view the search results when user taps on enter/search button in the keyboard")
	public void AT_Search_003() throws InterruptedException {

		/* Tap on 'Khojo' button */
		pages.searchPage.clkOnkhojo();

		/* User should be able to view the search results when user taps on enter/search button in the keyboard*/ 
		pages.searchPage.validateSearchDetails();
	}

}
