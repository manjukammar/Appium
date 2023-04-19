package com.tyss.aajtak.photo;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Photo_014
 * TestScript_Name :AT_Photo_014
 * Description :Verify for the pause button
 * @author Shivananda T S
 *
 */
public class TC_AT_Photo_014 extends BaseTest {

	@Test(description = "Verify for the pause button")
	public void AT_Photo_014() throws Exception {

		/* Tap on any Photo Gallery */
		pages.photoDetailPage.clkOnPhotoGalleryScreen();
		
		/* Tap on play icon present at the top right corner */
		pages.photoDetailPage.clkSlideShowPlayIcon();
		
		/* Tap on pause icon present at the top right corner */
		pages.photoDetailPage.clkSlideShowPauseIcon();


	}
}