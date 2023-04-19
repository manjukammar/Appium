package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
/**
 * Description: This class implements the locators and methods for Privacy policy page.
 * 
 * @author Mulage Abhishek
 * 
 */
public class PrivacyPolicy_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public PrivacyPolicy_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Privacy policy text */
	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.TextView[@text='प्राइवेसी पॉलिसी']")
	private AndroidElement txtPrivacyPolicy;


	/**
	 * Description: Method to validate privacy policy is displayed
	 * 
	 * @author Mulage Abhishek 
	 */
	public synchronized void validatePrivacyPolicyPage() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtPrivacyPolicy, "Privacy policy text"
					,"Privacy policy page is displayed","Privacy policy page is not displayed","green");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Privacy policy page is not displayed");
			Assert.fail("Privacy policy page is not displayed");
		}
	}


	/**
	 * Description: Method to click on back Button
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnBackBtn() {
		try {
			MobileActionUtil.clickDeviceBackButton(1);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on back Button");
			Assert.fail("Unable to perform action on back Button");
		}
	}


}
