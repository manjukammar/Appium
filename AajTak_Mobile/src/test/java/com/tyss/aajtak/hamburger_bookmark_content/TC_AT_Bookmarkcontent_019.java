package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Bookmarkcontent_019
 * TestScript Name: AT_Bookmarkcontent_019
 * Description: Verify the message displayed when there is no videos displayed
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Bookmarkcontent_019 extends BaseTest {
	
	@Test(description="Verify the message displayed when there is no videos displayed")
	public void  AT_Bookmarkcontent_019() throws InterruptedException {
				
		/* Validate content message */
		pages.bookmarkContentPage.validateContentMessage();
		
	}

}