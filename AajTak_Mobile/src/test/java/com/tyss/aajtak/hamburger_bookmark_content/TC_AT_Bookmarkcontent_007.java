package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Bookmarkcontent_007
 * TestScript Name: AT_Bookmarkcontent_007
 * Description: Verify the message displayed when there is no book marked stories
 * 
 * @Author: Sreelatha 
 */

public class TC_AT_Bookmarkcontent_007 extends BaseTest {
	
	@Test(description = "Verify the message displayed when there is no bookmarked stories")
	public void AT_Bookmarkcontent_007() throws Exception
	{
	
		/* Validate content message */
		pages.bookmarkContentPage.validateContentMessage();
		
	}


}
