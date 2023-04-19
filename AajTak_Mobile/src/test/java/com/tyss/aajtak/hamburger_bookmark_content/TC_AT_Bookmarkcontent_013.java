package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Bookmarkcontent_013
 * TestScript Name: AT_Bookmarkcontent_013
 * Description: Verify the message displayed when there is no book marked stories
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Bookmarkcontent_013 extends BaseTest {
	
	@Test(description ="Verify the message displayed when there is no bookmarked photos")
	public void AT_Bookmarkcontent_013() throws InterruptedException {

		
		/* Validate content message */
		pages.bookmarkContentPage.validateContentMessage();
		
	}
}
