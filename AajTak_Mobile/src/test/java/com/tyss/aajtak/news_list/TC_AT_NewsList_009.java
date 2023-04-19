package com.tyss.aajtak.news_list;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_NewsList_009
 * TestScript Name: AT_Newslist_009
 * Description: Verify that once user taps on 'Share' icon of any story & taps on 'Anya', it gives more options to share the story.
 * 
 * Author: Manjappa
 */
public class TC_AT_NewsList_009 extends BaseTest {

	@Test(description = "Description: Verify that once user taps on 'Share' icon of any story & taps on 'Anya', it gives more options to share the story")
	public void AT_Newslist_009() throws InterruptedException {

		/* Tap an Ant button */
		pages.homescreenPage.clkAntButton();

		/* Tap on share icon */
		pages.homescreenPage.clkShareIcon();

		/* Click other share option */
		pages.sharePage.clkOnShareOtherBtn();

		/* Validate the WhatsApp option */
		pages.sharePage.validateWhatsAppInOtherOption();

		
	}

}
