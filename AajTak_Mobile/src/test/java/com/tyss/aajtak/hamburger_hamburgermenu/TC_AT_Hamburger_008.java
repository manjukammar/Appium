package com.tyss.aajtak.hamburger_hamburgermenu;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Hamburger_008
 * TestScript Name: AT_Hamburger_008
 * Description: Verify that the user is able to navigate to Settings from Hamburger Menu
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Hamburger_008 extends BaseTest {

	@Test(description = "Verify that the user is able to navigate to Settings from 'Hamburger Menu'")
	public void AT_Hamburger_008() throws InterruptedException {

		/* Click on Back Arrow */
		pages.notificationHubPage.clkBackArrowBtn();
		
		/* Click on Hamburger menu */
		pages.homescreenPage.clkHamburgerIcon();
		
		/* Scroll to Settings */
		pages.hamburgerMenuPage.scrollToSettings();
		
		/* Click on Settings link in hamburger menu */
		pages.hamburgerMenuPage.clkSettingsLnk();
		
		/* Validate Settings page is displayed */
		pages.settingsPage.validateSettingsPageTitleTxt();
		
	}


}