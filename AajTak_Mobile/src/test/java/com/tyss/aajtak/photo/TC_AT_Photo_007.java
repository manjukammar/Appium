package com.tyss.aajtak.photo;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Photo_007
 * TestScript_Name :AT_Photo_007
 * Description :Verify that the user is able to see all sub-categories
 * @author Shivananda T S
 *
 */
public class TC_AT_Photo_007 extends BaseTest {

	@Test(description = "Verify that the user is able to see all sub-categories")
	public void AT_Photo_007() throws Exception {

		/* Validate the display of subcategories */
		pages.photoListPage.validateDisplayOfSubcategories();

		/* User should be able to view all the sub categories */
		pages.photoListPage.validateSubCategoriesOfPhotolistSection();

	}

}