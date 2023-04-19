package com.tyss.aajtak.hamburger_app_memoryclear_Karna;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;


/*
 * TestCaseId: AT_APPMem_002
 * TestScript Name: TC_AT_APPMem_002
 * Description: Verify user is able to clear App Memory by tapping on 'App Memory Clear Kare' & tapping on 'Haan' (Yes) from pop up message
 * 
 * @Author: Sanjay 
 */

public class TC_AT_APPMem_002 extends BaseTest {

	@Test(description = "Verify user is able to clear App Memory by tapping on 'App Memory Clear Kare' & tapping on 'Haan' (Yes) from pop up message")
	public void AT_APPMem_002() throws InterruptedException {

		/* Click on App Memory Clear karen option */
		pages.settingsPage.clkOnAppMemoryClearKarenTxt();

		/* Click on yes on pop up */
		pages.clearAppMemoryPage.clkHaanOption();

	}

}