
package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * Description: This class implements the locators and methods for HomeScreen Section
 * Page.
 * 
 * @author Sreelatha
 */

public class HomeScreenSection_Page {
	
	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public HomeScreenSection_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}
	
	/*Bharath Section Copy text*/
	@AndroidFindBy(xpath="//android.widget.TextView[@text='भारत']")
	private AndroidElement txtBharathsectioncopy;
	
	/**
	 * Description: Method to validate Bharat Section Copy text
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validatebharathsectioncopy() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtBharathsectioncopy, "Bharath Section Copy text", "Bharath Section Copy text is displayed", "Bharath Section Copy text is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Bharath Section Copy text");
			Assert.fail("Unable to validate Bharath Section Copy text");
		}
	}

	
	/**
	 * Description:Method to click on Device back button 
	 * 
	 * @author Sreelatha
	 * 
	 */
	public synchronized void clkBackbtn() {
		try {
			MobileActionUtil.clickDeviceBackButton(1);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Back button");
			Assert.fail("Unable to perform action on Back button");
		}
	}
	
	
}
