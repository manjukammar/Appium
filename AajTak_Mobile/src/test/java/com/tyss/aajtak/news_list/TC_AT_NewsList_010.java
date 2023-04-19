package com.tyss.aajtak.news_list;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_NewsList_010
 * TestScript Name: AT_Newslist_010
 * Description: Verify that user is navigated to Newslist screen when user taps on 'Cancel' or any where on the screen.
 * 
 * Author: Manjappa
 */
public class TC_AT_NewsList_010 extends BaseTest {

	@Test( description = "Description: Verify that user is navigated to Newslist screen when user taps on 'Cancel' or any where on the screen")
	public void AT_Newslist_010(){
		
		/*Click back button*/
		pages.homescreenPage.clkBackbtn();
		
		/* Validate if the user is navigated to news list screen */
		pages.newsListPage.validateNewslistTitleTxt();
	
//		/*Click on Ant button*/
//		pages.homescreenPage.clkAntButton();
//		
//		/*Click on bookmark icon */
//		pages.homescreenPage.clkBookmarkIcon();
		
		
	}

}
