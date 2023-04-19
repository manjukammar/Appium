package com.tyss.aajtak.nonfunctional;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
import com.tyss.aajtak.util.MobileActionUtil;
/*
* TestCaseId: TC_AT_NonFunctional_007
* TestScript Name: AT_NonFunctional_007
* Description: Verify that the application should not appear after uninstallation
* 
* Author: Manikandan A
*/
public class TC_AT_NonFunctional_007 extends BaseTest {
	
	@Test(description = "Verify that the application should not appear after uninstallation")
	public void AT_NonFunctional_007() throws Exception {

		/* Install app */
		MobileActionUtil.installApp();

		/* validate app installed */
		MobileActionUtil.validateAppInstalled();

	}

}
