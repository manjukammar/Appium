package com.tyss.aajtak.hamburger_feedback;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/*
 * TestCaseId: AT_Feedback_002
 * TestScript Name: TC_AT_Feedback_002
 * Description:Verify that the feedback screen is loaded in web view & all the options are aligned
 * 
 * @Author: Aishwarya
 */
public class TC_AT_Feedback_002 extends BaseTest{
		@Test(description = "Verify that the feedback screen is loaded in web view & all the options are aligned")
		public void AT_Feedback_002()  {
			
						
			/* Validate Aap ka naam is displayed */
			pages.feedBackPage.validateNameTb();
			
			/* Validate Aapka email id is displayed */
			pages.feedBackPage.validateEmailTb();
			
			/* Validate Aapka mobile number is displayed */
			pages.feedBackPage.validatePhoneNumberTb();
			
			/* Validate App ke baare mein aapki pratikriya is displayed */
			pages.feedBackPage.validateFeedbackTb();
			
			/* Validate submit button is displayed */
			pages.feedBackPage.validateSubmitBtn();
			
			
		}
}
