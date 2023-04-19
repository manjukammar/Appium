package com.tyss.aajtak.view_profile;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_ViewProfile_002
 * TestScript Name: AT_ViewProfile_002
 * Description: Verify that the user is able to view his/her name,profile picture and location
 * 
 * @Author: Sanjay 
 */

public class TC_AT_ViewProfile_002 extends BaseTest {
	
	
	@Test(description = "Verify that the user is able to view his/her name,profile picture and location")
	public void AT_ViewProfile_002() throws InterruptedException {
		
		/* Validate if the Profile image, User name, User place is displayed */
		pages.viewProfilePage.validateProfileImage();
		pages.viewProfilePage.validateUserName();
		pages.viewProfilePage.validateUserPlace();
		
	}
}



