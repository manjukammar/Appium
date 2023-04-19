package com.tyss.aajtak.bottom_navigationbar;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: AT_BNB_002
 * TestScript Name: TC_AT_BNB_002
 * Description: Access the Bottom navigation bar - Five options should be displayed
 * 
 * @Author: Sudhakar
 */

public class TC_AT_BNB_002 extends BaseTest {

	@Test(description = "Access the Bottom navigation bar - Five options should be displayed")
	public void AT_BNB_002() {


		/* Validate Home Bottom navigation bar is displayed */
		pages.bottomNavigationBarPage.validateBottomCircleFirstOption();

		/* Validate News reel Bottom navigation bar is displayed */
		pages.bottomNavigationBarPage.validateBottomCircleSecondOption();

		/* Validate Video Bottom navigation bar is displayed */
		pages.bottomNavigationBarPage.validateBottomCircleThirdOption();

		/* Validate Live tv Bottom navigation bar is displayed */
		pages.bottomNavigationBarPage.validateBottomCircleFourthOption();

		/* Validate Podcast Bottom navigation bar is displayed */
		pages.bottomNavigationBarPage.validateBottomCircleFifthOption();

	}

}