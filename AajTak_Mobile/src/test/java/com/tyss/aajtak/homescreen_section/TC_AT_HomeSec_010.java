package com.tyss.aajtak.homescreen_section;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
*
* TestCaseId: TC_AT_HomeSec_010
* TestScript Name: AT_HomeSec_010
* Description: Verify that when user Taps on photo it should go to photo detail in the gallery.
* 
* Author: Manjappa
*/
public class TC_AT_HomeSec_010 extends BaseTest{
	
	@Test(description="Description : Verify that when user Taps on photo it should go to photo detail in the gallery")
	public void AT_HomeSec_010() throws InterruptedException {
		
		/* Click on photo gallery */
		pages.photoDetailPage.clkOnPhotoGalleryScreen();
	
	}
}
