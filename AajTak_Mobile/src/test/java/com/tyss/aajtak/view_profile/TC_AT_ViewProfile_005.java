package com.tyss.aajtak.view_profile;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_ViewProfile_005
 * TestScript Name: AT_ViewProfile_005
 * Description: Verify that the user is able to navigate to Edit Profile page
 * 
 * @Author: Sanjay 
 */

public class TC_AT_ViewProfile_005 extends BaseTest {

	@Test( description = "Verify that the user is able to navigate to Edit Profile page")
	public void AT_ViewProfile_005() throws InterruptedException {
		
		/* Click on My back arrow button */
		pages.bookmarkContentPage.clkBackArrowBtn();

		/* Click on Edit profile icon */
		pages.viewProfilePage.clkOnEditProfile();

		/* Validate that the user is navigated to Edit Profile screen */
		pages.editProfilePage.validateEditProfilePage();

		pages.settingsPage.clkBackButton(2);
	
	}
}
