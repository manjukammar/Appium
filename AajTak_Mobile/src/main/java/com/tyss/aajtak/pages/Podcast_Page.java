package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * Description: This class implements the locators and methods for Podcast Page.
 * 
 * @author Mulage Abhishek
 * 
 */

public class Podcast_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public Podcast_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Podcast text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='लेटेस्ट']")
	private AndroidElement txtPodcast;

	/* Aur padhe text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvPodcastDesc")
	private AndroidElement txtAurPade;

	/* Whatsapp share image */
	@AndroidFindBy(id = "in.AajTak.headlines:id/whatsappShare")
	private AndroidElement imgWhatsappShare;

	/* Podcast mini player */
	@AndroidFindBy(id = "in.AajTak.headlines:id/podcastPlayer")
	private AndroidElement miniPodcastPlayer;

	/* Mini Player Play Icon */
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/podcastPlayer']")
	private AndroidElement icnMiniPlayerPlay;
	
	/* Mini Player Backward Icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/sheet_skip_back_button")
	private AndroidElement icnMiniPlayerBackward;

	/* Mini Player Forward Icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/sheet_skip_forward_button")
	private AndroidElement icnMiniPlayerForward;

	/* Audio Start Duration Text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/sheet_time_played_view")
	private AndroidElement txtAudioStartDuration;

	/* Minimize Mini Player Podcast Page */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/iv_minimize_sheet']")
	private AndroidElement minimizeMiniPlayerPodcastPage;

	/* Audio End Duration */
	@AndroidFindBy(id = "in.AajTak.headlines:id/sheet_duration_view")
	private AndroidElement audioEndDuration;

	/* Aaj Tak Logo */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/hamburgerIcon']/following-sibling::android.widget.ImageView")
	private AndroidElement logoAajTak;

	/* Offline Note */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='à¤†à¤ª à¤…à¤­à¥€ à¤‘à¤«à¤²à¤¾à¤‡à¤¨ à¤¹à¥ˆà¤‚' and @index='1']")
	private AndroidElement OfflineNote;

	/* Mini Player Forward Icon */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/sheet_skip_forward_button']")
	private AndroidElement icnForward10Sec;

	/* Sticky Player Close Icon */
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='in.AajTak.headlines:id/stickyCloseButton']")
	private AndroidElement icnCloseInStickyPlayer;

	/* Sticky Player Play Pause Icon */
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='in.AajTak.headlines:id/stickyPlayPause']")
	private AndroidElement icnPlayPauseInStickyPlayer;

	/* Sticky Player Backward Icon */
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='in.AajTak.headlines:id/stickyBackward']")
	private AndroidElement icnStickyBackward;

	/* Sticky Player Forward Icon */
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='in.AajTak.headlines:id/stickyForward']")
	private AndroidElement icnStickyForward;

	/* Sticky Collapse Button */
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='in.AajTak.headlines:id/stickyCollapseButton']")
	private AndroidElement btnStickyCollapse;

	/* Sticky Mini Close Button */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Podcast miniplayer stop']")
	private AndroidElement btnStickyMiniClose;

	/* Sticky Mini Expand Button */
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='in.AajTak.headlines:id/stickyMiniExpandButton']")
	private AndroidElement btnStickyMiniExpand;

	/* Play Pause Icon */
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@resource-id='in.AajTak.headlines:id/ib_play_pause']")
	private AndroidElement icnPlayPauseInThumbnail;

	/* Aur Sune Link */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_see_more']")
	private AndroidElement lnkAurSune;

	/* Paanch Miniute Text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvCategoryTitle")
	private AndroidElement txtPaanchMiniute;

	/* Audio Listed */
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='in.AajTak.headlines:id/rvRelatedPodcast']")
	private AndroidElement audiolisted;

	/* Ye Bhee Sunie Text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_title_more")
	private AndroidElement yeBheeSunie;

	/* Podcast Content Description Text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_section_desc")
	private AndroidElement txtPodcastContentDescription;
	
	/* Mini Player Podcast Page */
	@AndroidFindBy(id = "in.AajTak.headlines:id/main_content_frame")
	private AndroidElement miniPlayerPodcastPage;

	/* First Podcast Title Text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvPodcastLandingTitle")
	private AndroidElement txtFirstPodcastTitle;

	/* Sticky Player arrow icon */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ivPodVerticalClose']")
	private AndroidElement icnStickyplayerClose;

	/* Sticky Player arrow icon */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ivPodVerticalHide']")
	private AndroidElement icnStickyplayerArrow;

	/* Podcast Tumblines text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvPodcastsubTitle']")
	private AndroidElement txtPodcastThumbNail;

	/* Down arrow icon */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/iv_minimize_sheet']")
	private AndroidElement icnDownArrow;

	/**
	 * Description: Method to click on down arrow.
	 * 
	 * @author Sanjay
	 */
	public synchronized void clkOnDownArrowIcn() {
		try {
			MobileActionUtil.clickOnElement(icnDownArrow, "Down arrow icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Down arrow icon");
			Assert.fail("Unable to click on Down arrow icon");
		}
	}
	
	

	/**
	 * Description:Method to click on Podcast Tumblines text
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkOnPodcastThumbnailsTxt() {
		try {

			MobileActionUtil.clickOnElement(txtPodcastThumbNail, "Podcast Tumblines text");
			MobileActionUtil.poll(10000);

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Podcast Tumblines text");
			Assert.fail("Unable to perform action on Podcast Tumblines text");
		}
	}
	
	/**
	 * Description: Method to click on Mini Player Play icon
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnMiniPlayerPlayIcn() {
		try {
			MobileActionUtil.clickOnElement(icnMiniPlayerPlay, "Mini Player Play icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Mini Player Play icon");
			Assert.fail("Unable to perform action on Mini Player Play icon");
		}
	}

	/**
	 * Description: Method to click on Mini Player Backward Icon
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnMiniPlayerBackwardIcn() {
		try {
			MobileActionUtil.clickOnElement(icnMiniPlayerBackward, "Mini Player Backward icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Mini Player Backward icon");
			Assert.fail("Unable to perform action on Mini Player Backward icon");
		}
	}

	/**
	 * Description: Method to click on Mini Player Forward Icon
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnMiniPlayerForwardIcn() {
		try {
			MobileActionUtil.clickOnElement(icnMiniPlayerForward, "Mini Player Forward icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Mini Player Forward icon");
			Assert.fail("Unable to perform action on Mini Player Forward icon");
		}
	}

	/**
	 * Description: Method to click on Audio Start Duration
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnAudioStartDuration() {
		try {
			MobileActionUtil.clickOnElement(txtAudioStartDuration, "Audio Start Duration");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Audio Start Duration");
			Assert.fail("Unable to perform action on Audio Start Duration");
		}
	}

	/**
	 * Description: Method to click on Audio End Duration
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnAudioEndDuration() {
		try {
			MobileActionUtil.clickOnElement(audioEndDuration, "Audio End Duration");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Audio End Duration");
			Assert.fail("Unable to perform action on Audio End Duration");
		}
	}

	/**
	 * Description: Method to click on Minimize Mini Player Podcast Page
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnMinimizeMiniPlayerPodcastPage() {
		try {
			MobileActionUtil.clickOnElement(minimizeMiniPlayerPodcastPage, "Minimize Mini Player Podcast Page");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Minimize Mini Player Podcast Page");
			Assert.fail("Unable to perform action on Minimize Mini Player Podcast Page");
		}
	}

	/**
	 * Description: Method to click on Offline Note
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnOfflineNote() {
		try {
			MobileActionUtil.clickOnElement(OfflineNote, "Offline Note");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Offline Note");
			Assert.fail("Unable to perform action on Offline Note");
		}
	}

	/**
	 * Description: Method to click on Forward 10sec
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnForward10sec() {
		try {
			MobileActionUtil.poll(8000);
			MobileActionUtil.clickOnElementUsingCoordinates(800, 1560);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Forward 10sec");
			Assert.fail("Unable to perform action on Forward 10sec");
		}
	}

	/**
	 * Description: Method to click on Close Icon In Sticky Player
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnCloseIconInStickyPlayer() {
		try {
			MobileActionUtil.clickOnElement(icnCloseInStickyPlayer, "Close Icon In Sticky Player");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Close Icon In Sticky Player");
			Assert.fail("Unable to perform action on Close Icon In Sticky Player");
		}
	}

	/**
	 * Description: Method to click on Play Pause icon in Sticky Player
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnPlayPauseInStickyPlayer() {
		try {
			MobileActionUtil.clickOnElement(icnPlayPauseInStickyPlayer, "Play Pause icon in Sticky Player");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Play Pause icon in Sticky Player");
			Assert.fail("Unable to perform action on Play Pause icon in Sticky Player");
		}
	}

	/**
	 * Description: Method to click on Sticky Backward icon
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnStickyBackwardIcn() {
		try {
			MobileActionUtil.clickOnElement(icnStickyBackward, "Sticky Backward icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Sticky Backward icon");
			Assert.fail("Unable to perform action on Sticky Backward icon");
		}
	}

	/**
	 * Description: Method to click on Sticky Forward Icon
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnStickyForwardIcn() {
		try {
			MobileActionUtil.clickOnElement(icnStickyForward, "Sticky Forward icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Sticky Forward icon");
			Assert.fail("Unable to perform action on Sticky Forward icon");
		}
	}

	/**
	 * Description: Method to click on Sticky Collapse button
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnStickyCollapseBtn() {
		try {
			MobileActionUtil.clickOnElement(btnStickyCollapse, "Sticky Collapse button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Sticky Collapse button");
			Assert.fail("Unable to perform action on Sticky Collapse button");
		}
	}

	/**
	 * Description: Method to click on Sticky Mini Close Button
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnStickyMiniCloseBtn() {
		try {
			MobileActionUtil.clickOnElement(btnStickyMiniClose, "Sticky Mini Close button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Sticky Mini Close button");
			Assert.fail("Unable to perform action on Sticky Mini Close button");
		}
	}

	/**
	 * Description: Method to click on Sticky Mini Expand Button
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnStickyMiniExpandBtn() {
		try {
			MobileActionUtil.clickOnElement(btnStickyMiniExpand, "Sticky Mini Expand button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Sticky Mini Expand button");
			Assert.fail("Unable to perform action on Sticky Mini Expand button");
		}
	}

	/**
	 * Description: Method to click on Play Pause icon in Thumbnail
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnPlayPauseIconInThumbnail() {
		try {
			MobileActionUtil.clickOnElement(icnPlayPauseInThumbnail, "Play Pause icon in Thumbnail");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Play Pause icon in Thumbnail");
			Assert.fail("Unable to perform action on Play Pause icon in Thumbnail");
		}
	}

	/**
	 * Description: Method to click on Aur Sune link
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnAurSune() {
		try {
			MobileActionUtil.clickOnElement(lnkAurSune, "Aur Sune link");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Aur Sune link");
			Assert.fail("Unable to perform action on Aur Sune link");
		}
	}

	/**
	 * Description: Method to click on Ye Bhee Sunie
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnYeBheeSunie() {
		try {
			MobileActionUtil.clickOnElement(yeBheeSunie, "Ye Bhee Sunie");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Ye Bhee Sunie");
			Assert.fail("Unable to perform action on Ye Bhee Sunie");
		}
	}

	/**
	 * Description: Method to validate Offline Note
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validateOfflineNote() {
		try {
			try {
				OfflineNote.isDisplayed();
				MobileActionUtil.info("Offline Note is displayed");
				MobileActionUtil.extentinfo("Offline Note is displayed");
			} catch (Exception e) {
				MobileActionUtil.info("Offline Note is not displayed");
				MobileActionUtil.extentinfo("Offline Note is not displayed");
			}
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Offline Note");
			Assert.fail("Unable to validate Offline Note");
		}
	}

	/**
	 * Description: Method to validate mini Player Play iIcon
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validateMiniPlayerPlayIcon() {
		try {
			MobileActionUtil.isElementDisplayed(icnMiniPlayerPlay, "mini Player Play icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate mini Player Play icon");
			Assert.fail("Unable to validate mini Player Play icon");
		}
	}

	/**
	 * Description: Method to validate Podcast Landing Page
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validatePodcastLandingPage() {
		try {
			MobileActionUtil.isElementDisplayed(txtPodcast, "Podcast text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Podcast Landing Page");
			Assert.fail("Unable to validate Podcast Landing Page");
		}
	}

	/**
	 * Description: Method to validate Paanch Miniute text
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validatePaanchMiniute() {
		try {
			MobileActionUtil.isElementDisplayed(txtPaanchMiniute, "Paanch Miniute text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Paanch Miniute text");
			Assert.fail("Unable to validate Paanch Miniute text");
		}
	}

	/**
	 * Description: Method to validate Podcast Content Description
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validatePodcastContentDescription() {
		try {
			MobileActionUtil.isElementDisplayed(txtPodcastContentDescription, "Podcast Content Description");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Podcast Content Description is displayed");
			Assert.fail("Unable to validate Podcast Content Description is displayed");
		}
	}

	/**
	 * Description: Method to validate audio listed
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validateAudioListed() {
		try {
			MobileActionUtil.isElementDisplayed(audiolisted, "Audio Listed");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Audio Listed is displayed");
			Assert.fail("Unable to validate Audio Listed is displayed");
		}
	}

	/**
	 * Description: Method to validate Mini Player Podcast Page
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validateMiniPlayerPodcastPage() {
		try {
			MobileActionUtil.isElementDisplayed(miniPlayerPodcastPage, "Mini Player Podcast Page");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Mini Player Podcast Page");
			Assert.fail("Unable to validate Mini Player Podcast Page");
		}
	}

	/**
	 * Description: Method to click on First Podcast Title
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnFirstPodcastTitle() {
		try {
			MobileActionUtil.clickOnElement(txtFirstPodcastTitle, "First Podcast Title text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on First Podcast Title text");
			Assert.fail("Unable to click on First Podcast Title text");
		}
	}

	/**
	 * Description: Method to click on Aaj Tak Logo
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnAajTakLogo() {
		try {
			MobileActionUtil.clickOnElement(logoAajTak, "Aaj Tak Logo");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Aaj Tak Logo");
			Assert.fail("Unable to perform action on Aaj Tak Logo");
		}
	}

	/**
	 * Description: Method to Scroll to Audio Listed
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void scrollToAudiolisted() {
		try {
			MobileActionUtil.scrollToElement(audiolisted);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to scroll to Audio Listed");
			Assert.fail("Unable to scroll to Audio Listed");
		}
	}

	/**
	 * Description: Method to Scroll to Aur Sune
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void scrollToAurSune() {
		try {
			MobileActionUtil.scrollToElement(lnkAurSune);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to scroll to Aur Sune");
			Assert.fail("Unable to scroll to Aur Sune");
		}
	}

	/**
	 * Description:Method to get text of Audio Start Duration Description
	 * 
	 * @author:Mulage Abhishek
	 * @return AudioStartDurationDesc
	 * 
	 */
	public synchronized String getAudioStartDurationDesc() {
		String AudioStartDurationDesc = null;
		try {
			AudioStartDurationDesc = txtAudioStartDuration.getText();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to fetch text of Audio Start Duration Description");
			Assert.fail("Unable to fetch text of Audio Start Duration Description");
		}
		return AudioStartDurationDesc;
	}

	/**
	 * Description:Method to fetch text of First Podcast Title text
	 * 
	 * @author:Mulage Abhishek
	 * @return AudioStartDurationDesc
	 * 
	 */
	public synchronized String getFirstPodcastTitleDesc() {
		String FirstPodcastTitleDesc = null;
		try {
			FirstPodcastTitleDesc = txtFirstPodcastTitle.getText();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to get text of First Podcast Title text");
			Assert.fail("Unable to get text of First Podcast Title text");
		}
		return FirstPodcastTitleDesc;
	}

	/**
	 * Description: Method to wait For Mini Player Play icon
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void waitForMiniPlayerPlayIcon() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(icnMiniPlayerPlay, "Mini Player Play icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Mini Player Play icon is not displayed");
			Assert.fail("Mini Player Play icon is not displayed");
		}
	}

	/**
	 * Description: Method to wait For Offline Note
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void waitForOfflineNote() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(OfflineNote, "Offline Note");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Offline Note is not displayed");
			Assert.fail("Offline Note is not displayed");
		}
	}

	/**
	 * Description: Method to click on Backward 10sec
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnBackward10sec() {
		try {
//			MobileActionUtil.clickOnElement(icnMiniPlayerBackward, "Backward 10sec");
			MobileActionUtil.clickOnElementUsingCoordinates(270, 1569);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Backward 10sec");
			Assert.fail("Unable to perform action on Backward 10sec");
		}
	}

	/**
	 * Description: Method to validate Forward 10sec is displayed.
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validateForward10sec() {
		try {
			MobileActionUtil.validateisElementDisplayed(icnForward10Sec, "Forward 10 sec",
					"Forward 10sec is displayed", "Forward 10sec is not displayed", "green");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Forward 10sec is not displayed");
			Assert.fail("Forward 10sec is not displayed");
		}
	}

	/**
	 * Description: Method to Backward 10 sec button is displayed
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validateBackward10sec() {
		try {
			MobileActionUtil.validateisElementDisplayed(icnMiniPlayerBackward, "Backward 10 sec button",
					"Backward 10 sec button is displayed", "Backward 10 sec button is displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Backward 10 sec button is displayed");
			Assert.fail("Backward 10 sec button is displayed");
		}
	}

	/**
	 * Description: Method to validate First Podcast Title text is displayed.
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void validateFirstPodcastTitle() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtFirstPodcastTitle, "First Podcast Title text",
					"First Podcast Title text is dsiplayed", "First Podcast Title text is not dsiplayed",
					"blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("First Podcast Title text is not dsiplayed");
			Assert.fail("First Podcast Title text is not dsiplayed");
		}
	}

	/**
	 * Description: Method to Swipe to podcast Player.
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void swipeUpPodcastPlayer() {
		try {
			MobileActionUtil.swipeLeftToElement(miniPodcastPlayer);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to swipe to podcast player");
			Assert.fail("Unable to swipe to podcast player");
		}

	}

	/**
	 * Description: Method to click on Aur pade text.
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void clkOnAurPade() {
		try {
			MobileActionUtil.clickOnElement(txtAurPade, "Aur pade text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Aur pade text");
			Assert.fail("Unable to perform action on Aur pade text");
		}
	}

	/**
	 * Description: Method to Scroll to Audio Listed
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void scrollDown() {
		try {
			MobileActionUtil.scrollToElement(imgWhatsappShare);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to scroll to Audio Listed");
			Assert.fail("Unable to scroll to Audio Listed");
		}
	}

	/**
	 * Description: Method to Swipe up the mini player.
	 * 
	 * @author Mulage Abhishek
	 */
	public synchronized void swipeUpMiniPlayer() {
		try {
			MobileActionUtil.swipeUp();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to Swipe up the mini player");
			Assert.fail("Unable to Swipe up the mini player");
		}
	}
	
	/**
	 * Description:Method to click on Podcast Thumbnail text
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkOnPodcastThumbNailText() {
		try {

			MobileActionUtil.clickOnElement(txtPodcastThumbNail, "Podcast ThumbNail text");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Podcast ThumbNail text");
			Assert.fail("Unable to perform action on Podcast ThumbNail text");
		}
	}
	
	/**
	 * Description: Method to Scroll up the podcast page.
	 * 
	 * @author Sanjay
	 */
	public synchronized void scrollUp() {
		try {
			MobileActionUtil.scrollUp(1);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to Scroll up the podcast page");
			Assert.fail("Unable to Scroll up the podcast page");
		}
	}
	
	/**
	 * Description:Method to click on Sticky player Arrow icon.
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkOnStickyPlayerArrow() {
		try {

			MobileActionUtil.clickOnElement(icnStickyplayerArrow, "Sticky player Arrow icon");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Sticky player Arrow icon");
			Assert.fail("Unable to perform action on Sticky player Arrow icon");
		}
	}
	
	/**
	 * Description:Method to click on Sticky player clsoe icon
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkOnStickyPlayerClose() {
		try {

			MobileActionUtil.clickOnElement(icnStickyplayerClose, "Sticky player clsoe icon");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Sticky player clsoe icon");
			Assert.fail("Unable to perform action on Sticky player clsoe icon");
		}
	}
}
