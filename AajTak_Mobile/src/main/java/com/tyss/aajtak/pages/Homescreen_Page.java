package com.tyss.aajtak.pages;

import java.util.List;

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
 * Description:This class has Method Implementation for Home screen Page.
 * 
 * @author Abhishek
 *
 */
public class Homescreen_Page {

	public AndroidDriver<AndroidElement> androidDriver;
	public long ETO;

	public Homescreen_Page(AndroidDriver<AndroidElement> androidDriver, long ETO) {
		this.androidDriver = androidDriver;
		PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
		this.ETO = ETO;
	}

	/* AajTak home logo copy */
	@AndroidFindBy(xpath = "(//android.widget.ImageView)[2]")
	private AndroidElement aajTakHomeLogo;

	/* Bhadi khabarae button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/toolbar")
	private AndroidElement btnBhadikhabarae;
	
	/* BadiKahbre in Section */
	@AndroidFindBy(id = "in.AajTak.headlines:id/homeToolbar")
	private AndroidElement txtBadiKahbreinSection;

	/* SuperFasrCard image */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='बड़ी खबरें']")
	private AndroidElement imgSuperFasrCard;

	/* Carona tab */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='कोरोना']")
	private AndroidElement coranaTab;
	
	/* Bade Khabre text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='बड़ी खबरें']")
	private AndroidElement txtBadeKhabre;

	/* Home Icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/homeTab")
	private AndroidElement homebar;

	/* Podcast Radio icon */
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"पॉडकास्ट\"]/android.widget.FrameLayout/android.widget.ImageView")
	private AndroidElement rdoPodcast;

	/* Hamburger icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/hamburgerIcon")
	private AndroidElement hamburgerIcon;

	/* Super fast card title */
	@AndroidFindBy(id = "in.AajTak.headlines:id/title")
	private AndroidElement txtSuperfastCardTitle;

	/* Super fast card share cancel button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/iv_close")
	private AndroidElement btnSuperfastCardShareCloseButton;

	/* Sahre only this card button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_share_this_card_only")
	private AndroidElement btnShareOnlyThisCard;

	/* Share all cards button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_share_all_cards")
	private AndroidElement btnShareAllCards;

	/* Super fast card description */
	@AndroidFindBy(id = "in.AajTak.headlines:id/desc")
	private AndroidElement txtSuperfastCardDescription;

	/* Hamburger Icon copy */
	@AndroidFindBy(id = "in.AajTak.headlines:id/hamburgerIcon")
	private AndroidElement hamburgerIconCopy;

	/* Hamburger Icon short video */
	@AndroidFindBy(id = "in.AajTak.headlines:id/videohamburgerIcon")
	private AndroidElement lnkHamburgerIconShortVideo;

	/* New Hanburger icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/hamburgerIcon")
	private AndroidElement newhamburgerIcon;

	/* Daily cap Banner Message */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvNewsTitle")
	private AndroidElement txtDailycapBannerMessage;

	/* Daily Capsule Banner copy */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Aaj Tak Image\"]")
	private AndroidElement dailyCapsuleBannnerCopy;

	/* First News */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Aaj Tak Image']")
	private AndroidElement imgFirstNews;

	/* Temperature */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_topnews_temperature")
	private AndroidElement lnkTemperature;

	/* Weather link */
	@AndroidFindBy(id = "in.AajTak.headlines:id/iv_topnews_weather")
	private AndroidElement lnkWeather;

	/* Location link */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_topnews_temperature_value")
	private AndroidElement lnkLocation;

	/* Banner Down Arrow */
	@AndroidFindBy(id = "in.AajTak.headlines:id/topnews_downarrow")
	private AndroidElement bannerDownArrow;

	/* Down Arrow Sheet */
	@AndroidFindBy(id = "in.AajTak.headlines:id/design_bottom_sheet")
	private AndroidElement downArrowSheet;

	/* Always show icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_always")
	private AndroidElement btnAlwaysShow;

	/* Show once in Day */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_24hours")
	private AndroidElement lnkShowOnceinDay;

	/* Never Show link */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_never")
	private AndroidElement lnkNeverShow;

	/* First story title of section */
	@AndroidFindBy(id = "in.AajTak.headlines:id/news_title")
	private AndroidElement txtFirstStoryTitleOfSection;

	/* First Stroy Desc */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_desc")
	private AndroidElement txtFirstStoryDesc;

	/* Photo story desc */
	@AndroidFindBy(id = "in.AajTak.headlines:id/photostroy_desc")
	private AndroidElement lnkPhotoStoryDesc;

	/* Larger photo of first story */
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivHBILargeImg")
	private AndroidElement imgLargephotooffirststory;

	/* Other story title */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_title")
	private AndroidElement txtOtherStoryTitle;

	/* Visual Story title */
	@AndroidFindBy(id = "(in.AajTak.headlines:id/tv_visualstory_title)[2]")
	private AndroidElement txtVisualStoryTitle;

	/* Visual Story */
	@AndroidFindBy(id = "in.AajTak.headlines:id/clVisualStoriesBase")
	private AndroidElement txtVisualStory;

	/* First News title */
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvNewsTitle'])[1]")
	private AndroidElement txtFirstNewstitle;

	/* Second News Title */
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvNewsTitle'])[2]")
	private AndroidElement txtSecondNewsTitle;

	/* Second news detail title */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_title")
	private AndroidElement txtSecondNewsDetailTitle;

	/* Header News Article */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/ivNewsImage']")
	private AndroidElement txtHeaderNewsarticle;

	/* Super Fast Card */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='बड़ी खबरें' and @resource-id='in.AajTak.headlines:id/newspresso_image']")
	private AndroidElement superfastCard;

	/* Namaskar */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_goodmorning")
	private AndroidElement namaskar;

	/* First story title */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_title")
	private AndroidElement txtfirstStoryTitle;

	/* First video news home screen */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='टॉप वीडियो']")
	private AndroidElement txtVideoGallery;

	/* FirstVideo or PhotoInHomeScreen */
	@AndroidFindBy(xpath = "//android.view.ViewGroup[@resource-id='in.AajTak.headlines:id/clPhotoOrVideo']")
	private AndroidElement imgFirstVideoorPhotoInHomeScreen;

	
	/* Photo Gallery text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='फोटो गैलरी']")
	private AndroidElement txtPhotoGallery;
	
	/* Home screen loading */
	@AndroidFindBy(id = "in.AajTak.headlines:id/lav_loader")
	private AndroidElement homeScreenLoading;

	/* News Date */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvLastUpdates")
	private AndroidElement newsDate;

	/* Home tab */
	@AndroidFindBy(xpath = "(//android.widget.TextView[@text='होम'])[1]")
	private AndroidElement homeTab;

	/* Home Icon */
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"होम\"]")
	private AndroidElement homeIcon;

	/* Photo tab */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='फोटो']")
	private AndroidElement photoTab;

	/* ManoranJan tab */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='मनोरंजन']")
	private AndroidElement manoranjanTab;

	/* karyakram tab */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='कार्यक्रम']")
	private AndroidElement karyakramTab;

	/* Bharath tab */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='भारत']")
	private AndroidElement bharathTab;

	/* Other Stories from SectionTxt */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_topnews_seemore']")
	private AndroidElement otherStoriesfromSectionTxt;

	/* BadiKahbre in Section */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/newspresso_image']")
	private AndroidElement lnkBadiKahbreinSection;

	/* Badikhabre in SectionCopy */
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvNewsTitle'])[1]")
	private AndroidElement lnkBadikhabreinSectionCopy;

	/* More Options */
	@AndroidFindBy(id = "in.AajTak.headlines:id/moreOptions")
	private AndroidElement lnkMoreOPtions;

	/* Barath section copy */
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"भारत\"]/android.widget.TextView")
	private AndroidElement bharathSectioncopy;

	/* khel Section */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='खेल']")
	private AndroidElement lnkKhelSection;

	/* khel Section */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='लाइव टीवी']")
	private AndroidElement lnkLiveTv;
	
	
	
	/* Manoranjan Section */
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvSectionHeading' and @text='मनोरंजन']")
	private AndroidElement lnkManoranjanSection;

	/* Sperfast Card */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/logo']")
	private AndroidElement btnsuperfastcard;

	/* Superfast Card Close Icon */
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/iv_back']")
	private AndroidElement superfastCardCloseIcon;

	/* Comment icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivBottomComment")
	private AndroidElement commentIcon;

	/* Offline Icon */
	@AndroidFindBy(xpath = "//android.widget.ImageView [@resource-id=\"in.AajTak.headlines:id/ivBottomDownload\"]")
	private AndroidElement offlineIcon;

	/* Book mark icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivBottomBookmark")
	private AndroidElement bookmarkIcon;

	/* Share icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/ivBottomShare")
	private AndroidElement shareIcon;

	/* Superfast share icon */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_share")
	private AndroidElement superFastShareIcon;

	/* Share only one card */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tv_share_this_card_only")
	private AndroidElement lnkShareOnlyOneCard;

	/* SharebadiKhabre */
	@AndroidFindBy(id = "in.AajTak.headlines:id/shareLayout")
	private AndroidElement lnkSharebadiKhabre;

	/* Auto Label */
	@AndroidFindBy(id = "in.AajTak.headlines:id/mainTitleTxt")
	private AndroidElement autoLabel;

	/* Ant button */
	@AndroidFindBy(id = "in.AajTak.headlines:id/moreOptions")
	private AndroidElement btnAnt;

	/* Sticker image */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='वाट्सऐप स्टिकर्स']/../androidx.viewpager.widget.ViewPager[@resource-id='in.AajTak.headlines:id/pager']//android.widget.LinearLayout[@index=0]/android.widget.ImageView[@resource-id='in.AajTak.headlines:id/imageView']")
	private AndroidElement imgSticker;

	/* Sticker text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='वाट्सऐप स्टिकर्स']/../androidx.viewpager.widget.ViewPager[@resource-id='in.AajTak.headlines:id/pager']//android.widget.LinearLayout[@index=0]/android.widget.TextView[@resource-id='in.AajTak.headlines:id/bottom_text']")
	private AndroidElement txtSticker;

	/* other stickers */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='और स्टिकर्स']")
	private AndroidElement lnkOthersStickers;

	/* Dot Icon */
	@AndroidFindBy(xpath = "//android.widget.HorizontalScrollView")
	private List<AndroidElement> dot;

	/* Aap Abhi Off line text */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"आप अभी ऑफलाइन हैं\"]")
	private AndroidElement txtaapAbhiOffline;

	/* Add close button */
	@AndroidFindAll({ @AndroidBy(xpath = "//android.widget.TextView[@resource-id='close-button-icon']"),
			@AndroidBy(xpath = "//android.widget.ImageButton[@content-desc='Interstitial close button']"),
			@AndroidBy(xpath = "//android.widget.TextView[@text='Close']"),
			@AndroidBy(xpath = "//android.widget.TextView[@text='CLOSE']"),
			@AndroidBy(xpath = "//android.widget.Button"),
			@AndroidBy(xpath = "//android.view.View[@resource-id='close-button-container']"),
			@AndroidBy(xpath = "//android.widget.TextView[@resource-id='close-button-icon']"),
			@AndroidBy(xpath = "//android.widget.Button[@text='Close']") })
	private AndroidElement btnCloseAd;

	/* StoryTitle In HomeScreen */
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tvNewsTitle'])[1]")
	private AndroidElement txtStoryTitleInHomeScreen;

	/* Second Stroy title */
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"News Image\"])[2]")
	private AndroidElement secondStoryTitle;

	/* welcome text */
	@AndroidFindBy(id = "in.AajTak.headlines:id/signupHeader")
	private AndroidElement txtWelcome;

	/* First News1 */
	@AndroidFindBy(id = "in.AajTak.headlines:id/tvHBITitle")
	private AndroidElement txtFirstNewsHeadline;
	
	/* Home tab */
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='होम']")
	private AndroidElement txthomeTab;
	
	/*Toast message text*/
	@AndroidFindBy(xpath = "//android.widget.Toast")
	private AndroidElement txtToastmsg;

	/**
	 * Description:Method to click on First news1 in home page listing
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkFirstNews1() {
		try {

			MobileActionUtil.clickOnElement(txtFirstNewsHeadline, "First News1 Headline text");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on First news1 image");
			Assert.fail("Unable to perform action on First news1 image");
		}
	}

	/**
	 * Description: Method to swipe through the article
	 * 
	 * @author Abhishek
	 */
	public synchronized void swipeThroughArticle() {
		try {
			MobileActionUtil.swipeUp();
			MobileActionUtil.swipeDown();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to swipe through the article detail");
			Assert.fail("Unable to swipe through the article detail");
		}
	}

	/**
	 * Description:Method to validate welcome text is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateWelcomeIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(txtWelcome, "welcome text", "welcome text  is displayed",
					"welcome text is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("welcome text is not displayed");
			Assert.fail("welcome text is not displayed");
		}
	}

	/**
	 * Description:Method to Validate AajTak home logo copy is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateBadiKahbreinIsDisplayed() {
		try {

			MobileActionUtil.validateisElementDisplayed(txtBadiKahbreinSection, "BadiKahbrein text",
					"BadiKahbrein text is displayed ", "BadiKahbrein text is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("BadiKahbrein text is not displayed");
			Assert.fail("BadiKahbrein text is not displayed");
		}
	}

	/**
	 * Description:Method to scroll
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void scrollUp() {
		try {

			MobileActionUtil.scrollUp(2);

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to scroll");
			Assert.fail("Unable to scroll");
		}
	}

	/**
	 * Description:Method to click on Always show button
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkAlwaysShowButton() {
		try {

			MobileActionUtil.clickOnElement(btnAlwaysShow, "Always show button");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Always show button");
			Assert.fail("Unable to perform action on Always show button");
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
	 * Description:Method to click on Badi khabre in section copy
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkBadiKhabreInSectionCopy() {
		try {

			MobileActionUtil.clickOnElement(lnkBadikhabreinSectionCopy, "Badi khabre in section copy Link");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Badi khabre in section copy");
			Assert.fail("Unable to perform action on Badi khabre in section copy");
		}
	}

	/**
	 * Description:Method to click on Daily Capsule Banner Down Arrow
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkBannerDownArrow() {
		try {

			MobileActionUtil.clickOnElement(bannerDownArrow, "Banner down arrow");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Banner down arrow");
			Assert.fail("Unable to perform action on Banner down arrow");
		}
	}

	/**
	 * Description:Method to click on Bharath tab
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkBharathTab() {
		try {

			MobileActionUtil.clickOnElement(bharathTab, "Bharath tab");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Bharath tab");
			Assert.fail("Unable to perform action on Bharath tab");
		}
	}

	/**
	 * Description:Method to click on Bookmark icon
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkBookmarkIcon() {
		try {

			MobileActionUtil.clickOnElement(bookmarkIcon, "Bookmark icon");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Bookmark icon");
			Assert.fail("Unable to perform action on Bookmark icon");
		}
	}

	/**
	 * Description:Method to click on Comment icon
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkCommentIcon() {
		try {

			MobileActionUtil.clickOnElement(commentIcon, "Comment icon");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Comment icon");
			Assert.fail("Unable to perform action on Comment icon");
		}
	}

	/**
	 * Description:Method to click on First news in home page listing
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkFirstNews() {
		try {

			MobileActionUtil.clickOnElement(imgFirstNews, "First news");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on First news");
			Assert.fail("Unable to perform action on First news");
		}
	}

	/**
	 * Description:Method to click on Hamburger icon
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkHamburgerIcon() {
		try {
			
			MobileActionUtil.clickOnElement(hamburgerIcon, "Hamburger icon");
			MobileActionUtil.poll(1000);
			MobileActionUtil.scrollUpInSection(1);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Hamburger icon");
			Assert.fail("Unable to perform action on Hamburger icon");
		}
	}

	/**
	 * Description:Method to click on Hamburger icon copy
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkHamburgerIcnCopy() {
		try {

			MobileActionUtil.clickOnElement(hamburgerIconCopy, "Hamburger icon copy");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Hamburger icon copy");
			Assert.fail("Unable to perform action on Hamburger icon copy");
		}
	}

	/**
	 * Description:Method to click on Hamburger icon short video
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkHamburgerIconShortVideo() {
		try {

			MobileActionUtil.clickOnElement(lnkHamburgerIconShortVideo, "Hamburger icon short video link");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Hamburger icon short video link");
			Assert.fail("Unable to perform action on Hamburger icon short video link");
		}
	}

	/**
	 * Description:Method to click on Header news article
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkHeaderNewsArticle() {
		try {

			MobileActionUtil.clickOnElement(txtHeaderNewsarticle, "Header news article text");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Header news article text");
			Assert.fail("Unable to perform action on Header news article text");
		}
	}

	/**
	 * Description:Method to click on Home icon
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkHomeIcon() {
		try {

			MobileActionUtil.clickOnElement(homeIcon, "Home icon");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Home icon");
			Assert.fail("Unable to perform action on Home icon");
		}
	}

	/**
	 * Description:Method to click on Home tab
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkHomeTab() {
		try {

			MobileActionUtil.clickOnElement(homeTab, "Home tab");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Home tab");
			Assert.fail("Unable to perform action on Home tab");
		}
	}

	
	/**
	 * Description:Method to click on Large photo of first story
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkLargePhotoOfFirstStory() {
		try {

			MobileActionUtil.clickOnElement(imgLargephotooffirststory, "Large photo of first story");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Large photo of first story");
			Assert.fail("Unable to perform action on Large photo of first story");
		}
	}

	/**
	 * Description:Method to click on Manoranjan tab
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkManoranjanTab() {
		try {

			MobileActionUtil.clickOnElement(manoranjanTab, "Manoranjan tab");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Manoranjan tab");
			Assert.fail("Unable to perform action on Manoranjan tab");
		}
	}

	/**
	 * Description:Method to click on More options
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkMoreOptions() {
		try {

			MobileActionUtil.clickOnElement(lnkMoreOPtions, "More options");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on More options");
			Assert.fail("Unable to perform action on More options");
		}
	}

	/**
	 * Description:Method to click on Never show
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkNeverShow() {
		try {

			MobileActionUtil.clickOnElement(lnkNeverShow, "Never show");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Never show");
			Assert.fail("Unable to perform action on Never show");
		}
	}

	/**
	 * Description:Method to click on New hamburger icon
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkNewHamburgerIcon() {
		try {

			MobileActionUtil.clickOnElement(newhamburgerIcon, "New hamburger icon");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on New hamburger icon");
			Assert.fail("Unable to perform action on New hamburger icon");
		}
	}

	/**
	 * Description:Method to click on Photo tab
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkPhotoTab() {
		try {
			MobileActionUtil.clickOnElement(photoTab, "Photo tab");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Photo tab");
			Assert.fail("Unable to perform action on Photo tab");
		}
	}

	/**
	 * Description:Method to click on Podcast radio
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkPodcastRadio() {
		try {

			MobileActionUtil.clickOnElement(rdoPodcast, "Podcast radio");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Podcast radio");
			Assert.fail("Unable to perform action on Podcast radio");
		}
	}

	/**
	 * Description:Method to click on Share badi khabre
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkShareBadiKhabre() {
		try {

			MobileActionUtil.clickOnElement(lnkSharebadiKhabre, "Share badi khabre link");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Share badi khabre");
			Assert.fail("Unable to perform action on Share badi khabre");
		}
	}

	/**
	 * Description:Method to click on Share icon
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkShareIcon() {
		try {

			MobileActionUtil.clickOnElement(shareIcon, "Share icon");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Share icon");
			Assert.fail("Unable to perform action on Share icon");
		}
	}

	/**
	 * Description:Method to click on Share only one card
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkShareOnlyOneCard() {
		try {

			MobileActionUtil.clickOnElement(lnkShareOnlyOneCard, "Share only one card link");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Share only one card");
			Assert.fail("Unable to perform action on Share only one card");
		}
	}

	/**
	 * Description:Method to click on Super fast card
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkSuperfastCard() {
		try {
			MobileActionUtil.clickOnElement(btnsuperfastcard, "Super fast card button");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Super fast card");
			Assert.fail("Unable to perform action on Super fast card");
		}
	}

	/**
	 * Description:Method to click on Super fast card close icon
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkSuperFastCardCloseIcn() {
		try {

			MobileActionUtil.clickOnElement(superfastCardCloseIcon, "Super Fast card close icon");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Super Fast card close icon");
			Assert.fail("Unable to perform action on Super Fast card close icon");
		}
	}

	/**
	 * Description:Method to click on Super fast share icon
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkSuperfastShareIcon() {
		try {
			MobileActionUtil.clickOnElement(superFastShareIcon, "Super fast share icon");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Super fast share icon");
			Assert.fail("Unable to perform action on Super fast share icon");
		}
	}

	/**
	 * Description:Method to click on WhatsApp other stickers
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkWhatsAppOtherStickers() {
		try {

			MobileActionUtil.clickOnElement(lnkOthersStickers, "WhatsApp other stickers link");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on WhatsApp other stickers");
			Assert.fail("Unable to perform action on WhatsApp other stickers");
		}
	}

	/**
	 * Description:Method to click on WhatsApp sticker text
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkWhatsAppStickerText() {
		try {

			MobileActionUtil.clickOnElement(txtSticker, "WhatsApp sticker text");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on WhatsApp sticker text");
			Assert.fail("Unable to perform action on WhatsApp sticker text");
		}
	}

	/**
	 * Description:Method to click on Add close button
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkAdCloseBtn() {
		try {

			MobileActionUtil.clickOnElement(btnCloseAd, "Add close button");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Add close button");
			Assert.fail("Unable to perform action on Add close button");
		}
	}

	/**
	 * Description:Method to get first story title text
	 * 
	 * @author Abhishek
	 *
	 * 
	 */
	public synchronized String getFirstStoryTitleText() {
		String firstStoryTitleText = null;
		try {
			firstStoryTitleText = txtfirstStoryTitle.getText();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to fetch first story title text");
			Assert.fail("Unable to fetch first story title text");
		}
		return firstStoryTitleText;
	}

	/**
	 * Description:Method to validate Home tab is selected
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateHomeTabIsSelected() {
		try {

			if (homeTab.isSelected()) {
				MobileActionUtil.info("Home tab is selected");
				MobileActionUtil.validationinfo("Home tab is selected", "blue");
			}

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Home tab");
			Assert.fail("Unable to perform action on Home tab");
		}
	}

	/**
	 * Description:Method to click on Other stories from section text
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkOtherStoriesFromSectionText() {
		try {

			MobileActionUtil.clickOnElement(otherStoriesfromSectionTxt, "Other stories from section text");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Other stories from section text");
			Assert.fail("Unable to perform action on Other stories from section text");
		}
	}

	/**
	 * Description:Method to get Other Stories From SectionText
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized String getOtherStoriesFromSectionText() {
		String otherStoriesfromSectionText = null;
		try {
			otherStoriesfromSectionText = otherStoriesfromSectionTxt.getText();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to fetch other stories from section text");
			Assert.fail("Unable to fetch other stories from section text");
		}
		return otherStoriesfromSectionText;
	}

	/**
	 * Description:Method to get Second News Detail Title
	 * 
	 * @author Abhishek
	 *
	 * 
	 */
	public synchronized String getSecondNewsDetailTitle() {
		String secondNewsDetailTitle = null;
		try {
			secondNewsDetailTitle = txtSecondNewsDetailTitle.getText();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to fetch Second News Detail Title");
			Assert.fail("Unable to fetch Second News Detail Title");
		}
		return secondNewsDetailTitle;
	}

	/**
	 * Description:Method to Validate AajTak home logo copy is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateAajTakHomeLogoIsDisplayed() {
		try {

			MobileActionUtil.validateisElementDisplayed(aajTakHomeLogo, "AajTak home logo ",
					"AajTak home logo is displayed ", "AajTak home logo is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("AajTak home logo  is not displayed");
			Assert.fail("AajTak home logo is not displayed");
		}
	}

	/**
	 * Description:Method to Validate Badi kahbre in section is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateBadiKahbreInSectionIsDisplayed() {
		try {

			MobileActionUtil.validateisElementDisplayed(btnBhadikhabarae, "Badi kahbre in section",
					"Badi kahbre in section is displayed ", "Badi kahbre in section is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Badi kahbre in section is not displayed");
			Assert.fail("Badi kahbre in section is not displayed");
		}
	}

	/**
	 * Description:Method to Validate Banner down arrow is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateBannerDownArrowIsDisplayed() {
		try {

			MobileActionUtil.validateisElementDisplayed(bannerDownArrow, "Banner down arrow",
					"Banner down arrow is displayed ", "Banner down arrow is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Banner down arrow is not displayed");
			Assert.fail("Banner down arrow is not displayed");
		}
	}

	/**
	 * Description:Method to validate on Daily cap banner message is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateDailycapBannerMessageIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(txtDailycapBannerMessage, "Daily cap banner message",
					"Daily cap banner message is displayed", "Daily cap banner message is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Daily cap banner message is not displayed");
			Assert.fail("Daily cap banner message is not displayed");
		}
	}

	/**
	 * Description:Method to validate First news title is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateFirstNewsTitleIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(txtFirstNewstitle, "First news title",
					"First news title is displayed", "First news title is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("First news title is not displayed");
			Assert.fail("First news title is not displayed");
		}
	}

	/**
	 * Description:Method to validate Home tab is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateHomeTabIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(homeTab, "Home tab", "Home tab is displayed",
					"Home tab is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Home tab is not displayed");
			Assert.fail("Home tab is not displayed");
		}
	}

	/**
	 * Description:Method to validate Manoranjan section is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateManoranjanSectionIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(lnkManoranjanSection, "Manoranjan section",
					"Manoranjan section is displayed", "Manoranjan section is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Manoranjan section is not displayed");
			Assert.fail("Manoranjan section is not displayed");
		}
	}

	/**
	 * Description:Method to validate Super fast card close icon is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateSuperFastCardCloseIconIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(superfastCardCloseIcon, "Super fast card close icon",
					"Super fast card close icon is displayed", "Super fast card close icon is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Super fast card close icon is not displayed");
			Assert.fail("Super fast card close icon is not displayed");
		}
	}

	/**
	 * Description:Method to validate WhatsApp others stickers is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateWhatsAppOthersStickersIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(lnkOthersStickers, "WhatsApp others stickers",
					"WhatsApp others stickers is displayed", "WhatsApp others stickers is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("WhatsApp others stickers is not displayed");
			Assert.fail("WhatsApp others stickers is not displayed");
		}
	}

	/**
	 * Description:Method to validate Ad close button is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateAdCloseButtonIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(btnCloseAd, "Ad close button", "Add close button is displayed",
					"Add close button is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Add close button is not displayed");
			Assert.fail("Add close button is not displayed");
		}
	}

	/**
	 * Description:Method to validate Aap abhi offline text is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateAapAbhiOfflineTextIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(txtaapAbhiOffline, "Aap abhi offline text",
					"Aap abhi offline text is displayed", "Aap abhi offline text is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Aap abhi offline text is not displayed");
			Assert.fail("Aap abhi offline text is not displayed");
		}
	}

	/**
	 * Description:Method to validate Always show is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateAlwaysShowIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(btnAlwaysShow, "Always show", "Always show is displayed",
					"Always show is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Always show is not displayed");
			Assert.fail("Always show is not displayed");
		}
	}

	/**
	 * Description:Method to validate Auto label is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateAutoLabelIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(autoLabel, "Auto label", "Auto label is displayed",
					"Auto label is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Auto label is not displayed");
			Assert.fail("Auto label is not displayed");
		}
	}

	/**
	 * Description:Method to validate Down arrow sheet is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateDownArrowSheetIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(downArrowSheet, "Down arrow sheet",
					"Down arrow sheet is displayed", "Down arrow sheet is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Down arrow sheet is not displayed");
			Assert.fail("Down arrow sheet is not displayed");
		}
	}

	/**
	 * Description:Method to validate First video news in home screen is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateFirstVideoNewsInHomeScreenIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(txtVideoGallery,
					"First video news in home screen", "First video news in home screen is displayed",
					"First video news in home screen is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("First video news in home screen is not displayed");
			Assert.fail("First video news in home screen is not displayed");
		}
	}

	/**
	 * Description:Method to validate First video or photo in home screen is
	 * displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validatePhotoGalleryIsDisplayed() {
		try {

			MobileActionUtil.validateisElementDisplayed(txtPhotoGallery,
					"Photo Gallery in home screen", "Photo Gallery in home screen is displayed",
					"Photo Gallery in home screen is not displayed", "blue");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Photo Gallery in home screen is not displayed");
			Assert.fail("Photo Gallery in home screen is not displayed");
		}
	}

	/**
	 * Description:Method to validate Hamburger icon is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateHamburgerIconIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(hamburgerIcon, "Hamburger icon", "Hamburger icon is displayed",
					"Hamburger icon is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Hamburger icon is not displayed");
			Assert.fail("Hamburger icon is not displayed");
		}
	}

	/**
	 * Description:Method to validate Hamburger icon copy is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateHamburgerIconCopyIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(hamburgerIconCopy, "Hamburger icon copy",
					"Hamburger icon copy is displayed", "Hamburger icon copy is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Hamburger icon copy is not displayed");
			Assert.fail("Hamburger icon copy is not displayed");
		}
	}

	/**
	 * Description:Method to validate Manoranjan tab is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateManoranjanTabIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(manoranjanTab, "Manoranjan tab", "Manoranjan tab is displayed",
					"Manoranjan tab is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Manoranjan tab is not displayed");
			Assert.fail("Manoranjan tab is not displayed");
		}
	}

	/**
	 * Description:Method to validate More options is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateMoreOPtionsIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(lnkMoreOPtions, "More options", "More options is displayed",
					"More options is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("More options is not displayed");
			Assert.fail("More options is not displayed");
		}
	}

	/**
	 * Description:Method to validate Never show is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateNeverShowIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(lnkNeverShow, "Never show", "Never show is displayed",
					"Never show is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Never show is not displayed");
			Assert.fail("Never show is not displayed");
		}
	}

	/**
	 * Description:Method to validate News date is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateNewsDateIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(newsDate, "News date", "News date is displayed",
					"News date is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("News date is not displayed");
			Assert.fail("News date is not displayed");
		}
	}

	/**
	 * Description:Method to validate Offline icon is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateOfflineIconIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(offlineIcon, "Offline icon", "Offline icon is displayed",
					"Offline icon is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Offline icon is not displayed");
			Assert.fail("Offline icon is not displayed");
		}
	}

	/**
	 * Description:Method to validate Photo tab is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validatePhotoTabIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(photoTab, "Photo tab", "Photo tab is displayed",
					"Photo tab is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Photo tab is not displayed");
			Assert.fail("Photo tab is not displayed");
		}
	}

	/**
	 * Description:Method to validate Show once in day is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateShowOnceinDayIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(lnkShowOnceinDay, "Show once in day",
					"Show once in day is displayed", "Show once in day is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Show once in day is not displayed");
			Assert.fail("Show once in day is not displayed");
		}
	}

	/**
	 * Description:Method to validate Story title in home screen is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateStoryTitleInHomeScreenIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(txtStoryTitleInHomeScreen, "Story title in home screen",
					"Story title in home screen is displayed", "Story title in home screen is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Story title in home screen is not displayed");
			Assert.fail("Story title in home screen is not displayed");
		}
	}

	/**
	 * Description:Method to validate Super fast share icon is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateSuperFastShareIconIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(superFastShareIcon, "Super fast share icon",
					"Super fast share icon is displayed", "Super fast share icon is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Super fast share icon is not displayed");
			Assert.fail("Super fast share icon is not displayed");
		}
	}

	/**
	 * Description:Method to validate Temperature is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateTemperatureIsDisplyed() {
		try {
			MobileActionUtil.validateisElementDisplayed(lnkTemperature, "Temperature", "Temperature is displayed",
					"Temperature is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Temperature is not displayed");
			Assert.fail("Temperature is not displayed");
		}
	}

	/**
	 * Description:Method to validate WhatsApp sticker image is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateWhatsAppStickerImageIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(imgSticker, "WhatsApp sticker image",
					"WhatsApp sticker image is displayed", "WhatsApp sticker image is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("WhatsApp sticker image is not displayed");
			Assert.fail("WhatsApp sticker image is not displayed");
		}
	}

	/**
	 * Description:Method to validate WhatsApp sticker text is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateWhatsAppStickerTextIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(txtSticker, "WhatsApp sticker text",
					"WhatsApp sticker text is displayed", "WhatsApp sticker text is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("WhatsApp sticker text is not displayed");
			Assert.fail("WhatsApp sticker text is not displayed");
		}
	}

	/**
	 * Description:Method to validate Bharath section copy is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateBharathSectionCopyIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(bharathSectioncopy, "Bharath section copy",
					"Bharath section copy is displayed", "Bharath section copy is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Bharath section copy is not displayed");
			Assert.fail("Bharath section copy is not displayed");
		}
	}

	/**
	 * Description:Method to scroll to element Auto label
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void scrollToAutoLabel() {
		try {

//			MobileActionUtil.scrollToElement(autoLabel, "Auto label");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to scroll to Auto label");
			Assert.fail("Unable to scroll to Auto label");
		}
	}

	/**
	 * Description:Method to scroll to element First news title
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void scrollToFirstNewstitle() {
		try {

			MobileActionUtil.scrollUp(4);

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to scroll to First news title");
			Assert.fail("Unable to scroll to First news title");
		}
	}

	/**
	 * Description:Method to scroll to element First video news in home screen
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void scrollToFirstVideoNewsInHomeScreen() {
		try {

			MobileActionUtil.scrollToElement(txtVideoGallery);

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to scroll to First video news in home screen");
			Assert.fail("Unable to scroll to First video news in home screen");
		}
	}

	/**
	 * Description:Method to scroll to element First video or photo in home screen
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void scrollToPhotoGalleryInHomeScreen() {
		try {

			MobileActionUtil.scrollToElement(txtPhotoGallery);

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to scroll to First video or photo in home screen");
			Assert.fail("Unable to scroll to First video or photo in home screen");
		}
	}


	/**
	 * Description:Method to swipe to element Corona tab
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void swipeToCoranaTab() {
		try {

			MobileActionUtil.swipeLeftToElement(coranaTab);

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to swipe to Corona tab");
			Assert.fail("Unable to swipe to Corona tab");
		}
	}
	
	/**
	 * Description:Method to swipe to element Photo tab
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void swipeToPhotoTab() {
		try {

			MobileActionUtil.swipeLeftToPhotoElement(photoTab);
			
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to swipe to Photo tab");
			Assert.fail("Unable to swipe to Photo tab");
		}
	}

	/**
	 * Description:Method to wait for visibility of element Home screen loading
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void waitForVibilityOfHomeScreenLoading() {
		try {

			MobileActionUtil.waitForVisiblilityOfElement(homeScreenLoading, "Home screen loading");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Home screen loading is not visible");
			Assert.fail("Home screen loading is not visible");
		}
	}

	/**
	 * Description:Method to wait for visibility of element Aaj tak home logo copy
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void waitForVibilityOfAajTakHomeLogoCopy() {
		try {

			MobileActionUtil.waitForVisiblilityOfElement(aajTakHomeLogo, "Aaj tak home logo copy");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Aaj tak home logo copy is not visible");
			Assert.fail("Aaj tak home logo copy is not visible");
		}
	}

	/**
	 * Description:Method to wait for visibility of element Daily cap banner message
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void waitForVisibilityOfDailyCapBannerMessage() {
		try {

			MobileActionUtil.waitForVisiblilityOfElement(txtDailycapBannerMessage, "Daily cap banner message");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Daily cap banner message is not visible");
			Assert.fail("Daily cap banner message is not visible");
		}
	}

	/**
	 * Description:Method to wait for visibility of element Daily capsule bannner
	 * copy
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void waitForVibilityOfDailyCapsuleBannnerCopy() {
		try {

			MobileActionUtil.waitForVisiblilityOfElement(dailyCapsuleBannnerCopy, "Daily capsule bannner copy");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Daily capsule bannner copy is not visible");
			Assert.fail("Daily capsule bannner copy is not visible");
		}
	}

	/**
	 * Description:Method to wait for visibility of element First news1
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void waitForVibilityOfFirstnews1() {
		try {

			MobileActionUtil.waitForVisiblilityOfElement(txtFirstNewsHeadline, "First news1");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("First news1 is not visible");
			Assert.fail("First news1 is not visible");
		}
	}

	/**
	 * Description:Method to wait for visibility of element First news title
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void waitForVibilityOfFirstNewsTitle() {
		try {

			MobileActionUtil.waitForVisiblilityOfElement(txtFirstNewstitle, "First news title");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("First news title is not visible");
			Assert.fail("First news title is not visible");
		}
	}

	/**
	 * Description:Method to wait for visibility of element Hamburger icon
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void waitForVibilityOfHamburgerIcon() {
		try {

			MobileActionUtil.waitForVisiblilityOfElement(hamburgerIcon, "Hamburger icon");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Hamburger icon is not visible");
			Assert.fail("Hamburger icon is not visible");
		}
	}


	/**
	 * Description:Method to wait for visibility of element Home tab
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void waitForVibilityOfHomeTab() {
		try {

			MobileActionUtil.waitForVisiblilityOfElement(homeTab, "Home tab");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Home tab is not visible");
			Assert.fail("Home tab is not visible");
		}
	}

	/**
	 * Description:Method to wait for visibility of element Karyakram tab
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void waitForVibilityOfKaryakramTab() {
		try {

			MobileActionUtil.waitForVisiblilityOfElement(karyakramTab, "Karyakram tab");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Karyakram tab is not visible");
			Assert.fail("Karyakram tab is not visible");
		}
	}

	/**
	 * Description:Method to wait for visibility of element Large photo of first
	 * story
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void waitForVibilityOfLargePhotoOfFirstStory() {
		try {

			MobileActionUtil.waitForVisiblilityOfElement(imgLargephotooffirststory, "Large photo of first story");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Large photo of first story is not visible");
			Assert.fail("Large photo of first story is not visible");
		}
	}

	/**
	 * Description:Method to wait for visibility of element Manoranjan tab
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void waitForVibilityOfManoranjanTab() {
		try {

			MobileActionUtil.waitForVisiblilityOfElement(manoranjanTab, "Manoranjan tab");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Manoranjan tab is not visible");
			Assert.fail("Manoranjan tab is not visible");
		}
	}

	/**
	 * Description:Method to click on Device back button
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkBackbtn() {
		try {
			MobileActionUtil.clickDeviceBackButton(1);
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Back button");
			Assert.fail("Unable to perform action on Back button");
		}
	}

	/**
	 * Description:Method to validate to strings
	 * 
	 * @author Abhishek
	 * @param firstString
	 * @param secondString
	 * 
	 */
	public synchronized void verifyTwodifferentString(String firstString, String secondString) {
		try {
			if (firstString.equals(secondString)) {
				MobileActionUtil.error("Swipe action failed");
				MobileActionUtil.fail("Swipe action failed");
			} else {
				MobileActionUtil.info("Swipe action performed successfully");
				MobileActionUtil.extentinfo("Swipe action performed successfully");
			}

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Swipe action failed");
		}
	}

	/**
	 * Description:Method to click on Daily cap bannner message
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkDailyCapBannnerMessage() {
		try {

			MobileActionUtil.clickOnElement(txtDailycapBannerMessage, "Daily caps bannner message");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Daily capsule bannner message");
			Assert.fail("Unable to perform action on Daily capsule bannner message");
		}
	}

	/**
	 * Description:Method to validate namaskar in home screen is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateNamaskarInHomeScreenIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(namaskar, "namaskar", "namaskar in home screen is displayed",
					"namaskar in home screen is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("namaskar in home screen is not displayed");
			Assert.fail("namaskar in home screen is not displayed");
		}
	}

	/**
	 * Description:Method to validate comment Icon is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateCommentIconIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(commentIcon, "comment icon", "comment icon  is displayed",
					"comment Icon is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("comment icon is not displayed");
			Assert.fail("comment icon is not displayed");
		}
	}

	/**
	 * Description:Method to validate share Icon is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateShareIconIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(shareIcon, "share icon", "share icon  is displayed",
					"share icon is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("share icon is not displayed");
			Assert.fail("share icon is not displayed");
		}
	}

	/**
	 * Description:Method to validate book mark Icon is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateBookmarkIconIsDisplyed() {
		try {

			MobileActionUtil.validateisElementDisplayed(bookmarkIcon, "bookmark icon", "bookmark icon  is displayed",
					"bookmark icon is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("bookmark icon is not displayed");
			Assert.fail("bookmark icon is not displayed");
		}
	}

	/**
	 * Description:Method to click on offline Icon
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkOnOfflineIcon() {
		try {
			MobileActionUtil.clickOnElement(offlineIcon, "offline icon");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on offline icon");
			Assert.fail("Unable to perform action on offline icon");
		}
	}

	/**
	 * Description:Method to click on Badi khabre in section
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkBadiKhabreInSection() {
		try {
			MobileActionUtil.scrollToElement(lnkBadiKahbreinSection);
			MobileActionUtil.clickOnElement(lnkBadiKahbreinSection, "Badi khabre in section link");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Badi khabre in section");
			Assert.fail("Unable to perform action on Badi khabre in section");
		}
	}

	/**
	 * Description:Method to swipe up through the cards
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void swipeUpThroughTheCards() {
		try {

			MobileActionUtil.swipeUp();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to swipe up through the cards");
			Assert.fail("Unable to swipe up through the cards");
		}
	}

	/**
	 * Description:Method to swipe down through the cards
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void swipeDownThroughTheCards() {
		try {

			MobileActionUtil.swipeDown();

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to swipe down through the cards");
			Assert.fail("Unable to swipe down through the cards");
		}
	}

	/**
	 * Description:Method to Validate AajTak home logo copy is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateSuperfastcardShareOptionsAreDisplayed() {
		try {

			MobileActionUtil.validateisElementDisplayed(btnShareOnlyThisCard, "Share only this card button",
					"Share only this card button sahre option is displayed ",
					"Share only this card button sahre option is not displayed", "green");

			MobileActionUtil.validateisElementDisplayed(btnShareAllCards, "Share all cards button",
					"Share all cards button sahre option is displayed ",
					"Share all cards button sahre option is not displayed", "green");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Superfast card Share options are not displayed");
			Assert.fail("Superfast card Share options are not displayed");
		}
	}

	/**
	 * Description:Method to click on Super fast card description
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkSuperfastCardDescription() {
		try {

			MobileActionUtil.clickOnElement(txtSuperfastCardDescription, "Super fast card description ");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Super fast card description ");
			Assert.fail("Unable to perform action on Super fast card description ");
		}
	}

	/**
	 * Description:Method to fetch the superfast card title
	 * 
	 * @author Abhishek
	 *
	 * 
	 */
	public synchronized String fetchSuperfastCardTitleText() {
		String firstStoryTitleText = null;
		try {
			firstStoryTitleText = txtSuperfastCardTitle.getText();
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to fetch first story title text");
			Assert.fail("Unable to fetch first story title text");
		}
		return firstStoryTitleText;
	}

	/**
	 * Description:Method to click on Super fast card share close icon
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkSuperFastCardShareCloseIcn() {
		try {

			MobileActionUtil.clickOnElement(btnSuperfastCardShareCloseButton, "Super Fast card close share icon");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on Super Fast card share close icon");
			Assert.fail("Unable to perform action on Super Fast card share close icon");
		}
	}

	/**
	 * Description:Method to validate Bade kabhre is displayed
	 * 
	 * @author SreeLatha
	 * 
	 */
	public synchronized void validateArticlePage() {
		try {

			MobileActionUtil.validateisElementDisplayed(txtBadeKhabre, "Bade Khabre text", "Article page is displayed",
					"Article page is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("bookmark Icon is not displayed");
			Assert.fail("bookmark Icon is not displayed");
		}
	}

	/**
	 * Description:Method to Validate Super Fast card is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateSuperFastCardIsDisplayed() {
		try {
			MobileActionUtil.scrollToElement(imgSuperFasrCard);
			MobileActionUtil.validateisElementDisplayed(imgSuperFasrCard, "SuperFasrCard image",
					"SuperFasrCard img is displayed ", "SuperFasrCard img is not displayed", "blue");
		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("SuperFasrCard img is not displayed");
			Assert.fail("SuperFasrCard img is not displayed");
		}
	}

	/**
	 * Description:Method to click on First news in home title
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void clkFirstNewsTitle() {
		try {

			MobileActionUtil.clickOnElement(txtFirstNewstitle, "First news");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Unable to perform action on First news");
			Assert.fail("Unable to perform action on First news");
		}
	}

	/**
	 * Description:Method to Validate Badi kahbre in section is displayed
	 * 
	 * @author Abhishek
	 * 
	 */
	public synchronized void validateBhadiKhabarae() {
		try {

			MobileActionUtil.validateisElementDisplayed(txtBadeKhabre, "Badi kahbre in section",
					"Badi kahbre in section is displayed ", "Badi kahbre in section is not displayed", "green");

		} catch (Exception e) {
			MobileActionUtil.error(e.getMessage());
			MobileActionUtil.fail("Badi kahbre in section is not displayed");
			Assert.fail("Badi kahbre in section is not displayed");
		}
	}
	
         /**
		 * Description: Method to Validate Toast Message.
		 * 
		 * @author Abhishek
		 */
		public synchronized void validateToastMessage() {
			try {
				try {
					txtToastmsg.isDisplayed();
				} catch (Exception e) {
					MobileActionUtil.info("Toast Message is not Interactable");
				}
			} catch (Exception e) {
				MobileActionUtil.error(e.getMessage());
				MobileActionUtil.fail("Unable to Validate Toast Message");
				Assert.fail("Unable to Validate Toast");
			}
		}
		
		
		
		/**
		 * Description:Method to click on Home tab
		 * 
		 * @author Abhishek
		 * 
		 */
		public synchronized void clkHomeTabTxt() {
			try {

				MobileActionUtil.clickOnElement(txthomeTab, "Home tab");

			} catch (Exception e) {
				MobileActionUtil.error(e.getMessage());
				MobileActionUtil.fail("Unable to perform action on Home tab");
				Assert.fail("Unable to perform action on Home tab");
			}
		}

		
		/**
		 * Description:Method to swipe to element Khel section
		 * 
		 * @author Abhishek
		 * 
		 */
		public synchronized void swipeToKhelSection() {
			try {

			MobileActionUtil.swipeLeftSection();

			} catch (Exception e) {
				MobileActionUtil.error(e.getMessage());
				MobileActionUtil.fail("Unable to swipe to Khel section");
				Assert.fail("Unable to swipe to Khel section");
			}
		}
		
		/**
		 * Description:Method to click on Khel section
		 * 
		 * @author Abhishek
		 * 
		 */
		public synchronized void clkKhelSection() {
			try {
				MobileActionUtil.waitForElement(lnkKhelSection, "Khel section link");
				MobileActionUtil.clickOnElement(lnkKhelSection, "Khel section link");

			} catch (Exception e) {
				MobileActionUtil.error(e.getMessage());
				MobileActionUtil.fail("Unable to perform action on Khel section");
				Assert.fail("Unable to perform action on Khel section");
			}
		}
		
		/**
		 * Description: Method to Click on live tv
		 * 
		 * @author Bredlin
		 */
		public synchronized void clkLivetvLnk() {
			try {

				MobileActionUtil.clickOnElement(lnkLiveTv, "live tv");
			} catch (Exception e) {
				MobileActionUtil.error(e.getMessage());
				MobileActionUtil.fail("Unable to perform action on live tv");
				Assert.fail("Unable to perform action on live tv");
			}
		}
		
		
		/**
		 * Description: Method to Click on live tv
		 * 
		 * @author Bredlin
		 */
		public synchronized void swipeRightLeftAndValidate() {
			try {

				MobileActionUtil.swipeLeft();
				if (bharathTab.isSelected()) {
					MobileActionUtil.validationinfo(bharathTab.getText()+" is selected", "blue");
					MobileActionUtil.info(bharathTab.getText()+" is selected");
				}
				MobileActionUtil.swipeRight();
				validateHomeTabIsSelected();
			} catch (Exception e) {
				MobileActionUtil.error(e.getMessage());
				MobileActionUtil.fail("Unable to perform action on live tv");
				Assert.fail("Unable to perform action on live tv");
			}
		}


}