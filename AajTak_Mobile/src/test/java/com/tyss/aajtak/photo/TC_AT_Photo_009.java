package com.tyss.aajtak.photo;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Photo_009
 * TestScript_Name :AT_Photo_009
 * Description :Verify the user is able to view the description of the photo
 * @author Shivananda T S
 *
 */
public class TC_AT_Photo_009 extends BaseTest {

	@Test(description = "Verify the user is able to view the description of the photo")
	public void AT_Photo_009() throws Exception {

		/* Tap on any Photo Gallery */
		pages.photoDetailPage.clkOnPhotoGalleryScreen();

		/* Description should be displayed for the photos */
		pages.photoDetailPage.validatePhotoDescriptionText();
	}

}