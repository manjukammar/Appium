package com.tyss.aajtak.photo;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Photo_005
 * TestScript_Name :AT_Photo_005
 * Description :Verify the user is able to bookmark the photos on the screen
 * @author Shivananda T S
 *
 */
public class TC_AT_Photo_005 extends BaseTest {

	@Test(description = "Verify the user is able to bookmark the photos on the screen")
	public void AT_Photo_005() throws Exception {

		/* Tap on Bookmark icon */
		pages.photoListPage.clkOnBookmarkIcon();

		/* Photo gallery should be bookmarked */
		pages.photoListPage.validateBookmarkIcon();

	}

}