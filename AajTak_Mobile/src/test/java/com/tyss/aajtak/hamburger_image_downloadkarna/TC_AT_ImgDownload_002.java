package com.tyss.aajtak.hamburger_image_downloadkarna;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: TC_AT_ImgDownload_002
 * TestScript Name: AT_ImgDownload_002
 * Description: Verify that 2G, 3G/4G & WiFi is enabled by default once user taps 'Image Download Karae
 * 
 * @Author: Sreelatha 
 */

public class TC_AT_ImgDownload_002 extends BaseTest {
	
	@Test(description = "Verify that 2G, 3G/4G & WiFi is enabled by default once user taps Image Download Karae")
	public void AT_ImgDownload_002() throws InterruptedException {
		
		
		/* Validate 2G option is enabled by default */
		pages.imageDownloadKarenPage.validate2GToggleIsEnabled();
		
		/* Validate 3G or 4G option is enabled by default */
		pages.imageDownloadKarenPage.validate3G4GToggleIsEnabled();
		
		/* Validate Wifi option is enabled by default */
		pages.imageDownloadKarenPage.validateWifiToggleIsEnabled();
	}

}
