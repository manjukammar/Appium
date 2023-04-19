package com.tyss.aajtak.edit_profile;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_EditProf_007
 * TestScript Name: TC_AT_EditProf_007
 * Description:Verify that the user is able to edit location
 * 
 * @Author: Chithra
 */

public class TC_AT_EditProf_007 extends BaseTest {

	@Test(description="Verify that the user is able to edit location")
	public void AT_EditProf_007() 
	{
		
		
		/* Set Location text field */
		pages.editProfilePage.setUserLocation("Bangalore");
		
		
		
		
	}
}
