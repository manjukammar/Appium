package com.tyss.aajtak.search;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Search_014
 * TestScript_Name :AT_Search_014
 * Description :Verify the photo detail screens
 * 
 * @author Shivananda T S
 *
 */
public class TC_AT_Search_014 extends BaseTest {

	@Test(description = "Verify the photo detail screens")
	public void AT_Search_014() throws Exception {

		/* Tap on 'Photo Tab' */
		pages.searchPage.clkOnPhoto();

		/* Photo details screen should be verified */
		pages.searchPage.validatePhotoDetailScreen();
	}

}
