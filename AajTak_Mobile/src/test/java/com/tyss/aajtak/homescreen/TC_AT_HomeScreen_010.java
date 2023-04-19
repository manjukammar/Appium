package com.tyss.aajtak.homescreen;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_HomeScreen_010
 * TestScript Name: AT_Home_010
 * Description: Description: Description: Verify that user is able to share story by tapping on the 'Share' icon available at end of any story.
 * 
 * Author: Manjappa
 */
public class TC_AT_HomeScreen_010 extends BaseTest {
	@Test(description = "Description: Verify that user is able to share story by tapping on the 'Share' icon available at end of any story")
	public void AT_Home_010() {

		/* Tap an Ant button */
		pages.homescreenPage.clkAntButton();
		
		/*Tap on share icon*/
		pages.homescreenPage.clkShareIcon();
		
		/*Verify the Whatsapp Share is present */
		pages.sharePage.validateWhatsappShare();
		
		/*Verify the Twitter Share is present */
		pages.sharePage.validateTwitterShare();
		
		/*Verify the Facebook Share is present */
		pages.sharePage.validateFaceBookShare();

		
	}
}