package com.tyss.aajtak.hamburger_bookmark_content;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_Bookmarkcontent_010
 * TestScript Name: AT_Bookmarkcontent_010
 * Description: Verify that when user clicks on any gallery user get navigated to the photo detail page
 * 
 * @Author: Sreelatha 
 */
public class TC_AT_Bookmarkcontent_010 extends BaseTest {

	@Test(description = "Verify that when user clicks on any gallery user get navigated to the photo detail page")
	public void AT_Bookmarkcontent_010() throws InterruptedException {
			
		/* Click on book marked photo */ 
		pages.bookmarkContentPage.clkBookmarkPhotoTitle();
		
		/* Validate Photo Details page is displayed */
		pages.photoDetailPage.validatePhotoGalleryScreen();
	}

}
