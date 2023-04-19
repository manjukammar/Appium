package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Dwncnt_030
 * TestScript Name: AT_Dwncnt_030
 * Description: Verify that the user is able to save the story/photo/video for first click
 * 
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_030 extends BaseTest {
	@Test(description = "Verify that the user is able to save the story/photo/video for first click")
	public void AT_Dwncnt_030() throws InterruptedException {

		/* Click on Device back Button */
		pages.homescreenPage.clkBackbtn();
		
		/* Click on Close Icon */
		pages.hamburgerMenuPage.clkCloseIcn();
		
		/* Click on download Icon */
		pages.photoListPage.clkOnDownloadIcon();
		
		/* Validate Toast Message */
		pages.signUpPage.validateToastMessage();
		
		/* Click on the Hamburger Icon */
		pages.homescreenPage.clkHamburgerIcon();
		
		/* Click on Download Icon */
		pages.hamburgerMenuPage.clkDownloadIcn();
		
		
		
	}
}