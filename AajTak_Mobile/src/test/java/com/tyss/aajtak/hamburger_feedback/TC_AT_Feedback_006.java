package com.tyss.aajtak.hamburger_feedback;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: AT_Feedback_006
 * TestScript Name: TC_AT_Feedback_006
 * Description:Verify that user is able to 'Submit' the 'Feedback' form by providing invalid email id 
 * 
 * @Author: Aishwarya
 */
public class TC_AT_Feedback_006 extends BaseTest{
	@Test( description="Verify that user is able to 'Submit' the 'Feedback' form by providing invalid email id")
	public void AT_Feedback_006() 
	{
		
		/* Click on Device back button */
		pages.feedBackPage.clkDeviceBackButton(1);
		
		/* Click on Feedback tab */
		pages.settingsPage.clkFeedbackTab();
		
		/* Set Name text field */
		pages.feedBackPage.setNameTb(prop_constants.getProperty("user_name"));
		
		/* Set Email text field with invalid value*/
		pages.feedBackPage.setEmailTb(prop_constants.getProperty("invalid_email_id"));
		
		/* Set Mobile number text field */
		pages.feedBackPage.setPhoneNumberTb(prop_constants.getProperty("phone_number"));
		
		/* Set Feedback text field */
		pages.feedBackPage.setFeedbackTb(prop_constants.getProperty("feedback"));
		
		/* Click on Submit button */
		pages.feedBackPage.clkSubmitBtn();
		
		/* Validate error message is displayed */
		pages.feedBackPage.validateWarningMsg(prop_constants.getProperty("feedback_email_warn_msg"));
		
		
	}
}
