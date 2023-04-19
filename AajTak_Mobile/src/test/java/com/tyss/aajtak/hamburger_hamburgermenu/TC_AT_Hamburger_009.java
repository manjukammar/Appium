package com.tyss.aajtak.hamburger_hamburgermenu;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Hamburger_009
 * TestScript Name: AT_Hamburger_009
 * Description: Verify that the user is able to get different options under Settings
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Hamburger_009 extends BaseTest {


	@Test(description = "Verify that the user is able to get different options under 'Settings'")
	public void AT_Hamburger_009() throws InterruptedException {
		
		/* Validate Notification text is displayed */
		pages.settingsPage.validateNotificationTxt();

		/* Validate Image download text is displayed */
		pages.settingsPage.validateImageDownloadKarenTxt();
		
		/* Validate Video Auto play text is displayed */
		pages.settingsPage.validateVideoAutoPlayToggleOn();
		
		/* Validate App memory clear karen text is displayed */
		pages.settingsPage.validateAppMemoryClearKarenTxt();
		
		/* Validate App Ratings karen text is displayed */
		pages.settingsPage.validateAppRatingKarenTxt();
		
		/* Validate App Share karen text is displayed */
		pages.settingsPage.validateAppShareKarenTxt();
		
		/* Validate Feedback tab is displayed */
		pages.settingsPage.validateFeedBackTab();
	
		/* Validate App Version tab is displayed */
		pages.settingsPage.validateAppVersionTab();
		
		/* Validate Privacy policy text is displayed */
		pages.settingsPage.validatePrivatePolicyTxt();
		
		/* Validate SaveKiSharte text is displayed */
		pages.settingsPage.validateSevaKiSharteTxt();
	
	}

}