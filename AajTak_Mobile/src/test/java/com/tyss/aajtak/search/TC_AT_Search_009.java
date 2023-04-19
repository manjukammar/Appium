package com.tyss.aajtak.search;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Search_009
 * TestScript_Name :AT_Search_009
 * Description : Verify that user is able to view stories, photos and videos in the All tab.
 * 
 * @author Shivananda T S
 *
 */
public class TC_AT_Search_009 extends BaseTest {

	@Test(description = " Verify that user is able to view stories, photos and videos in the All tab.")
	public void AT_Search_009() throws Exception {
		
		/* validate search category */
		pages.searchPage.validateSearchCategory();}

}
