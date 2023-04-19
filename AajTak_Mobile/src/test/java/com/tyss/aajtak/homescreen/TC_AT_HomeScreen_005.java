package com.tyss.aajtak.homescreen;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_HomeScreen_005
 * TestScript Name: AT_Home_005
 * Description: Verify that user is able to navigate to comments screen by tapping on 'Comments' icon below any story.
 * 
 * Author: Manjappa
 */
public class TC_AT_HomeScreen_005 extends BaseTest {

	@Test(description = "Description: Verify that user is able to navigate to comments screen by tapping on 'Comments' icon below any story")
	public void AT_Home_005(){

		/* Click Comment icon*/
		pages.homescreenPage.clkCommentIcon();
		
		/* Validate Comments Screen */
		pages.commentsPage.validateCommentHeading();
		
		/* Wait till comment text field is present */
		pages.commentsPage.waitForCommentTextfield();
		
		/*Validate  comment text field is present*/
		pages.commentsPage.validateCommenttextfield();
				
	}
}