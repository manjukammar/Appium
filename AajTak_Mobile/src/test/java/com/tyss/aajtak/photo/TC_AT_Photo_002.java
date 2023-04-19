package com.tyss.aajtak.photo;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId :TC_AT_Photo_002
 *  TestScript_Name : AT_Photo_002
 *  Description :Verify the user is able to navigate to photo list screen from the Hamburger menu
 * 
 * @author Shivananda T S
 *
 */
public class TC_AT_Photo_002 extends BaseTest {

	@Test(description = "Verify the user is able to navigate to photo list screen from the Hamburger menu")
	public void AT_Photo_002() throws Exception {

		/* Tap on hamburger menu */
		pages.homescreenPage.clkHamburgerIcon();

		/* Tap on Photo section */
		pages.hamburgerMenuPage.clkPhotoLnk();

		/* Photo section and photos should be displayed */
		pages.photoDetailPage.validatePhotoGalleryScreen();

	}

}
