package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
/**
 * 
 * 
 * Description:This class has Method Implementation for Live Tv Widget Page.
 * 
 * @author Sushmita P H
 *
 */
public class LiveTvWidget_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public LiveTvWidget_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Live widget Icon */
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='लाइव टीवी']")
	private AndroidElement icnLiveTvWidget;

	/* First Video text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvVideoTitle")
	private AndroidElement txtFirstVideo;
	
	/* karyakaram link */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='कार्यक्रम']")
	private AndroidElement txtKaryakaram;
	
	/* Ant Button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/moreOptions")
	private AndroidElement btnAnt;
	
	/* Download icon */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='डाउनलोड']")
	private AndroidElement icnDownload;

	/* First Story Black and White Image */
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ivProgramList'])[1]")
	private AndroidElement imgFirstStoryBlackAndWhite;

	/* Live Tv Share Icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivLiveTvShare")
	private AndroidElement icnLivetvShare;

	/* Mute Icon */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/volumeMute']")
	private AndroidElement icnMute;

	/* Live Tv Text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvLiveTv")
	private AndroidElement txtLiveTv;

	/* Live tv Image */
	@AndroidFindBy(id = "in.AajTak.headlines:id/clVisibilityChanger")
	private AndroidElement imgLiveTv;


	/**
	 * Description:Method to Click on First Story Black and White
	 * 
	 * @author Sushmita P H
	 * 
	 */
	public synchronized void clkFirstStoryBlackAndWhiteImg() {
		try {
			MobileActionUtil.clickOnElement(imgFirstStoryBlackAndWhite, "First Story Black and White image");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on First Story Black and White image");
			Assert.fail("Unable to perform action on First Story Black and White image");
		}
	}

	/**
	 * Description:Method to Click on Live Tv Share
	 * 
	 * @author Sushmita P H
	 * 
	 */
	public synchronized void clkLiveTvShareIcn() {
		try {
			MobileActionUtil.clickOnElement(icnLivetvShare, "Live Tv Share icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Live Tv Share icon");
			Assert.fail("Unable to perform action on Live Tv Share icon");
		}
	}

	/**
	 * Description:Method to Click on Live Tv Widget icon
	 * 
	 * @author Sushmita P H
	 * 
	 */
	public synchronized void clkLiveTvWidgetIcn() {
		try {
			MobileActionUtil.clickOnElement(icnLiveTvWidget, "Live Tv Widget icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Live Tv Widget icon");
			Assert.fail("Unable to perform action on Live Tv Widget icon");
		}
	}

	/**
	 * Description:Method to Wait for the Mute Icon
	 * 
	 * @author Sushmita P H
	 * 
	 */
	public synchronized void waitForMuteIcn() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(icnMute, "Mute icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to wait for the Mute icon");
			Assert.fail("Unable to wait for the Mute icon");
		}
	}

	/**
	 * Description:Method to Click on Mute Icon
	 * 
	 * @author Sushmita P H
	 * 
	 */
	public synchronized void clkOnMuteIcn() {
		try {
			MobileActionUtil.clickOnElement(icnMute, "Mute icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Mute icon");
			Assert.fail("Unable to perform action on Mute icon");
		}
	}

	/**
	 * Description: Method to verify Live tv text.
	 * 
	 * @author Sushmita P H
	 */
	public synchronized void validateLiveTv() {
		try {
			MobileActionUtil.waitForElement(txtLiveTv, "Live Tv text");
			MobileActionUtil.validateisElementDisplayed(txtLiveTv, "Live Tv text", "Live tv text is displayed",
					"Live tv text is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Live tv cropped text");
			Assert.fail("Unable to validate Live tv cropped text");
		}
	}

	/**
	 * Description: Method to verify Live tv image.
	 * 
	 * @author Sushmita P H
	 */
	public synchronized void validateLiveTvCropped() {
		try {
			MobileActionUtil.waitForElement(imgLiveTv, "Live Tv image");
			MobileActionUtil.validateisElementDisplayed(imgLiveTv, "Live Tv image", "Live tv is displayed & it is not cropped",
					"Live tv is cropped", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Live tv image");
			Assert.fail("Unable to validate Live tv image");
		}
	}

	/**
	 * Description: Method to verify Mute icon.
	 * 
	 * @author Sushmita P H
	 */
	public synchronized void validateMuteIcon() {
		try {
			MobileActionUtil.validateisElementDisplayed(icnMute, "Mute icon", "Mute icon is displayed",
					"Mute icon is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Mute icon");
			Assert.fail("Unable to validate Mute icon");
		}
	}
	
	/**
	 * Description:Method to Tap on Screen.
	 * 
	 * @author Sushmita P H
	 * 
	 */
	public synchronized void tapOnScreen() {
		try {
			MobileActionUtil.clickOnElementUsingCoordinates(524 ,759 );
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Live tv image");
			Assert.fail("Unable to perform action on Live tv image");
		}
	}
	
	/**
	 * Description: Method to Click on first Video
	 * 
	 * @author Bredlin
	 */
	public synchronized void clkFirstVideoTitle() {
		try {

			MobileActionUtil.clickOnElement(txtFirstVideo, "First Video title");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on First Video title");
			Assert.fail("Unable to perform action on First Video title");
		}
	}

	
	/**
	 * Description: Method to Click on Karyakaram
	 * 
	 * @author Bredlin
	 */
	public synchronized void clkKaryakaramTxt() {
		try {

			MobileActionUtil.clickOnElement(txtKaryakaram, "Karyakaram");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Karyakaram");
			Assert.fail("Unable to perform action on Karyakaram");
		}
	}
	
	/**
	 * Description:Method to click on Ant button
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkAntButton() {
		try {
			
			MobileActionUtil.clickOnElement(btnAnt, "Ant button");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Ant button");
			Assert.fail("Unable to perform action on Ant button");
		}
	}


	/**
	 * Description: Method to click on Download Icon.
	 * 
	 * @author Bredlin
	 */
	public synchronized void clkDownloadIcn() {
		try {
			MobileActionUtil.clickOnElement(icnDownload, "Download Icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Download Icon");
			Assert.fail("Unable to perform action on Download Icon");
		}
	}
}
