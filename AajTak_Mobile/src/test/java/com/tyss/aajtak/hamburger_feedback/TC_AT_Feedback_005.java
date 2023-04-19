package com.tyss.aajtak.hamburger_feedback;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: AT_Feedback_005
 * TestScript Name: TC_AT_Feedback_005
 * Description:Verify that user is able to 'Submit' the 'Feedback' form by providing invalid name 
 * 
 * @Author: Aishwarya
 */
public class TC_AT_Feedback_005 extends BaseTest{
	@Test(description="Verify that user is able to 'Submit' the 'Feedback' form by providing invalid name ")
	public void AT_Feedback_005() 
	{
		
		
		/* Set Name text field with invalid value */
		pages.feedBackPage.setNameTb(prop_constants.getProperty("invlid_user_name"));
		
		/* Set Email text field */
		pages.feedBackPage.setEmailTb(prop_constants.getProperty("email_id"));
		
		/* Set Mobile number text field */
		pages.feedBackPage.setPhoneNumberTb(prop_constants.getProperty("phone_number"));
		
		/* Set Feedback text field */
		pages.feedBackPage.setFeedbackTb(prop_constants.getProperty("feedback"));
		
		/* Click on Submit button */
		pages.feedBackPage.clkSubmitBtn();
		
		/* Validate error message is displayed */
		pages.feedBackPage.validateWarningPhoneNumberMsg();
		
		
		
		
	}
}

