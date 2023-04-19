package com.tyss.aajtak.live_tv_widget;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_LiveTvWiget_002
 * TestScript_Name :AT_LiveTvWiget_002
 * Description : Verify the mute icon.
 * 
 * @author Shivananda T S
 *
 */
public class TC_AT_LiveTvWidget_002 extends BaseTest {

	@Test(description = " Verify the mute icon")
	public void AT_LiveTvWiget_002() throws Exception {

		/*Tap on live tv screen*/
		pages.liveTvWidgetPage.tapOnScreen();

		/* Wait till the mute icon is present */
		pages.liveTvWidgetPage.waitForMuteIcn();

		/* Tap on mute icon */
		pages.liveTvWidgetPage.clkOnMuteIcn();
		
		/*User should be able to view Mute icon and should be mute/unmute the mute icon*/
		pages.liveTvWidgetPage.validateMuteIcon();

	}
}
