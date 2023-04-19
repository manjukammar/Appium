package com.tyss.aajtak.inarticle_link;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_InArticleLink_001
 * TestScript_Name :AT_InArticleLink_001
 * Description :Verify that user is navigated to story detail screen when user taps on the story inarticle link
 * 
 * @author Shivananda T S
 *
 */
public class TC_AT_InArticleLink_001 extends BaseTest {

	@Test(description = "Verify that user is navigated to story detail screen when user taps on the story inarticle link")
	public void AT_InArticleLink_001() throws Exception {


		/* Swipe to Khel section */
		pages.homescreenPage.swipeToKhelSection();

		/* Tap on any News list */
		pages.homescreenPage.clkKhelSection();

		/* scroll to first news title */
		pages.homescreenPage.scrollToFirstNewstitle();

		/* Tap on any story (That contains In-Article link inside) */
		pages.homescreenPage.clkFirstNews();

		/* Tap on 'In-article link' */
		pages.storyDetailPage.clkOnInArticleLink1();

		/*
		 * User should be navigated to story detail screen when user taps on the story
		 * in-article link
		 */
		pages.storyDetailPage.validateBhadikhabarae();

	}
}
