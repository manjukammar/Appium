package com.tyss.aajtak.photo;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId :TC_AT_Photo_017
 * TestScript_Name :AT_Photo_017
 * Description :Verify that the next screens appears when user swipe the screen
 * @author Shivananda T S
 *
 */
public class TC_AT_Photo_017 extends BaseTest {

	@Test(description = "Verify that the next screens appears when user swipe the screen")
	public void AT_Photo_017() throws Exception {
		/* Swipe left at the center */
		pages.photoListPage.swipeLeftAtTheCenter();

		/* User should be able to view the next screen(photo) by swiping */
		pages.photoDetailPage.validatePhotoGalleryScreen();
	}

}