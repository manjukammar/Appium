package com.tyss.aajtak.photo;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Photo_011
 * TestScript_Name :AT_Photo_011
 * Description :Verify that the description of photo change when the user swipes through the photo
 * @author Shivananda T S
 *
 */
public class TC_AT_Photo_011 extends BaseTest {

	@Test(description = "Verify that the description of photo change when the user swipes through the photo")
	public void AT_Photo_011() throws Exception {
	
		/* Swipe left / right through the photo gallery and validate the descriptions */
		pages.photoListPage.swipeLeftAtTheCenter();

		/* Tap on any Photo Gallery */
		pages.photoDetailPage.clkOnPhotoGalleryScreen();
		
		/* Description should be displayed for the photos */
		pages.photoDetailPage.validatePhotoDescriptionText();

	}
}
