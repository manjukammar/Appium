package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Dwncnt_015
 * TestScript Name:AT_Dwncnt_015
 * Description: Verify the message displayed when there is no Downloaded photos
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_015 extends BaseTest {
	@Test(description = "Verify the message displayed when there is no Downloaded photos")
	public void AT_Dwncnt_015() throws InterruptedException {

		/* Click on Photos Section */
		pages.downloadedContentPage.clkTasvireSection();
		
		/* Validate  Apne kuch bhi download nahi kiya hai text */
		pages.downloadedContentPage.validateContentMessage();
		

	}
}