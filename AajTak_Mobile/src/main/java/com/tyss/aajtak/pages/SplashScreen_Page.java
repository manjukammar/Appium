package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * Description: This class has Method Implementation for Hamburger Menu Page.
 * 
 * @author Sreelatha
 */
public class SplashScreen_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public SplashScreen_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* splash Image */
	@AndroidFindBy(id = "in.AajTak.headlines:id/imageView2")
	private AndroidElement splashImage;

	/* App Icon Image */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Aaj Tak']")
	private AndroidElement icnApp;

	/**
	 * Description: Method to validate splash Image
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateSplashImage() {
		try {
			MobileActionUtil.validateisElementDisplayed(splashImage, "Splash Image", "Splash Image is displayed",
					"Splash Image is not displayed", "blue");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Splash Image");
			Assert.fail("Unable to validate Splash Image");
		}
	}

	/**
	 * Description: Method to validate app icon in Menu
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateAppIcon() {
		try {

			MobileActionUtil.validateisElementDisplayed(icnApp, "App Icon", "App Icon is displayed in Menu page",
					"App Icon is not displayed in Menu page", "blue");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate App Icon in the device");
			Assert.fail("Unable to validate App Icon in the device");
		}
	}
	
	/**
	 * Description: Method to validate app icon in Menu
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateAppIconInMenu() {
		try {

			MobileActionUtil.scrollDown(1);
			MobileActionUtil.validateisElementDisplayed(icnApp, "App Icon", "App Icon is displayed in Menu page",
					"App Icon is not displayed in Menu page", "blue");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate App Icon in the device");
			Assert.fail("Unable to validate App Icon in the device");
		}
	}
	
	

	/**
	 * Description: Method to validate app icon in Menu
	 * 
	 * @author Sreelatha
	 */
	public synchronized void tapAppIconInMenu() {
		try {

			MobileActionUtil.clickOnElement(icnApp, "App Icon");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on App Icon");
			Assert.fail("Unable to perform action on App Icon");
		}
	}

}
