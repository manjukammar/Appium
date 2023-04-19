package com.tyss.aajtak.daily_capsule;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_DailyCapsule_019
 * TestScript Name: TC_AT_DailyCapsule_019
 * Description: Verify that user is able to swipe through newspresso card by swiping up 
 * 
 * @Author: Sudhakar
 */
public class TC_AT_DailyCapsule_019 extends BaseTest {

	@Test(description = "Verify that user is able to swipe through newspresso card by swiping up ")
	public void AT_DailyCapsule_019() {

		
		/* Fetch the title of the first card */
		String firstcard=pages.homescreenPage.fetchSuperfastCardTitleText();
		
		/* Swipe up through the cards */
		pages.homescreenPage.swipeUpThroughTheCards();
		
		/* Fetch the title of the second card */
		String secondcard=pages.homescreenPage.fetchSuperfastCardTitleText();
		
		/* Validate the cards afte swiping */
		pages.homescreenPage.verifyTwodifferentString(firstcard, secondcard);
		
		
	}
}