package com.tyss.aajtak.hamburger_app_memoryclear_Karna;


import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;


/*
 * TestCaseId: AT_APPMem_004
 * TestScript Name: TC_AT_APPMem_004
 * Description: Verify that when user taps on 'App memory clear kare' user should receive a warning popup & when user taps anywhere on the screen the pop up message should disappear
 * 
 * @Author: Sanjay 
 */

public class TC_AT_APPMem_004 extends BaseTest{

	@Test(description = "Verify that when user taps on 'App memory clear kare' user should receive a warning popup & when user taps anywhere on the screen the pop up message should disappear")
	public void AT_APPMem_004() throws InterruptedException {

		/* Validate alert message */
		pages.clearAppMemoryPage.validateAlertMessage();

		/* Click on Device Back button */
		pages.clearAppMemoryPage.clkBackArrowBtn();

		/* Validate whether App Memory Clear Karen is present or not */
		pages.settingsPage.validateAppMemoryClearKarenTxt();
	}
}