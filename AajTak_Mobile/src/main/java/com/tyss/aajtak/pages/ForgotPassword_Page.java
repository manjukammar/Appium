package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
/**
 * Description: This class has Method Implementation for Forgot Password Page.
 * 
 * @author Sreelatha
 */
public class ForgotPassword_Page {
	
	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public ForgotPassword_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Forgot Password text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/toolbar")
	private AndroidElement txtForgotPassword;
	
	/**
	 * Description: Method to validate Forgot password Page.
	 * 
	 * @author Sreelatha 
	 */
	public synchronized void validateForgotPasswordPage() {
		try {
			MobileActionUtil.isElementDisplayed(txtForgotPassword, "Forgot password text");
			} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Forgot password page");
			Assert.fail("Unable to validate Forgot password page");
		}
	}	

}
