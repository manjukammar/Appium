package com.tyss.aajtak.story_details;

import java.io.IOException;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_StoryDetail_009
 * TestScript Name: AT_StoryDetail_009
 * Description: Verify that user is able to view the bookmarked story is available in 'Bookmark' tab
 * 
 * @Author: Sanjay 
 */
public class TC_AT_StoryDetail_009  extends BaseTest{

	@Test(description = "Verify that user is able to view the bookmarked story is available in 'Bookmark' tab")
	public void AT_StoryDetail_009() throws Exception, IOException {



		/* Click on back button */
		pages.homescreenPage.clkBackbtn();

		/* Click on hamburger icon */
		pages.homescreenPage.clkHamburgerIcon();

		/* Click on bookmark icon */
		pages.hamburgerMenuPage.clkBookmarkIcn();}

}
