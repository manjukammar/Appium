package com.tyss.aajtak.photo;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Photo_004
 * TestScript_Name :AT_Photo_004
 * Description : Verify the user is able to share the photos on the screen
 * @author Shivananda T S
 *
 */
public class TC_AT_Photo_004 extends BaseTest {

	@Test(description = "Verify the user is able to share the photos on the screen")
	public void AT_Photo_004() throws Exception {

		/* Tap on Share icon */
		pages.photoListPage.clkOnShareIcon();

		/* Validate if FAcebook,twitter,whatsapp present on clicking Share Icon */
		pages.sharePage.validateShareOtions();

		/* Select the sharing media */
		pages.sharePage.clkOnWhatsAppShare();
		
		pages.homescreenPage.clkBackbtn();

	}

}