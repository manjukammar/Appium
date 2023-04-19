package com.tyss.aajtak.hamburger_hamburgermenu;


import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Hamburger_001
 * TestScript Name: AT_Hamburger_001
 * Description:  Verify the user is able to view Hamburger menu, while clicking on Hamburger icon
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Hamburger_001 extends BaseTest {


	@Test(description = "Verify the user is able to view Hamburger menu, while clicking on Hamburger icon")
	public void AT_Hamburger_001() throws InterruptedException {
		

		/* Click on Hamburger Menu Icon */
		pages.homescreenPage.clkHamburgerIcon();
	
		/* Validate Download content */
		pages.hamburgerMenuPage.validateDownloadIcn();
		
		/* Validate Book mark content */
		pages.hamburgerMenuPage.validateBookmarkIcn();
		
		/* Validate Notification content */
		pages.hamburgerMenuPage.validateNotificationIcon();
		
	}


}