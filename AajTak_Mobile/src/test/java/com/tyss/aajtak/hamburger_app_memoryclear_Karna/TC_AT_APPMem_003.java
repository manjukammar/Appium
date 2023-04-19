package com.tyss.aajtak.hamburger_app_memoryclear_Karna;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;


/*
 * TestCaseId: AT_APPMem_003
 * TestScript Name: TC_AT_APPMem_003
 * Description: Verify if user is not able to clear App Memory by tapping on 'App Memory Clear Kare' & tapping on 'Nahi' (No) from pop up message
 * 
 * @Author: Sanjay 
 */

public class TC_AT_APPMem_003 extends BaseTest {

	@Test(description = "Verify if user is not able to clear App Memory by tapping on 'App Memory Clear Kare' & tapping on 'Nahi' (No) from pop up message")
	public void AT_APPMem_003() throws InterruptedException {

		/* Click on App Memory Clear karen option */
		pages.settingsPage.clkOnAppMemoryClearKarenTxt();

		/* Click on yes on pop up */
		pages.clearAppMemoryPage.clkNahiOption();
	}
}