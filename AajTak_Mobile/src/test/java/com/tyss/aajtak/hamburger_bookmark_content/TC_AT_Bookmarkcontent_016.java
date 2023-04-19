package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Bookmarkcontent_016
 * TestScript Name: AT_Bookmarkcontent_016
 * Description: Verify that the user is able to navigated to the video detail page
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Bookmarkcontent_016 extends BaseTest {

	@Test(description="Verify that the user is able to navigated to the video detail page")
	public void AT_Bookmarkcontent_016() throws InterruptedException {

		/* Click on video title from book marked section */
		pages.bookmarkContentPage.clkVideoTitle(); 
	
		/* Validate video detail page */
		pages.videoDetailPage.validateVideoToolbarTitle();
	}	

}					