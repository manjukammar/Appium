package com.tyss.aajtak.live_blog_widget;

import org.testng.annotations.Test;

import com.tyss.aajtak.baseutil.BaseTest;
/**
 * TestCaseId : TC_AT_LiveBlgWidget_001
 * TestScript_Name :AT_LiveBlgWidget_001
 * Description :Verify that user is able view five chunks in the Live Blog
 * 
 * @author Shivananda T S
 *
 */
public class TC_AT_LiveBlgWidget_001 extends BaseTest {

	@Test(description = "Verify that user is able view five chunks in the Live Blog")
	public void AT_LiveBlgWidget_001() throws Exception {
		
		/*click on LiveBlog tv*/
		pages.liveBlogPage.clkOnLiveBlgTv();

		/*Validate number of chunks*/
		pages.liveBlogPage.validateNumberOfChunks();
		


	}
}
