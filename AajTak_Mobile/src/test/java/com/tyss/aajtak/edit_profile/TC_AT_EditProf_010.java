package com.tyss.aajtak.edit_profile;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_EditProf_010
 * TestScript Name: TC_AT_EditProf_010
 * Description:Verify that the user is able to change the profile picture
 * 
 * @Author: Chithra
 */

public class TC_AT_EditProf_010 extends BaseTest {

	@Test(description="Verify that the user is able to change the profile picture")
	public void AT_EditProf_010()
	{

		/* Tap on photo selection */
		pages.editProfilePage.clkProfileSelection();
		
		/* Tap on Camera */
		pages.editProfilePage.clkCamera();
		
		/* Tap on Camera Shutter */
		pages.editProfilePage.clkCameraShutterBtn();
		
		/* Click on pic done button */
		pages.editProfilePage.clkPicDone();
		
	
		
		
		}
}
