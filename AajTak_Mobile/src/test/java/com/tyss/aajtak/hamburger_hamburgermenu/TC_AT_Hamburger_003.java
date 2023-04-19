package com.tyss.aajtak.hamburger_hamburgermenu;


import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Hamburger_003
 * TestScript Name: AT_Hamburger_003
 * Description:  Verify that on tapping Downloaded Content user is navigated to Downloaded Content screen
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Hamburger_003 extends BaseTest {


	@Test(description = "Verify that on tapping 'Downloaded Content' user is navigated to 'Downloaded Content' screen")
	public void AT_Hamburger_003() throws InterruptedException {
		
		/* Click Download content icon */
		pages.hamburgerMenuPage.clkDownloadIcn();
		
		/* Validate Download content Page */
		pages.downloadedContentPage.validateDownloadContentPage();
		
		
	}
}