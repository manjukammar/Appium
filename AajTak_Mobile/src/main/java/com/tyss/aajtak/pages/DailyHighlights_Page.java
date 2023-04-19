package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * Description: This class has Method Implementation for Daily Highlights Page.
 * 
 * @author Ramya R
 */
public class DailyHighlights_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public DailyHighlights_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* More Options text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/moreOptions")
	private AndroidElement txtMoreOptions;

	/* Close button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/iv_newswrap_close")
	private AndroidElement btnClose;

	/* Swipe Up button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/iv_swipe")
	private AndroidElement btnSwipeup;

	/* Daily high lights text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='डेली हाइलाइट�?स']")
	private AndroidElement txtDailyHighlights;

	/* News wrap count text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_newswrap_count")
	private AndroidElement txtNewsWrapCount;

	/* News wrap title text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_title")
	private AndroidElement txtNewsWrapTitle;

	/**
	 * Description: Method to Wait for News wrap title.
	 * 
	 * @author Ramya R
	 */
	public synchronized void waitForNewswraptitle() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(txtNewsWrapTitle, "News wrap title text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to Wait for News wrap title text");
			Assert.fail("Unable to Wait for News wrap title text");
		}
	}

	/**
	 * Description: Method to Wait for News wrap count.
	 * 
	 * @author Ramya R
	 */
	public synchronized void waitForNewswrapCount() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(txtNewsWrapCount, "News wrap count text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to Wait for News wrap count text");
			Assert.fail("Unable to Wait for News wrap count text");
		}
	}

	/**
	 * Description: Method to validate News wrap count.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateNewswrapCount() {
		try {
			MobileActionUtil.isElementDisplayed(txtNewsWrapCount, "News wrap count text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate News wrap count text");
			Assert.fail("Unable to validate News wrap count text");
		}
	}

	/**
	 * Description: Method to validate Daily high lights.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateDailyHighlightsPage() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtDailyHighlights, "Daily Highlights text",
					"Daily Highlights page is displayed", "Daily Highlights page is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Daily Highlights page is not displayed");
			Assert.fail("Daily Highlights page is not displayed");
		}
	}

	/**
	 * Description: Method to click on Swipe Up.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkSwipeUpBtn() {
		try {
			MobileActionUtil.clickOnElement(btnSwipeup, "Swipe Up button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Swipe Up button");
			Assert.fail("Unable to click on Swipe Up button");
		}
	}

	/**
	 * Description: Method to click on Close button.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkCloseBtn() {
		try {
			MobileActionUtil.clickOnElement(btnClose, "Close button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Close button");
			Assert.fail("Unable to click on Close button");
		}
	}

	/**
	 * Description: Method to validate Close button.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateCloseBtn() {
		try {
			MobileActionUtil.isElementDisplayed(btnClose, "Close button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Close button");
			Assert.fail("Unable to validate Close button");
		}
	}

	/**
	 * Description: Method to Wait for More option text.
	 * 
	 * @author Ramya R
	 */
	public synchronized void waitForMoreOption() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(txtMoreOptions, "More option text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to Wait for More option text ");
			Assert.fail("Unable to Wait for More option text ");
		}
	}

	/**
	 * Description: Method to click for More option text.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clickMoreOption() {
		try {
			MobileActionUtil.clickOnElement(txtMoreOptions, "More option text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click for More option text ");
			Assert.fail("Unable to Wait for click option text ");
		}
	}
}
