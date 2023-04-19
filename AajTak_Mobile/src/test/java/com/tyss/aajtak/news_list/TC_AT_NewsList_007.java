package com.tyss.aajtak.news_list;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_NewsList_007
 * TestScript Name: AT_Newslist_007
 * Description: Verify that user is able to share story by tapping on the 'Share' icon available at end of any story.
 * 
 * Author: Manjappa
 */
public class TC_AT_NewsList_007 extends BaseTest {
	@Test(description = "Description: Verify that user is able to share story by tapping on the 'Share' icon available at end of any story")
	public void AT_Newslist_007() {

		/* Tap on ant button */
		pages.homescreenPage.clkAntButton();

		/* Tap on share icon */
		pages.homescreenPage.clkShareIcon();

		/* Verify the Whatsapp Share is present */
		pages.sharePage.validateWhatsappShare();

		/* Verify the Twitter Share is present */
		pages.sharePage.validateTwitterShare();

		/* Verify the Facebook Share is present */
		pages.sharePage.validateFaceBookShare();
	}

}
