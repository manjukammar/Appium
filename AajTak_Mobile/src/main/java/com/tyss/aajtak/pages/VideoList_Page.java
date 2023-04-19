package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * Description: This class has Method Implementation for Video List Page.
 * 
 * @author Sreelatha
 */
public class VideoList_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public VideoList_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Video title text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvFeaturedFirstVideoTitle")
	private AndroidElement txtVideoTitle;

	/* Video close button */
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='com.android.systemui:id/dismiss']")
	private AndroidElement btnVideoClose;

	/* Book mark icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tbBookMarkIcon")
	private AndroidElement icnBookmark;

	/* Download icon */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='डाउनलोड']")
	private AndroidElement icnDownload;

	/* Pause button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/exoPlayPauseButton")
	private AndroidElement btnPause;

	/* Start Time */
	@AndroidFindBy(id = "in.AajTak.headlines:id/exo_position")
	private AndroidElement lnkStartTime;

	/* End Time */
	@AndroidFindBy(id = "in.AajTak.headlines:id/exo_progress")
	private AndroidElement progressBarSlider;

	/**
	 * Description: Method to click on Book mark icon.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkOnBookMarkIcon() {
		try {
			MobileActionUtil.poll(2000);
			MobileActionUtil.clickOnElement(icnBookmark, "Bookmark icon");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform click action on Bookmark icon");
			Assert.fail("Unable to perform click action on Bookmark icon");
		}
	}

	/**
	 * Description: Method to Wait for Book mark icon.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void waitTillBookmarkIcon() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(icnBookmark, "Bookmark icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to Wait for Bookmark icon");
			Assert.fail("Unable to Wait for Bookmark icon");
		}
	}

	/**
	 * Description: Method to click on Video Close button.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkOnVideoCloseBtn() {
		try {
			MobileActionUtil.clickOnElement(btnVideoClose, "Video Close button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform click action on Video Close button");
			Assert.fail("Unable to perform click action on Video Close button");
		}
	}

	/**
	 * Description: Method to click on Video title.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkOnVideoTitle() {
		try {
			MobileActionUtil.clickOnElement(txtVideoTitle, "Video title");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform click action on Video title");
			Assert.fail("Unable to perform click action on Video title");
		}
	}

	/**
	 * Description: Method to Wait for Video title.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void waitTillVideoTitle() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(txtVideoTitle, "Video title");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to Wait for Video title");
			Assert.fail("Unable to Wait for Video title");
		}
	}

	/**
	 * Description: Method to Wait for Download icon.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void waitTillDownloadIcon() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(icnDownload, "Download icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to Wait for Download icon");
			Assert.fail("Unable to Wait for Download icon");
		}
	}

	/**
	 * Description:Method to get text of Video title.
	 * 
	 * @author Sreelatha
	 * @return VideoTitle
	 * 
	 */
	public synchronized String getVideoTitle() {
		String VideoTitle = null;
		try {
			VideoTitle = txtVideoTitle.getText();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to get text of Video title");
			Assert.fail("Unable to get text of Video title");
		}
		return VideoTitle;
	}

	/**
	 * Description:Method to click Device back button
	 * 
	 * @author Sreelatha
	 * @param numberOfTimes
	 * 
	 */
	public synchronized void clkDeviceBackButton(int numberOfTimes) {
		try {
			MobileActionUtil.clickDeviceBackButton(numberOfTimes);

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform click action on Device back button");
			Assert.fail("Unable to perform click action on Device back button");
		}
	}

	/**
	 * Description:Method to click Device back button
	 * 
	 * @author Sreelatha
	 * 
	 */
	public synchronized void clkBackBtn() {
		try {
			MobileActionUtil.clickDeviceBackButton(1);

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on back button");
			Assert.fail("Unable to click on back button");
		}
	}

	/**
	 * Description:Method to close the video
	 * 
	 * @author Sreelatha
	 * 
	 */
	public synchronized void closeTheVideoPlayer() {
		try {
			MobileActionUtil.poll(5000);
			MobileActionUtil.closeVideo();
			MobileActionUtil.info("Closed the Video");
			MobileActionUtil.extentinfo("Closed the Video");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to close the Video");
			Assert.fail("Unable to close the Video");
		}
	}

	/**
	 * Description:Method to Long press and slide the Video progress bar
	 * 
	 * @author Manikandan A,Mulage Abhishek
	 * 
	 */
	public synchronized void longPressandSlideVideoPlayer() {
		try {

			MobileActionUtil.poll(30000);
			MobileActionUtil.clickOnElementUsingCoordinates(524, 759);
			try {
				if (btnPause.isDisplayed()) {
					MobileActionUtil.clickOnElement(btnPause, "Pause button");
					String startTime = lnkStartTime.getText();
					MobileActionUtil.info("Video start time: " + startTime);
					MobileActionUtil.extentinfo("Video start time: " + startTime);
					int x = progressBarSlider.getLocation().getX();
					int y = progressBarSlider.getLocation().getY();
					MobileActionUtil.clickOnElementUsingCoordinates(x + 50, y);

					String endTime = lnkStartTime.getText();
					MobileActionUtil.info(
							"Navigated progress bar from start time: " + startTime + "to Seeked time: " + endTime);
					MobileActionUtil.extentinfo(
							"Navigated progress bar from start time: " + startTime + "to Seeked time: " + endTime);

				}
			} catch (Exception e) {
				MobileActionUtil.info("Pause Button is not displayed");
			}

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Video Player");
			Assert.fail("Unable to perform action on Video Player");
		}
	}
}
