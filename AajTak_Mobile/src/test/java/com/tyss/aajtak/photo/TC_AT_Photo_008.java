package com.tyss.aajtak.photo;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Photo_008
 * TestScript_Name :AT_Photo_008
 * Description :Verify that the user is able to navigate to sub-categories by taping on the corresponding tab
 * @author Shivananda T S
 *
 */
public class TC_AT_Photo_008 extends BaseTest {

	@Test(description = "Verify that the user is able to navigate to sub-categories by taping on the corresponding tab")
	public void AT_Photo_008() throws Exception {

		/* Tap on each corresponding sub category */
		pages.photoListPage.clkOnSubCategoriesInPhotoSection();

		/* validate share icon */
		pages.photoListPage.validateShareIcon();
	}

}