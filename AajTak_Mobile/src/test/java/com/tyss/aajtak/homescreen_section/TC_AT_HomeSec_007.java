package com.tyss.aajtak.homescreen_section;

import java.io.IOException;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;

/*
 * TestCaseId: TC_AT_HomeSec_007
 * TestScript Name: AT_HomeSec_007
 * Description: Verify that the user is able to scroll through article detail"
 * 
 * Author: Manjappa
 */
public class TC_AT_HomeSec_007 extends BaseTest{ 

	@Test(description="Description : Verify that the user is able to scroll through article detail")
	public void AT_HomeSec_007() throws InterruptedException, IOException {
		
		/*Scroll to first news*/
		pages.homescreenPage.scrollToFirstNewstitle();
		
	}

}
