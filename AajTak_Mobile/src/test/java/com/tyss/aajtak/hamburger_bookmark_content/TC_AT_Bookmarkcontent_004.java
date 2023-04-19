package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Bookmarkcontent_004
 * TestScript Name: AT_Bookmarkcontent_004
 * Description: Verify that the user is able to view date/time of the story appear on article
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Bookmarkcontent_004 extends BaseTest {
	
	@Test(description = "Verify that the user is able to view date/time of the story appear on article")
	public void AT_Bookmarkcontent_004() throws InterruptedException {
	
		/* Validate Book mark content Date */
		pages.bookmarkContentPage.validateBookmarkContentDate();
		
	}

}
