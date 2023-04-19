package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
/**
 * Description: This class has Method Implementation for ClearApp Memory Page.
 * 
 * @author Ramya R
 */
public class ClearAppMemory_Page {
	
	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public ClearAppMemory_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}
	
	/* Sabhi Saf Karen Options text */
	private AndroidElement txtSabhiSafKarenOptions(String tabName) {
		String xpath = "//android.widget.Button[@text='"+tabName+"']";
		return androidDriver.findElementByXPath(xpath);
	}
	
	/* Alert message */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private AndroidElement txtAlertMessage;
	
	/**
	 * Description: Method to validate Alert message.
	 * 
	 * @author Ramya R 
	 */
	public synchronized void validateAlertMessage() {
		try {
			MobileActionUtil.isElementDisplayed(txtAlertMessage, "Alert message");
			} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Alert message");
			Assert.fail("Unable to validate Alert message");
		}
	}

	
	/**
	 * Description: Method to click on Nahi text .
	 * 
	 * @author Ramya R 
	 */
	public synchronized void clkNahiOption() {
		try {
			MobileActionUtil.clickOnElement(txtSabhiSafKarenOptions("नहीं"), "Nahi text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Nahi option ");
			Assert.fail("Unable to click on Nahi option ");
		}
	}
	
	/**
	 * Description: Method to click on Haan text.
	 * 
	 * @author Ramya R 
	 */
	public synchronized void clkHaanOption() {
		try {
			MobileActionUtil.clickOnElement(txtSabhiSafKarenOptions("हां"), "Haan text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Haan text");
			Assert.fail("Unable to click on Haan text");
		}
	}
	
	
	/**
	 * Description: Method to click on back Button
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkBackArrowBtn() {
		try {
			MobileActionUtil.clickDeviceBackButton(1);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Device back Button");
			Assert.fail("Unable to click on Device back Button");
		}
	}
	
	
	
}
