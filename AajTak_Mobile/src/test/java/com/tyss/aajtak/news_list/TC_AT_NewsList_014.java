package com.tyss.aajtak.news_list;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_NewsList_014
 * TestScript Name: AT_Newslist_014
 * Description: Verify that user is able to tap on already added 'Offline Story' icon and view message stating the content is already been added.
 * 
 * Author: Manjappa
 */
public class TC_AT_NewsList_014 extends BaseTest{
@Test(description = "Verify that user is able to tap on already added 'Offline Story' icon and view message stating the content is already been added")
public void AT_Newslist_014(){

	
	/* Click on download content */
	pages.downloadedContentPage.clkDownloadTitle();

	/* Verify the story title */
	pages.downloadedContentPage.validateStoryTitle();

	/* Click on story title */
	pages.downloadedContentPage.clkOnStoryTitle();
	
	/* Tap ant button */
	pages.homescreenPage.clkAntButton();

	/* Tap download icon */
	pages.homescreenPage.clkOnOfflineIcon();
	
  }
}
