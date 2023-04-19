package com.tyss.aajtak.daily_capsule;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_DailyCapsule_009
 * TestScript Name: TC_AT_DailyCapsule_009
 * Description: Verify that the user should be able to view the share icon in the newspresso card
 * 
 * @Author: Sudhakar
 */
public class TC_AT_DailyCapsule_009 extends BaseTest {

	@Test(description = "Verify that the user should be able to view the share icon in the newspresso card")
	public void AT_DailyCapsule_009()  {
		
		/* Validate Share keren icon is displayed */
		pages.homescreenPage.validateSuperFastShareIconIsDisplyed();
		
	}
}