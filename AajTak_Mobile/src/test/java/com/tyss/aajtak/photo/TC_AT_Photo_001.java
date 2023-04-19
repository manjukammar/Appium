package com.tyss.aajtak.photo;

import org.testng.annotations.Test;
import com.tyss.aajtak.baseutil.BaseTest;


/**
 * TestCaseId :TC_AT_Photo_001
 *  TestScript_Name : AT_Photo_001
 *  Description :Verify the user is able to navigate to photo list screen from the Horizontal tab
 * 
 * @author Shivananda T S
 *
 */
public class TC_AT_Photo_001 extends BaseTest {

	@Test(description = "Verify the user is able to navigate to photo list screen from the Horizontal tab")
	public void AT_Photo_001() throws Exception {
		
		/* Wait till home screen loads */
		pages.homescreenPage.waitForVibilityOfHomeTab();

		/* Navigate to home screen */
		pages.homescreenPage.validateHamburgerIconIsDisplyed();
		
		/* Swipe To photo section in horizontal menu (method should be create) */
		pages.homescreenPage.swipeToPhotoTab();
		
		/* Tap on photo section in horizontal menu */
		pages.homescreenPage.clkPhotoTab();

		/* Photo section and photos should be displayed */
		pages.photoDetailPage.validatePhotoGalleryScreen();

	}

}
