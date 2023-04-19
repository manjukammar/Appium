package com.tyss.aajtak.hamburger_downloaded_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_Dwncnt_012
 * TestScript Name:AT_Dwncnt_012
 * Description: Verify the title and date of the gallery
 * 
 * Author: Bredlin
 */
public class TC_AT_Dwncnt_012 extends BaseTest {
	@Test(description = "Verify the title and date of the gallery")
	public void AT_Dwncnt_012() throws InterruptedException {
		
		/* Validate the Content Date */
		pages.downloadedContentPage.validateContentDate();

	}
}
