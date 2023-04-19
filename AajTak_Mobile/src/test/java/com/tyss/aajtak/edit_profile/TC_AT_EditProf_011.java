package com.tyss.aajtak.edit_profile;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_EditProf_011
 * TestScript Name: TC_AT_EditProf_011
 * Description:Verify that the user is able to save the changes
 * 
 * @Author: Chithra
 */

public class TC_AT_EditProf_011 extends BaseTest {

	@Test(description="Verify that the user is able to save the changes")
	public void AT_EditProf_011()
	{
		
		/* Click on Save kare */
		pages.editProfilePage.clkSaveKaren();

		/* Click Device back Button */
		pages.settingsPage.clkBackButton(2);
		
		}

}
