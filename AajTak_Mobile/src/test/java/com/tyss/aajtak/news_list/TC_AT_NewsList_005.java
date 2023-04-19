package com.tyss.aajtak.news_list;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_NewsList_005
 * TestScript Name: AT_Newslist_005
 * Description: Verify that user is able to navigate to comments screen by tapping on 'Comments' icon below any story.
 * 
 * Author: Manjappa
 */
public class TC_AT_NewsList_005 extends BaseTest {

	@Test(description = "Description: Verify that user is able to navigate to comments screen by tapping on 'Comments' icon below any story")
	public void AT_Newslist_005() throws InterruptedException {


		/* Tap on ant button */
		pages.homescreenPage.clkAntButton();
		
		/* Tap on comment icon */
		pages.homescreenPage.clkCommentIcon();
		
		/*Validate that the comments screen is loaded*/
		pages.commentsPage.validateCommentHeading();
		
		}

}
