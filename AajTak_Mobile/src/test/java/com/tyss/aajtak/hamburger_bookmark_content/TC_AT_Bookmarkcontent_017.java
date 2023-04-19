package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Bookmarkcontent_017
 * TestScript Name: AT_Bookmarkcontent_017
 * Description: Verify that the user is able to remove the individual videos from the book mark page
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Bookmarkcontent_017 extends BaseTest {
	
	@Test(description = "Verify that the user is able to remove the individual videos from the bookmark page")
	public void AT_Bookmarkcontent_0017() throws InterruptedException {
		
		/*Click on Book mark icon */
		pages.videoListPage.clkOnBookMarkIcon();
		
		/* Click on Device Back button */
		pages.videoListPage.clkDeviceBackButton(1);

		/* Click on Video section in book mark content */
		pages.bookmarkContentPage.clkVideoSection(prop_constants.getProperty("videos"));

		/* Validate Content Message */
		pages.bookmarkContentPage.validateContentMessage();
		
		/* Close Video player */
		pages.bookmarkContentPage.closeTheVideoPlayer();
		
	}
}
