package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Dwncnt_023
 * TestScript Name:AT_Dwncnt_023
 * Description: Verify the message displayed when there is no videos displayed
 * 
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_023 extends BaseTest {
	@Test(description = "Verify the message displayed when there is no videos displayed")
	public void AT_Dwncnt_023()  throws InterruptedException 
	{
		/* Click on the Videos section */
		pages.downloadedContentPage.clkVideoSection();
		
		/* Validate  Apne kuch bhi download nahi kiya hai text */
		pages.downloadedContentPage.validateContentMessage();
		
	}

}