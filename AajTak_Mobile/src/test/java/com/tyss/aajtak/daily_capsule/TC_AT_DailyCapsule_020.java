package com.tyss.aajtak.daily_capsule;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_DailyCapsule_020
 * TestScript Name: TC_AT_DailyCapsule_020
 * Description: Verify that user is able to swipe through newspresso card by swiping down 
 * 
 * @Author: Sudhakar
 */
public class TC_AT_DailyCapsule_020 extends BaseTest {
	@Test( description = "Verify that user is able to swipe through newspresso card by swiping down")
	public void AT_DailyCapsule_020(){
		
		/* Fetch the title of the first card */
		String firstcard=pages.homescreenPage.fetchSuperfastCardTitleText();
		
		/* Swipe down through the cards */
		pages.homescreenPage.swipeDownThroughTheCards();
		
		/* Fetch the title of the second card */
		String secondcard=pages.homescreenPage.fetchSuperfastCardTitleText();
		
		/* Validate the cards afte swiping */
		pages.homescreenPage.verifyTwodifferentString(firstcard, secondcard);
		
	}
}