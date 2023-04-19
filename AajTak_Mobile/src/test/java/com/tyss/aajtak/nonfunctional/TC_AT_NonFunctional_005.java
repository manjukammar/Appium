package com.tyss.aajtak.nonfunctional;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
import com.tyss.aajtak.util.MobileActionUtil;
/*
* TestCaseId: TC_AT_NonFunctional_005
* TestScript Name: AT_NonFunctional_005
* Description: Open the application and turn off the internet and Verify that 'aap abhi offline hai' message is displaying
* 
* Author: Manikandan A
*/

public class TC_AT_NonFunctional_005 extends BaseTest {

	@Test(description = "Open the application and turn off the internet and Verify that 'aap abhi offline hai' message is displaying")

	public void AT_NonFunctional_005() throws Exception {
	
		/* Launch the app */
		MobileActionUtil.launchApp();
		
		/* Turn off the data connection */
		MobileActionUtil.turnOffTheConnection();
		
		/* validate offline Note is displayed */
		pages.podcastPage.validateOfflineNote();

	}
}
