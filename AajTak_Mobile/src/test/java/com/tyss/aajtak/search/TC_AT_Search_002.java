package com.tyss.aajtak.search;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Search_002 
 * TestScript_Name :AT_Search_002 
 * Description :Verify that user is able to enter the text in the search text field
 * 
 * @author Shivananda T S
 *
 */
public class TC_AT_Search_002 extends BaseTest {

	// Pending: Unable to enter From the keyBoard
	@Test(description = "Verify that user is able to enter the text in the search text field")
	public void AT_Search_002() throws Exception {

		/* Enter the Text in the Search text field */
		pages.searchPage.setValue1InSearchArticles(prop_constants.getProperty("value"));

	}

}
