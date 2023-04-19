package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Dwncnt_009
 * TestScript Name:AT_Dwncnt_009
 * Description: Verify the message displayed when there is no Downloaded stories
 * 
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_009 extends BaseTest {
	// 88
	@Test(description = "Verify the message displayed when there is no Downloaded stories")
	public void AT_Dwncnt_009() throws InterruptedException {

		/* Validate  Apne kuch bhi download nahi kiya hai text */
		pages.downloadedContentPage.validateContentMessage();
		
	}
}
