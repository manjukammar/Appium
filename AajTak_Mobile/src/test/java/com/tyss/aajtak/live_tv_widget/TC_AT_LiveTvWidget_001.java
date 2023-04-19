package com.tyss.aajtak.live_tv_widget;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_LiveTvWiget_001
 * TestScript_Name :AT_LiveTvWiget_001
 * Description :Verify that the live tv is not cropped.
 * 
 * @author Shivananda T S
 *
 */
public class TC_AT_LiveTvWidget_001 extends BaseTest {

	@Test(description = "Verify that the live tv is not cropped")
	public void AT_LiveTvWiget_001() throws Exception {
		
		/* Wait till home screen loads */
		pages.homescreenPage.waitForVibilityOfHomeTab();

		/* Navigate to home screen */
		pages.homescreenPage.validateHamburgerIconIsDisplyed();
		
		/* Tap on Live Tv Widget */
		pages.liveTvWidgetPage.clkLiveTvWidgetIcn();
		
		/*Verify the live tv*/
		pages.liveTvWidgetPage.validateLiveTv();
		
		/*Live tv should not be cropped*/
		pages.liveTvWidgetPage.validateLiveTvCropped();

	}
}
