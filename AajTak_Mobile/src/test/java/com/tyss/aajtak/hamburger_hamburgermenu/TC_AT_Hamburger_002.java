package com.tyss.aajtak.hamburger_hamburgermenu;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Hamburger_002
 * TestScript Name: AT_Hamburger_002
 * Description:  Verify the user is able to view the icon 'Downloaded Content' on the Menu
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Hamburger_002 extends BaseTest {


	@Test(description = "Verify the user is able to view the icon 'Downloaded Content' on the Menu")
	public void AT_Hamburger_002() throws InterruptedException {
		
		/* Validate Download content icon is displayed */
		pages.hamburgerMenuPage.validateDownloadIcn();
		
	}
}