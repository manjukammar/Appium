package com.tyss.aajtak.inarticle_link;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_InArticleLink_002
 * TestScript_Name :AT_InArticleLink_002
 * Description :Verify that user is navigated to the previous story detail screen when user taps on the back arrow button
 * 
 * @author Shivananda T S
 *
 */
public class TC_AT_InArticleLink_002 extends BaseTest {

	@Test(description = "Verify that user is navigated to the previous story detail screen when user taps on the back arrow button")
	public void AT_InArticleLink_002() throws Exception {

		/* Tap on 'Back arrow' button */
		pages.storyDetailPage.clkOnBackArrow();

		/* User should be navigated to the previous story detail screen when user taps on the back arrow button*/
		pages.storyDetailPage.validateInArticleLink1();
		
		/* click on Home tab */
		pages.homescreenPage.clkHomeTab();
	}
}
