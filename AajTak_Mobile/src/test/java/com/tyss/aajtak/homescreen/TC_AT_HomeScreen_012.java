package com.tyss.aajtak.homescreen;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_HomeScreen_011
 * TestScript Name: AT_Home_011
 * Description: Description: Description: Verify that once user taps on 'Share' icon of any story & taps on 'Anya', it gives more options to share the story
 * 
 * Author: Manjappa
 */
public class TC_AT_HomeScreen_012 extends BaseTest {
	@Test( description = "Description: Verify that once user taps on 'Share' icon of any story & taps on 'Anya', it gives more options to share the story")
	public void AT_Home_012() {

		/* Tap an Ant button */
		pages.homescreenPage.clkAntButton();
		
		/*Tap on share icon*/
		pages.homescreenPage.clkShareIcon();
		
		/* Click other share option */
		pages.sharePage.clkOnShareOtherBtn();
		
		/*Validate the WhatsApp option*/
		pages.sharePage.validateWhatsAppInOtherOption();		
	}
}