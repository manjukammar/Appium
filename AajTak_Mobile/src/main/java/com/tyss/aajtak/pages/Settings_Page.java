package com.tyss.aajtak.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * Description: This class implements the locators and methods for Settings
 * page.
 * 
 * @author Mulage Abhishek
 * 
 */
public class Settings_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public Settings_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Settings title text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tbText']")
	private AndroidElement txtSettingsPageTitle;

	/* Video auto play toggle on */
	@AndroidFindBy(xpath = "//android.widget.Switch[@resource-id='in.AajTak.headlines:id/switchItem' and @text='ON']")
	private AndroidElement videoAutoPlayToggleOn;

	/* App memory clear karen text */
	private AndroidElement txtAppMemoryClearKaren(String appMemoryClearKaren) {
		String xpath ="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvSettingsItem' and @text='"+appMemoryClearKaren+"']";
		return androidDriver.findElement(By.xpath(xpath));
	};

	/* App share karen text */
	private AndroidElement txtAppShareKaren(String appShareKaren) {
		String xpath ="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvSettingsItem' and @text='"+appShareKaren+"']";
		return androidDriver.findElement(By.xpath(xpath));
	};

	/* Feed back text */
	private AndroidElement txtFeedBack(String feedback) {
		String xpath ="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvSettingsItem' and @text='"+feedback+"']";
		return androidDriver.findElement(By.xpath(xpath));
	};

	/* App version text */
	private AndroidElement txtAppVersion(String appVersion) {
		String xpath ="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvSettingsItem' and @text='"+appVersion+"']";
		return androidDriver.findElement(By.xpath(xpath));
	};

	/* Privacy policy text */
	private AndroidElement txtPrivacyPolicy(String privacyPolicy) {
		String xpath ="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvSettingsItem' and @text='"+privacyPolicy+"']";
		return androidDriver.findElement(By.xpath(xpath));
	};

	/* Seva ki sharte text */
	private AndroidElement txtSevaKiSharte(String sevaKiSharte) {
		String xpath ="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvSettingsItem' and @text='"+sevaKiSharte+"']";
		return androidDriver.findElement(By.xpath(xpath));
	};

	/* App rating karen text */
		private AndroidElement txtAppRatingKaren(String appRatingKaren) {
		String xpath ="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvSettingsItem' and @text='"+appRatingKaren+"']";
		return androidDriver.findElement(By.xpath(xpath));
	};

	/* Notification text */
		private AndroidElement txtNotification(String notification) {
		String xpath ="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvSettingsItem' and @text='"+notification+"']";
		return androidDriver.findElement(By.xpath(xpath));
	};	
	
	/* Image download karen text */
	private AndroidElement txtImageDownloadKaren(String imageDownloadKaren) {
		String xpath ="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvSettingsItem' and @text='"+imageDownloadKaren+"']";
		return androidDriver.findElement(By.xpath(xpath));
	};	

	/* Customize section text */
	private AndroidElement txtCustomizeSection(String customizeSection) {
		String xpath ="//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvSettingsItem' and @text='"+customizeSection+"']";
		return androidDriver.findElement(By.xpath(xpath));
	};	

	/* Back arrow button */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/tbBackArrow']")
	private AndroidElement btnBackArrow;

	/* Settings verification title text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tbText' and @text='सेटिंग्स']")
	private AndroidElement txtSettingsVerificationTitle;

	/**
	 * Description:Method to click on Device back button
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkBackButton(int noOfTimes) {
		try {
			MobileActionUtil.clickDeviceBackButton(noOfTimes);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Back button");
			Assert.fail("Unable to perform action on Back button");
		}
	}

	/**
	 * Description: Method to click on App memory clear karen text
	 * 
	 * @author Abhishek
	 */
	public synchronized void clkOnAppMemoryClearKarenTxt() {
		try {
			MobileActionUtil.clickOnElement(txtAppMemoryClearKaren("ऐप मेमोरी क्लियर करें"), "App memory clear karen text ");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on App memory clear karen text  ");
			Assert.fail("Unable to perform action on App memory clear karen text  ");
		}
	}

	/**
	 * Description: Method to click on App share karen text
	 * 
	 * @author Abhishek
	 */
	public synchronized void clkOnAppShareKarenTxt() {
		try {
			MobileActionUtil.clickOnElement(txtAppShareKaren("ऐप शेयर करें"), "App share karen text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on App share karen text");
			Assert.fail("Unable to perform action on App share karen text");
		}
	}

	/**
	 * Description: Method to click on Back arrow button
	 * 
	 * @author Abhishek
	 */
	public synchronized void clkOnBackArrowButton() {
		try {
			MobileActionUtil.clickOnElement(btnBackArrow, "Back arrow button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Back arrow button ");
			Assert.fail("Unable to perform action on Back arrow button ");
		}
	}

	/**
	 * Description: Method to click on Customize section text
	 * 
	 * @author Abhishek
	 */
	public synchronized void clkOnCustomizeSectionTxt() {
		try {
			MobileActionUtil.clickOnElement(txtCustomizeSection("दोस्तों को आमंत्रित करें"), "Customize section text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Customize section text");
			Assert.fail("Unable to perform action on Customize section text");
		}
	}

	/**
	 * Description: Method to click on Privacy policy text
	 * 
	 * @author Abhishek
	 */
	public synchronized void clkOnPrivacyPolicyTxt() {
		try {
			MobileActionUtil.clickOnElement(txtPrivacyPolicy("प्राइवेसी पॉलिसी"), "Privacy policy text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Privacy policy text");
			Assert.fail("Unable to perform action on Privacy policy text");
		}
	}

	/**
	 * Description: Method to click on Seva ki sharte text
	 * 
	 * @author Abhishek
	 */
	public synchronized void clkOnSevaKiSharteTxt() {
		try {
			MobileActionUtil.clickOnElement(txtSevaKiSharte("सेवा की शर्तें"), "Seva ki sharte text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Seva ki sharte text");
			Assert.fail("Unable to perform action on Seva ki sharte text");
		}
	}

	/**
	 * Description: Method to validate Settings page title text
	 * 
	 * @author Abhishek
	 */
	public synchronized void validateSettingsPageTitleTxt() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtSettingsPageTitle, "Settings page title text",
					"Settings page title text is displayed", "Settings page title text is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Settings page title text is not displayed");
			Assert.fail("Settings page title text is not displayed");
		}
	}

	/**
	 * Description: Method to validate App memory clear karen text
	 * 
	 * @author Abhishek
	 */
	public synchronized void validateAppMemoryClearKarenTxt() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtAppMemoryClearKaren("ऐप मेमोरी क्लियर करें"), "App memory clear karen text",
					"App memory clear karen text is displayed", "App memory clear karen text is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("App memory clear karen text is not displayed");
			Assert.fail("App memory clear karen text is not displayed");
		}
	}

	/**
	 * Description: Method to validate App rating karen text
	 * 
	 * @author Abhishek
	 */
	public synchronized void validateAppRatingKarenTxt() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtAppRatingKaren("ऐप को रेटिंग दें"), "App rating karen text",
					"App rating karen text is displayed", "App rating karen text is displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("App rating karen text is displayed");
			Assert.fail("App rating karen text is displayed");
		}
	}

	/**
	 * Description: Method to validate Customize Section
	 * 
	 * @author Abhishek
	 */
	public synchronized void validateCustomizeSectionTxt() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtCustomizeSection("दोस्तों को आमंत्रित करें"), "Customize section text",
					"Customize section text is displayed", "Customize section text is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Customize section text is not displayed");
			Assert.fail("Customize section text is not displayed");
		}
	}

	/**
	 * Description: Method to validate Notification text
	 * 
	 * @author Abhishek
	 */
	public synchronized void validateNotificationTxt() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtNotification("नोटिफिकेशन"), "Notification text",
					"Notification text is displayed", "Notification text is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Notification text is not displayed");
			Assert.fail("Notification text is not displayed");
		}
	}

	/**
	 * Description: Method to validate Settings verification title text
	 * 
	 * @author Abhishek
	 */
	public synchronized void validateSettingsVerificationTitleTxt() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtSettingsVerificationTitle,
					"Settings verification title text", "Settings verification title text is displayed",
					"Settings verification title text is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Settings verification title text is not displayed");
			Assert.fail("Settings verification title text is not displayed");
		}
	}

	/**
	 * Description: Method to validate Seva ki sharte text
	 * 
	 * @author Abhishek
	 */
	public synchronized void validateSevaKiSharteTxt() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtSevaKiSharte("सेवा की शर्तें"), "Seva ki sharte text",
					"Seva ki sharte text is displayed", "Seva ki sharte text is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Seva ki sharte text is not displayed");
			Assert.fail("Seva ki sharte text is not displayed");
		}
	}

	/**
	 * Description: Method to validate Video auto play toggle on
	 * 
	 * @author Abhishek
	 */
	public synchronized void validateVideoAutoPlayToggleOn() {
		try {
			MobileActionUtil.validateisElementDisplayed(videoAutoPlayToggleOn, "Video auto play toggle on",
					"Video auto play toggle on is displayed", "Video auto play toggle on is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Video auto play toggle on is not displayed");
			Assert.fail("Video auto play toggle on is not displayed");
		}
	}

	/**
	 * Description: Method to Scroll to App Share Karen
	 * 
	 * @author Abhishek
	 */
	public synchronized void scrollToAppShareKaren() {
		try {
			MobileActionUtil.scrollToElement(txtAppShareKaren("ऐप शेयर करें"));
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to scroll to App share karen");
			Assert.fail("Unable to scroll to App Share Karen");
		}
	}

	/**
	 * Description: Method to Scroll to App Version
	 * 
	 * @author Abhishek
	 */
	public synchronized void scrollToAppVersion() {
		try {
			MobileActionUtil.scrollToElement(txtAppVersion("ऐप वर्जन"));
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to scroll to App Version");
			Assert.fail("Unable to scroll to App Version");
		}
	}

	/**
	 * Description: Method to Scroll to Seva Ki Sharte
	 * 
	 * @author Abhishek
	 */
	public synchronized void scrollToSevaKiSharte() {
		try {
			MobileActionUtil.scrollToElement(txtSevaKiSharte("सेवा की शर्तें"));
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to scroll to Seva Ki Sharte");
			Assert.fail("Unable to scroll to Seva Ki Sharte");
		}
	}

	/**************************************** 19-01-23 *************************/

	/**
	 * Description: Method to click on Image download karen text
	 * 
	 * @author SreeLatha
	 */
	public synchronized void clkOnImageDownloadKarenTxt() {
		try {
			MobileActionUtil.clickOnElement(txtImageDownloadKaren("इमेज डाउनलोड करें"), "Image download karen text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Image download karen text");
			Assert.fail("Unable to perform action on Image download karen text");
		}
	}

	/**
	 * Description: Method to validate Privacy policy text
	 * 
	 * @author SreeLatha
	 */
	public synchronized void validatePrivatePolicyTxt() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtPrivacyPolicy("प्राइवेसी पॉलिसी"), "Privacy policy text",
					"Privacy policy text is displayed", "Privacy policy text is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Privacy policy text is not displayed");
			Assert.fail("Privacy policy text is not displayed");
		}
	}

	/**
	 * Description: Method to click on Feedback tab
	 * 
	 * @author
	 */
	public synchronized void clkFeedbackTab() {
		try {
			MobileActionUtil.clickOnElement(txtFeedBack("फीडबैक"), "Feedback tab");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Feedback tab");
			Assert.fail("Unable to perform action on Feedback tab");
		}
	}

	/**
	 * Description: Method to validate Image download karen text.
	 * 
	 * @author SreeLatha
	 */
	public synchronized void validateImageDownloadKarenTxt() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtImageDownloadKaren("इमेज डाउनलोड करें"), "Image download karen text",
					"Image download karen text is displayed", "Image download karen text is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Image download karen text is not displayed");
			Assert.fail("Image download karen text is not displayed");
		}
	}

	/**
	 * Description: Method to validate Feedback tab
	 * 
	 * @author SreeLatha
	 */
	public synchronized void validateFeedBackTab() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtFeedBack("फीडबैक"), "Feedback tab", "Feedback tab is displayed",
					"Feedback tab is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Feedback tab is not displayed");
			Assert.fail("Feedback tab is not displayed");
		}
	}

	/**
	 * Description: Method to validate App share karen text
	 * 
	 * @author SreeLatha
	 */
	public synchronized void validateAppShareKarenTxt() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtAppShareKaren("ऐप शेयर करें"), "App share karen text",
					"App share karen text is displayed", "App share karen text is not displayed", "green");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("App share karen text is not displayed");
			Assert.fail("App share karen text is not displayed");
		}
	}

	/**
	 * Description: Method to validate App version tab
	 * 
	 * @author SreeLatha
	 */
	public synchronized void validateAppVersionTab() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtAppVersion("ऐप वर्जन"), "App version tab",
					"App version tab is displayed", "App version tab is not displayed", "green");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("App version tab is not displayed");
			Assert.fail("App version tab is not displayed");
		}
	}
}
