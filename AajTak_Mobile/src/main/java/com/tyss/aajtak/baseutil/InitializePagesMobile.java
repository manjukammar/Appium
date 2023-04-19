package com.tyss.aajtak.baseutil;

import com.tyss.aajtak.pages.BookmarkContent_Page;
import com.tyss.aajtak.pages.BottomNavigationBar_Page;
import com.tyss.aajtak.pages.ClearAppMemory_Page;
import com.tyss.aajtak.pages.Comments_Page;
import com.tyss.aajtak.pages.DailyHighlights_Page;
import com.tyss.aajtak.pages.DownloadedContent_Page;
import com.tyss.aajtak.pages.EditProfile_Page;
import com.tyss.aajtak.pages.FeedBack_Page;
import com.tyss.aajtak.pages.ForgotPassword_Page;
import com.tyss.aajtak.pages.HamburgerMenu_Page;
import com.tyss.aajtak.pages.HomeScreenSection_Page;
import com.tyss.aajtak.pages.HomescreenWalkthrough_Page;
import com.tyss.aajtak.pages.Homescreen_Page;
import com.tyss.aajtak.pages.ImageDownloadKaren_Page;
import com.tyss.aajtak.pages.LiveBlog_Page;
import com.tyss.aajtak.pages.LiveTvWidget_Page;
import com.tyss.aajtak.pages.LoginOrRegister_Page;
import com.tyss.aajtak.pages.Logout_Page;
import com.tyss.aajtak.pages.NewsList_Page;
import com.tyss.aajtak.pages.NotificationHub_Page;
import com.tyss.aajtak.pages.PhotoDetail_Page;
import com.tyss.aajtak.pages.PhotoList_Page;
import com.tyss.aajtak.pages.Podcast_Page;
import com.tyss.aajtak.pages.PrivacyPolicy_Page;
import com.tyss.aajtak.pages.Search_Page;
import com.tyss.aajtak.pages.Settings_Page;
import com.tyss.aajtak.pages.Share_Page;
import com.tyss.aajtak.pages.ShuruKarienOnboarding_Page;
import com.tyss.aajtak.pages.SignUp_Page;
import com.tyss.aajtak.pages.SplashScreen_Page;
import com.tyss.aajtak.pages.StoryDetail_Page;
import com.tyss.aajtak.pages.TermsAndConditions_Page;
import com.tyss.aajtak.pages.VideoDetail_Page;
import com.tyss.aajtak.pages.VideoList_Page;
import com.tyss.aajtak.pages.ViewProfile_Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * Description Initialize all pages with driver,ETO, MobileActionUtil
 * 
 * @author Manikandan A
 * 
 */
public class InitializePagesMobile {
	public BookmarkContent_Page bookmarkContentPage;
	public BottomNavigationBar_Page bottomNavigationBarPage;
	public ClearAppMemory_Page clearAppMemoryPage;
	public DailyHighlights_Page dailyHighlightsPage;
	public DownloadedContent_Page downloadedContentPage;
	public FeedBack_Page feedBackPage;
	public ForgotPassword_Page forgotPasswordPage;
	public HamburgerMenu_Page hamburgerMenuPage;
	public Homescreen_Page homescreenPage;
	public HomeScreenSection_Page HomeScreenSectionPage;
	public HomescreenWalkthrough_Page homescreenWalkthroughPage;
	public ImageDownloadKaren_Page imageDownloadKarenPage;
	public LoginOrRegister_Page loginOrRegisterPage;
	public PhotoDetail_Page photoDetailPage;
	public PhotoList_Page photoListPage;
	public PrivacyPolicy_Page privacyPolicyPage;
	public Search_Page searchPage;
	public Settings_Page settingsPage;
	public Share_Page sharePage;
	public ShuruKarienOnboarding_Page shuruKarienOnboardingPage;
	public SignUp_Page signUpPage;
	public SplashScreen_Page splashScreenPage;
	public StoryDetail_Page storyDetailPage;
	public TermsAndConditions_Page termsAndConditionsPage;
	public NewsList_Page newsListPage;
	public Logout_Page logoutPage;
	public Comments_Page commentsPage;
	public Podcast_Page podcastPage;
	public VideoList_Page videoListPage;
	public VideoDetail_Page videoDetailPage;
	public ViewProfile_Page viewProfilePage;
	public NotificationHub_Page notificationHubPage;
	public EditProfile_Page editProfilePage;
	public LiveTvWidget_Page liveTvWidgetPage;
	public LiveBlog_Page liveBlogPage;

	public InitializePagesMobile(AndroidDriver<AndroidElement> androidDriver, long ETO) {

		bookmarkContentPage = new BookmarkContent_Page(androidDriver, ETO);
		bottomNavigationBarPage = new BottomNavigationBar_Page(androidDriver, ETO);
		clearAppMemoryPage = new ClearAppMemory_Page(androidDriver, ETO);
		dailyHighlightsPage = new DailyHighlights_Page(androidDriver, ETO);
		downloadedContentPage = new DownloadedContent_Page(androidDriver, ETO);
		feedBackPage = new FeedBack_Page(androidDriver, ETO);
		forgotPasswordPage = new ForgotPassword_Page(androidDriver, ETO);
		hamburgerMenuPage = new HamburgerMenu_Page(androidDriver, ETO);
		homescreenPage = new Homescreen_Page(androidDriver, ETO);
		HomeScreenSectionPage = new HomeScreenSection_Page(androidDriver, ETO);
		homescreenWalkthroughPage = new HomescreenWalkthrough_Page(androidDriver, ETO);
		imageDownloadKarenPage = new ImageDownloadKaren_Page(androidDriver, ETO);
		loginOrRegisterPage = new LoginOrRegister_Page(androidDriver, ETO);
		photoDetailPage = new PhotoDetail_Page(androidDriver, ETO);
		photoListPage = new PhotoList_Page(androidDriver, ETO);
		privacyPolicyPage = new PrivacyPolicy_Page(androidDriver, ETO);
		searchPage = new Search_Page(androidDriver, ETO);
		settingsPage = new Settings_Page(androidDriver, ETO);
		sharePage = new Share_Page(androidDriver, ETO);
		shuruKarienOnboardingPage = new ShuruKarienOnboarding_Page(androidDriver, ETO);
		signUpPage = new SignUp_Page(androidDriver, ETO);
		splashScreenPage = new SplashScreen_Page(androidDriver, ETO);
		storyDetailPage = new StoryDetail_Page(androidDriver, ETO);
		termsAndConditionsPage = new TermsAndConditions_Page(androidDriver, ETO);
		newsListPage = new NewsList_Page(androidDriver, ETO);
		logoutPage = new Logout_Page(androidDriver, ETO);
		commentsPage = new Comments_Page(androidDriver, ETO);
		podcastPage = new Podcast_Page(androidDriver, ETO);
		videoListPage = new VideoList_Page(androidDriver, ETO);
		videoDetailPage = new VideoDetail_Page(androidDriver, ETO);
		viewProfilePage = new ViewProfile_Page(androidDriver, ETO);
		notificationHubPage = new NotificationHub_Page(androidDriver, ETO);
		editProfilePage = new EditProfile_Page(androidDriver, ETO);
		liveTvWidgetPage = new LiveTvWidget_Page(androidDriver, ETO);
		liveBlogPage = new LiveBlog_Page(androidDriver, ETO);

	}
}
