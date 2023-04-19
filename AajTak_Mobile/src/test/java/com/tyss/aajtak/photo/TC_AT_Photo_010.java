package com.tyss.aajtak.photo;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Photo_010
 * TestScript_Name :AT_Photo_010
 * Description :Verify that the user is able to swipe horizontally through the photos
 * @author Shivananda T S
 *
 */
public class TC_AT_Photo_010 extends BaseTest {

	@Test(description = "Verify that the user is able to swipe horizontally through the photos")
	public void AT_Photo_010() throws Exception {
		/* Tap on device back button */
		pages.hamburgerMenuPage.clkBackbtn();

		/* Swipe left / right through the photo gallery */
		pages.photoListPage.swipeLeftAtTheCenter();
		
		/* Tap on any Photo Gallery */
		pages.photoDetailPage.clkOnPhotoGalleryScreen();
		
		/* Description should be displayed for the photos */
		pages.photoDetailPage.validatePhotoDescriptionText();
		
		/* Tap on device back button */
		pages.hamburgerMenuPage.clkBackbtn();
	}

}