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
 * Description:This class has Method Implementation for Logout Page.
 * 
 * @author Abhishek
 *
 */
public class Logout_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public Logout_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Logout button */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvSignOut']")
	private AndroidElement btnLogout;

	/* Logout button */
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	private AndroidElement btnLogoutTap;

	/* Alert Message */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private AndroidElement txtAlertMessageOnSignout;



	/**
	 * Description: Method to verify alert message displayed.
	 * 
	 * @author Abhishek
	 */
	public synchronized void verifyAlertMessageOnSignout() {
		try {
			MobileActionUtil.waitForElement(txtAlertMessageOnSignout, "Alert message text");

			if (txtAlertMessageOnSignout.isDisplayed()) {
				MobileActionUtil.info("SignOut alert message is displayed");
			}
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate SignOut Alert message text");
			Assert.fail("Unable to validate SignOut Alert message text");
		}
	}


	/**
	 * Description: Method to Verify Sign out button is displayed.
	 * 
	 * @author Sushmita P H
	 */
	public synchronized void verifySignOutButton() {
		try {
			MobileActionUtil.waitForElement(btnLogout, "Sign Out button");
			if (btnLogout.isDisplayed()) {
				MobileActionUtil.info("Sign out button is displayed");
			}
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Sign out button");
			Assert.fail("Unable to validate Sign out button");
		}
	}


	/**
	 * Description: Method to click on logout Tap
	 * 
	 * @author Abhishek
	 */
	public synchronized void clkLogoutTapBtn() {
		try {
			MobileActionUtil.clickOnElement(btnLogoutTap, "logout Tap button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on logout Tap");
			Assert.fail("Unable to click on logout Tap");
		}
	}

	
	/**
	 * Description: Method to click on Sign Out
	 * 
	 * @author Sanjay
	 */
	public synchronized void clkSignOutBtn() {
		try {
			MobileActionUtil.clickOnElement(btnLogout, "Sign Out");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Sign Out button");
			Assert.fail("Unable to click on Sign Out button");
		}
	}
}
