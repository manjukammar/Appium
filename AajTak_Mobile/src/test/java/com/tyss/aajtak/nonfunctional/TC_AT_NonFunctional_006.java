package com.tyss.aajtak.nonfunctional;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
import com.tyss.aajtak.util.MobileActionUtil;
/*
* TestCaseId: TC_AT_NonFunctional_006
* TestScript Name: AT_NonFunctional_006
* Description: Verify that user is able to uninstall the app
* 
* Author: Manikandan A
*/

public class TC_AT_NonFunctional_006 extends BaseTest {
	@Test(description = "Verify that user is able to uninstall the app")
	public void AT_NonFunctional_006() throws Exception {
		
		/* Turn on the data connection */
		MobileActionUtil.turnOnTheConnection();
		
		/* Uninstall the app */
		MobileActionUtil.uninstallApp();

		/* validate the app installed */
		MobileActionUtil.validateAppInstalled();

	}

}
