package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


/**
 * 
 * 
 * Description:This class has Method Implementation for ShuruKarienOnboarding Page.
 * 
 * @author Manjappa
 *
 */

public class ShuruKarienOnboarding_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public ShuruKarienOnboarding_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Aagebade button */
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"आगे बढ़ें\"]")
	private AndroidElement btnAageBado;

	/*Anya settings button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/button_settings")
	private AndroidElement btnAnyaSettings;

	/* AajTak home logo copy */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/hamburgerIcon']/following-sibling::android.widget.ImageView")
	private AndroidElement aajTakHomeLogo;

	/**
	 * Description:Method to Validate AajTak home logo or Home is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateAagebadoOrHomePageDisplayed() {
		try {

			MobileActionUtil.poll(3000);
			try {
				if (aajTakHomeLogo.isDisplayed()) {
					MobileActionUtil.validateisElementDisplayed(aajTakHomeLogo, "AajTak home logo ",
							"AajTak home logo is displayed ", "AajTak home logo is not displayed", "green");

				} else if (btnAageBado.isDisplayed()) {
					MobileActionUtil.validateisElementDisplayed(btnAageBado, "Aage Bado button",
							"Aage Bado button is displayed", "Aage Bado button is not displayed", "blue");
				}
			} catch (Exception e) {

			}

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("AajTak home logo  is not displayed");
			Assert.fail("AajTak home logo is not displayed");
		}
	}


	/**
	 * Description: Method to click on AageBado Button.
	 * 
	 * @author Manjappa
	 */
	public synchronized void clkAnyaSettingsBtn() {
		try {
			MobileActionUtil.clickOnElement(btnAnyaSettings, "Anya Settings Button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform click on Anya Settings Button");
			Assert.fail("Unable to perform click  on Anya Settings Button");
		}
	}

	/**
	 * Description: Method to validate Anya settings button.
	 * 
	 * @author Manjappa
	 */
	public synchronized void validateAnyaSettingsBtn() {
		try {
			MobileActionUtil.isElementDisplayed(btnAnyaSettings, "Anya Settings button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to  validate Anya Settings Button");
			Assert.fail("Unable to validate Anya Settings Button");
		}
	}

	/**
	 * Description: Method to click on AageBado Button.
	 * 
	 * @author Manjappa
	 */
	public synchronized void clkAageBadoBtn() {
		try {
			MobileActionUtil.clickOnElement(btnAageBado, "AageBado Button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click action on AageBado Button");
			Assert.fail("Unable to click action on AageBado Button");
		}
	}

	/**
	 * Description: Method to Verify AageBado button.
	 * 
	 * @author Manjappa
	 */
	public synchronized void validateAageBado() {
		try {
			MobileActionUtil.validateisElementDisplayed(btnAageBado, "Aage Bado button",
					"Aage Bado button is displayed", "Aage Bado button is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate AageBado button");
			Assert.fail("Unable to validate AageBado button");
		}
	}

	/**
	 * Description: Method to Verify AageBado button.
	 * 
	 * @author Manjappa
	 */
	public synchronized void validateAppLaunched() {
		try {
			MobileActionUtil.validateisElementDisplayed(btnAageBado, "Application", "Launched Application",
					"Application not Launched", "green");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Application Launched");
			Assert.fail("Unable to validate Application Launched");
		}
	}
}
