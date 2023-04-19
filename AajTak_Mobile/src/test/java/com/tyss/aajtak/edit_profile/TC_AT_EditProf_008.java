
package com.tyss.aajtak.edit_profile;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_EditProf_008
 * TestScript Name: TC_AT_EditProf_008
 * Description:Verify that if the user is login with email then the email field should display as Contact Information
 * 
 * @Author: Chithra
 */

public class TC_AT_EditProf_008 extends BaseTest {

	@Test(description="Verify that if the user is login with email then the email field should display as Contact Information")
	public void AT_EditProf_008()
	{
		
		/* Validate the email id is displayed */
		pages.editProfilePage.validateRegisteredEmail(prop_constants.getProperty("email_id"));
		
	}
}
