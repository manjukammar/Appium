package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TermsAndConditions_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public TermsAndConditions_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Terms and conditions */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='India Today Group : TERMS AND CONDITIONS']")
	private AndroidElement txtTermsAndConditons;

	/**
	 * Description: Method to verify Terms and conditions.
	 * 
	 * @author Shivananda T S
	 */
	public synchronized void validateTermsAndConditions() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtTermsAndConditons, "Terms and conditions",
					"Able to validate Terms and conditions", "Unable to validate Terms and conditions", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Terms and conditions");
			Assert.fail("Unable to validate Terms and conditions");
		}
	}

	/**
	 * Description: Method to click on back Button
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkDeviceBackBtn() {
		try {
			MobileActionUtil.clickDeviceBackButton(1);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on back Arrow Button");
			Assert.fail("Unable to perform action on back Arrow Button");
		}
	}

}
