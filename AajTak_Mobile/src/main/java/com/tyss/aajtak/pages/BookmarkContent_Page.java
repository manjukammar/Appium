package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * Description: This class has Method Implementation for Bookmark Content Page.
 * 
 * @author Ramya R
 */
public class BookmarkContent_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public BookmarkContent_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Book mark Content Options tab */
	private AndroidElement tabBookmarkContentOptions(String tabName) {
		String xpath = "//android.widget.TextView[@text='"+tabName+"' and @resource-id='in.AajTak.headlines:id/tvCategory']";
		return androidDriver.findElementByXPath(xpath);
	}
	
	/* Sabhi Saf Karen Options text */
	private AndroidElement txtSabhiSafKarenOptions(String tabName) {
		String xpath = "//android.widget.Button[@text='"+tabName+"']";
		return androidDriver.findElementByXPath(xpath);
	}
	
	/* Bookmark first story */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvBookmarkTitle")
	private AndroidElement txtBookmarkFirstStory;
	
	/* Content date text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvLastUpdates")
	private AndroidElement txtContentDate;

	/* Story Content date text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvDate")
	private AndroidElement txtContentDateStory;

	/* Toast message text */
	@AndroidFindBy(xpath = "//android.widget.Toast[1]")
	private AndroidElement txtToastmsg;

	/* Bookmark Title text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvBookmarkTitle']")
	private AndroidElement txtBookmarkTitle;

	/* SabhiSafKaren text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvClear']")
	private AndroidElement txtSabhiSafKaren;

	/* Photo title text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvBookmarkTitle")
	private AndroidElement txtPhotoTitle;

	/* Bookmark Photo title text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvBookmarkTitle")
	private AndroidElement txtBookmarkPhotoTitle;

	/* Story title text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvBookmarkTitle")
	private AndroidElement txtStoryTitle;

	/* Alert message on SabhiSafKaren */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private AndroidElement txtAlertMessageSabhiSafKaren;

	/* Bookmark title text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='बुकमार्क']")
	private AndroidElement txtBookmarkPageTitle;

	/* First Story title text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvBookmarkTitle")
	private AndroidElement txtFirstStoryTitle;

	/* Video title text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvBookmarkTitle")
	private AndroidElement txtVideoTitle;

	/* Content message text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='आपने कुछ भी बुकमार्क नहीं किया है']")
	private AndroidElement txtContentMessage;

	/* Bookmark Content Date */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvDate']")
	private AndroidElement txtBookmarkContentDate;

	/* Back Arrow button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tbBackArrow")
	private AndroidElement btnBackArrow;


	/**
	 * Description:Method to click back arrow button
	 * 
	 * @author Ramya R
	 * 
	 */
	public synchronized void clkBackArrowBtn() {
		try {
			MobileActionUtil.clickOnElement(btnBackArrow, "Back arrow button");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Back arrow button");
			Assert.fail("Unable to click on Back arrow button");
		}
	}
	
	/**
	 * Description: Method to validate Content date.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateBookmarkContentDate() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtBookmarkContentDate, "Bookmark Content Date text", "Content date is displayed",
					"Content date is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Content date is not displayed");
			Assert.fail("Content date is not displayed");
		}
	}
	
	
	/**
	 * Description: Method to Wait for sabhiSafKaren text.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void waitForprogressBar() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(txtSabhiSafKaren, "SabhiSafKaren text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to wait for SabhiSafKaren Text");
			Assert.fail("Unable to wait for SabhiSafKaren Text");
		}
	}

	/**
	 * Description: Method to validate Content message.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateContentMessage() {
		try {
			MobileActionUtil.isElementDisplayed(txtContentMessage, "Content message text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Content message");
			Assert.fail("Unable to validate Content message");
		}
	}

	/**
	 * Description: Method to validate Bookmark page.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateBookmarkPage() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtBookmarkPageTitle, "Bookmark Title text",
					"Bookmark page is displayed", "Bookmark page is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Bookmark page is not displayed");
			Assert.fail("Bookmark page is not displayed");
		}
	}

	/**
	 * Description: Method to validate Alert message on SabhiSafKaren.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateAlertMessageSabhiSafKaren() {
		try {
			MobileActionUtil.isElementDisplayed(txtAlertMessageSabhiSafKaren, "Alert message on SabhiSafKaren");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Alert message on SabhiSafKaren");
			Assert.fail("Unable to validate Alert message on SabhiSafKaren");
		}
	}

	/**
	 * Description: Method to validate story title.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateStoryTitle() {
		try {
			MobileActionUtil.isElementDisplayed(txtStoryTitle, "Story title text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Story title");
			Assert.fail("Unable to validate Story title");
		}
	}

	/**
	 * Description: Method to click on Video Section.
	 * 
	 * @author Sreelatha
	 * @param option 
	 */
	public synchronized void clkVideoSection(String option) {
		try {
			MobileActionUtil.clickOnElement(tabBookmarkContentOptions(option), "Video Section text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Video Section text");
			Assert.fail("Unable to click on Video Section text");
		}
	}

	/**
	 * Description: Method to validate video title.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateVideoTitle() {
		try {
			MobileActionUtil.isElementDisplayed(txtVideoTitle, "Video title text");
			closeTheVideoPlayer();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Video title");
			Assert.fail("Unable to validate Video title");
		}
	}
	
	/**
	 * Description:Method to close the video
	 * 
	 * @author:Abhishek
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
	 * Description: Method to click on video title.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkVideoTitle() {
		try {
			MobileActionUtil.clickOnElement(txtVideoTitle, "Video title text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on video title");
			Assert.fail("Unable to click on video title");
		}
	}

	/**
	 * Description: Method to click on photo title.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkPhotoTitle() {
		try {
			MobileActionUtil.clickOnElement(txtPhotoTitle, "photo title text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on photo title");
			Assert.fail("Unable to click on photo title");
		}
	}

	/**
	 * Description: Method to validate Bookmark photo title.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateBookmarkPhotoTitle() {
		try {
			MobileActionUtil.isElementDisplayed(txtBookmarkPhotoTitle, "Bookmark photo title text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate bookmark photo title");
			Assert.fail("Unable to validate bookmark photo title");
		}
	}

	/**
	 * Description: Method to click on Bookmark photo title.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkBookmarkPhotoTitle() {
		try {
			MobileActionUtil.clickOnElement(txtBookmarkPhotoTitle, "Bookmark photo title text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on bookmark photo title");
			Assert.fail("Unable to click on bookmark photo title");
		}
	}

	/**
	 * Description: Method to click on sabhiSafKaren text.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkSabhiSafKaren() {
		try {
			MobileActionUtil.clickOnElement(txtSabhiSafKaren, "SabhiSafKaren text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on sabhiSafKaren text");
			Assert.fail("Unable to click on sabhiSafKaren text");
		}
	}

	/**
	 * Description: Method to validate sabhiSafKaren text.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateSabhiSafKaren() {
		try {
			MobileActionUtil.isElementDisplayed(txtSabhiSafKaren, "SabhiSafKaren text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate SabhiSafKaren text");
			Assert.fail("Unable to validate SabhiSafKaren text");
		}
	}

	/**
	 * Description: Method to click on Haan option for clear Bookmark content.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkHaanOptionForClearBookmarkContent() {
		try {
			MobileActionUtil.clickOnElement(txtSabhiSafKarenOptions("हां"), "Haan text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Haan option ");
			Assert.fail("Unable to click on Haan option ");
		}
	}

	/**
	 * Description:Method to get text of Bookmark title.
	 * 
	 * @author: Sreelatha
	 * @return bookmarkTitle
	 * 
	 */
	public synchronized String getTextBookmarkTitle() {
		String bookmarkTitle = null;
		try {
			bookmarkTitle = txtBookmarkTitle.getText();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to get text of Bookmark title");
			Assert.fail("Unable to get text of Bookmark title");
		}
		return bookmarkTitle;
	}

	/**
	 * Description:Method to get text of video title.
	 * 
	 * @author: Sreelatha
	 * @return VideoTitle
	 * 
	 */
	public synchronized String getTextVideoTitle() {
		String VideoTitle = null;
		try {
			VideoTitle = txtVideoTitle.getText();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to get text of video title");
			Assert.fail("Unable to get text of video title");
		}
		return VideoTitle;
	}

	/**
	 * Description: Method to validate verify first story title.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateFirstStoryTitle() {
		try {
			MobileActionUtil.isElementDisplayed(txtFirstStoryTitle, " First Story title text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate First Story title");
			Assert.fail("Unable to validate First story title");
		}
	}

	/**
	 * Description:Method to get text of verify first story title.
	 * 
	 * @author: Sreelatha
	 * @return FirstStoryTitle
	 * 
	 */
	public synchronized String getTextFirstStoryTitle() {
		String FirstStoryTitle = null;
		try {
			FirstStoryTitle = txtFirstStoryTitle.getText();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to get text of First story title");
			Assert.fail("Unable to get text of First story title");
		}
		return FirstStoryTitle;
	}

	/**
	 * Description:Method to get text of Toast message.
	 * 
	 * @author: Sreelatha
	 * @return ToastMessage
	 * 
	 */
	public synchronized String getTextToastMsg() {
		String ToastMessage = null;
		try {
			ToastMessage = txtToastmsg.getText();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to get text of Toast message");
			Assert.fail("Unable to get text of Toast message");
		}
		return ToastMessage;
	}

	/**
	 * Description:Method to get text of Content date story.
	 * 
	 * @author: Sreelatha
	 * @return contentDateStory
	 * 
	 */
	public synchronized String getTextContentDateStory() {
		String contentDateStory = null;
		try {
			contentDateStory = txtContentDateStory.getText();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to get text of Content date story");
			Assert.fail("Unable to get text of Content date story");
		}
		return contentDateStory;
	}

	/**
	 * Description:Method to get text of Content date
	 * 
	 * @author: Sreelatha
	 * @return ContentDate
	 * 
	 */
	public synchronized String getTextContentDate() {
		String ContentDate = null;
		try {
			ContentDate = txtContentDate.getText();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to get text of Content date");
			Assert.fail("Unable to get text of Content date");
		}
		return ContentDate;
	}

	/**
	 * Description: Method to validate story Section.
	 * 
	 * @author Ramya R
	 * @param option 
	 */
	public synchronized void validateStorySection(String option) {
		try {
			MobileActionUtil.validateisElementDisplayed(tabBookmarkContentOptions(option), "Story Section text",
					"Story Section is displayed", "Story Section is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Story Section text is not displayed");
			Assert.fail("Story Section text is not displayed");
		}
	}

	/**
	 * Description: Method to validate Tasvire Section
	 * 
	 * @author Ramya R
	 * @param option 
	 */
	public synchronized void validateTasvireSection(String option) {
		try {
			MobileActionUtil.validateisElementDisplayed(tabBookmarkContentOptions(option), "Tasvire Section text",
					"Tasvire Section is displayed", "Tasvire Section is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Tasvire Section is not displayed");
			Assert.fail("Tasvire Section is not displayed");
		}
	}

	/**
	 * Description: Method to validate video Section
	 * 
	 * @author Ramya R
	 * @param option 
	 */
	public synchronized void validateVideoSection(String option) {
		try {
			MobileActionUtil.validateisElementDisplayed(tabBookmarkContentOptions(option), "Video Section text",
					"Video Section is displayed", "Video Section is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Video Section is not displayed");
			Assert.fail("Video Section is not displayed");
		}
	}

	/**
	 * Description: Method to validate Content date.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateContentDate() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtContentDate, "Content date text",
					"Content date is displayed", "Content date is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Content date is not displayed");
			Assert.fail("Content date is not displayed");
		}
	}

	/**
	 * Description: Method to click on Bookmark first Story.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkBookmarkFirstStory() {
		try {
			MobileActionUtil.clickOnElement(txtBookmarkFirstStory, "Bookmark first Story text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Bookmark first Story text");
			Assert.fail("Unable to click on Bookmark first Story text");
		}
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
			MobileActionUtil.fail("Unable to click on Device back button");
			Assert.fail("Unable to click on Device back button");
		}
	}

	/**
	 * Description: Method to click on Story section.
	 * 
	 * @author Sreelatha
	 * @param option 
	 */
	public synchronized void clkStorySection(String option) {
		try {
			MobileActionUtil.clickOnElement(tabBookmarkContentOptions(option), "Story section text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Story section text");
			Assert.fail("Unable to click on Story section text");
		}
	}

	/**
	 * Description: Method to click on Verify Story itle.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkStoryTitle() {
		try {
			MobileActionUtil.clickOnElement(txtStoryTitle, " Story title text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Story title text");
			Assert.fail("Unable to click on Story title text");
		}
	}

	/**
	 * Description: Method to click on Tasvire section.
	 * 
	 * @author Sreelatha
	 * @param options 
	 */
	public synchronized void clkTasvireSection(String options) {
		try {
			MobileActionUtil.clickOnElement(tabBookmarkContentOptions(options), "Tasvire section text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Tasvire section");
			Assert.fail("Unable to click on Tasvire section");
		}
	}

	/**
	 * Description: Method to validate Photo Title.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validatePhotoTitle() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtPhotoTitle, "Photo title text", "Photo title is displayed",
					"Photo title is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Photo title is not displayed");
			Assert.fail("Photo title is not displayed");
		}
	}

}
