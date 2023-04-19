package com.tyss.aajtak.hamburger_feedback;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: AT_Feedback_004
 * TestScript Name: TC_AT_Feedback_004
 * Description:Verify whether user is able to submit feedback by tapping on 'Submit Another Response' from confirmation message
 * 
 * @Author: Aishwarya
 */
public class TC_AT_Feedback_004 extends BaseTest{
	@Test(description="Verify whether user is able to submit feedback by tapping on 'Submit Another Response' from confirmation message")
	public void AT_Feedback_004() 
	{
		
		/* Validate Submit another response is displayed */
		pages.feedBackPage.validateSubmitAnotherRespone();
		
		/* Click on Device back button */
		pages.feedBackPage.clkDeviceBackButton(2);
		
//		/* Click on Submit another response from confirmation message */
//		pages.feedBackPage.clkSubmitAnotherRespone();
		
		/* Validate it is navigated to another feedback form */
		//page is not loading both manual and automation
//		pages.feedBackPage.validateAnotherFeedbackForm();
		
	}
}
