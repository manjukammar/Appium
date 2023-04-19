package com.tyss.aajtak.news_list;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_NewsList_003
 * TestScript Name: AT_Newslist_003
 * Description: Verify that user is able to tap 'Offline Story' icon below any story.
 * 
 * Author: Manjappa
 */
public class TC_AT_NewsList_003 extends BaseTest {

	@Test( description = "Description: Verify that user is able to tap 'Offline Story' icon below any story")
	public void AT_Newslist_003() {

		/*Click on save icon*/
		pages.newsListPage.clkDownloadIcon();
		
		/* Validate toast message */
		pages.newsListPage.validateToastMessage();
		
		
	}

}