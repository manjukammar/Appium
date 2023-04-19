package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Bookmarkcontent_002
 * TestScript Name: AT_Bookmarkcontent_002
 * Description: Verify the contents of the story page in book mark
 * 
 * @Author: Sreelatha 
 */

public class TC_AT_Bookmarkcontent_002 extends BaseTest {
	
	@Test(description = "Verify the contents of the story page in book mark")
	public void AT_Bookmarkcontent_002() throws InterruptedException
	{
		/* Click on Back Arrow button */
		pages.bookmarkContentPage.clkBackArrowBtn();
		
		/* Click on first News */
		pages.homescreenPage.clkFirstNews();
		
		/* Get Title of any story */
		pages.storyDetailPage.getTitleOFAnyStory();
		
		/* Click on Story title */
		pages.storyDetailPage.clkTitleOfAnyStory();

		/* Click on Ant button */
		pages.homescreenPage.clkAntButton();
		
	    /* Click on book mark icon */
		pages.homescreenPage.clkBookmarkIcon();
		
		/* Click on back button */
		pages.homescreenPage.clkBackbtn();
		
		/* Click on Hamburger menu icon in home screen */
		pages.homescreenPage.clkHamburgerIcon();
		
		/* Click on Book mark content icon in home screen */
		pages.hamburgerMenuPage.clkBookmarkIcn();
	
		/* Click on first book marked story */
		pages.bookmarkContentPage.clkStorySection(prop_constants.getProperty("story"));
		
		/* Validate Story title*/
		pages.bookmarkContentPage.validateFirstStoryTitle();
		
		
	}

}
