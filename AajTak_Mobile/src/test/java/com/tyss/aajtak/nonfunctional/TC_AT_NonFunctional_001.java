package com.tyss.aajtak.nonfunctional;
import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
import com.tyss.aajtak.util.MobileActionUtil;

/*
* TestCaseId: TC_AT_NonFunctional_001
* TestScript Name: AT_NonFunctional_001
* Description: Verify app installation is successful.
* 
* Author: Manikandan A
*/

public class TC_AT_NonFunctional_001 extends BaseTest {

	@Test(description = "Verify app installation is successful")
	public void AT_NonFunctional_001() throws Exception {
		
		/* Uninstall the app */
		MobileActionUtil.uninstallApp();
	
		/* Install the app */
		MobileActionUtil.installApp();
	
		/* validate app installed */
		MobileActionUtil.validateAppInstalled();
		
	}

}
