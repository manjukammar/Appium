package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Bookmarkcontent_015
 * TestScript Name: AT_Bookmarkcontent_015
 * Description:  Description : Verify the title and time of the video
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Bookmarkcontent_015 extends BaseTest {

	@Test(description = "Verify the title and time of the video")
	public void AT_Bookmarkcontent_015() throws InterruptedException {

		/* Validate Content Date */
		pages.bookmarkContentPage.validateBookmarkContentDate();
		

	}

}
