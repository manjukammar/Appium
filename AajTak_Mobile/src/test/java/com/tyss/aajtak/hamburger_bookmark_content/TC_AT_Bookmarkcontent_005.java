package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Bookmarkcontent_005
 * TestScript Name: AT_Bookmarkcontent_005
 * Description: Verify that the user is able to navigate to the article description page
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Bookmarkcontent_005 extends BaseTest {
	
	@Test(description = "Verify that the user is able to navigate to the article description page")
	public void AT_Bookmarkcontent_005() throws Exception {
				
		
		/* Click on book marked story */
		pages.bookmarkContentPage.clkStoryTitle();
		
		/* Validate Article description Page */
		pages.homescreenPage.validateArticlePage();
		
	}
}
