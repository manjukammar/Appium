package com.tyss.aajtak.pages;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.tyss.aajtak.util.MobileActionUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * Description: This class has Method Implementation for Download Content Page.
 * 
 * @author Ramya R
 */
public class DownloadedContent_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public DownloadedContent_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* Download title text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='डाउनलोडेड कंटेंट']")
	private AndroidElement txtDownloadtitle;

	/* Back Arrow button */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/tbBackArrow']")
	private AndroidElement btnBackArrow;

	/* Bookmark title text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='बुकमार्क']")
	private AndroidElement txtBookmarkPageTitle;

	/* Content message text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='आपने कुछ भी डाउनलोड नहीं किया है']")
	private AndroidElement txtContentMessage;

	/* Download Content Options tab */
	private AndroidElement tabDownloadContentOptions(String tabName) {
		String xpath = "//android.widget.TextView[@text='"+tabName+"' and @resource-id='in.AajTak.headlines:id/tvCategory']";
		return androidDriver.findElementByXPath(xpath);
	}

	/* Alert message Sabhi saf karen */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private AndroidElement txtAlertMessageSabhiSafKaren;

	/* Delete single photo button */
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/photo_parent_view']//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/story_delete']")
	private AndroidElement btnDeleteSinglePhoto;

	/* Delete single story video button */
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=0]//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/story_delete']")
	private AndroidElement btnDeleteSingleStoryVideo;
	
	/*Haan option */
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button2']")
	private AndroidElement txtHaan;

	/*SabhiSafKaren text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvClear']")
	private AndroidElement txtSabhiSafKaren;

	/*Story title text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvBookmarkTitle']")
	private AndroidElement txtVideoTitle;

	/*Content Date text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvDate']")
	private AndroidElement txtContentDate;

	/*Story Title text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvBookmarkTitle")
	private AndroidElement txtStoryTitle;

	/* Alert title on SabhiSafKaren */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/alertTitle']")
	private AndroidElement txtAlertTitleSabhiSafKaren;

	/* Download Size text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/downloaded_size']")
	private AndroidElement txtDownloadSize;

	/* New Content message text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='आपने कुछ भी बुकमार्क नहीं किया है']")
	private AndroidElement txtNewcontentMessage;

	/* photo title text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvBookmarkTitle']")
	private AndroidElement txtPhotoTitle;

	/* video story title text */
	@AndroidBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvVideoTitle']")
	private AndroidElement txtVideoStorytitle;

	/* Vide content text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvBookmarkTitle']")
	private AndroidElement txtWideContent;

	/* Progress bar text */
	@AndroidFindBy(xpath = "//android.view.View[@resource-id='in.AajTak.headlines:id/rate_progress_bar']")
	private AndroidElement txtProgressBar;

	/* Toast Message */
	@AndroidFindBy(xpath = "//android.widget.Toast[1]")
	private AndroidElement txtToastmsg;

	/**
	 * Description: Method to click on Tasvire Section.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkTasvireSection() {
		try {
			MobileActionUtil.clickOnElement(tabDownloadContentOptions("Photos"), "Tasvire section text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Tasvire section text");
			Assert.fail("Unable to click on Tasvire section text");
		}
	}
	
	/**
	 * Description: Method to click on Story Section.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkStorySection() {
		try {
			MobileActionUtil.clickOnElement(tabDownloadContentOptions("Story"), "Story Section text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Story Section text");
			Assert.fail("Unable to click on Story Section text");
		}
	}

	
	/**
	 * Description: Method to click on Video Section Text.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkVideoSection() {
		try {
			MobileActionUtil.clickOnElement(tabDownloadContentOptions("Videos"), "Video section text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Video section text");
			Assert.fail("Unable to click on Video section text");
		}
	}

	
	/**
	 * Description: Method to click on Verify Video title.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkVideoTitle() {
		try {
			MobileActionUtil.scrollToElement(txtVideoTitle);
			MobileActionUtil.clickOnElement(txtVideoTitle, "Video title text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Video title text");
			Assert.fail("Unable to click on Video title text");
		}
	}
	

	/**
	 * Description: Method to validate verify video story title.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateVideoStorytitle() {
		try {
			MobileActionUtil.isElementDisplayed(txtVideoStorytitle, "video story title text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Verify video story title text");
			Assert.fail("Unable to validate Verify video story title text");
		}
	}

	/**
	 * Description: Method to validate photo title.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validatePhotoTitle() {
		try {
			MobileActionUtil.isElementDisplayed(txtPhotoTitle, "photo title text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate photo title text");
			Assert.fail("Unable to validate photo title text");
		}
	}

	/**
	 * Description: Method to validate New content message.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateNewcontentMessage() {
		try {
			MobileActionUtil.isElementDisplayed(txtNewcontentMessage, "New content message text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate New content message text");
			Assert.fail("Unable to validate New content message text");
		}
	}

	/**
	 * Description: Method to validate Download Size.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateDownloadSize() {
		try {
			MobileActionUtil.isElementDisplayed(txtDownloadSize, "Download Size text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Download Size text");
			Assert.fail("Unable to validate Download Size text");
		}
	}

	/**
	 * Description: Method to validate Alert title on SabhiSafKaren.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateAlertTitleSabhiSafKaren() {
		try {
			MobileActionUtil.isElementDisplayed(txtAlertTitleSabhiSafKaren, "Alert title on SabhiSafKaren");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Alert title on SabhiSafKaren");
			Assert.fail("Unable to validate Alert title on SabhiSafKaren");
		}
	}

	/**
	 * Description:Method to get text of Story Title.
	 * 
	 * @author: Ramya R
	 * @return VerifyStoryTitle
	 * 
	 */
	public synchronized String getTextStoryTitle() {
		String VerifyStoryTitle = null;
		try {
			VerifyStoryTitle = txtStoryTitle.getText();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to get text of Story Title text");
			Assert.fail("Unable to get text of Story Title text");
		}
		return VerifyStoryTitle;
	}

	/**
	 * Description: Method to validate Story title.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateStoryTitle() {
		try {
			MobileActionUtil.isElementDisplayed(txtStoryTitle, "Story Title text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Story Title text");
			Assert.fail("Unable to validate Story Title text");
		}
	}
	
	/**
	 * Description: Method to click Story title.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkOnStoryTitle() {
		try {
			MobileActionUtil.clickOnElement(txtStoryTitle, "Story Title text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Story Title text");
			Assert.fail("Unable to click on Story Title text");
		}
	}

	/**
	 * Description: Method to validate Verify Content Date Text.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateContentDate() {
		try {
			MobileActionUtil.isElementDisplayed(txtContentDate, "Content Date text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Content Date text");
			Assert.fail("Unable to validate Content Date text");
		}
	}

	/**
	 * Description: Method to Wait for Video title text.
	 * 
	 * @author Ramya R
	 */
	public synchronized void waitForVideoTitle() {
		try {
			MobileActionUtil.waitForVisiblilityOfElement(txtVideoTitle, "Video title text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to Wait for Video title text");
			Assert.fail("Unable to Wait for Video title text");
		}
	}

	
	/**
	 * Description: Method to click on sabhiSafKaren text.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkSabhiSafKaren() {
		try {
			MobileActionUtil.clickOnElement(txtSabhiSafKaren, "SabhiSafKaren text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on SabhiSafKaren text");
			Assert.fail("Unable to click on SabhiSafKaren text");
		}
	}

	/**
	 * Description: Method to validate SabhiSafKaren text.
	 * 
	 * @author Ramya R
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
	 * Description: Method to click on Haan option for clear downloaded content.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkHaanOptionForClearDownloadedContent() {
		try {
			MobileActionUtil.clickOnElement(txtHaan, "Haan option");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Haan option ");
			Assert.fail("Unable to click on Haan option ");
		}
	}

	/**
	 * Description: Method to click on Download title.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkDownloadTitle() {
		try {
			MobileActionUtil.clickOnElement(txtDownloadtitle, "Download title text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Download title text");
			Assert.fail("Unable to click on Download title text");
		}
	}

	/**
	 * Description: Method to click on Delete single story video.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkDeleteSingleStoryVideo() {
		try {
			MobileActionUtil.clickOnElement(btnDeleteSingleStoryVideo, "Delete single story video");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Delete single story video");
			Assert.fail("Unable to click on Delete single story video");
		}
	}

	/**
	 * Description: Method to click on Delete single photo.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkDeleteSinglePhoto() {
		try {
			MobileActionUtil.clickOnElement(btnDeleteSinglePhoto, "Delete single photo button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Delete single photo button");
			Assert.fail("Unable to click on Delete single photo button");
		}
	}

	/**
	 * Description: Method to validate Story section.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validatestorySection() {
		try {
			MobileActionUtil.isElementDisplayed(tabDownloadContentOptions("Story"), "Story section text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Story section text");
			Assert.fail("Unable to validate Story section text");
		}
	}

	/**
	 * Description: Method to validate Content message.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateContentMessage() {
		try {
			MobileActionUtil.isElementDisplayed(txtContentMessage, "Content message text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Content message text");
			Assert.fail("Unable to validate Content message text");
		}
	}

	/**
	 * Description: Method to validate Tasvire section.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateTasvireSection() {
		try {
			MobileActionUtil.isElementDisplayed(tabDownloadContentOptions("Photos"), " Tasvire section text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Tasvire section text");
			Assert.fail("Unable to validate Tasvire section text");
		}
	}

	/**
	 * Description: Method to validate Story Section.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateStorySection() {
		try {
			MobileActionUtil.validateisElementDisplayed(tabDownloadContentOptions("Story"), "Story Section text",
					"Story Section is displayed", "Story Section is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Story Section");
			Assert.fail("Unable to validate Story Section");
		}
	}

	/**
	 * Description: Method to validate video Section
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateVideoSection() {
		try {
			MobileActionUtil.validateisElementDisplayed(tabDownloadContentOptions("Videos"), "video Section", "video Section is displayed",
					"video Section is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate video Section");
			Assert.fail("Unable to validate video Section");
		}
	}

	/**
	 * Description: Method to validate Alert Message On Sabhi Saf Karen.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateAlertMessageSabhiSafKaren() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtAlertMessageSabhiSafKaren,
					"Alert Message On Sabhi Saf Karen", "Alert message is displayed", "Alert message is not displayed",
					"blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Alert Message On Sabhi Saf Karen");
			Assert.fail("Unable to validate Alert Message On Sabhi Saf Karen");
		}
	}

	/**
	 * Description: Method to validate Video Title
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateVideoTitle() {
		try {
			MobileActionUtil.validateisElementDisplayed(txtVideoTitle, "Video title text", "Video Title is displayed",
					"Video Title is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Video Title text");
			Assert.fail("Unable to validate Video Title text");
		}
	}

	/**
	 * Description: Method to click on Back Arrow button.
	 * 
	 * @author Ramya R
	 */
	public synchronized void clkBackArrowBtn() {
		try {
			MobileActionUtil.clickOnElement(btnBackArrow, "Back Arrow button");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Back Arrow button");
			Assert.fail("Unable to click on Back Arrow button");
		}
	}

	/**
	 * Description:Method to click on Device back button
	 * 
	 * @author Sreelatha
	 * 
	 */
	public synchronized void clkBackBtn() {
		try {
			MobileActionUtil.clickDeviceBackButton(1);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Back button");
			Assert.fail("Unable to click on Back button");
		}
	}

	/**
	 * Description: Method to Wait for Progress bar.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void waitForProgressBar() {
		try {
			try {
				MobileActionUtil.waitForVisiblilityOfElement(txtProgressBar, "Progress bar text");
			} catch (Exception e) {
				MobileActionUtil.info("Progress bar text is not displayed");
			}
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to Wait for Progress bar text");
			Assert.fail("Unable to Wait for Progress bar text");
		}
	}
	
	/**
	 * Description: Method to validate Download Content Page.
	 * 
	 * @author Ramya R
	 */
	public synchronized void validateDownloadContentPage() {
		try {
			MobileActionUtil.isElementDisplayed(txtDownloadtitle, "Download title text");
			} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate Download title text");
			Assert.fail("Unable to validate Download title text");
		}
	}
	
	/**
	 * Description: Method to click on Photo Title
	 * 
	 * @author Sreelatha
	 */
	public synchronized void clkPhotoTitle() {
		try {
			MobileActionUtil.clickOnElement(txtPhotoTitle, "Photo Title Text");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to click on Photo Title Text");
			Assert.fail("Unable to click on Photo Title Text");
		}
	}
	
	/**
	 * Description: Method to Validate Delete Video Button.
	 * 
	 * @author Sreelatha
	 */
	public synchronized void validateDeleteBtn() {
		try {
			try {
				MobileActionUtil.waitForVisiblilityOfElement(btnDeleteSingleStoryVideo, "Delete Video Button");
			} catch (Exception e) {
				MobileActionUtil.info("Delete Video Button is not displayed");
			}
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to validate on Delete Video Button");
			Assert.fail("Unable to validate on Delete Video Button");
		}
	}

}
