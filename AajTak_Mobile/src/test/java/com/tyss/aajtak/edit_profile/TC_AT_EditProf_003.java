

package com.tyss.aajtak.edit_profile;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;


/*
 * TestCaseId: AT_EditProf_003
 * TestScript Name: TC_AT_EditProf_003
 * Description:Verify that the user is able to view the Name entered at the time of signup
 * 
 * @Author: Chithra
 */
public class TC_AT_EditProf_003 extends BaseTest {

	@Test(description="Verify that the user is able to view the Name entered at the time of signup")
	public void AT_EditProf_003() 
	{
		
		/* Validate name is displayed */
		pages.editProfilePage.validateEditUsername(prop_constants.getProperty("user_name"));
		
		
	}
}
