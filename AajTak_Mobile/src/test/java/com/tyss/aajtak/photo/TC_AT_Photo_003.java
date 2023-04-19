package com.tyss.aajtak.photo;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Photo_003
 * TestScript_Name :AT_Photo_003
 * Description : Verify the user is able to download the photos on the screen
 * @author Shivananda T S
 *
 */
public class TC_AT_Photo_003 extends BaseTest {

	@Test(description = "Verify the user is able to download the photos on the screen")
	public void AT_Photo_003() throws Exception {

		/* Tap on DownloadIcon */
		pages.photoListPage.clkOnDownloadIcon();

		/* Photo gallery should be offlined */
		pages.photoListPage.validateDownloadIcon();

	}

}