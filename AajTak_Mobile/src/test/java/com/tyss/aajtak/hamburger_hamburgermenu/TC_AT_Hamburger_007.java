package com.tyss.aajtak.hamburger_hamburgermenu;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Hamburger_007
 * TestScript Name: AT_Hamburger_007
 * Description: Verify that on tapping Notification Hub user is navigated to Notification Hub screen
 * 
 * @Author: Sreelatha 
 */

public class TC_AT_Hamburger_007 extends BaseTest {

	@Test(description = "Verify that on tapping 'Notification Hub' user is navigated to 'Notification Hub' screen")
	public void AT_Hamburger_007() throws InterruptedException {
		
		/* Click on Notification icon in Hamburger Menu */
		pages.hamburgerMenuPage.clkNotificationIcn();
		
		/* Validate Notification Hub page */
		pages.notificationHubPage.validateNotificationHubPage();
		
	}

}