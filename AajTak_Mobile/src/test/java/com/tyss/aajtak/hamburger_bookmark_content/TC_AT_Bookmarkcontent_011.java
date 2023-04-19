package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Bookmarkcontent_011
 * TestScript Name: AT_Bookmarkcontent_011
 * Description: Verify that user is able to remove the gallery from book marked content
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Bookmarkcontent_011 extends BaseTest {

	@Test(description = "Verify that user is able to remove the gallery from bookmarked content")
	public void AT_Bookmarkcontent_011() throws InterruptedException {
				
		/* Click on Book mark icon */
		pages.photoDetailPage.clkOnBookmarkIcon();
		
		/* Click on Close icon */
		pages.photoDetailPage.clkCloseIcn();
		
		/*Click on photo section in book mark content page */
		pages.bookmarkContentPage.clkTasvireSection(prop_constants.getProperty("photos"));
		
		/* Validate Content message */
		pages.bookmarkContentPage.validateContentMessage();
	}

}
