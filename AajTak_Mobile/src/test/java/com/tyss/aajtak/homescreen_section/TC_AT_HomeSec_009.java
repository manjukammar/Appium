package com.tyss.aajtak.homescreen_section;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_HomeSec_009
 * TestScript Name: AT_HomeSec_009
 * Description: Verify that the user is able to view the photo story.
 * 
 * Author: Manjappa
 */
public class TC_AT_HomeSec_009 extends BaseTest{
	
	@Test(description="Description : Verify that the user is able to view the photo story")
	public void AT_HomeSec_009() throws InterruptedException {
		

		/* Tap on back button */
		pages.homescreenPage.clkBackbtn();

		/* click on hamburger icon */
		pages.homescreenPage.clkHamburgerIcon();

		/* Click on photo option */
		pages.hamburgerMenuPage.clkPhotoLnk();

		/* Verify photo label is present in home screen */
		pages.homescreenPage.validatePhotoTabIsDisplyed();

		/* Scroll all stories */
		pages.homescreenPage.scrollToAutoLabel();

		/* Verify auto section is present */
		pages.homescreenPage.validateAutoLabelIsDisplyed();
	}
}
