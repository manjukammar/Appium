package com.tyss.aajtak.photo;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId :TC_AT_Photo_016 
 * TestScript_Name :AT_Photo_016
 * Description : Verify that the date displayed If the photo gallery is published before 24 hours
 * @author Shivananda T S
 *
 */

public class TC_AT_Photo_016 extends BaseTest {

	

	@Test(description = "Verify that the date displayed If the photo gallery is published before 24 hours")
	public void AT_Photo_016() throws Exception {
	
		/* Validate the display of date and time */
		pages.photoListPage.validatePhotoGalleryDate();

	}
}