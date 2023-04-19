package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
/**
 * 
 * 
 * Description:This class has Method Implementation for Notification Hub Page.
 * 
 * @author SreeLatha
 *
 */
public class NotificationHub_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public NotificationHub_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Notification hub title */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='नोटिफिकेशन हब']")
	private AndroidElement txtTitleInNotificationHub;

	/* Back arrow button */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/hamburgerIcon']")
	private AndroidElement btnBackArrow;

	/**
	 * Description: Method to validate Notification hub page.
	 * 
	 * @author SreeLatha
	 */
	public synchronized void validateNotificationHubPage() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtTitleInNotificationHub, "Notification hub title",
					"Notification hub page is displayed", "Notification hub page is not displayed", "green");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Notification hub page is not displayed");
			Assert.fail("Notification hub page is not displayed");
		}
	}

	/**
	 * Description: Method to click on Back Arrow button.
	 * 
	 * @author SreeLatha
	 */
	public synchronized void clkBackArrowBtn() {
		try {
			MobileActionUtil.clickOnElement(btnBackArrow, "Back Arrow button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on back arrow button");
			Assert.fail("Unable to click on back arrow button");
		}
	}

}
