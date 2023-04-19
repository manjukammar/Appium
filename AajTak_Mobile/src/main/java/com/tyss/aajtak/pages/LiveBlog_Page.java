package com.tyss.aajtak.pages;

import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
/**
 * Description: This class has Method Implementation for Live Blog Page.
 * 
 * @author Sreelatha
 */
public class LiveBlog_Page {
	
	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public LiveBlog_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}
	
	/* Live tv text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/liveTV")
	private AndroidElement txtLiveTv;

	/* Chunk text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvBookmarkTitle']")
	private List<AndroidElement> txtChunks;

	/* Blog text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvBookmarkTitle']")
	private AndroidElement txtBlog;

	/* Live Blog Date text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvVideoTitle")
	private AndroidElement txtLiveBlogVdoTitle;


	/**
	 * Description: Method to Click on Live blog widget.
	 * 
	 * @author Sreelatha
	 * 
	 */
	public synchronized void clkOnLiveBlgTv() {
		try {
			MobileActionUtil.clickOnElement(txtLiveTv, "Live blog widget");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Live blog widget");
			Assert.fail("Unable to perform action on Live blog widget");
		}
	}

/**
	 * Description: Method to validate Number of chunks.
	 * 
	 * @author Sreelatha
	 */

	public synchronized void validateNumberOfChunks() {
		try {
			MobileActionUtil.scrollDown(3);
			MobileActionUtil.poll(4000);
			for (AndroidElement androidElement : txtChunks) {
				System.out.println(androidElement.getText());
			}
			MobileActionUtil.scrollDown(1);
			MobileActionUtil.poll(3000);
			for (AndroidElement androidElement : txtChunks) {
				System.out.println(androidElement.getText());
			}

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Live tv layout");
			Assert.fail("Unable to validate Live tv layout");
		}
	}
/**
	 * Description:Method to Click on  Blog Description
	 * 
	 * @author Sreelatha
	 * 
	 */
	public synchronized void clkOnAnychunk() {
		try {
			MobileActionUtil.clickOnElement(txtBlog, "First blog description");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on First blog description");
			Assert.fail("Unable to perform action on First blog description");
		}
	}

/**
	 * Description:Method to Validate Live Blog Page Text
	 * 
	 * @author Sreelatha
	 * 
	 */
	public synchronized void validateliveBlogPageTxt() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtLiveBlogVdoTitle, "Live Blog page title text",
					"Live Blog page title text is displayed", "Live Blog page title text is not displayed", "green");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Live Blog page title text");
			Assert.fail("Unable to validate Live Blog page title text");
		}
	}
}
