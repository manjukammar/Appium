package com.tyss.aajtak.photo;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_Photo_015
 * TestScript_Name :AT_Photo_015
 * Description :Verify that the next gallery loads after the end of first gallery
 * @author Shivananda T S
 *
 */
public class TC_AT_Photo_015  extends BaseTest {



	@Test(description = "Verify that the next gallery loads after the end of first gallery")
	public void AT_Photo_015() throws Exception {

		/* Verify next gallery button */
		pages.photoDetailPage.validateNextGalleryTab();

	}
}