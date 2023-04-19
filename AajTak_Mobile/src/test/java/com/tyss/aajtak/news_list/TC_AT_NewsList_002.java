package com.tyss.aajtak.news_list;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_NewsList_002
 * TestScript Name: AT_Newslist_002
 * Description: Verify that each story has below options : Comments icon, Bookmark icon, Offline Story icon and Share icon.
 * 
 * Author: Manjappa
 */
public class TC_AT_NewsList_002 extends BaseTest {

	@Test( description = "Description: Verify that each story has below options : Comments icon, Bookmark icon, Offline Story icon and Share icon")
	public void AT_Newslist_002() throws InterruptedException {
		
		/* click on Home Tab */
		pages.homescreenPage.clkHomeTab();
		
		/*wait for available story */
		pages.newsListPage.waitForNewslistTitle();
		
		/*Tap on any available story */
		pages.newsListPage.clkNewslistTitleTxt();
		
		/* Tap on ant button */
		pages.homescreenPage.clkAntButton();
		
		/*Validate if user is able to view Comments icon*/
		pages.newsListPage.validateCommentIcon();
		
		/*Validate if user is able to view book mark icon*/
		pages.newsListPage.validateBookmarkIcon();
		
		/*Validate if user is able to view download icon*/
		pages.newsListPage.validateDownloadIcon();
		
		/*Validate if user is able to view share icon*/
		pages.newsListPage.validateShareIcon();
		
		

	}

}
