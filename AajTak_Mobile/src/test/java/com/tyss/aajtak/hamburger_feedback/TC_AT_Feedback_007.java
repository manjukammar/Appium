package com.tyss.aajtak.hamburger_feedback;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: AT_Feedback_007
 * TestScript Name: TC_AT_Feedback_007
 * Description:Verify that user is able to 'Submit' the 'Feedback' form by providing invalid phone number
 * 
 * @Author: Aishwarya
 */
public class TC_AT_Feedback_007 extends BaseTest{
	@Test(description="Verify that user is able to 'Submit' the 'Feedback' form by providing invalid phone number")
	public void AT_Feedback_007() 
	{
		
		
		/* Click on Device back button */
		pages.feedBackPage.clkDeviceBackButton(1);
		
		/* Click on Feedback tab */
		pages.settingsPage.clkFeedbackTab();
		
		/* Set Name text field */
		pages.feedBackPage.setNameTb(prop_constants.getProperty("user_name"));
		
		/* Set Email text field */
		pages.feedBackPage.setEmailTb(prop_constants.getProperty("email_id"));
		
		/* Set Mobile number text field with invalid number */
		pages.feedBackPage.setPhoneNumberTb(prop_constants.getProperty("invalid_phone_number"));
		
		/* Set Feedback text field */
		pages.feedBackPage.setFeedbackTb(prop_constants.getProperty("feedback"));
		
		/* Click on Submit button */
		pages.feedBackPage.clkSubmitBtn();
		
		/* Validate error message is displayed */
		pages.feedBackPage.validateWarningPhoneNumberMsg();

		
		
	}
}
