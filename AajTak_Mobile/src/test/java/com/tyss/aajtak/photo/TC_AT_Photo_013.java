package com.tyss.aajtak.photo;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Photo_013
 * TestScript_Name :AT_Photo_013
 * Description :Verify for the slide show
 * @author Shivananda T S
 *
 */
public class TC_AT_Photo_013 extends BaseTest {
	
	@Test(description = "Verify for the slide show")
	public void AT_Photo_013() throws Exception {

		/* Tap on play icon present at the top right corner */
		pages.photoDetailPage.clkSlideShowPlayIcon();
		
		/* Tap on pause icon present at the top right corner */
		pages.photoDetailPage.clkSlideShowPauseIcon();

	}
}