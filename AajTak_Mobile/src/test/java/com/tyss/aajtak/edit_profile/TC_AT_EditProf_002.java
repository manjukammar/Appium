

package com.tyss.aajtak.edit_profile;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_EditProf_002
 * TestScript Name: TC_AT_EditProf_002
 * Description:Verify that the user is able to view the edit profile heading with a back button
 * 
 * @Author: Chithra
 */


public class TC_AT_EditProf_002 extends BaseTest {

	@Test(description="Verify that the user is able to view the edit profile heading with a back button")
	public void AT_EditProf_002()
	{	

		/* Validate Header is displayed */
		pages.editProfilePage.validateEditProfilePage();
		
		/* Validate Back button is displayed */
		pages.editProfilePage.validateBackArrow();
		

	}
}
