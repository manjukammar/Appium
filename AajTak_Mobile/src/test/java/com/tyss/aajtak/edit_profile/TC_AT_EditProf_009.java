package com.tyss.aajtak.edit_profile;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_EditProf_009
 * TestScript Name: TC_AT_EditProf_009
 * Description:Verify that if the user is login with phone then the phone fiield should display as Contact Information
 * 
 * @Author: Chithra
 */

public class TC_AT_EditProf_009 extends BaseTest {

	@Test(description="Verify that if the user is login with phone then the phone fiield should display as Contact Information")
	public void AT_EditProf_009() 
	{
		
		/* Validate Mobile number */
		pages.editProfilePage.validateRegisteredPhoneNumber(prop_constants.getProperty("phone_number"));
	}
}


