package com.tyss.aajtak.daily_capsule;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_DailyCapsule_017
 * TestScript Name: TC_AT_DailyCapsule_017
 * Description: Verify that user is able to close the newspresso card by tapping on the close icon
 * 
 * @Author: Sudhakar
 */

public class TC_AT_DailyCapsule_017 extends BaseTest {

	@Test(description="Verify that user is able to close the newspresso card by tapping on the close icon")
	public void AT_DailyCapsule_017()  {

		/* Tap on Close button */
		pages.homescreenPage.clkSuperFastCardCloseIcn();
		
		/* Validate Home tab is displayed */
		pages.homescreenPage.validateHomeTabIsDisplyed();
		
		

	}
}