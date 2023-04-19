package com.tyss.aajtak.live_tv_widget;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_LiveTvWiget_003
 * TestScript_Name :AT_LiveTvWiget_003
 * Description : Verify the mute icon.
 * 
 * @author Shivananda T S
 *
 */
public class TC_AT_LiveTvWidget_003 extends BaseTest {

	@Test(description = "Verify that user is abe to share the live tv")
	public void AT_LiveTvWiget_003() throws Exception {

		/* click the livetv share button */
		pages.liveTvWidgetPage.clkLiveTvShareIcn();

		/* Verify WhatsApp option is availble */
		pages.sharePage.validateWhatsappShare();

		/* Click on the WhatsApp */
		pages.sharePage.clkOnWhatsAppShare();

		/* Live tv should be shared to the particular app selected */
		pages.homescreenPage.clkBackbtn();
	}
}
