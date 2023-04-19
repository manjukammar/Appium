package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class VideoDetail_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public VideoDetail_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Video toolbar title text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/toolbar")
	private AndroidElement txtVideoToolbarTitle;

	/**
	 * Description: Method to verify Video toolbar title.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void validateVideoToolbarTitle() {
		try {
			MobileActionUtil.poll(1000);
			MobileActionUtil.validateisElementDisplayed(txtVideoToolbarTitle, "Video toolbar title",
					"Able to validate Video toolbar title", "Unable to validate Video toolbar title", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Video toolbar title");
			Assert.fail("Unable to validate Video toolbar title");
		}
	}

	/**
	 * Description:Method to click Device back button
	 * 
	 * @author:Shiavananda T S
	 * @param numberOfTimes
	 * 
	 */
	public synchronized void clkDeviceBackButton(int numberOfTimes) {
		try {
			MobileActionUtil.clickDeviceBackButton(numberOfTimes);

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Hamburger menu is not visible");
			Assert.fail("Hamburger menu is not visible");
		}
	}
}
