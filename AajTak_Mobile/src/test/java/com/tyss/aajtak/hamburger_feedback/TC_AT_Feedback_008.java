package com.tyss.aajtak.hamburger_feedback;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: AT_Feedback_008
 * TestScript Name: TC_AT_Feedback_008
 * Description:Verify that user is able to 'Submit' the 'Feedback' form by providing invalid comment
 * 
 * @Author: Aishwarya
 */
public class TC_AT_Feedback_008 extends BaseTest{
	@Test(description="Verify that user is able to 'Submit' the 'Feedback' form by providing invalid comment")
	public void AT_Feedback_008()
	{

		/* Click on Device back button */
		pages.feedBackPage.clkDeviceBackButton(1);
		
		/* Click on Feedback tab */
		pages.settingsPage.clkFeedbackTab();
		
		/* Set Name text field */
		pages.feedBackPage.setNameTb(prop_constants.getProperty("user_name"));
		
		/* Set Email text field */
		pages.feedBackPage.setEmailTb(prop_constants.getProperty("email_id"));
		
		/* Set Mobile number text field */
		pages.feedBackPage.setPhoneNumberTb(prop_constants.getProperty("phone_number"));
		
		/* Set Feedback text field with invalid value */
		pages.feedBackPage.setFeedbackTb(prop_constants.getProperty("invlid_user_name"));
		
		/* Click on Submit button */
		pages.feedBackPage.clkSubmitBtn();
		
//		/* Validate error message is displayed */
//		pages.feedBackPage.validateWarningFeedbackMsg();

		
	}
}
