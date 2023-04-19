package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Bookmarkcontent_009
 * TestScript Name: AT_Bookmarkcontent_009
 * Description: Verify the title and time of the gallery
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Bookmarkcontent_009 extends BaseTest {

	@Test(description = "Verify the title and time of the gallery")
	public void AT_Bookmarkcontent_009() throws InterruptedException {
	
		/* Validate Book marked content Date */
		pages.bookmarkContentPage.validateBookmarkContentDate();
		
	}

}
