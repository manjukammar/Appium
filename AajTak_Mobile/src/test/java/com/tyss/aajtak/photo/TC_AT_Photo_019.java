package com.tyss.aajtak.photo;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Photo_019
 * TestScript_Name :AT_Photo_019
 * Description : Verify that the user is able to zoom in and out the photo.
 * @author Shivananda T S
 *
 */
public class TC_AT_Photo_019 extends BaseTest {

	@Test(description = "Verify that the user is able to zoom in and out the photo.")
	public void AT_Photo_019() throws Exception {

		/* Zoom in and Out on the photo */
		pages.photoDetailPage.zoomPhoto();

		/* User should be able to zoom in and zoom out the photos */
		pages.photoDetailPage.validatePhotoGalleryScreen();
		
		/* Click Device back Button */
		pages.homescreenPage.clkBackbtn();
	}

}