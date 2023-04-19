package com.tyss.aajtak.homescreen;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_HomeScreen_003
 * TestScript Name: AT_Home_003
 * Description: Verify that each story has Comments icon, Bookmark icon, Offline Story icon and Share icon.
 * 
 * Author: Manjappa
 */
public class TC_AT_HomeScreen_004 extends BaseTest {

	@Test( description = "Description: Verify that each story has Comments icon, Bookmark icon, Offline Story icon and Share icon")
	public void AT_Home_004() throws InterruptedException {
	
		/* Click on the top story */
		pages.homescreenPage.clkDailyCapBannnerMessage();
		
		/* Click Ant Button */
		pages.homescreenPage.clkAntButton();
		
		/* Validate Book mark icon is present */
		pages.homescreenPage.validateBookmarkIconIsDisplyed();
		
		/*Validate Comment icon is present*/
		pages.homescreenPage.validateCommentIconIsDisplyed();
		
		/*Validate Share icon is present*/
		pages.homescreenPage.validateShareIconIsDisplyed();
		
		/*Validate Download icon is present*/
		pages.homescreenPage.validateOfflineIconIsDisplyed();
		
		
	}
}