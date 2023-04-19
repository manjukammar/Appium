package com.tyss.aajtak.edit_profile;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_EditProf_006
 * TestScript Name: TC_AT_EditProf_006
 * Description:Verify that the user should be able to select the DOB
 * 
 * @Author: Chithra
 */

public class TC_AT_EditProf_006 extends BaseTest {

	@Test(description="Verify that the user should be able to select the DOB")
	public void AT_EditProf_006()
	{	
		/* Set user DOB text field */
		pages.editProfilePage.setUserDOBTextField("7th दिसंबर 1997");
		
		}
	
}
