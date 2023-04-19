package com.tyss.aajtak.hamburger_app_sharekarna;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_APPShare_001
 * TestScript Name: TC_AT_APPShare_001
 * Description : Verify that when user tap on 'App Share Kare' user receives different options to share the app 
 * @Author: Chithra
 */


public class TC_AT_AppShare_001 extends BaseTest{

	@Test(description = "Description : Verify that when user tap on 'App Share Kare' user receives different options to share the app")
	public void AT_APPShare_001(){


		/* Click on App  share karein */
		pages.settingsPage.clkOnAppShareKarenTxt();
		
		/* Validate options are displayed */
		pages.sharePage.validateShareOptionsAreDisplayed();
			
  
	}

}