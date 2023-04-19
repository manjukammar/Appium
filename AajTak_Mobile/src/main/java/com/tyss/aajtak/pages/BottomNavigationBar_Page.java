package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * Description: This class has Method Implementation for Bottom Navigation Bar
 * Page.
 * 
 * @author Sreelatha
 */
public class BottomNavigationBar_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public BottomNavigationBar_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Bottom navigate bar */
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='in.AajTak.headlines:id/bottomNavigationView']")
	private AndroidElement tabBottomNavigateRoundCube;

	/* Badi Khabrein text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvHBITitle']")
	private AndroidElement txtBadiKhabrein;


	/* Bottom Circle Options tab */
	private AndroidElement tabBottomCircleOptions(String tabName) {
		String xpath = "//android.widget.FrameLayout[@content-desc='" + tabName + "']";
		return androidDriver.findElementByXPath(xpath);
	}

	/**
	 * Description: Method to click on Bottom circle fifth option.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkBottomCircleFifthOption() {
		try {
			MobileActionUtil.clickOnElement(tabBottomCircleOptions("पॉडकास्ट"), "Pod cast tab");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Pod cast Option");
			Assert.fail("Unable to perform action on Pod cast Option");
		}
	}

	/**
	 * Description: Method to validate Bottom circle fifth option(Pod cast).
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateBottomCircleFifthOption() {
		try {
			MobileActionUtil.isElementDisplayed(tabBottomCircleOptions("पॉडकास्ट"), "Pod cast tab");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Pod cast Option");
			Assert.fail("Unable to validate Pod cast Option");
		}
	}
	
	/**
	 * Description: Method to click on Bottom circle fourth option(Live TV).
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkBottomCircleFourthOption() {
		try {
			MobileActionUtil.clickOnElement(tabBottomCircleOptions("लाइव टीवी"), "Live TV tab");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform click action on Live TV tab option");
			Assert.fail("Unable to perform click action on Live TV tab option");
		}
	}

	/**
	 * Description: Method to validate Bottom circle fourth option.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateBottomCircleFourthOption() {
		try {
			MobileActionUtil.isElementDisplayed(tabBottomCircleOptions("लाइव टीवी"), "Live TV tab");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Live TV tab option");
			Assert.fail("Unable to validate Live TV tab option");
		}
	}

	
	/**
	 * Description: Method to validate Bottom circle third option.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateBottomCircleThirdOption() {
		try {
			MobileActionUtil.isElementDisplayed(tabBottomCircleOptions("वीडियो"), "Video tab");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Videos Option");
			Assert.fail("Unable to validate Videos Option");
		}
	}

	
	
	/**
	 * Description: Method to click on Video tab.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkVideoTab() {
		try {
			MobileActionUtil.clickOnElement(tabBottomCircleOptions("वीडियो"), "Video tab");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Video tab");
			Assert.fail("Unable to perform action on Video tab");
		}
	}
	
	/**
	 * Description: Method to click on Bottom circle second option.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkBottomCircleSecondOption() {
		try {
			MobileActionUtil.clickOnElement(tabBottomCircleOptions("न्यूज़ रील"), "News reels tab");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform click action on News reels tab Option");
			Assert.fail("Unable to perform click action on News reels tab Option");
		}
	}

	/**
	 * Description: Method to validate Bottom circle second option.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateBottomCircleSecondOption() {
		try {
			MobileActionUtil.isElementDisplayed(tabBottomCircleOptions("न्यूज़ रील"), "News Reels tab");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate News Reels tab Option");
			Assert.fail("Unable to validate News Reels tab Option");
		}
	}
	
	
	/**
	 * Description: Method to click on Home tab.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkBottomCircleFirstOption() {
		try {
			MobileActionUtil.clickOnElement(tabBottomCircleOptions("होम"), "Home tab");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform click action on Home tab Option");
			Assert.fail("Unable to perform click action on Home tab Option");
		}
	}
	
	/**
	 * Description: Method to validate Bottom circle first option.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateBottomCircleFirstOption() {
		try {
			MobileActionUtil.isElementDisplayed(tabBottomCircleOptions("होम"), "Home tab");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Home Option");
			Assert.fail("Unable to validate Home Option");
		}
	}


	/**
	 * Description: Method to validate Badi Khabrein.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateBadiKhabrein() {
		try {
			MobileActionUtil.isElementDisplayed(txtBadiKhabrein, "Badi Khabrein text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Badi Khabrein text");
			Assert.fail("Unable to validate Badi Khabrein text");
		}
	}

	/**
	 * Description: Method to click on Bottom navigate bar.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkBottomNavigateRoundCube() {
		try {
			MobileActionUtil.clickOnElement(tabBottomNavigateRoundCube, "Bottom navigate bar");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Bottom navigate bar");
			Assert.fail("Unable to click on Bottom navigate bar");
		}
	}

	/**
	 * Description: Method to Wait for Bottom navigate bar.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void waitTillBottomNavigateRoundCube() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(tabBottomNavigateRoundCube, "Bottom navigate bar");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to Wait for Bottom navigate bar");
			Assert.fail("Unable to Wait for Bottom navigate bar");
		}
	}

	/**
	 * Description: Method to validate Bottom navigate bar.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateBottomNavigateRoundCube() {
		try {
			MobileActionUtil.isElementDisplayed(tabBottomNavigateRoundCube, "Bottom navigate bar");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Bottom navigate bar");
			Assert.fail("Unable to validate Bottom navigate bar");
		}
	}

	/**
	 * Description: Method to validate Live TV.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateLiveTV() {
		try {
			MobileActionUtil.isElementDisplayed(tabBottomCircleOptions("लाइव टीवी"), "Live TV tab");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Live TV tab");
			Assert.fail("Unable to validate Live TV tab");
		}
	}
	
	/**
	 * Description: Method to turn off the connection
	 * 
	 * @author Sreelatha
	 */
	public synchronized void turnOffTheConnection() {
		try {
			MobileActionUtil.turnOffTheConnection();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to turn off the connection ");
			Assert.fail("Unable to turn off the connection ");
		}
	}

	/**
	 * Description: Method to turn on the connection
	 * 
	 * @author Sreelatha
	 */
	public synchronized void turnOnTheConnection() {
		try {
			MobileActionUtil.turnOnTheConnection();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to turn on the connection ");
			Assert.fail("Unable to turn on the connection ");
		}
	}


}
