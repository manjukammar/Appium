package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Bookmarkcontent_022
 * TestScript Name: AT_Bookmarkcontent_022
 * Description: Verify that user is navigated to previous screen by tapping on back button from Book marked contents
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Bookmarkcontent_022 extends BaseTest {
	
	@Test(description="Verify that user is navigated to previous screen by tapping on back button from Bookmarked contents")
	public void  AT_Bookmarkcontent_022()  throws InterruptedException
	{
	
		/* Click on Device Back button */
		pages.bookmarkContentPage.clkDeviceBackButton(1);

		/* Validate Home screen is displayed */
		pages.homescreenPage.validateAajTakHomeLogoIsDisplayed();
		
	}
}