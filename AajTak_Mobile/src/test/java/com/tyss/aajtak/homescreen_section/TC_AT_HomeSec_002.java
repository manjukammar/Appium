package com.tyss.aajtak.homescreen_section;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_HomeSec_002
 * TestScript Name: AT_HomeSec_002
 * Description: Verify section contains news list in 3 different formats Stories, Photo Gallery and Videos.
 * 
 * Author: Manjappa
 */
public class TC_AT_HomeSec_002 extends BaseTest{

	@Test(description="Description : Verify section contains news list in 3 different formats Stories, Photo Gallery and Videos")
	public void AT_HomeSec_002() throws InterruptedException {
    
   
		/* Story verification */
		pages.homescreenPage.validateStoryTitleInHomeScreenIsDisplyed();
		
		/* Scrolling till the photo */
        pages.homescreenPage.scrollToPhotoGalleryInHomeScreen();

        /* Gallery verification */
		pages.homescreenPage.validatePhotoGalleryIsDisplayed();

//		/* Scrolling till the video */
//        pages.homescreenPage.scrollToFirstVideoNewsInHomeScreen();
		
        /* Video verification */
		pages.homescreenPage.validateFirstVideoNewsInHomeScreenIsDisplyed();
	

	}

}
