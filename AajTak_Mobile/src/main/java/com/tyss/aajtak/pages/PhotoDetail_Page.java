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
 * Description:This class has Method Implementation for Photo detail Page.
 * 
 * @author Manikandan A
 *
 */
public class PhotoDetail_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public PhotoDetail_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Close Icon */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ivClose']")
	private AndroidElement icnClose;

	/* Bookmark Icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivBookmarkDetail")
	private AndroidElement bookmarkIcon;

	/* Photo gallery screen image */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ivPhotoAutoSlide']")
	private AndroidElement imgPhotoGalleryScreen;

	/* Photo description text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvPhotoCaption']")
	private AndroidElement txtPhotoDescription;

	/* Slide show icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivPlay")
	private AndroidElement icnSlideShow;

	/* Close gallery icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivClose")
	private AndroidElement icnCloseGallery;

	/* Next gallery button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivPhotoAutoSlide")
	private AndroidElement btnNextGalleryPlay;



	/**
	 * Description: Method to click on Close icon
	 * 
	 * @author Manikandan A
	 */
	public synchronized void clkCloseIcn() {
		try {
			MobileActionUtil.clickOnElement(icnClose, "Close icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click  on Close icon");
			Assert.fail("Unable to click  on Close icon");
		}
	}

	/**
	 * Description: Method to click on Book mark icon
	 * 
	 * @author Manikandan A
	 */
	public synchronized void clkOnBookmarkIcon() {
		try {
			MobileActionUtil.clickOnElement(bookmarkIcon, "Bookmark icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Bookmark icon");
			Assert.fail("Unable to click on Bookmark icon");
		}
	}


	/**
	 * Description: Method to Verify Next Gallery button .
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validateNextGalleryTab() {
		try {
			MobileActionUtil.validateisElementDisplayed(btnNextGalleryPlay, "Next gallery play button",
					"Next gallery play button is displayed", "Next gallery play button is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate next gallery play button");
			Assert.fail("Unable to validate next gallery play button");
		}
	}

	/**
	 * Description: Method to click on Slide show icon
	 * 
	 * @author Manikandan A
	 */
	public synchronized void clkSlideShowPlayIcon() {
		try {
			MobileActionUtil.clickOnElement(icnSlideShow, "Play Slide Show");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Play slide show Icon");
			Assert.fail("Unable to click on Play slide show Icon");
		}
	}
	
	/**
	 * Description: Method to click on Slide show pause icon
	 * 
	 * @author Manikandan A
	 */
	public synchronized void clkSlideShowPauseIcon() {
		try {
			MobileActionUtil.clickOnElement(icnSlideShow, "Pause Slide Show");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Pause Slide show Icon");
			Assert.fail("Unable to click on Pause Slide show Icon");
		}
	}


	/**
	 * Description: Method to validate Photo description text is displayed.
	 * 
	 * @author Manikandan A
	 */
	public synchronized void validatePhotoDescriptionText() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtPhotoDescription, "Photo description text",
					"Photo description text is displayed", "Photo description text is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Photo description text is not displayed");
			Assert.fail("Photo description text is not displayed");
		}
	}

	/**
	 * Description: Method to validate Photo gallery screen is displayed.
	 * 
	 * @author Manikandan A
	 */
	public synchronized void validatePhotoGalleryScreen() {
		try {
			MobileActionUtil.validateisElementDisplayed(imgPhotoGalleryScreen, "Photo gallery screen",
					"Photo gallery screen is displayed", "Photo gallery screen is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Photo gallery screen is not displayed");
			Assert.fail("Photo gallery screen is not displayed");
		}
	}


	/**
	 * Description: Method to click on Photo gallery screen.
	 * 
	 * @author Manikandan A
	 */
	public synchronized void clkOnPhotoGalleryScreen() {
		try {
			MobileActionUtil.clickOnElement(imgPhotoGalleryScreen, "Photo gallery");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Photo gallery screen");
			Assert.fail("Unable to click on Photo gallery screen");
		}
	}


	/**
	 * Description: Method to click on Close gallery icon
	 * 
	 * @author Manikandan A
	 */
	public synchronized void clkcloseGalleryIcon() {
		try {
			MobileActionUtil.clickOnElement(icnCloseGallery, "Close gallery icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Close gallery icon");
			Assert.fail("Unable to click on Close gallery icon");
		}
	}
	
	/**
	 * Description: Method to zoomin and zoomout the photo.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void zoomPhoto() {
		try {
			MobileActionUtil.zoomin();
			MobileActionUtil.poll(2000);
			MobileActionUtil.zoomout();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform zoom action on Photo");
			Assert.fail("Unable to perform zoom action on Photo");
		}
	}

	
}
