package com.tyss.aajtak.daily_capsule;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_DailyCapsule_016
 * TestScript Name: TC_AT_DailyCapsule_016
 * Description: Verify that the user should be able to view the close button on the top left corner
 * 
 * @Author: Sudhakar
 */
public class TC_AT_DailyCapsule_016 extends BaseTest {

	@Test( description = "Verify that the user should be able to view the close button on the top left corner")
	public void AT_DailyCapsule_016()  {
		
		
		/* Validate Close(x) button is visible */
		pages.homescreenPage.validateSuperFastCardCloseIconIsDisplyed();
		
	}
}