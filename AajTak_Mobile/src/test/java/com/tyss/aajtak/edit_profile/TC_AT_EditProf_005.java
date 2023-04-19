package com.tyss.aajtak.edit_profile;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;


/*
 * TestCaseId: AT_EditProf_005
 * TestScript Name: TC_AT_EditProf_005
 * Description:Verify that the user is able to select the Gender
 * 
 * @Author: Chithra
 */
public class TC_AT_EditProf_005 extends BaseTest {

	@Test(description="Verify that the user is able to select the Gender")
	public void AT_EditProf_005() 
	{

		/* Click on Gender(Ling) drop down */
		pages.editProfilePage.clkGender();
		
		/* Select Gender as Sthree */
		pages.editProfilePage.clkSelectSThree();
		
		/* Validate Gender as Sthree is displayed */
		pages.editProfilePage.validateGender();

	}
}