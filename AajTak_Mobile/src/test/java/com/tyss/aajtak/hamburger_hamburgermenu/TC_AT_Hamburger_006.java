package com.tyss.aajtak.hamburger_hamburgermenu;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Hamburger_006
 * TestScript Name: AT_Hamburger_006
 * Description: Verify the user is able to view 'Notification Hub' icon on the menu
 * 
 * @Author: Sreelatha 
 */

public class TC_AT_Hamburger_006 extends BaseTest {


	@Test(description = "Verify the user is able to view 'Notification Hub' icon on the menu")
	public void AT_Hamburger_006() throws InterruptedException {
		
		
		/* Click on Device Back button */
		pages.bookmarkContentPage.clkDeviceBackButton(1);
		
		/* Click on Hamburger menu icon */
		pages.homescreenPage.clkHamburgerIcon();
		
		/* Validate Notification icon is displayed */
		pages.hamburgerMenuPage.validateNotificationIcon();
		
	}

}