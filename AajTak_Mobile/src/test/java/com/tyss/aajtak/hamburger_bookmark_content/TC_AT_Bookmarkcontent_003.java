package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Bookmarkcontent_003
 * TestScript Name: AT_Bookmarkcontent_003
 * Description: Verify that there is an option to remove the story from book marked content
 * 
 * @Author: Sreelatha 
 */

public class TC_AT_Bookmarkcontent_003 extends BaseTest {

	@Test(description = "Verify that there is an option to remove the story from book marked content")
	public void AT_Bookmarkcontent_003() throws InterruptedException {
		
		/* Remove Story from Book mark content */
		pages.bookmarkContentPage.validateSabhiSafKaren();
	
	}

}